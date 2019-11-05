package br.edu.senai.model.dao;

import br.edu.senai.connection.ConnectionFactory;
import br.edu.senai.model.bean.Categoria;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CategoriaDAO {

    ConnectionFactory connection;

    public CategoriaDAO() {
        connection = new ConnectionFactory();
    }

    public boolean daoInsertCategoria(Categoria categoria) {
        PreparedStatement stmt = null;

        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("");
            stmt.setString(1, categoria.getDescricaoCategoria());
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }

    public List<Categoria> daoReadCompleteCategoriaList() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Categoria> categorias = new ArrayList<>();

        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("SELECT *FROM categoria");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setIdCategoria(rs.getInt("idcategoria"));
                categoria.setDescricaoCategoria(rs.getString("descricao_categoria"));
                categorias.add(categoria);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connection.closeConnection(stmt, rs);
        }
        return categorias;
    }

    public boolean daoUpdateCategoria(Categoria categoria) {
        PreparedStatement stmt = null;

        try {
            stmt = connection.getConection().prepareStatement("");
            stmt.setInt(1, categoria.getIdCategoria());
            stmt.setString(2, categoria.getDescricaoCategoria());
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }

    public boolean daoDeleteCategoria(int id) {
        PreparedStatement stmt = null;

        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }
}
