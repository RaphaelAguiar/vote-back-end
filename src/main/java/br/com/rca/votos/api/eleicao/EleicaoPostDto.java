package br.com.rca.votos.api.eleicao;

import javax.validation.constraints.NotNull;

public class EleicaoPostDto {
    @NotNull
    private String cargo;
    @NotNull
    private String idCandidato;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(String idCandidato) {
        this.idCandidato = idCandidato;
    }
}
