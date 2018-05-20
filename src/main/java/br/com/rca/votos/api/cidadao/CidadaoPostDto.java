package br.com.rca.votos.api.cidadao;

import javax.validation.constraints.NotNull;

public class CidadaoPostDto {
  @NotNull
  private String cpf;
  @NotNull
  private String senha;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
