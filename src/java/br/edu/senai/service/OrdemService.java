package br.edu.senai.service;

import br.edu.senai.controller.EnderecoController;
import br.edu.senai.controller.OrdemController;
import br.edu.senai.model.bean.Endereco;
import br.edu.senai.model.bean.Ordem;
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

@Path("/ordem")
public class OrdemService {
    OrdemController ordemController = new OrdemController();

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/insert")
    public Response serviceInsertOrdem(Ordem ordem) {
        try {
            if (ordemController.controllerInsertOrdem(ordem)) {
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
    public List<Ordem> serviceReadOrdem() {
        return ordemController.controllerReadCompleteOrdemList();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/update")
    public Response serviceUpdateOrdem(Ordem ordem) {
        try {
            if (ordemController.controllerUpdateOrdem(ordem)) {
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
    public Response serviceDeleteOrdem(@PathParam("id") int id) {
        try {
            if (ordemController.controllerDeleteOrdem(id)) {
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
