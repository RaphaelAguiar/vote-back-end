package br.com.rca.votos.rest.cargo.resultado;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode(of="cpf")
public class CidadaoDto {
  @Getter
  @Setter
  private String cpf;
}
