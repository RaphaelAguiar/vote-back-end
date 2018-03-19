package br.com.rca.votos.security;

import br.com.rca.votos.domain.cidadao.Cidadao;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class LogginService {

  public Cidadao getUser(){
    return (Cidadao) SecurityContextHolder
      .getContext()
      .getAuthentication()
      .getPrincipal();
  }
}
