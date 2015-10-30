package com.ibm.quickstart.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.ibm.quickstart.util.ConfigurationStrings;

@Path(value = "/hello")
public class HelloResource {

    private final ConfigurationStrings conf;

    public HelloResource(ConfigurationStrings conf) {
        this.conf = conf;
    }

    @GET
    public String sayHello() {
        return conf.getServerParameters().getDb2host();
    }

}