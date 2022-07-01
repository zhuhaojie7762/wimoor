/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fulfillmentinbound;

import java.util.Objects;

import com.amazon.spapi.model.ErrorList;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The response schema for the voidTransport operation.
 */
@ApiModel(description = "The response schema for the voidTransport operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T11:30:31.304+08:00")
public class VoidTransportResponse {
  @SerializedName("payload")
  private CommonTransportResult payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public VoidTransportResponse payload(CommonTransportResult payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the voidTransport operation.
   * @return payload
  **/
  @ApiModelProperty(value = "The payload for the voidTransport operation.")
  public CommonTransportResult getPayload() {
    return payload;
  }

  public void setPayload(CommonTransportResult payload) {
    this.payload = payload;
  }

  public VoidTransportResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoidTransportResponse voidTransportResponse = (VoidTransportResponse) o;
    return Objects.equals(this.payload, voidTransportResponse.payload) &&
        Objects.equals(this.errors, voidTransportResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoidTransportResponse {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

