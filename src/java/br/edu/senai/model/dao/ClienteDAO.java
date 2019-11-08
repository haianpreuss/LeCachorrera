package br.edu.senai.model.dao;

import br.edu.senai.connection.ConnectionFactory;
import br.edu.senai.model.bean.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO {
    ConnectionFactory connection;

    public ClienteDAO() {
        connection = new ConnectionFactory();
    }

    public boolean daoInsertCliente(Cliente cliente) {
        PreparedStatement stmt = null;

        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("CALL sp_inserir_cliente(?,?,?,?,?,?)");
            stmt.setString(1, cliente.getNomeCliente());
            stmt.setString(2, cliente.getDocumentoPessoa());
            stmt.setString(3, cliente.getTelefonePessoa());
            stmt.setString(4, cliente.getEmailPessoa());
            stmt.setString(5, cliente.getTipoCliente());
            stmt.setString(6, cliente.getSexoCliente());
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }

    public List<Cliente> daoReadCompleteClienteList() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Cliente> clientes = new ArrayList<>();

        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("SELECT *FROM cliente");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdPessoa(rs.getInt("idcliente"));
                cliente.setNomeCliente(rs.getString("nome_cliente"));
                cliente.setDocumentoPessoa(rs.getString("documento_cliente"));
                cliente.setTelefonePessoa(rs.getString("telefone_cliente"));
                cliente.setEmailPessoa(rs.getString("email_cliente"));
                cliente.setTipoCliente(rs.getString("tipo_cliente"));
                cliente.setSexoCliente(rs.getString("sexo_cliente"));
                cliente.setDataCadastro(rs.getString("data_cadastro_cliente"));
                cliente.setEnderecoIdEndereco(rs.getInt("endereco_idendereco"));
                clientes.add(cliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connection.closeConnection(stmt, rs);
        }
        return clientes;
    }

    public boolean daoUpdateCliente(Cliente cliente) {
        PreparedStatement stmt = null;

        try {
            stmt = connection.getConection().prepareStatement("CALL sp_update_cliente(?,?,?,?,?,?,?)");
            stmt.setInt(1, cliente.getIdPessoa());
            stmt.setString(2, cliente.getNomeCliente());
            stmt.setString(3, cliente.getDocumentoPessoa());
            stmt.setString(4, cliente.getTelefonePessoa());
            stmt.setString(5, cliente.getEmailPessoa());
            stmt.setString(6, cliente.getTipoCliente());
            stmt.setString(7, cliente.getSexoCliente());
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }

    public boolean daoDeleteCliente(int id) {
        PreparedStatement stmt = null;

        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }
}
