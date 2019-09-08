package br.edu.senai.model.bean;

public class Animal {
    private Integer idCliente;
    private Integer especieIdEspecie;
    private String nomeAnimal;
    private String dataNascimentoAnimal;
    private String racaAnimal;
    private String porteAnimal;
    private String observacaoAnimal;
    private String sexoAnimal;
    private String dataCadastroAnimal;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getEspecieIdEspecie() {
        return especieIdEspecie;
    }

    public void setEspecieIdEspecie(Integer especieIdEspecie) {
        this.especieIdEspecie = especieIdEspecie;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getDataNascimentoAnimal() {
        return dataNascimentoAnimal;
    }

    public void setDataNascimentoAnimal(String dataNascimentoAnimal) {
        this.dataNascimentoAnimal = dataNascimentoAnimal;
    }

    public String getRacaAnimal() {
        return racaAnimal;
    }

    public void setRacaAnimal(String racaAnimal) {
        this.racaAnimal = racaAnimal;
    }

    public String getPorteAnimal() {
        return porteAnimal;
    }

    public void setPorteAnimal(String porteAnimal) {
        this.porteAnimal = porteAnimal;
    }

    public String getObservacaoAnimal() {
        return observacaoAnimal;
    }

    public void setObservacaoAnimal(String observacaoAnimal) {
        this.observacaoAnimal = observacaoAnimal;
    }

    public String getSexoAnimal() {
        return sexoAnimal;
    }

    public void setSexoAnimal(String sexoAnimal) {
        this.sexoAnimal = sexoAnimal;
    }

    public String getDataCadastroAnimal() {
        return dataCadastroAnimal;
    }

    public void setDataCadastroAnimal(String dataCadastroAnimal) {
        this.dataCadastroAnimal = dataCadastroAnimal;
    }
}
