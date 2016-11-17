package br.com.example.rest.v1;

import br.com.example.impl.model.Cliente;
import br.com.example.impl.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by william on 16/11/2016.
 */
@Component
@Path("/v1")
public class RestEndpoints {

    @Autowired
    private ClienteService clienteService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/clientes")
    public List<Cliente> getClientes(){
        return clienteService.findAllClientes();
    }


}
