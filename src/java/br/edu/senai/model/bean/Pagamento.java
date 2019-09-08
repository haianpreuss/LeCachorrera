package br.edu.senai.model.bean;

public class Pagamento {
    private Integer idPagamento;
    private String meioPagamento;
    private String parcelaPagamento;

    public Integer getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Integer idPagamento) {
        this.idPagamento = idPagamento;
    }

    public String getMeioPagamento() {
        return meioPagamento;
    }

    public void setMeioPagamento(String meioPagamento) {
        this.meioPagamento = meioPagamento;
    }

    public String getParcelaPagamento() {
        return parcelaPagamento;
    }

    public void setParcelaPagamento(String parcelaPagamento) {
        this.parcelaPagamento = parcelaPagamento;
    }
}
