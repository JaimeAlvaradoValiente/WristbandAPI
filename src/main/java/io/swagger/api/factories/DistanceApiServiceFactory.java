package io.swagger.api.factories;

import io.swagger.api.DistanceApiService;
import io.swagger.api.impl.DistanceApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-13T17:20:56.547Z[GMT]")public class DistanceApiServiceFactory {
    private final static DistanceApiService service = new DistanceApiServiceImpl();

    public static DistanceApiService getDistanceApi() {
        return service;
    }
}
