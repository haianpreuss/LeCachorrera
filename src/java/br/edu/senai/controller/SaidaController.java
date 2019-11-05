package br.edu.senai.controller;

import br.edu.senai.model.bean.Saida;
import br.edu.senai.model.dao.SaidaDAO;
import java.util.List;

public class SaidaController {
    SaidaDAO saidaDao = new SaidaDAO();
    
    //INSERT
    public boolean controllerInsertSaida(Saida saida){
        //TODO requisitos
        return saidaDao.daoInsertSaida(saida);
    }
    
    //READ
    public List<Saida> controllerReadCompleteSaida(){
        //TODO requisitos
        return saidaDao.daoReadCompleteSaidaList();
    }
    
    //UPDATE
    public boolean controllerUpdateSaida(Saida saida){
        //TODO requisitos
        return saidaDao.daoUpdateSaida(saida);
    }
    
    //DELETE
    public boolean controllerDeleteSaida(int id){
        //TODO requisitos
        return saidaDao.daoDeleteSaida(id);
    }
}
