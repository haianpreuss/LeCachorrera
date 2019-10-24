package br.edu.senai.service;

import br.edu.senai.controller.EntradaController;
import br.edu.senai.model.bean.Entrada;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/entrada")
public class EntradaService {
    static EntradaController entradaController = new EntradaController();

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/insert")
    public Response serviceInsertEntrada(Entrada entrada) {
        try {
            if (entradaController.controllerInsertEntrada(entrada)) {
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
    public Response serviceReadEntrada() {
        List<Entrada> listaEntrada = entradaController.controllerReadCompleteEntrada();
        GenericEntity<List<Entrada>> list = new GenericEntity<List<Entrada>>(listaEntrada) {
        };
        return Response.ok(list).build();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/update")
    public Response serviceUpdateEntrada(Entrada entrada) {
        try {
            if (entradaController.controllerUpdateEntrada(entrada)) {
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
    public Response serviceDeleteEntrada(@PathParam("id") int id) {
        try {
            if (entradaController.controllerDeleteEntrada(id)) {
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
