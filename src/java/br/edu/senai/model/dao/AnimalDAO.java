package br.edu.senai.model.dao;

import br.edu.senai.connection.ConnectionFactory;
import br.edu.senai.model.bean.Animal;
import br.edu.senai.model.bean.Especie;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AnimalDAO {
    ConnectionFactory connection;
    
    public AnimalDAO(){
        connection = new ConnectionFactory();
    }
    
    public boolean daoInsertAnimal(Animal animal){
        boolean result = false;
        PreparedStatement stmt = null;
        Especie especie = new Especie();
        
        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("CALL sp_insert_animal(?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setObject(1, animal.getClienteAnimal());
            stmt.setString(2, animal.getNomeAnimal());
            stmt.setString(3, animal.getDataNascimentoAnimal());
            stmt.setString(4, animal.getRacaAnimal());
            stmt.setString(5, animal.getPorteAnimal());
            stmt.setString(6, animal.getObservacaoAnimal());
            stmt.setString(7, animal.getSexoAnimal());
            stmt.setString(8, animal.getDataCadastroAnimal());
            stmt.setString(9, especie.getIndex(animal.getIndexEspecieAnimal()));
            stmt.executeUpdate();
            connection.confirm();
            result = true;
        } catch (SQLException ex) {
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);            
        } finally {
            connection.closeConnection(stmt);
        }
        return result;
    }
    
    public List<Animal> daoReadCompleteAnimalList(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Animal> animais = new ArrayList<>();
        
        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("");
            rs = stmt.executeQuery();
            while(rs.next()){
                Animal animal = new Animal();
                animal.setIdAnimal(rs.getInt("idanimal"));
                animal.setNomeAnimal(rs.getString("nome_animal"));
                animal.setDataNascimentoAnimal(rs.getString("data_nascimento_animal"));
                animal.setRacaAnimal(rs.getString("raca_animal"));
                animal.setPorteAnimal(rs.getString("porte_animal"));
                animal.setObservacaoAnimal(rs.getString("observacao_animal"));
                animal.setSexoAnimal(rs.getString("sexo_animal"));
                animal.setDataCadastroAnimal("data_cadastro_animal");
                animais.add(animal);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connection.closeConnection(stmt, rs);
        }
        return animais;
    }
    
    public void update(Animal animal){
        PreparedStatement stmt = null;
        
        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("");
            stmt.setInt(1, animal.getIdAnimal());
            stmt.setObject(2, animal.getClienteAnimal());
            stmt.setString(3, animal.getNomeAnimal());
            stmt.setString(4, animal.getDataNascimentoAnimal());
            stmt.setString(5, animal.getRacaAnimal());
            stmt.setString(6, animal.getPorteAnimal());
            stmt.setString(7, animal.getObservacaoAnimal());
            stmt.setString(8, animal.getSexoAnimal());
            stmt.setString(9, animal.getDataCadastroAnimal());
            stmt.setInt(10, animal.getIndexEspecieAnimal());
            stmt.executeUpdate();
            connection.confirm();
        } catch (SQLException ex) {
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connection.closeConnection(stmt);
        }
    }
    
    public void delete(int id){
        PreparedStatement stmt = null;
        
        try {
            connection.openConnection();
            stmt = connection.getConection().prepareStatement("");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            connection.confirm();
        } catch (SQLException ex) {
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connection.closeConnection(stmt);
        }
    }
}
