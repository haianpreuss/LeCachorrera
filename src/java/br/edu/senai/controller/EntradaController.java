package br.edu.senai.controller;

import br.edu.senai.model.bean.Entrada;
import br.edu.senai.model.dao.EntradaDAO;
import java.util.List;

public class EntradaController {
    EntradaDAO entradaDao = new EntradaDAO();
    
    //INSERT
    public boolean controllerInsertEntrada(Entrada entrada){
        //TODO requisitos
        return entradaDao.daoInsertEntrada(entrada);
    }
    
    //READ
    public List<Entrada> controllerReadCompleteEntrada(){
        //TODO requisitos
        return null;
    }
    
    //UPDATE
    public boolean controllerUpdateEntrada(Entrada entrada){
        //TODO requisitos
        return entradaDao.daoUpdateEntrada(entrada);
    }
    
    //DELETE
    public boolean controllerDeleteEntrada(int id){
        //TODO requisitos
        return entradaDao.daoDeleteEntrada(id);
    }
}
