package br.edu.senai.model.dao;

import br.edu.senai.connection.ConnectionFactory;
import br.edu.senai.model.bean.Funcionario;
import br.edu.senai.model.bean.Saida;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaidaDAO {
    ConnectionFactory connection;

    public SaidaDAO() {
        connection = new ConnectionFactory();
    }

    public boolean daoInsertSaida(Saida saida) {
        PreparedStatement stmt = null;

        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("CALL sp_insert_saida(?,?)");
            stmt.setString(2, saida.getTipoSaida());
            stmt.setObject(3, saida.getFuncionarioSaida());
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SaidaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }

    public List<Saida> daoReadCompleteSaidaList() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Saida> saidas = new ArrayList<>();
        

        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("SELECT *FROM saida");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Saida saida = new Saida();
                Funcionario funcionario = new Funcionario();
                saida.setIdSaida(rs.getInt("idsaida"));
                saida.setDataHoraSaida(rs.getString("data_hora_saida"));
                saida.setTipoSaida(rs.getString("tipo_saida"));
                funcionario.setIdPessoa(rs.getInt("funcionario_idfuncionario"));
                saida.setFuncionarioSaida(funcionario);
                saidas.add(saida);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SaidaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connection.closeConnection(stmt, rs);
        }
        return saidas;
    }

    public boolean daoUpdateSaida(Saida saida) {
        PreparedStatement stmt = null;

        try {
            stmt = connection.getConection().prepareStatement("");
            stmt.setInt(1, saida.getIdSaida());
            stmt.setString(2, saida.getDataHoraSaida());
            stmt.setString(3, saida.getTipoSaida());
            stmt.setObject(4, saida.getFuncionarioSaida());
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SaidaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }

    public boolean daoDeleteSaida(int id) {
        PreparedStatement stmt = null;

        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SaidaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }
}
