package it.ness.exceptionmapper.logger;

import org.jboss.logging.BasicLogger;
import org.jboss.logging.Logger;
import org.jboss.logging.annotations.LogMessage;
import org.jboss.logging.annotations.Message;
import static org.jboss.logging.Logger.Level.INFO;
import org.jboss.logging.annotations.MessageLogger;

@MessageLogger(projectCode="FLW")
public interface ServicesLogger extends BasicLogger {
    
    ServicesLogger LOGGER = Logger.getMessageLogger(ServicesLogger.class, "it.ness.services ");

    @LogMessage(level = INFO)
    @Message(id=1, value="Loading config from %s")
    void loadingFrom(Object from);

    @LogMessage(level = INFO)
    @Message(id=2, value="Hello %s")
    void hello(Object object);
}
