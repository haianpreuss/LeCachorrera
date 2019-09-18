package br.edu.senai.controller;

import br.edu.senai.model.bean.Animal;
import br.edu.senai.model.dao.AnimalDAO;
import java.util.List;

public class AnimalController {
    AnimalDAO animalDao = new AnimalDAO();
    
    
    //INSERT
    public boolean controllerInsertAnimal(Animal esseAnimal){
        boolean result = false;
        //TODO requisitos
        if(animalDao.daoInsertAnimal(esseAnimal)){                        
            result = true;
        }
        return result;
    }

    //READ
    public List<Animal> controllerReadCompleteAnimalList() {
        //TODO code
        return null;
    }
    
    
    
}
