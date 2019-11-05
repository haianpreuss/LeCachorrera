package br.edu.senai.model.bean;

public class Saida {
    private Integer idSaida;
    private Funcionario funcionarioSaida;
    private String tipoSaida;
    private String dataHoraSaida;
    
    public String getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(String dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    public Integer getIdSaida() {
        return idSaida;
    }

    public void setIdSaida(Integer idSaida) {
        this.idSaida = idSaida;
    }

    public Funcionario getFuncionarioSaida() {
        return funcionarioSaida;
    }

    public void setFuncionarioSaida(Funcionario funcionarioSaida) {
        this.funcionarioSaida = funcionarioSaida;
    }

    public String getTipoSaida() {
        return tipoSaida;
    }

    public void setTipoSaida(String tipoSaida) {
        this.tipoSaida = tipoSaida;
    }
}
