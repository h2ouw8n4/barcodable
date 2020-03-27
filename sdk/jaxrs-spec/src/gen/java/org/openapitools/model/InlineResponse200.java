package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-03-27T18:10:17.418-04:00[America/New_York]")
public class InlineResponse200   {
  
  private @Valid List<String> upcs = new ArrayList<String>();
  private @Valid List<String> eans = new ArrayList<String>();
  private @Valid List<String> asins = new ArrayList<String>();
  private @Valid String message;

  /**
   * A list of UPCs
   **/
  public InlineResponse200 upcs(List<String> upcs) {
    this.upcs = upcs;
    return this;
  }

  
  @ApiModelProperty(example = "[\"190198155795\"]", value = "A list of UPCs")
  @JsonProperty("upcs")
  public List<String> getUpcs() {
    return upcs;
  }
  public void setUpcs(List<String> upcs) {
    this.upcs = upcs;
  }

  /**
   * A list of EANs
   **/
  public InlineResponse200 eans(List<String> eans) {
    this.eans = eans;
    return this;
  }

  
  @ApiModelProperty(example = "[1.90198155795E11]", value = "A list of EANs")
  @JsonProperty("eans")
  public List<String> getEans() {
    return eans;
  }
  public void setEans(List<String> eans) {
    this.eans = eans;
  }

  /**
   * A list of ASINs
   **/
  public InlineResponse200 asins(List<String> asins) {
    this.asins = asins;
    return this;
  }

  
  @ApiModelProperty(example = "[\"B01M1EXQY4\"]", value = "A list of ASINs")
  @JsonProperty("asins")
  public List<String> getAsins() {
    return asins;
  }
  public void setAsins(List<String> asins) {
    this.asins = asins;
  }

  /**
   **/
  public InlineResponse200 message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(example = "OK", value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.upcs, inlineResponse200.upcs) &&
        Objects.equals(this.eans, inlineResponse200.eans) &&
        Objects.equals(this.asins, inlineResponse200.asins) &&
        Objects.equals(this.message, inlineResponse200.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upcs, eans, asins, message);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

