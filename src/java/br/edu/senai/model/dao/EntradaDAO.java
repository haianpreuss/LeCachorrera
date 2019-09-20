package br.edu.senai.model.dao;

import br.edu.senai.connection.ConnectionFactory;
import br.edu.senai.model.bean.Entrada;
import br.edu.senai.model.bean.Fornecedor;
import br.edu.senai.model.bean.Funcionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EntradaDAO {
    ConnectionFactory connection;

    public EntradaDAO() {
        connection = new ConnectionFactory();
    }

    public boolean daoInsertEntrada(Entrada entrada) {
        PreparedStatement stmt = null;

        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("");
            stmt.setString(1, entrada.getCodigoBarraEntrada());
            stmt.setObject(2, entrada.getFuncionarioEntrada());
            stmt.setObject(3, entrada.getFornecedorEntrada());
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EntradaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }

    public List<Entrada> daoReadCompleteEntradaList() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Entrada> entradas = new ArrayList<>();

        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Entrada entrada = new Entrada();
                entrada.setIdEntrada(rs.getInt("identrada"));
                entrada.setDataHoraEntrada(rs.getString("data_hora_entrada"));
                entrada.setCodigoBarraEntrada(rs.getString("codigo_barra_entrada"));
                entrada.setFuncionarioEntrada((Funcionario) rs.getObject("funcionario_idfuncionario"));
                entrada.setFornecedorEntrada((Fornecedor) rs.getObject("fornecedor_idfornecedor"));
                entradas.add(entrada);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EntradaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connection.closeConnection(stmt, rs);
        }
        return entradas;
    }

    public boolean daoUpdateEntrada(Entrada entrada) {
        PreparedStatement stmt = null;

        try {
            stmt = connection.getConection().prepareStatement("");
            stmt.setInt(1, entrada.getIdEntrada());
            stmt.setString(2, entrada.getDataHoraEntrada());
            stmt.setString(3, entrada.getCodigoBarraEntrada());
            stmt.setObject(4, entrada.getFuncionarioEntrada());
            stmt.setObject(5, entrada.getFornecedorEntrada());
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EntradaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }

    public boolean daoDeleteEntrada(int id) {
        PreparedStatement stmt = null;

        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EntradaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }
}
