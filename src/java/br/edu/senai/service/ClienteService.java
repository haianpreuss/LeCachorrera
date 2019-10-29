package br.edu.senai.service;

import br.edu.senai.controller.ClienteController;
import br.edu.senai.model.bean.Cliente;
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

@Path("/cliente")
public class ClienteService {

    ClienteController clienteController = new ClienteController();

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/insert")
    public Response serviceInsertCliente(Cliente cliente) {
        try {
            if (clienteController.controllerInsertCliente(cliente)) {
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
    public List<Cliente> serviceReadCliente() {
        return clienteController.controllerReadCompleteClienteList();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/update")
    public Response serviceUpdateCliente(Cliente cliente) {
        try {
            if (clienteController.controllerUpdateCliente(cliente)) {
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
    public Response serviceDeleteCliente(@PathParam("id") int id) {
        try {
            if (clienteController.controllerDeleteCliente(id)) {
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
