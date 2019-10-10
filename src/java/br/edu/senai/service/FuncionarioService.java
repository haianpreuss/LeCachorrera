package br.edu.senai.service;

import br.edu.senai.controller.FuncionarioController;
import br.edu.senai.model.bean.Funcionario;
import javax.ws.rs.Path;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/funcionario")
public class FuncionarioService {

    static FuncionarioController funcionarioController = new FuncionarioController();

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/insert")
    public Response serviceInsertFuncionario(Funcionario novoFuncionario) {
        try {
            if(funcionarioController.controllerInsertFuncionario(novoFuncionario)){
                return Response.ok().build();
            }else{
                return Response.serverError().build();
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            return Response.serverError().build();
        }
    }
    
    @GET
    @Path("/read")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Funcionario> serviceReadFuncionario(){
        return funcionarioController.controllerReadCompleteFuncionario();
    }
    
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/update")
    public Response serviceUpdateFuncionario(Funcionario novoFuncionario){
        try {
            if(funcionarioController.controllerUpdateFuncionario(novoFuncionario)){
                return Response.ok().build();
            }else{
                return Response.serverError().build();
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            return Response.serverError().build();
        }
    }
    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/delete/{d}")
    public Response serviceDeleteFuncionario(@PathParam("id") int id){
        try{
            if(funcionarioController.controllerDeleteFuncionario(id)){
                return Response.ok().build();
            }else{
                return Response.serverError().build();
            }
        }catch(Exception exception){
            exception.printStackTrace();
            return Response.serverError().build();
        }
    }
}
