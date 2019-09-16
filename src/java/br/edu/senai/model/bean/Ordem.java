package br.edu.senai.model.bean;

public class Ordem {
    private Integer idOrdem;
    private Funcionario funcionarioOrdem;
    private Cliente clienteOrdem;
    private Animal animalOrdem;
    private Integer indexPagamentoOrdem;
    private String statusPagamentoOrdem;
    private String statusOrdem;

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
