package br.com.rca.votos.domain.voto;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface VotoRepository extends Repository<Voto,String> {
    Voto save(Voto voto);
    List<Voto> findByNomeCargo(String nomeCargo);
}
