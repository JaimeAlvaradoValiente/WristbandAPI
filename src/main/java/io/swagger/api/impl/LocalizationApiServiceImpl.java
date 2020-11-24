package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Localization;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-13T17:20:56.547Z[GMT]")public class LocalizationApiServiceImpl extends LocalizationApiService {
    @Override
    public Response getLocalization( @NotNull Integer idWrist, SecurityContext securityContext) throws NotFoundException {
        System.out.println("Recibiendo petición para ofrecer la localización");
        if (idWrist == null) {
            System.out.println ("Se ha introducido un id de dispositivo incorrecto");
            return Response.status(Response.Status.BAD_REQUEST).entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "¡Dispositivo incorrecto!")).build();
        }
        else {
            System.out.println("Localización de la pulsera con id " + idWrist);
            Localization localization = new Localization();
            localization.setLatitud(39);
            localization.setLongitud(-6);
            localization.setAltitud(378);
            localization.setHeading(14);
            return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, localization.toString())).build();
        }
    }
    @Override
    public Response putLocalization( @NotNull Integer idWrist,  @NotNull Boolean activate, SecurityContext securityContext) throws NotFoundException {
        if (idWrist == null) {
            System.out.println ("Dispositivo incorrecto");
            return Response.status(Response.Status.BAD_REQUEST).entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "¡Dispositivo incorrecto!")).build();
        }
        else {
            if (activate) {
                System.out.println ("Activando la localización");
                return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "Localización activada")).build();
            }
                System.out.println ("Desactivando la localización");
                return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "Localización desactivada")).build();
        }
    }
}