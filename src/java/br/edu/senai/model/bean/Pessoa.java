package br.edu.senai.model.bean;

abstract public class Pessoa {
    private Integer idPessoa;
    private String telefonePessoa;
    private String emailPessoa;
    private String documentoPessoa;

    public String getDocumentoPessoa() {
        return documentoPessoa;
    }

    public void setDocumentoPessoa(String documentoPessoa) {
        this.documentoPessoa = documentoPessoa;
    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getTelefonePessoa() {
        return telefonePessoa;
    }

    public void setTelefonePessoa(String telefonePessoa) {
        this.telefonePessoa = telefonePessoa;
    }

    public String getEmailPessoa() {
        return emailPessoa;
    }

    public void setEmailPessoa(String emailPessoa) {
        this.emailPessoa = emailPessoa;
    }
    
    
}
