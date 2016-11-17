package br.com.example.rest.config;

import br.com.example.rest.v1.RestEndpoints;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * Created by william on 16/11/2016.
 */
@Component
@ApplicationPath("demo")
public class JerseyConfig extends ResourceConfig{

    public JerseyConfig(){
        super();
        register("io.swagger.jaxrs.json");
        register(io.swagger.jaxrs.listing.ApiListingResource.class);
        register(io.swagger.jaxrs.listing.SwaggerSerializers.class);
        register(RestEndpoints.class);
        register(CORSConfig.class);

    }
}
