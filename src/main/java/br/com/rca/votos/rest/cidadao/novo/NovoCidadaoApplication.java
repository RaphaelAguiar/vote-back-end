package br.com.rca.votos.rest.cidadao.novo;

import br.com.rca.votos.domain.cidadao.CidadaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NovoCidadaoApplication {
  @Autowired
  private CidadaoService cidadaoService;

  public String novo(CidadaoDto cidadaoDto) {
    return cidadaoService.novo(
      cidadaoDto.getCpf(),
      cidadaoDto.getSenha())
      .getId();
  }
}
