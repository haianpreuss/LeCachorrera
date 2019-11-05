package br.edu.senai.controller;

import br.edu.senai.model.bean.Servico;
import br.edu.senai.model.dao.ServicoDAO;
import java.util.List;

public class ServicoController {
    ServicoDAO servicoDao = new ServicoDAO();
    
    
    //INSERT
    public boolean controllerInsertServico(Servico servico){
        //TODO requisitos
        return servicoDao.daoInsertServico(servico);
    }

    //READ
    public List<Servico> controllerReadCompleteServicoList() {
        //TODO code
        return servicoDao.daoReadCompleteServicoList();
    }
    
    //UPDATE
    public boolean controllerUpdateServico(Servico servico){
        //TODO requisitos
        return servicoDao.daoUpdateServico(servico);
    }
    
    //DELETE
    public boolean controllerDeleteServico(int id){
        //TODO requisitos
        return servicoDao.daoDeleteServico(id);
    }
}
