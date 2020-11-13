package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.DistanceApiService;
import io.swagger.api.factories.DistanceApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/distance")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-13T17:20:56.547Z[GMT]")public class DistanceApi  {
   private final DistanceApiService delegate;

   public DistanceApi(@Context ServletConfig servletContext) {
      DistanceApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("DistanceApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (DistanceApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = DistanceApiServiceFactory.getDistanceApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "obtener la distancia entre el bastón y la pulsera.", description = "Pasando un id del bastón se obtiene la distancia entre este y la pulsera ", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "distancia entre bastón y pulsera", content = @Content(schema = @Schema(implementation = Integer.class))),
        
        @ApiResponse(responseCode = "400", description = "id del bastón incorrecto") })
    public Response getDistance(@Parameter(in = ParameterIn.QUERY, description = "id del bastón",required=true) @QueryParam("idStick") Integer idStick
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getDistance(idStick,securityContext);
    }
}
