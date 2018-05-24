package br.com.rca.votos.api.cidadao;

public class CidadaoGetReturn {
    private String cpf;
    private String nomeCargoCandidatado;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeCargoCandidatado() {
        return nomeCargoCandidatado;
    }

    public void setNomeCargoCandidatado(String nomeCargoCandidatado) {
        this.nomeCargoCandidatado = nomeCargoCandidatado;
    }
}
