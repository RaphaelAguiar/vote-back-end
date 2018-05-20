package br.com.rca.votos.application.eleicao;

import br.com.rca.votos.domain.cargo.CargoRepository;
import br.com.rca.votos.domain.cidadao.CidadaoRepository;
import br.com.rca.votos.domain.voto.Voto;
import br.com.rca.votos.domain.voto.VotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EleicaoVotar {
    @Autowired
    private CidadaoRepository cidadaoRepository;

    @Autowired
    private CargoRepository cargoRepository;

    @Autowired
    private VotoRepository votoRepository;

    public void votar(String idCidadao, String idCandidato, String nomeCargo) {
        cidadaoRepository.findById(idCidadao)
            .orElseThrow(() -> new IllegalArgumentException("Cidadão inválido!"));

        cidadaoRepository.findById(idCandidato)
            .orElseThrow(() -> new IllegalArgumentException("Cidadão inválido!"));

        cargoRepository.findByNome(nomeCargo)
            .orElseThrow(() -> new IllegalArgumentException("Cargo inválido!"));

        Voto voto = new Voto();
        voto.setNomeCargo(nomeCargo);
        voto.setIdVotado(idCandidato);
        voto.setIdVotante(idCidadao);
        votoRepository.save(voto);
    }
}
