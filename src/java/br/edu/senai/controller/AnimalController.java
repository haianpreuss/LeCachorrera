package br.edu.senai.controller;

import br.edu.senai.model.bean.Animal;
import br.edu.senai.model.dao.AnimalDAO;
import java.util.List;

public class AnimalController {
    AnimalDAO animalDao = new AnimalDAO();
    
    
    //INSERT
    public boolean controllerInsertAnimal(Animal esseAnimal){
        //TODO requisitos
        return animalDao.daoInsertAnimal(esseAnimal);
    }

    //READ
    public List<Animal> controllerReadCompleteAnimalList() {
        return animalDao.daoReadCompleteAnimalList();
    }
    
    //UPDATE
    public boolean controllerUpdateAnimal(Animal animal){
        //TODO requisitos
        return animalDao.daoUpdateAnimal(animal);
    }
    
    //DELETE
    public boolean controllerDeleteAnimal(int id){
        //TODO requisitos
        return animalDao.daoDeleteAnimal(id);
    }
    
}
