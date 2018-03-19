package br.com.rca.votos.rest.cidadao.novo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@ToString
@EqualsAndHashCode(of="cpf")
public class CidadaoDto {
  @Getter
  @Setter
  @NotNull
  private String cpf;
  @Getter
  @Setter
  @NotNull
  private String senha;
}
