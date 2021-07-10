package it.ness.exceptionmapper.service;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.inject.Inject;

import org.jboss.logging.Logger;

import it.ness.exceptionmapper.model.Prova;

@ApplicationScoped
public class SimpleService {

    @Inject
    Logger logger;

    @Transactional
    public void prova() {
        Prova prova = new Prova();
        prova.name="flower";
        prova.persist();
        logger.info("ciao ciao: " + prova);
    }
    
}
