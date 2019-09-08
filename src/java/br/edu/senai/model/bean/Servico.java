package br.edu.senai.model.bean;

public class Servico {
    private Integer idServico;
    private String descricaoServico;
    private Float valorServico;

    public Integer getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public Float getValorServico() {
        return valorServico;
    }

    public void setValorServico(Float valorServico) {
        this.valorServico = valorServico;
    }
}
