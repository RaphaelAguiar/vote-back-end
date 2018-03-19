package br.com.rca.votos.domain.resultado;

import br.com.rca.votos.domain.cidadao.Cidadao;
import br.com.rca.votos.domain.cidadao.CidadaoRepository;
import br.com.rca.votos.domain.voto.Voto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ResultadoService {

  @Autowired
  private CidadaoRepository cidadaoRepository;

  public Cidadao resultado(String nomeCargo) {

  }
}
