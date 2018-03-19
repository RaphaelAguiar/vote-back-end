package br.com.rca.votos.domain.cidadao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CidadaoService {
  @Autowired
  private CidadaoRepository cidadaoRepository;

  public Cidadao novo(String cpf, String senha) {
    //TODO verificar CPF Válido
    //TODO verificar senha valida

    cidadaoRepository
      .findByCpf(cpf)
      .ifPresent(c -> {
        throw new IllegalArgumentException("Cpf já cadastrado existe!");
      });

    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    return cidadaoRepository
      .save(new Cidadao(
        cpf,
        passwordEncoder.encode(senha),
        Collections.emptySet()));
  }
}
