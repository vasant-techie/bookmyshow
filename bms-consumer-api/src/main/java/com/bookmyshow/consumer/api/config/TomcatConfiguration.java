package com.bookmyshow.consumer.api.config;

import lombok.Data;
import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.coyote.ajp.AbstractAjpProtocol;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.bookmyshow.consumer.api.constants.ConsApiConstants.*;

@Configuration
@Data
public class TomcatConfiguration {
    /*
        @Value("${tomcat.ajp.port}")
        int ajpPort;

        @Value("${tomcat.ajp.remoteauthentication}")
        String remoteAuthentication;

        @Value("${tomcat.ajp.enabled}")
        boolean tomcatAjpEnabled;

        @Bean
        public TomcatServletWebServerFactory servletContainer() {

            TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
            if (tomcatAjpEnabled) {
                Connector ajpConnector = new Connector(AJP_VERSION);
                ajpConnector.setPort(ajpPort);
                ajpConnector.setSecure(true);
                ajpConnector.setAllowTrace(false);
                ajpConnector.setScheme(CONNECTOR_SCHEME);
                ajpConnector.setRedirectPort(REDIRECT_PORT);
                ((AbstractAjpProtocol) ajpConnector.getProtocolHandler()).setSecretRequired(false);
                tomcat.addAdditionalTomcatConnectors(ajpConnector);
                tomcat.addAdditionalTomcatConnectors(ajpConnector);
            }

            return tomcat;
        }*/
    @Bean
    public ServletWebServerFactory servletContainer() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory() {
            @Override
            protected void postProcessContext(Context context) {
                SecurityConstraint securityConstraint = new SecurityConstraint();
                securityConstraint.setUserConstraint("CONFIDENTIAL");
                SecurityCollection collection = new SecurityCollection();
                collection.addPattern("/*");
                securityConstraint.addCollection(collection);
                context.addConstraint(securityConstraint);
            }
        };
        tomcat.addAdditionalTomcatConnectors(redirectConnector());
        return tomcat;
    }

    private Connector redirectConnector() {
        Connector connector = new Connector(TomcatServletWebServerFactory.DEFAULT_PROTOCOL);
        connector.setPort(8080);
        connector.setSecure(true);
        connector.setAllowTrace(false);
        connector.setScheme(CONNECTOR_SCHEME);
        connector.setRedirectPort(8443);
        return connector;
    }
}