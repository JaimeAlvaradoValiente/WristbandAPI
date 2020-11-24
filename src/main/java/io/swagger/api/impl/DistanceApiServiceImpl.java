package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-13T17:20:56.547Z[GMT]")public class DistanceApiServiceImpl extends DistanceApiService {
    @Override
    public Response getDistance( @NotNull Integer idStick, SecurityContext securityContext) throws NotFoundException {
        System.out.println("Recibiendo petición para calcular la distancia entre el bastón y la pulsera");

        if (idStick == null) {
            System.out.println ("Se ha introducido un id del bastón incorrecto");
            return Response.status(Response.Status.BAD_REQUEST).entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "¡Dispositivo incorrecto!")).build();
        }
        else {
            System.out.println("Obteniendo distancia entre pulsera y bastón con id " + idStick);
            return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "300")).build();
        }
    }
}
