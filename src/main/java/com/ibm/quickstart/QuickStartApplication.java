package com.ibm.quickstart;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import com.codahale.metrics.JmxReporter;
import com.codahale.metrics.MetricRegistry;
import com.ibm.quickstart.resource.HelloResource;
import com.ibm.quickstart.util.ConfigurationStrings;

public class QuickStartApplication extends Application<ConfigurationStrings> {

    public static void main(String[] args) throws Exception {
        new QuickStartApplication().run(args);
    }

    @Override
	public String getName() {
		return "UBX Quick Start: Endpoints";
	}
    
    @Override
	public void initialize(Bootstrap<ConfigurationStrings> bootstrap) {
		final MetricRegistry mr = bootstrap.getMetricRegistry();
		final JmxReporter reporter = JmxReporter.forRegistry(mr).build();
		reporter.start();
	}
    
    @Override
    public void run(ConfigurationStrings conf, Environment env) throws Exception {
    	env.jersey().register(new HelloResource(conf));
    }

}