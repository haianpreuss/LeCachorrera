package br.edu.senai.model.dao;

import br.edu.senai.connection.ConnectionFactory;
import br.edu.senai.model.bean.Endereco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EnderecoDAO {
    ConnectionFactory connection;

    public EnderecoDAO() {
        connection = new ConnectionFactory();
    }

    public boolean daoInsertEndereco(Endereco endereco) {
        PreparedStatement stmt = null;

        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("CALL sp_insert_endereco(?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, endereco.getCepEndereco());
            stmt.setString(2, endereco.getUfEndereco());
            stmt.setString(3, endereco.getCidadeEndereco());
            stmt.setString(4, endereco.getBairroEndereco());
            stmt.setString(5, endereco.getLogradouroEndereco());
            stmt.setString(6, endereco.getNumeroEndereco());
            stmt.setString(7, endereco.getComplementoEndereco());
            stmt.setString(8, endereco.getReferenciaEndereco());
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }

    public List<Endereco> daoReadCompleteEnderecoList() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Endereco> enderecos = new ArrayList<>();

        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("SELECT *FROM endereco");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Endereco endereco = new Endereco();
                endereco.setIdEndereco(rs.getInt("idendereco"));
                endereco.setCepEndereco(rs.getString("cep_endereco"));
                endereco.setUfEndereco(rs.getString("uf_endereco"));
                endereco.setCidadeEndereco(rs.getString("cidade_endereco"));
                endereco.setBairroEndereco(rs.getString("bairro_endereco"));
                endereco.setLogradouroEndereco(rs.getString("logradouro_endereco"));
                endereco.setNumeroEndereco(rs.getString("numero_endereco"));
                endereco.setComplementoEndereco(rs.getString("complemento_endereco"));
                endereco.setReferenciaEndereco(rs.getString("referencia_endereco"));                
                enderecos.add(endereco);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connection.closeConnection(stmt, rs);
        }
        return enderecos;
    }

    public boolean daoUpdateEndereco(Endereco endereco) {
        PreparedStatement stmt = null;

        try {
            stmt = connection.getConection().prepareStatement("");
            stmt.setInt(1, endereco.getIdEndereco());
            stmt.setString(2, endereco.getCepEndereco());
            stmt.setString(3, endereco.getCidadeEndereco());
            stmt.setString(4, endereco.getBairroEndereco());
            stmt.setString(5, endereco.getLogradouroEndereco());
            stmt.setString(6, endereco.getNumeroEndereco());
            stmt.setString(7, endereco.getComplementoEndereco());
            stmt.setString(8, endereco.getReferenciaEndereco());
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }

    public boolean daoDeleteEndereco(int id) {
        PreparedStatement stmt = null;

        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }
}
