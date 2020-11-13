package io.swagger.api.factories;

import io.swagger.api.LocalizationApiService;
import io.swagger.api.impl.LocalizationApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-13T17:20:56.547Z[GMT]")public class LocalizationApiServiceFactory {
    private final static LocalizationApiService service = new LocalizationApiServiceImpl();

    public static LocalizationApiService getLocalizationApi() {
        return service;
    }
}
