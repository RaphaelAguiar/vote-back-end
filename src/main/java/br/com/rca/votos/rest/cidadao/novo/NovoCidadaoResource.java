package br.com.rca.votos.rest.cidadao.novo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class NovoCidadaoResource {

  @Autowired
  private NovoCidadaoApplication novoCidadaoApplication;

  @PostMapping("/cidadao/novo")
  public String novo(@Valid @RequestBody CidadaoDto cidadaoDto){
    return novoCidadaoApplication.novo(cidadaoDto);
  }
}
