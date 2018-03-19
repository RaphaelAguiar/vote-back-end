package br.com.rca.votos.rest.cargo.resultado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping
public class ResultadoResource {
  @Autowired
  private ResultadoApplication resultadoApplication;

  @GetMapping("/resultado/obter")
  public ResultadoDto resultado(@RequestParam("nomeCargo") String nomeCargo){
    return resultadoApplication.resultado(nomeCargo);
  }

}
