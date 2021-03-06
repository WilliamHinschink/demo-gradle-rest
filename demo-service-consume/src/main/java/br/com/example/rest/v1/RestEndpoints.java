package br.com.example.rest.v1;

import br.com.example.impl.service.ClienteService;
import br.com.example.rest.v1.binder.ClienteBinder;
import br.com.example.rest.v1.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/v1")
public class RestEndpoints {

    @Autowired
    private ClienteService clienteService;

    @GET
    @Path("/clientes")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cliente> getAllClientes() {
        return ClienteBinder.bindListFromImpl(clienteService.findAllClientes());
    }

    @GET
    @Path("/clientes/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Cliente getClienteById(@PathParam("id") Long id) {
        return ClienteBinder.bindFromImpl(clienteService.findById(id));
    }

    @DELETE
    @Path("/clientes/deleta/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteClienteById(@PathParam("id") Long id) {
        clienteService.deleteById(id);
    }

    @POST
    @Path("/clientes/insere")
    @Consumes(MediaType.APPLICATION_JSON)
    public void insertCliente(@RequestBody Cliente cliente) {
        clienteService.insertCliente(ClienteBinder.bindToModel(cliente));
    }

    @GET
    @Path("/clientes")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Cliente> findNameCliente(@QueryParam("nome") String nome) {
        return ClienteBinder.bindListFromImpl(clienteService.findByName(nome));
    }

    @PUT
    @Path("/clientes/atualiza")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void updateCliente(@RequestBody Cliente cliente) {
        if (clienteService.isClienteExist(ClienteBinder.bindToModel(cliente)))
            clienteService.updateCliente(ClienteBinder.bindToModel(cliente));
    }
}
