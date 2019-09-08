package br.edu.senai.model.bean;

public class Cliente extends Pessoa{
    private Integer enderecoIdEndereco;
    private String nomeCliente;
    private String tipoCliente;
    private String sexoCliente;
    private String dataCadastro;

    public Integer getEnderecoIdEndereco() {
        return enderecoIdEndereco;
    }

    public void setEnderecoIdEndereco(int enderecoIdEndereco) {
        this.enderecoIdEndereco = enderecoIdEndereco;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getSexoCliente() {
        return sexoCliente;
    }

    public void setSexoCliente(String sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
