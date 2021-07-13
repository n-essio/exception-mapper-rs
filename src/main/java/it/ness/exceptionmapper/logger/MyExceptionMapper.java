package it.ness.exceptionmapper.logger;

import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.jboss.logging.Logger;

@Provider
public class MyExceptionMapper implements ExceptionMapper<Throwable>{

    @Inject
    Logger logger;

    @Override
    public Response toResponse(Throwable exception) {
        // TODO Auto-generated method stub bohgh
        logger.info(exception);
        return Response.serverError().build();
    }
    
}
