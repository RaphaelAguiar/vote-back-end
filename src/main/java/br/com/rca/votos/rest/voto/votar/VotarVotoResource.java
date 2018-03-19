package br.com.rca.votos.rest.voto.votar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class VotarVotoResource {
  @Autowired
  private VotarVotoApplication votarVotoApplication;

  @PostMapping("/voto/votar")
  //TODO requerir autenticacao
  //TODO criptografar
  public void votar(@Valid @RequestBody VotoDto votoDto){
    votarVotoApplication.votar(votoDto);
  }
}
