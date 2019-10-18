package br.edu.senai.model.bean;

public class Ordem {
    private Integer idOrdem;
    private Funcionario funcionarioOrdem;
    private Cliente clienteOrdem;
    private Animal animalOrdem;
    private Integer indexPagamentoOrdem;
    private Boolean statusPagamentoOrdem;
    private Boolean statusOrdem;

    public Integer getIdOrdem() {
        return idOrdem;
    }

    public void setIdOrdem(Integer idOrdem) {
        this.idOrdem = idOrdem;
    }

    public Funcionario getFuncionarioOrdem() {
        return funcionarioOrdem;
    }

    public void setFuncionarioOrdem(Funcionario funcionarioOrdem) {
        this.funcionarioOrdem = funcionarioOrdem;
    }

    public Cliente getClienteOrdem() {
        return clienteOrdem;
    }

    public void setClienteOrdem(Cliente clienteOrdem) {
        this.clienteOrdem = clienteOrdem;
    }

    public Integer getIndexPagamentoOrdem() {
        return indexPagamentoOrdem;
    }

    public void setIndexPagamentoOrdem(Integer indexPagamentoOrdem) {
        this.indexPagamentoOrdem = indexPagamentoOrdem;
    }

    public Animal getAnimalOrdem() {
        return animalOrdem;
    }

    public void setAnimalOrdem(Animal animalOrdem) {
        this.animalOrdem = animalOrdem;
    }

    public Boolean getStatusPagamentoOrdem() {
        return statusPagamentoOrdem;
    }

    public void setStatusPagamentoOrdem(Boolean statusPagamentoOrdem) {
        this.statusPagamentoOrdem = statusPagamentoOrdem;
    }

    public Boolean getStatusOrdem() {
        return statusOrdem;
    }

    public void setStatusOrdem(Boolean statusOrdem) {
        this.statusOrdem = statusOrdem;
    }
}
