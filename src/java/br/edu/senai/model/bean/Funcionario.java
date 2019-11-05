package br.edu.senai.model.bean;

public class Funcionario extends Pessoa{
    private String nomeFuncionario;
    private String setorFuncionario;
    private String cargoFuncionario;
    private String sexoFuncionario;
    private Integer senhaFuncionario;

    public Integer getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(Integer senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getSetorFuncionario() {
        return setorFuncionario;
    }

    public void setSetorFuncionario(String setorFuncionario) {
        this.setorFuncionario = setorFuncionario;
    }

    public String getCargoFuncionario() {
        return cargoFuncionario;
    }

    public void setCargoFuncionario(String cargoFuncionario) {
        this.cargoFuncionario = cargoFuncionario;
    }

    public String getSexoFuncionario() {
        return sexoFuncionario;
    }

    public void setSexoFuncionario(String sexoFuncionario) {
        this.sexoFuncionario = sexoFuncionario;
    }
}
