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
 * The response schema for the getPreorderInfo operation.
 */
@ApiModel(description = "The response schema for the getPreorderInfo operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T11:30:31.304+08:00")
public class GetPreorderInfoResponse {
  @SerializedName("payload")
  private GetPreorderInfoResult payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetPreorderInfoResponse payload(GetPreorderInfoResult payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the getPreorderInfo operation.
   * @return payload
  **/
  @ApiModelProperty(value = "The payload for the getPreorderInfo operation.")
  public GetPreorderInfoResult getPayload() {
    return payload;
  }

  public void setPayload(GetPreorderInfoResult payload) {
    this.payload = payload;
  }

  public GetPreorderInfoResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * One or more unexpected errors occurred during the operation.
   * @return errors
  **/
  @ApiModelProperty(value = "One or more unexpected errors occurred during the operation.")
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
    GetPreorderInfoResponse getPreorderInfoResponse = (GetPreorderInfoResponse) o;
    return Objects.equals(this.payload, getPreorderInfoResponse.payload) &&
        Objects.equals(this.errors, getPreorderInfoResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPreorderInfoResponse {\n");
    
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

