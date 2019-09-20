package br.edu.senai.model.dao;

import br.edu.senai.connection.ConnectionFactory;
import br.edu.senai.model.bean.Fornecedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FornecedorDAO {
    ConnectionFactory connection;

    public FornecedorDAO() {
        connection = new ConnectionFactory();
    }

    public boolean daoInsertFornecedor(Fornecedor fornecedor) {
        PreparedStatement stmt = null;

        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("");
            stmt.setString(1, fornecedor.getRazaoSocialFornecedor());
            stmt.setString(2, fornecedor.getNomeFantasiaFornecedor());
            stmt.setString(3, fornecedor.getDocumentoPessoa());
            stmt.setString(4, fornecedor.getIeFornecedor());
            stmt.setString(5, fornecedor.getTelefonePessoa());
            stmt.setString(6, fornecedor.getEmailPessoa());
            stmt.setString(7, fornecedor.getDataCadastroFornecedor());
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }

    public List<Fornecedor> daoReadCompleteFornecedorList() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Fornecedor> fornecedores = new ArrayList<>();

        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setIdPessoa(rs.getInt("idfornecedor"));
                fornecedor.setRazaoSocialFornecedor(rs.getString("razao_social_fornecedor"));
                fornecedor.setNomeFantasiaFornecedor(rs.getString("nome_fantasia_fornecedor"));
                fornecedor.setDocumentoPessoa(rs.getString("documento_fornecedor"));
                fornecedor.setIeFornecedor(rs.getString("ie_fornecedor"));
                fornecedor.setTelefonePessoa(rs.getString("telefone_fornecedor"));
                fornecedor.setEmailPessoa(rs.getString("email_fornecedor"));
                fornecedor.setDataCadastroFornecedor(rs.getString("data_cadastro_fornecedor"));
                fornecedores.add(fornecedor);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connection.closeConnection(stmt, rs);
        }
        return fornecedores;
    }

    public boolean daoUpdateFornecedor(Fornecedor fornecedor) {
        PreparedStatement stmt = null;

        try {
            stmt = connection.getConection().prepareStatement("");
            stmt.setInt(1, fornecedor.getIdPessoa());
            stmt.setString(2, fornecedor.getRazaoSocialFornecedor());
            stmt.setString(3, fornecedor.getNomeFantasiaFornecedor());
            stmt.setString(4, fornecedor.getDocumentoPessoa());
            stmt.setString(5, fornecedor.getIeFornecedor());
            stmt.setString(6, fornecedor.getTelefonePessoa());
            stmt.setString(7, fornecedor.getEmailPessoa());
            stmt.setString(8, fornecedor.getDataCadastroFornecedor());
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }

    public boolean daoDeleteFornecedor(int id) {
        PreparedStatement stmt = null;

        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }
}
