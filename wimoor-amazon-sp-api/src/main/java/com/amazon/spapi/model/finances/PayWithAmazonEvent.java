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
import com.amazon.spapi.model.finances.ChargeComponent;
import com.amazon.spapi.model.finances.FeeComponentList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An event related to the seller&#39;s Pay with Amazon account.
 */
@ApiModel(description = "An event related to the seller's Pay with Amazon account.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:01:58.583+08:00")
public class PayWithAmazonEvent {
  @SerializedName("SellerOrderId")
  private String sellerOrderId = null;

  @SerializedName("TransactionPostedDate")
  private String transactionPostedDate = null;

  @SerializedName("BusinessObjectType")
  private String businessObjectType = null;

  @SerializedName("SalesChannel")
  private String salesChannel = null;

  @SerializedName("Charge")
  private ChargeComponent charge = null;

  @SerializedName("FeeList")
  private FeeComponentList feeList = null;

  @SerializedName("PaymentAmountType")
  private String paymentAmountType = null;

  @SerializedName("AmountDescription")
  private String amountDescription = null;

  @SerializedName("FulfillmentChannel")
  private String fulfillmentChannel = null;

  @SerializedName("StoreName")
  private String storeName = null;

  public PayWithAmazonEvent sellerOrderId(String sellerOrderId) {
    this.sellerOrderId = sellerOrderId;
    return this;
  }

   /**
   * An order identifier that is specified by the seller.
   * @return sellerOrderId
  **/
  @ApiModelProperty(value = "An order identifier that is specified by the seller.")
  public String getSellerOrderId() {
    return sellerOrderId;
  }

  public void setSellerOrderId(String sellerOrderId) {
    this.sellerOrderId = sellerOrderId;
  }

  public PayWithAmazonEvent transactionPostedDate(String transactionPostedDate) {
    this.transactionPostedDate = transactionPostedDate;
    return this;
  }

   /**
   * The date and time when the payment transaction is posted. In ISO 8601 date time format.
   * @return transactionPostedDate
  **/
  @ApiModelProperty(value = "The date and time when the payment transaction is posted. In ISO 8601 date time format.")
  public String getTransactionPostedDate() {
    return transactionPostedDate;
  }

  public void setTransactionPostedDate(String transactionPostedDate) {
    this.transactionPostedDate = transactionPostedDate;
  }

  public PayWithAmazonEvent businessObjectType(String businessObjectType) {
    this.businessObjectType = businessObjectType;
    return this;
  }

   /**
   * The type of business object.
   * @return businessObjectType
  **/
  @ApiModelProperty(value = "The type of business object.")
  public String getBusinessObjectType() {
    return businessObjectType;
  }

  public void setBusinessObjectType(String businessObjectType) {
    this.businessObjectType = businessObjectType;
  }

  public PayWithAmazonEvent salesChannel(String salesChannel) {
    this.salesChannel = salesChannel;
    return this;
  }

   /**
   * The sales channel for the transaction.
   * @return salesChannel
  **/
  @ApiModelProperty(value = "The sales channel for the transaction.")
  public String getSalesChannel() {
    return salesChannel;
  }

  public void setSalesChannel(String salesChannel) {
    this.salesChannel = salesChannel;
  }

  public PayWithAmazonEvent charge(ChargeComponent charge) {
    this.charge = charge;
    return this;
  }

   /**
   * The charge associated with the event.
   * @return charge
  **/
  @ApiModelProperty(value = "The charge associated with the event.")
  public ChargeComponent getCharge() {
    return charge;
  }

  public void setCharge(ChargeComponent charge) {
    this.charge = charge;
  }

  public PayWithAmazonEvent feeList(FeeComponentList feeList) {
    this.feeList = feeList;
    return this;
  }

   /**
   * A list of fees associated with the event.
   * @return feeList
  **/
  @ApiModelProperty(value = "A list of fees associated with the event.")
  public FeeComponentList getFeeList() {
    return feeList;
  }

  public void setFeeList(FeeComponentList feeList) {
    this.feeList = feeList;
  }

  public PayWithAmazonEvent paymentAmountType(String paymentAmountType) {
    this.paymentAmountType = paymentAmountType;
    return this;
  }

   /**
   * The type of payment.  Possible values:  * Sales
   * @return paymentAmountType
  **/
  @ApiModelProperty(value = "The type of payment.  Possible values:  * Sales")
  public String getPaymentAmountType() {
    return paymentAmountType;
  }

  public void setPaymentAmountType(String paymentAmountType) {
    this.paymentAmountType = paymentAmountType;
  }

  public PayWithAmazonEvent amountDescription(String amountDescription) {
    this.amountDescription = amountDescription;
    return this;
  }

   /**
   * A short description of this payment event.
   * @return amountDescription
  **/
  @ApiModelProperty(value = "A short description of this payment event.")
  public String getAmountDescription() {
    return amountDescription;
  }

  public void setAmountDescription(String amountDescription) {
    this.amountDescription = amountDescription;
  }

  public PayWithAmazonEvent fulfillmentChannel(String fulfillmentChannel) {
    this.fulfillmentChannel = fulfillmentChannel;
    return this;
  }

   /**
   * The fulfillment channel.  Possible values:  * AFN - Amazon Fulfillment Network (Fulfillment by Amazon)  * MFN - Merchant Fulfillment Network (self-fulfilled)
   * @return fulfillmentChannel
  **/
  @ApiModelProperty(value = "The fulfillment channel.  Possible values:  * AFN - Amazon Fulfillment Network (Fulfillment by Amazon)  * MFN - Merchant Fulfillment Network (self-fulfilled)")
  public String getFulfillmentChannel() {
    return fulfillmentChannel;
  }

  public void setFulfillmentChannel(String fulfillmentChannel) {
    this.fulfillmentChannel = fulfillmentChannel;
  }

  public PayWithAmazonEvent storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

   /**
   * The store name where the event occurred.
   * @return storeName
  **/
  @ApiModelProperty(value = "The store name where the event occurred.")
  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayWithAmazonEvent payWithAmazonEvent = (PayWithAmazonEvent) o;
    return Objects.equals(this.sellerOrderId, payWithAmazonEvent.sellerOrderId) &&
        Objects.equals(this.transactionPostedDate, payWithAmazonEvent.transactionPostedDate) &&
        Objects.equals(this.businessObjectType, payWithAmazonEvent.businessObjectType) &&
        Objects.equals(this.salesChannel, payWithAmazonEvent.salesChannel) &&
        Objects.equals(this.charge, payWithAmazonEvent.charge) &&
        Objects.equals(this.feeList, payWithAmazonEvent.feeList) &&
        Objects.equals(this.paymentAmountType, payWithAmazonEvent.paymentAmountType) &&
        Objects.equals(this.amountDescription, payWithAmazonEvent.amountDescription) &&
        Objects.equals(this.fulfillmentChannel, payWithAmazonEvent.fulfillmentChannel) &&
        Objects.equals(this.storeName, payWithAmazonEvent.storeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerOrderId, transactionPostedDate, businessObjectType, salesChannel, charge, feeList, paymentAmountType, amountDescription, fulfillmentChannel, storeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayWithAmazonEvent {\n");
    
    sb.append("    sellerOrderId: ").append(toIndentedString(sellerOrderId)).append("\n");
    sb.append("    transactionPostedDate: ").append(toIndentedString(transactionPostedDate)).append("\n");
    sb.append("    businessObjectType: ").append(toIndentedString(businessObjectType)).append("\n");
    sb.append("    salesChannel: ").append(toIndentedString(salesChannel)).append("\n");
    sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
    sb.append("    feeList: ").append(toIndentedString(feeList)).append("\n");
    sb.append("    paymentAmountType: ").append(toIndentedString(paymentAmountType)).append("\n");
    sb.append("    amountDescription: ").append(toIndentedString(amountDescription)).append("\n");
    sb.append("    fulfillmentChannel: ").append(toIndentedString(fulfillmentChannel)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
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

