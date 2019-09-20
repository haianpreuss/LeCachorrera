package br.edu.senai.controller;

import br.edu.senai.model.bean.Produto;
import br.edu.senai.model.dao.ProdutoDAO;
import java.util.List;

public class ProdutoController {
    ProdutoDAO produtoDao = new ProdutoDAO();
    
    //INSERT
    public boolean controllerInsertProduto(Produto produto){
        //TODO requisitos
        return produtoDao.daoInsertProduto(produto);
    }
    
    //READ
    public List<Produto> controllerReadComplete(){
        //TODO requisitos
        return null;
    }
    
    //UPDATE
    public boolean controllerUpdateProduto(Produto produto){
        //TODO requisitos
        return produtoDao.daoUpdateProduto(produto);
    }
    
    //DELETE
    public boolean controllerDeleteProduto(int id){
        //TODO requisitos
        return produtoDao.daoDeleteProduto(id);
    }
}
