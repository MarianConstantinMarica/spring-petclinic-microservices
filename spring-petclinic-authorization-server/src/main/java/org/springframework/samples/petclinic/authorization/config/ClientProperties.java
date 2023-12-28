package org.springframework.samples.petclinic.authorization.config;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class ClientProperties {

    private String clientId;
    private String clientSecret;
    private Set<String> scopes;
}
