package br.edu.senai.model.bean;

public class Entrada {
    private Integer idEntrada;
    private Integer fornecedorIdFornecedor;
    private Integer funcionarioIdFuncionario;
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

    public Integer getFornecedorIdFornecedor() {
        return fornecedorIdFornecedor;
    }

    public void setFornecedorIdFornecedor(Integer fornecedorIdFornecedor) {
        this.fornecedorIdFornecedor = fornecedorIdFornecedor;
    }

    public Integer getFuncionarioIdFuncionario() {
        return funcionarioIdFuncionario;
    }

    public void setFuncionarioIdFuncionario(Integer funcionarioIdFuncionario) {
        this.funcionarioIdFuncionario = funcionarioIdFuncionario;
    }
}
