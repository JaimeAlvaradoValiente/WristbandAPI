/*
 * Wristband API
 * API asociada al dispositivo del bastón
 *
 * OpenAPI spec version: 1.0.0
 * Contact: you@your-company.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Localization
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-13T17:20:56.547Z[GMT]")public class Localization   {
  @JsonProperty("latitud")
  private Integer latitud = null;

  @JsonProperty("longitud")
  private Integer longitud = null;

  @JsonProperty("altitud")
  private Integer altitud = null;

  @JsonProperty("heading")
  private Integer heading = null;

  public Localization latitud(Integer latitud) {
    this.latitud = latitud;
    return this;
  }

  /**
   * Get latitud
   * @return latitud
   **/
  @JsonProperty("latitud")
  @Schema(required = true, description = "")
  @NotNull
  public Integer getLatitud() {
    return latitud;
  }

  public void setLatitud(Integer latitud) {
    this.latitud = latitud;
  }

  public Localization longitud(Integer longitud) {
    this.longitud = longitud;
    return this;
  }

  /**
   * Get longitud
   * @return longitud
   **/
  @JsonProperty("longitud")
  @Schema(required = true, description = "")
  @NotNull
  public Integer getLongitud() {
    return longitud;
  }

  public void setLongitud(Integer longitud) {
    this.longitud = longitud;
  }

  public Localization altitud(Integer altitud) {
    this.altitud = altitud;
    return this;
  }

  /**
   * Get altitud
   * @return altitud
   **/
  @JsonProperty("altitud")
  @Schema(example = "378", required = true, description = "")
  @NotNull
  public Integer getAltitud() {
    return altitud;
  }

  public void setAltitud(Integer altitud) {
    this.altitud = altitud;
  }

  public Localization heading(Integer heading) {
    this.heading = heading;
    return this;
  }

  /**
   * Get heading
   * @return heading
   **/
  @JsonProperty("heading")
  @Schema(required = true, description = "")
  @NotNull
  public Integer getHeading() {
    return heading;
  }

  public void setHeading(Integer heading) {
    this.heading = heading;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Localization localization = (Localization) o;
    return Objects.equals(this.latitud, localization.latitud) &&
        Objects.equals(this.longitud, localization.longitud) &&
        Objects.equals(this.altitud, localization.altitud) &&
        Objects.equals(this.heading, localization.heading);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitud, longitud, altitud, heading);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Localization {\n");
    
    sb.append("    latitud: ").append(toIndentedString(latitud)).append("\n");
    sb.append("    longitud: ").append(toIndentedString(longitud)).append("\n");
    sb.append("    altitud: ").append(toIndentedString(altitud)).append("\n");
    sb.append("    heading: ").append(toIndentedString(heading)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
