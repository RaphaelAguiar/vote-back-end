package br.com.rca.votos.domain.voto;

import br.com.rca.votos.domain.cargo.Cargo;
import br.com.rca.votos.domain.cargo.CargoRepository;
import br.com.rca.votos.domain.cidadao.Cidadao;
import br.com.rca.votos.domain.cidadao.CidadaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VotoService {
  @Autowired
  private CidadaoRepository cidadaoRepository;

  @Autowired
  private CargoRepository cargoRepository;

  public void votar(String idCidadao, String idCandidato, String nomeCargo) {
    Cidadao cidadao = cidadaoRepository.findById(idCidadao)
      .orElseThrow(() -> new IllegalArgumentException("Cidadão inválido!"));


    Cidadao candidato = cidadaoRepository.findById(idCandidato)
      .orElseThrow(() -> new IllegalArgumentException("Cidadão inválido!"));

    //TODO Criar uma busca para cargos;
    Cargo cargo = cargoRepository.findByNome(nomeCargo)
      .orElseThrow(() -> new IllegalArgumentException("Cargo inválido!"));

    Voto voto = new Voto(
      cargo,
      candidato
    );
    cidadao.getVotos().add(voto);

    cidadaoRepository.save(cidadao);
  }
}
