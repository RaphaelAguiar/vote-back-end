package br.com.rca.votos.domain.cidadao;

import br.com.rca.votos.domain.voto.Voto;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

@ToString
@EqualsAndHashCode(of="id")
@RequiredArgsConstructor
public class Cidadao implements UserDetails {
  @Id
  @Getter
  @Setter
  private String id;
  @Getter
  @Setter
  @NonNull
  private String cpf;
  @Getter
  @Setter
  @NonNull
  private String senha;
  @Getter
  @Setter
  @NonNull
  private Set<Voto> votos;

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return Collections.emptySet();
  }

  @Override
  public String getPassword() {
    return senha;
  }

  @Override
  public String getUsername() {
    return cpf;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }
}
