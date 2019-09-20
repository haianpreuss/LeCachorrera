package br.edu.senai.controller;

import br.edu.senai.model.bean.Endereco;
import br.edu.senai.model.dao.EnderecoDAO;
import java.util.List;

public class EnderecoController {
    EnderecoDAO enderecoDao = new EnderecoDAO();
    
    //INSERT
    public boolean controllerInsertEndereco(Endereco endereco){
        //TODO requisitos
        return enderecoDao.daoInsertEndereco(endereco);
    }
    
    //READ
    public List<Endereco> controllerReadCompleteEndereco(){
        //TODO requisitos
        return null;
    }
    
    //UPDATE
    public boolean controllerUpdateEndereco(Endereco endereco){
        //TODO requisitos
        return enderecoDao.daoUpdateEndereco(endereco);
    }
    
    //DELETE
    public boolean controllerDeleteEndereco(int id){
        //TODO requisitos
        return enderecoDao.daoDeleteEndereco(id);
    }
}
