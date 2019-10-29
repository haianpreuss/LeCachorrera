package br.edu.senai.service;

import br.edu.senai.controller.EnderecoController;
import br.edu.senai.controller.FornecedorController;
import br.edu.senai.model.bean.Endereco;
import br.edu.senai.model.bean.Fornecedor;
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

@Path("/fornecedor")
public class FornecedorService {
    FornecedorController fornecedorController = new FornecedorController();

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/insert")
    public Response serviceInsertFornecedor(Fornecedor fornecedor) {
        try {
            if (fornecedorController.controllerInsertForneceder(fornecedor)) {
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
    public List<Fornecedor> serviceReadFornecedor() {
        return fornecedorController.controllerReadCompleteFornecedor();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/update")
    public Response serviceUpdateFornecedor(Fornecedor fornecedor) {
        try {
            if (fornecedorController.controllerUpdateFornecedor(fornecedor)) {
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
    public Response serviceDeleteFornecedor(@PathParam("id") int id) {
        try {
            if (fornecedorController.controllerDelteFornecedor(id)) {
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
