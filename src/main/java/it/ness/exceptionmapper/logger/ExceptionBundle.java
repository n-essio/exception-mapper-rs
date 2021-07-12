package it.ness.exceptionmapper.logger;

import java.text.ParseException;

import org.jboss.logging.Messages;
import org.jboss.logging.annotations.Message;
import org.jboss.logging.annotations.MessageBundle;
import org.jboss.logging.annotations.Param;

@MessageBundle(projectCode = "FLW")
public interface ExceptionBundle {

    ExceptionBundle EXCEPTIONS = Messages.getBundle(ExceptionBundle.class);

    @Message(id = 13231, value = "The config file could not be opened.")
    Exception configFileAccessError();

    @Message(id = 13232, value = "Date string '%s' was invalid.")
    ParseException dateWasInvalid(String dateString, @Param int errorOffset);

}
