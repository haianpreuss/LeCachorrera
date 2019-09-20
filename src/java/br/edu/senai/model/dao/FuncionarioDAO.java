package br.edu.senai.model.dao;

import br.edu.senai.connection.ConnectionFactory;
import br.edu.senai.model.bean.Funcionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FuncionarioDAO {
    ConnectionFactory connection;

    public FuncionarioDAO() {
        connection = new ConnectionFactory();
    }

    public boolean daoInsertFuncionario(Funcionario funcionario) {
        PreparedStatement stmt = null;

        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("");
            stmt.setString(1, funcionario.getNomeFuncionario());
            stmt.setString(2, funcionario.getDocumentoPessoa());
            stmt.setString(3, funcionario.getTelefonePessoa());
            stmt.setString(4, funcionario.getEmailPessoa());
            stmt.setString(5, funcionario.getSetorFuncionario());
            stmt.setString(6, funcionario.getCargoFuncionario());
            stmt.setString(7, funcionario.getSexoFuncionario());
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }

    public List<Funcionario> daoReadCompleteFuncionarioList() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Funcionario> funcionarios = new ArrayList<>();

        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setIdPessoa(rs.getInt("idfuncionario"));
                funcionario.setNomeFuncionario(rs.getString("nome_funcionario"));
                funcionario.setDocumentoPessoa(rs.getString("documento_funcionario"));
                funcionario.setTelefonePessoa(rs.getString("telefone_funcionario"));
                funcionario.setEmailPessoa(rs.getString("email_funcionario"));
                funcionario.setSetorFuncionario(rs.getString("setor_funcionario"));
                funcionario.setCargoFuncionario(rs.getString("cargo_funcionario"));
                funcionario.setSexoFuncionario(rs.getString("sexo_funcionario"));
                funcionarios.add(funcionario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connection.closeConnection(stmt, rs);
        }
        return funcionarios;
    }

    public boolean daoUpdateFuncionario(Funcionario funcionario) {
        PreparedStatement stmt = null;

        try {
            stmt = connection.getConection().prepareStatement("");
            stmt.setInt(1, funcionario.getIdPessoa());
            stmt.setString(2, funcionario.getNomeFuncionario());
            stmt.setString(3, funcionario.getDocumentoPessoa());
            stmt.setString(4, funcionario.getTelefonePessoa());
            stmt.setString(5, funcionario.getEmailPessoa());
            stmt.setString(6, funcionario.getSetorFuncionario());
            stmt.setString(7, funcionario.getCargoFuncionario());
            stmt.setString(8, funcionario.getSexoFuncionario());
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }

    public boolean daoDeleteFuncionario(int id) {
        PreparedStatement stmt = null;

        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }
}
