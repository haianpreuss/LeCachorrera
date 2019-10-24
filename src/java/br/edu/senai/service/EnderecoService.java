package br.edu.senai.service;

import br.edu.senai.controller.EnderecoController;
import br.edu.senai.model.bean.Endereco;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/endereco")
public class EnderecoService {

    static EnderecoController enderecoController = new EnderecoController();

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/insert")
    public Response serviceInsertEndereco(Endereco endereco) {
        try {
            if (enderecoController.controllerInsertEndereco(endereco)) {
                return Response.ok().build();
            } else {
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
    public List<Endereco> serviceReadEndereco() {
        return enderecoController.controllerReadCompleteEndereco();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/update")
    public Response serviceUpdateEndereco(Endereco endereco) {
        try {
            if (enderecoController.controllerUpdateEndereco(endereco)) {
                return Response.ok().build();
            } else {
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
    public Response serviceDeleteEndereco(@PathParam("id") int id) {
        try {
            if (enderecoController.controllerDeleteEndereco(id)) {
                return Response.ok().build();
            } else {
                return Response.serverError().build();
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            return Response.serverError().build();
        }
    }
}
