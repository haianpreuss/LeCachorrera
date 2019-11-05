package br.edu.senai.controller;

import br.edu.senai.model.bean.Categoria;
import br.edu.senai.model.dao.CategoriaDAO;
import java.util.List;

public class CategoriaController {
    CategoriaDAO categoriaDao = new CategoriaDAO();
    
    //INSERT
    public boolean controllerInsertCategoria(Categoria categoria){
        //TODO requisitos
        return categoriaDao.daoInsertCategoria(categoria);
    }
    
    //READ
    public List<Categoria> controllerReadCompleteCategoria(){
        return categoriaDao.daoReadCompleteCategoriaList();
    }
    
    //UPDATE
    public boolean controllerUpdateCategoria(Categoria categoria){
        //TODO requisitos
        return categoriaDao.daoUpdateCategoria(categoria);
    }
    
    //DELETE
    public boolean controllerDeleteCategoria(int id){
        //TODO requisitos
        return categoriaDao.daoDeleteCategoria(id);
    }
}
