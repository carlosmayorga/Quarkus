package org.cmayorga.quarkus;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import java.util.logging.Logger;

@ApplicationScoped
public class AppLifecycleBean {
    public static final Logger LOGGER = Logger.getLogger("ListenerBean");

    void onStart(@Observes StartupEvent startupEvent){
        LOGGER.info("The applicaation is starting ...");
    }

    void onStop(@Observes ShutdownEvent shutdownEvent){
        LOGGER.info("The application is being Stopping ...");
    }
}
