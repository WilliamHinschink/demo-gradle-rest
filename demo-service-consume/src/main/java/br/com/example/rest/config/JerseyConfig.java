package br.com.example.rest.config;

import br.com.example.rest.v1.RestEndpoints;
import br.com.example.rest.v1.exceptionmapper.ApiExceptionMapper;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("demo")
public class JerseyConfig extends ResourceConfig{

    public JerseyConfig(){
        super();
        register("io.swagger.jaxrs.json");
        register(io.swagger.jaxrs.listing.ApiListingResource.class);
        register(io.swagger.jaxrs.listing.SwaggerSerializers.class);
        register(RestEndpoints.class);
        register(ApiExceptionMapper.class);
    }
}
