package br.com.rca.votos.rest.voto.votar;

import br.com.rca.votos.domain.cidadao.Cidadao;
import br.com.rca.votos.domain.voto.VotoService;
import br.com.rca.votos.security.LogginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VotarVotoApplication {
  @Autowired
  private VotoService votoService;
  @Autowired
  private LogginService logginService;

  public void votar(VotoDto votoDto) {
    Cidadao cidadao = logginService.getUser();
    votoService.votar(
      cidadao.getId(),
      votoDto.getIdCandidato(),
      votoDto.getCargo()
    );
  }
}
