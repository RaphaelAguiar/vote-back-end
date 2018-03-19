package br.com.rca.votos.rest.cargo.resultado;

import br.com.rca.votos.domain.cidadao.Cidadao;
import br.com.rca.votos.domain.resultado.ResultadoService;
import br.com.rca.votos.domain.voto.VotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ResultadoApplication {

  @Autowired
  private ResultadoService resultadoService;

  public ResultadoDto resultado(String nomeCargo) {
    Cidadao cidadao = resultadoService.resultado(nomeCargo);
  }
}
