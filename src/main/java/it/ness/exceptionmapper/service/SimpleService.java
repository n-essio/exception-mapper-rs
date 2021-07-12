package it.ness.exceptionmapper.service;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.inject.Inject;

import org.jboss.logging.Logger;

import it.ness.exceptionmapper.logger.ServicesLogger;
import it.ness.exceptionmapper.model.Prova;

@ApplicationScoped
public class SimpleService {

    @Inject
    Logger logger;

    @Transactional
    public void prova() throws Exception {
        Prova prova = new Prova();
        if (prova.uuid == null) {
            ServicesLogger.LOGGER.loadingFrom("booh");
        } else {
            prova.name = "flower";
            prova.persist();
            logger.info("ciao ciao: " + prova);
        }
    }
}
