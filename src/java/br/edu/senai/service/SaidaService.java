package br.edu.senai.service;

import br.edu.senai.controller.EnderecoController;
import br.edu.senai.controller.SaidaController;
import br.edu.senai.model.bean.Endereco;
import br.edu.senai.model.bean.Saida;
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

@Path("/saida")
public class SaidaService {
    SaidaController saidaController = new SaidaController();

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/insert")
    public Response serviceInsertSaida(Saida saida) {
        try {
            if (saidaController.controllerInsertSaida(saida)) {
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
    public List<Saida> serviceReadSaida() {
        return saidaController.controllerReadCompleteSaida();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/update")
    public Response serviceUpdateSaida(Saida saida) {
        try {
            if (saidaController.controllerUpdateSaida(saida)) {
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
    public Response serviceDeleteSaida(@PathParam("id") int id) {
        try {
            if (saidaController.controllerDeleteSaida(id)) {
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
