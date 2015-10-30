package com.ibm.quickstart.util;

import io.dropwizard.Configuration;

import javax.validation.constraints.NotNull;

public class ConfigurationStrings extends Configuration{

    @NotNull
    private ServerParameters serverParameters;

    public ServerParameters getServerParameters() {
        return serverParameters;
    }

    public void setServerParameters(ServerParameters serverParameters) {
        this.serverParameters = serverParameters;
    }
}