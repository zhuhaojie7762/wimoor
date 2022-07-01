/*
 * Selling Partner API for Finances
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.finances;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.finances.Currency;
import com.amazon.spapi.model.finances.SAFETReimbursementItemList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A SAFE-T claim reimbursement on the seller&#39;s account.
 */
@ApiModel(description = "A SAFE-T claim reimbursement on the seller's account.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:01:58.583+08:00")
public class SAFETReimbursementEvent {
  @SerializedName("PostedDate")
  private String postedDate = null;

  @SerializedName("SAFETClaimId")
  private String saFETClaimId = null;

  @SerializedName("ReimbursedAmount")
  private Currency reimbursedAmount = null;

  @SerializedName("ReasonCode")
  private String reasonCode = null;

  @SerializedName("SAFETReimbursementItemList")
  private SAFETReimbursementItemList saFETReimbursementItemList = null;

  public SAFETReimbursementEvent postedDate(String postedDate) {
    this.postedDate = postedDate;
    return this;
  }

   /**
   * The date and time when the financial event was posted.
   * @return postedDate
  **/
  @ApiModelProperty(value = "The date and time when the financial event was posted.")
  public String getPostedDate() {
    return postedDate;
  }

  public void setPostedDate(String postedDate) {
    this.postedDate = postedDate;
  }

  public SAFETReimbursementEvent saFETClaimId(String saFETClaimId) {
    this.saFETClaimId = saFETClaimId;
    return this;
  }

   /**
   * A SAFE-T claim identifier.
   * @return saFETClaimId
  **/
  @ApiModelProperty(value = "A SAFE-T claim identifier.")
  public String getSaFETClaimId() {
    return saFETClaimId;
  }

  public void setSaFETClaimId(String saFETClaimId) {
    this.saFETClaimId = saFETClaimId;
  }

  public SAFETReimbursementEvent reimbursedAmount(Currency reimbursedAmount) {
    this.reimbursedAmount = reimbursedAmount;
    return this;
  }

   /**
   * The amount of the reimbursement.
   * @return reimbursedAmount
  **/
  @ApiModelProperty(value = "The amount of the reimbursement.")
  public Currency getReimbursedAmount() {
    return reimbursedAmount;
  }

  public void setReimbursedAmount(Currency reimbursedAmount) {
    this.reimbursedAmount = reimbursedAmount;
  }

  public SAFETReimbursementEvent reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Indicates why the seller was reimbursed.
   * @return reasonCode
  **/
  @ApiModelProperty(value = "Indicates why the seller was reimbursed.")
  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  public SAFETReimbursementEvent saFETReimbursementItemList(SAFETReimbursementItemList saFETReimbursementItemList) {
    this.saFETReimbursementItemList = saFETReimbursementItemList;
    return this;
  }

   /**
   * Get saFETReimbursementItemList
   * @return saFETReimbursementItemList
  **/
  @ApiModelProperty(value = "")
  public SAFETReimbursementItemList getSaFETReimbursementItemList() {
    return saFETReimbursementItemList;
  }

  public void setSaFETReimbursementItemList(SAFETReimbursementItemList saFETReimbursementItemList) {
    this.saFETReimbursementItemList = saFETReimbursementItemList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SAFETReimbursementEvent saFETReimbursementEvent = (SAFETReimbursementEvent) o;
    return Objects.equals(this.postedDate, saFETReimbursementEvent.postedDate) &&
        Objects.equals(this.saFETClaimId, saFETReimbursementEvent.saFETClaimId) &&
        Objects.equals(this.reimbursedAmount, saFETReimbursementEvent.reimbursedAmount) &&
        Objects.equals(this.reasonCode, saFETReimbursementEvent.reasonCode) &&
        Objects.equals(this.saFETReimbursementItemList, saFETReimbursementEvent.saFETReimbursementItemList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postedDate, saFETClaimId, reimbursedAmount, reasonCode, saFETReimbursementItemList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SAFETReimbursementEvent {\n");
    
    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
    sb.append("    saFETClaimId: ").append(toIndentedString(saFETClaimId)).append("\n");
    sb.append("    reimbursedAmount: ").append(toIndentedString(reimbursedAmount)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    saFETReimbursementItemList: ").append(toIndentedString(saFETReimbursementItemList)).append("\n");
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

