package br.edu.senai.model.bean;

public class Entrada {
    private Integer idEntrada;
    private Fornecedor fornecedorEntrada;
    private Funcionario funcionarioEntrada;
    private Integer codigoBarraEntrada;
    private String dataHoraEntrada;

    public String getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(String dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public Integer getCodigoBarraEntrada() {
        return codigoBarraEntrada;
    }

    public void setCodigoBarraEntrada(Integer codigoBarraEntrada) {
        this.codigoBarraEntrada = codigoBarraEntrada;
    }

    public Integer getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(Integer idEntrada) {
        this.idEntrada = idEntrada;
    }

    public Fornecedor getFornecedorEntrada() {
        return fornecedorEntrada;
    }

    public void setFornecedorEntrada(Fornecedor fornecedorEntrada) {
        this.fornecedorEntrada = fornecedorEntrada;
    }

    public Funcionario getFuncionarioEntrada() {
        return funcionarioEntrada;
    }

    public void setFuncionarioEntrada(Funcionario funcionarioEntrada) {
        this.funcionarioEntrada = funcionarioEntrada;
    }
}
