package com.example;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;



    public class MyApplication extends ResourceConfig {
    public MyApplication() {
        super(MyResource.class);
        register(RolesAllowedDynamicFeature.class);
    }
    }
