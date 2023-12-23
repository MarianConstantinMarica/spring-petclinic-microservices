package org.springframework.samples.petclinic.authorization.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class AuthorizationServerClients {

    private Map<String, ClientProperties> clients;

    @ConfigurationProperties(prefix = "authorization")
    public Map<String, ClientProperties> getClients() {
        return clients;
    }

    public void setClients(Map<String, ClientProperties> clients) {
        this.clients = clients;
    }
}
