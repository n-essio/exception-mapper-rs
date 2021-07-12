package it.ness.exceptionmapper.service.rs;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import it.ness.exceptionmapper.logger.ExceptionBundle;
import it.ness.exceptionmapper.service.SimpleService;

@ApplicationScoped
@Path("/prova")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProvaServiceRs {

    @Inject
    SimpleService simpleService;

    @Path("/single")
    @GET
    public Response prova() throws Exception {
        simpleService.prova();
        return Response.ok("single").build();
    }

    @Path("/nonso")
    @GET
    public Response nonso() {
        return Response.ok("nonso").build();
        
    }

    @Path("/exception1")
    @GET
    public Response exception1() throws Exception{
       throw ExceptionBundle.EXCEPTIONS.configFileAccessError();        
    }
}

