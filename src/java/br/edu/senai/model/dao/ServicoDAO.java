package br.edu.senai.model.dao;

import br.edu.senai.connection.ConnectionFactory;
import br.edu.senai.model.bean.Servico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServicoDAO {
    ConnectionFactory connection;

    public ServicoDAO() {
        connection = new ConnectionFactory();
    }
    
    public boolean daoInsertServico(Servico servico){
        PreparedStatement stmt = null;
        
        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("CALL sp_inserir_servico(?,?)");
            stmt.setString(1, servico.getDescricaoServico());
            stmt.setFloat(2, servico.getValorServico());
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ServicoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
        
    }
    
    public List<Servico> daoReadCompleteServicoList(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Servico> servicos = new ArrayList<>();
        
        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("VIEW");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Servico servico = new Servico();
                servico.setIdServico(rs.getInt("idservico"));
                servico.setDescricaoServico(rs.getString("descricao_servico"));
                servico.setValorServico(rs.getFloat("valor_servico"));
                servicos.add(servico);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ServicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connection.closeConnection(stmt, rs);
        }
        return servicos;
    }
    
    public boolean daoUpdateServico(Servico servico){
        PreparedStatement stmt = null;
        
        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("");
            stmt.setString(1, servico.getDescricaoServico());
            stmt.setFloat(2, servico.getValorServico());
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ServicoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }
    
    public boolean daoDeleteServico(int id){
        PreparedStatement stmt = null;
        
        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ServicoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }
}
