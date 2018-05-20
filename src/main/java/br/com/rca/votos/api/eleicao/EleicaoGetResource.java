package br.com.rca.votos.api.eleicao;

import br.com.rca.votos.application.eleicao.EleicaoResultado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class EleicaoGetResource {
    @Autowired
    private EleicaoResultado eleicaoResultado;

    @GetMapping("/eleicao/{nomeCargo}")
    public Map<String,Long> get(@PathVariable String nomeCargo) {
        return eleicaoResultado.get(nomeCargo);
    }
}
