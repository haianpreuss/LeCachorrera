package br.edu.senai.controller;

import br.edu.senai.model.bean.Funcionario;
import br.edu.senai.model.dao.FuncionarioDAO;
import java.util.List;

public class FuncionarioController {

    FuncionarioDAO funcionarioDao = new FuncionarioDAO();

    //INSERT
    public boolean controllerInsertFuncionario(Funcionario funcionario) {
        //TODO requisitos
        return funcionarioDao.daoInsertFuncionario(funcionario);
    }

    //READ
    public List<Funcionario> controllerReadCompleteFuncionario(){
        //TODO requisitos
        return null;
    }
    
    //UPDATE
    public boolean controllerUpdateFuncionario(Funcionario funcionario){
        //TODO requisitos
        return funcionarioDao.daoUpdateFuncionario(funcionario);
    }
    
    //DELETE
    public boolean controllerDeleteFuncionario(int id){
        //TODO requisitos
        return funcionarioDao.daoDeleteFuncionario(id);
    }
}
