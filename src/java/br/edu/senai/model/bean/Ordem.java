package br.edu.senai.model.bean;

public class Ordem {
    private Integer idOrdem;
    private Integer funcionarioIdFuncionario;
    private Integer clienteIdCliente;
    private Integer pagamentoIdPagamento;
    private Integer animalIdAnimal;
    private String statusPagamentoOrdem;
    private String statusOrdem;

    public Integer getIdOrdem() {
        return idOrdem;
    }

    public void setIdOrdem(Integer idOrdem) {
        this.idOrdem = idOrdem;
    }

    public Integer getFuncionarioIdFuncionario() {
        return funcionarioIdFuncionario;
    }

    public void setFuncionarioIdFuncionario(Integer funcionarioIdFuncionario) {
        this.funcionarioIdFuncionario = funcionarioIdFuncionario;
    }

    public Integer getClienteIdCliente() {
        return clienteIdCliente;
    }

    public void setClienteIdCliente(Integer clienteIdCliente) {
        this.clienteIdCliente = clienteIdCliente;
    }

    public Integer getPagamentoIdPagamento() {
        return pagamentoIdPagamento;
    }

    public void setPagamentoIdPagamento(Integer pagamentoIdPagamento) {
        this.pagamentoIdPagamento = pagamentoIdPagamento;
    }

    public Integer getAnimalIdAnimal() {
        return animalIdAnimal;
    }

    public void setAnimalIdAnimal(Integer animalIdAnimal) {
        this.animalIdAnimal = animalIdAnimal;
    }

    public String getStatusPagamentoOrdem() {
        return statusPagamentoOrdem;
    }

    public void setStatusPagamentoOrdem(String statusPagamentoOrdem) {
        this.statusPagamentoOrdem = statusPagamentoOrdem;
    }

    public String getStatusOrdem() {
        return statusOrdem;
    }

    public void setStatusOrdem(String statusOrdem) {
        this.statusOrdem = statusOrdem;
    }
}
