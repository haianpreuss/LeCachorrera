package br.edu.senai.model.dao;

import br.edu.senai.connection.ConnectionFactory;
import br.edu.senai.model.bean.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProdutoDAO {
    ConnectionFactory connection;

    public ProdutoDAO() {
        connection = new ConnectionFactory();
    }

    public boolean daoInsertProduto(Produto produto) {
        PreparedStatement stmt = null;

        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("");
            stmt.setString(1, produto.getDescricaoProduto());
            stmt.setFloat(2, produto.getValorProduto());
            stmt.setInt(3, produto.getCategoriaIdCategoria());
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }

    public List<Produto> daoReadCompleteProdutoList() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Produto> produtos = new ArrayList<>();

        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setIdProduto(rs.getInt("idproduto"));
                produto.setDescricaoProduto(rs.getString("descricao_produto"));
                produto.setValorProduto(rs.getFloat("valor_produto"));
                produto.setEstoqueProduto(rs.getInt("estoque_produto"));
                produto.setCategoriaIdCategoria(rs.getInt("categoria_idcategoria"));
                produtos.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connection.closeConnection(stmt, rs);
        }
        return produtos;
    }

    public boolean daoUpdateProduto(Produto produto) {
        PreparedStatement stmt = null;

        try {
            stmt = connection.getConection().prepareStatement("");
            stmt.setInt(1, produto.getIdProduto());
            stmt.setString(2, produto.getDescricaoProduto());
            stmt.setFloat(3, produto.getValorProduto());
            stmt.setInt(4, produto.getCategoriaIdCategoria());
            stmt.executeUpdate();
            connection.confirm();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connection.closeConnection(stmt);
        }
    }

    public boolean daoDeleteProduto(int id) {
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
