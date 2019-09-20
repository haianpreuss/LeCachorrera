package br.edu.senai.controller;

import br.edu.senai.model.bean.Cliente;
import br.edu.senai.model.dao.ClienteDAO;
import java.util.List;

public class ClienteController {
    ClienteDAO clienteDao = new ClienteDAO();
    
    //INSERT
    public boolean controllerInsertCliente(Cliente cliente){
        //TODO requisitos
        return clienteDao.daoInsertCliente(cliente);
    }
    
    //READ
    public List<Cliente> controllerReadCompleteCliente(){
        //TODO requisitos
        return null;
    }
    
    //UPDATE
    public boolean controllerUpdateCliente(Cliente cliente){
        //TODO requisitos
        return clienteDao.daoUpdateCliente(cliente);
    }
    
    //DELETE
    public boolean controllerDeleteCliente(int id){
        //TODO requisitos
        return clienteDao.daoDeleteCliente(id);
    }
    
    
}
