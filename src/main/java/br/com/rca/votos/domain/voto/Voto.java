package br.com.rca.votos.domain.voto;

//Criptogravar para que apenas o autor do eleicao saiba qual foi o seu eleicao;

public class Voto {
    private String cpfVotante;
    private String cpfVotado;
    private String nomeCargo;


    public String getCpfVotante() {
        return cpfVotante;
    }

    public void setCpfVotante(String cpfVotante) {
        this.cpfVotante = cpfVotante;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public String getCpfVotado() {
        return cpfVotado;
    }

    public void setCpfVotado(String cpfVotado) {
        this.cpfVotado = cpfVotado;
    }
}
