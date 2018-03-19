package br.com.rca.votos.domain.cargo;

import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface CargoRepository extends Repository<Cargo,String>{
  void deleteAll();
  Cargo save(Cargo cargo);
  Optional<Cargo> findByNome(String nomeCargo);
}
