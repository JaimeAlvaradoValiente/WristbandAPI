package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.LocalizationApiService;
import io.swagger.api.factories.LocalizationApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.Localization;

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


@Path("/localization")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-13T17:20:56.547Z[GMT]")public class LocalizationApi  {
   private final LocalizationApiService delegate;

   public LocalizationApi(@Context ServletConfig servletContext) {
      LocalizationApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("LocalizationApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (LocalizationApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = LocalizationApiServiceFactory.getLocalizationApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "obtener la localización de la pulsera", description = "Pasando un id de la pulsera  se obtiene su localización ", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "localización", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Localization.class)))),
        
        @ApiResponse(responseCode = "400", description = "dispositivo incorrecto") })
    public Response getLocalization(@Parameter(in = ParameterIn.QUERY, description = "id de la pulsera",required=true) @QueryParam("idWrist") Integer idWrist
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getLocalization(idWrist,securityContext);
    }
    @PUT
    
    
    
    @Operation(summary = "activa o desactiva la ubicación", description = "Activar o desactivar la ubicación en función de un valor ", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "pulsera incorrecta"),
        
        @ApiResponse(responseCode = "404", description = "pulsera no encontrada") })
    public Response putLocalization(@Parameter(in = ParameterIn.QUERY, description = "id de la pulsera",required=true) @QueryParam("idWrist") Integer idWrist
,@Parameter(in = ParameterIn.QUERY, description = "valor para activar o desactivar",required=true) @QueryParam("activate") Boolean activate
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.putLocalization(idWrist,activate,securityContext);
    }
}
