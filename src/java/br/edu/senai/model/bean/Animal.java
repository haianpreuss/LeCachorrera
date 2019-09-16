package br.edu.senai.model.bean;

public class Animal {
    private Integer idAnimal;
    private Cliente clienteAnimal;
    private String nomeAnimal;
    private String dataNascimentoAnimal;
    private String racaAnimal;
    private String porteAnimal;
    private String observacaoAnimal;
    private String sexoAnimal;
    private String dataCadastroAnimal;
    private Integer indexEspecieAnimal;
    
    public Integer getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Integer idAnimal) {
        this.idAnimal = idAnimal;
    }

    public Integer getIndexEspecieAnimal() {
        return indexEspecieAnimal;
    }

    public void setIndexEspecieAnimal(Integer indexEspecieAnimal) {
        this.indexEspecieAnimal = indexEspecieAnimal;
    }

    public Cliente getClienteAnimal() {
        return clienteAnimal;
    }

    public void setClienteAnimal(Cliente clienteAnimal) {
        this.clienteAnimal = clienteAnimal;
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
