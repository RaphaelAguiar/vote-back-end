package br.com.rca.votos.domain.voto;

//Criptogravar para que apenas o autor do eleicao saiba qual foi o seu eleicao;

public class Voto {
    private String idVotante;
    private String nomeCargo;
    private String idVotado;

    public String getIdVotante() {
        return idVotante;
    }

    public void setIdVotante(String idVotante) {
        this.idVotante = idVotante;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public String getIdVotado() {
        return idVotado;
    }

    public void setIdVotado(String idVotado) {
        this.idVotado = idVotado;
    }
}
