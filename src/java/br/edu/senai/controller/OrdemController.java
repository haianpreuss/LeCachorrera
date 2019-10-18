package br.edu.senai.controller;

import br.edu.senai.model.bean.Ordem;
import br.edu.senai.model.dao.OrdemDAO;
import java.util.List;

public class OrdemController {
    OrdemDAO ordemDao = new OrdemDAO();
    
    
    //INSERT
    public boolean controllerInsertOrdem(Ordem ordem){
        //TODO requisitos
        return ordemDao.daoInsertOrdem(null);
    }

    //READ
    public List<Ordem> controllerReadCompleteOrdemList() {
        //TODO code
        return ordemDao.daoReadCompleteOrdemList();
    }
    
    //UPDATE
    public boolean controllerUpdateOrdem(Ordem ordem){
        //TODO requisitos
        return ordemDao.daoUpdateOrdem(null);
    }
    
    //DELETE
    public boolean controllerDeleteOrdem(int id){
        //TODO requisitos
        return ordemDao.daoDeleteOrdem(id);
    }
}
