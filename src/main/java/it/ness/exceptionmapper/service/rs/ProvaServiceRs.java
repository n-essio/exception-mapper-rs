package it.ness.exceptionmapper.service.rs;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Path("/prova")
public class ProvaServiceRs {

    @Path("/single")
    public Response prova() {
        return Response.accepted().build();
    }
}
