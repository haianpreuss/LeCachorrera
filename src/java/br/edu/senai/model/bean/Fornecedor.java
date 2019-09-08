package br.edu.senai.model.bean;

public class Fornecedor extends Pessoa{
    private String razaoSocialFornecedor;
    private String nomeFantasiaFornecedor;
    private String ieFornecedor;
    private String dataCadastroFornecedor;

    public String getRazaoSocialFornecedor() {
        return razaoSocialFornecedor;
    }

    public void setRazaoSocialFornecedor(String razaoSocialFornecedor) {
        this.razaoSocialFornecedor = razaoSocialFornecedor;
    }

    public String getNomeFantasiaFornecedor() {
        return nomeFantasiaFornecedor;
    }

    public void setNomeFantasiaFornecedor(String nomeFantasiaFornecedor) {
        this.nomeFantasiaFornecedor = nomeFantasiaFornecedor;
    }

    public String getIeFornecedor() {
        return ieFornecedor;
    }

    public void setIeFornecedor(String ieFornecedor) {
        this.ieFornecedor = ieFornecedor;
    }

    public String getDataCadastroFornecedor() {
        return dataCadastroFornecedor;
    }

    public void setDataCadastroFornecedor(String dataCadastroFornecedor) {
        this.dataCadastroFornecedor = dataCadastroFornecedor;
    }
}
