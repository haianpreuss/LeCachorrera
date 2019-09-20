package br.edu.senai.controller;

import br.edu.senai.model.bean.Fornecedor;
import br.edu.senai.model.dao.FornecedorDAO;
import java.util.List;

public class FornecedorController {
    FornecedorDAO fornecedorDao = new FornecedorDAO();
    
    //INSERT
    public boolean controllerInsertForneceder(Fornecedor fornecedor){
        //TODO requisitos
        return fornecedorDao.daoInsertFornecedor(fornecedor);
    }
    
    //READ
    public List<Fornecedor> controllerReadCompleteFornecedor(){
        //TODO requisitos
        return null;
    }
    
    //UPDATE
    public boolean controllerUpdateFornecedor(Fornecedor fornecedor){
        //TODO requisitos
        return fornecedorDao.daoUpdateFornecedor(fornecedor);
    }
    
    //DELETE
    public boolean controllerDelteFornecedor(int id){
        //TODO requisitos
        return fornecedorDao.daoDeleteFornecedor(id);
    }
}
