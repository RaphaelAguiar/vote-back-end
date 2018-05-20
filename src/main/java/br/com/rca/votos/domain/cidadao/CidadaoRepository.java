package br.com.rca.votos.domain.cidadao;

import org.springframework.data.repository.Repository;

import java.util.Optional;
import java.util.Set;

public interface CidadaoRepository extends Repository<Cidadao, String> {
    Cidadao save(Cidadao cidadao);
    Optional<Cidadao> findById(String idCidadao);
    Optional<Cidadao> findByCpf(String cpf);
}
