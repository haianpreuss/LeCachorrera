package br.edu.senai.service;

import br.edu.senai.controller.AnimalController;
import br.edu.senai.model.bean.Animal;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("")
public class AnimalService {
    //Instancia do controlador
    static AnimalController animalController = new AnimalController();
    
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/insert")
    public Response serviceInsertAnimal(Animal esseAnimal){
        if(animalController.controllerInsertAnimal(esseAnimal)){
            return Response.ok().build();
        }else{
            return Response.serverError().build();
        }
    }
    
    
    @GET
    @Path("/read")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Animal> serviceReadAnimal(){
        return animalController.controllerReadCompleteAnimalList();
    }
    
}
