package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InlineResponse200  {
  
  @ApiModelProperty(example = "[\"190198155795\"]", value = "A list of UPCs")
 /**
   * A list of UPCs
  **/
  private List<String> upcs = null;

  @ApiModelProperty(example = "[1.90198155795E11]", value = "A list of EANs")
 /**
   * A list of EANs
  **/
  private List<String> eans = null;

  @ApiModelProperty(example = "[\"B01M1EXQY4\"]", value = "A list of ASINs")
 /**
   * A list of ASINs
  **/
  private List<String> asins = null;

  @ApiModelProperty(example = "OK", value = "")
  private String message;
 /**
   * A list of UPCs
   * @return upcs
  **/
  @JsonProperty("upcs")
  public List<String> getUpcs() {
    return upcs;
  }

  public void setUpcs(List<String> upcs) {
    this.upcs = upcs;
  }

  public InlineResponse200 upcs(List<String> upcs) {
    this.upcs = upcs;
    return this;
  }

  public InlineResponse200 addUpcsItem(String upcsItem) {
    this.upcs.add(upcsItem);
    return this;
  }

 /**
   * A list of EANs
   * @return eans
  **/
  @JsonProperty("eans")
  public List<String> getEans() {
    return eans;
  }

  public void setEans(List<String> eans) {
    this.eans = eans;
  }

  public InlineResponse200 eans(List<String> eans) {
    this.eans = eans;
    return this;
  }

  public InlineResponse200 addEansItem(String eansItem) {
    this.eans.add(eansItem);
    return this;
  }

 /**
   * A list of ASINs
   * @return asins
  **/
  @JsonProperty("asins")
  public List<String> getAsins() {
    return asins;
  }

  public void setAsins(List<String> asins) {
    this.asins = asins;
  }

  public InlineResponse200 asins(List<String> asins) {
    this.asins = asins;
    return this;
  }

  public InlineResponse200 addAsinsItem(String asinsItem) {
    this.asins.add(asinsItem);
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InlineResponse200 message(String message) {
    this.message = message;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    upcs: ").append(toIndentedString(upcs)).append("\n");
    sb.append("    eans: ").append(toIndentedString(eans)).append("\n");
    sb.append("    asins: ").append(toIndentedString(asins)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

