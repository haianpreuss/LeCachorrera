package br.edu.senai.model.dao;

import br.edu.senai.connection.ConnectionFactory;
import br.edu.senai.model.bean.Animal;
import br.edu.senai.model.bean.Cliente;
import br.edu.senai.model.bean.Especie;
import br.edu.senai.model.bean.Funcionario;
import br.edu.senai.model.bean.Ordem;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrdemDAO {
    ConnectionFactory connection;
    
    public OrdemDAO(){
        connection = new ConnectionFactory();
    }
    
    public boolean daoInsertOrdem(Ordem ordem){
        PreparedStatement stmt = null;
        
        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("CALL sp_insert_animal(?, ?, ?, ?, ?, ?)");
            stmt.setObject(1, ordem.getFuncionarioOrdem());
            stmt.setObject(2, ordem.getClienteOrdem());
            stmt.setObject(3, ordem.getAnimalOrdem());
            stmt.setObject(4, ordem.getIndexPagamentoOrdem());
            stmt.setBoolean(5, ordem.getStatusPagamentoOrdem());
            stmt.setBoolean(6, ordem.getStatusOrdem());
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(OrdemDAO.class.getName()).log(Level.SEVERE, null, ex);            
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }
    
    public List<Ordem> daoReadCompleteOrdemList(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Ordem> listaOrdem = new ArrayList<>();
        
        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("");
            rs = stmt.executeQuery();
            while(rs.next()){
                Ordem ordem = new Ordem();
                ordem.setIdOrdem(rs.getInt("idordem"));
                ordem.setFuncionarioOrdem((Funcionario) rs.getObject("funcionario_idfuncionario"));
                ordem.setClienteOrdem((Cliente) rs.getObject("cliente_idcliente"));
                ordem.setAnimalOrdem((Animal) rs.getObject("animal_idanimal"));
                ordem.setIndexPagamentoOrdem(rs.getInt(""));
                ordem.setStatusPagamentoOrdem(rs.getBoolean("status_pagamento_ordem"));
                ordem.setStatusOrdem(rs.getBoolean("status_ordem"));
                listaOrdem.add(ordem);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdemDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connection.closeConnection(stmt, rs);
        }
        return listaOrdem;
    }
    
    public boolean daoUpdateOrdem(Ordem ordem){
        PreparedStatement stmt = null;
        
        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("");
            stmt.setObject(1, ordem.getFuncionarioOrdem());
            stmt.setObject(2, ordem.getClienteOrdem());
            stmt.setObject(3, ordem.getAnimalOrdem());
            stmt.setObject(4, ordem.getIndexPagamentoOrdem());
            stmt.setBoolean(5, ordem.getStatusPagamentoOrdem());
            stmt.setBoolean(6, ordem.getStatusOrdem());
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(OrdemDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }
    
    public boolean daoDeleteOrdem(int id){
        PreparedStatement stmt = null;
        
        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(OrdemDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }
}
