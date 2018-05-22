package br.com.rca.votos.application.eleicao;

import br.com.rca.votos.domain.voto.VotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Collectors;

@Service
public class EleicaoResultado {
    @Autowired
    private VotoRepository votoRepository;

    public Map<String, Long> get(String nomeCargo) {
        return votoRepository
            .findByNomeCargo(nomeCargo)
            .stream()
            .collect(Collectors.groupingBy(
                cargo -> cargo.getCpfVotado(),
                Collectors.counting()
            ));
    }
}
