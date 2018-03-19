package br.com.rca.votos.domain.cargo;

import lombok.*;
import org.springframework.data.annotation.Id;

@ToString
@EqualsAndHashCode(of="id")
@RequiredArgsConstructor
public class Cargo {
  @Id
  @Getter
  @Setter
  private String id;

  @Getter
  @Setter
  @NonNull
  private String nome;
}
