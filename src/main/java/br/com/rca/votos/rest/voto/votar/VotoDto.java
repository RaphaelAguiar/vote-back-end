package br.com.rca.votos.rest.voto.votar;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@ToString
@EqualsAndHashCode(of="cargo")
public class VotoDto {
  @Getter
  @Setter
  @NotNull
  private String cargo;
  @Getter
  @Setter
  @NotNull
  private String idCandidato;
}
