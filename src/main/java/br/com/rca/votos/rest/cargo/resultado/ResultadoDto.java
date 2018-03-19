package br.com.rca.votos.rest.cargo.resultado;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class ResultadoDto {
  @Getter
  @Setter
  private String cargo;
  @Getter
  @Setter
  private CidadaoDto eleito;
}
