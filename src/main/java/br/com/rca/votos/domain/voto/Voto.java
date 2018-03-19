package br.com.rca.votos.domain.voto;

import br.com.rca.votos.domain.cargo.Cargo;
import br.com.rca.votos.domain.cidadao.Cidadao;
import lombok.*;

@ToString
@EqualsAndHashCode(of="cargo")
@RequiredArgsConstructor
public class Voto {
  @Getter
  @Setter
  @NonNull
  private Cargo cargo;

  @Getter
  @Setter
  @NonNull
  private Cidadao candidato;
}
