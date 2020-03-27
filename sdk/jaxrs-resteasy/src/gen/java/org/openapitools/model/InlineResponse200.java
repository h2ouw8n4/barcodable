package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-03-27T18:10:14.773-04:00[America/New_York]")
public class InlineResponse200   {
  
  private List<String> upcs = new ArrayList<String>();
  private List<String> eans = new ArrayList<String>();
  private List<String> asins = new ArrayList<String>();
  private String message;

  /**
   * A list of UPCs
   **/
  
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
    return Objects.equals(upcs, inlineResponse200.upcs) &&
        Objects.equals(eans, inlineResponse200.eans) &&
        Objects.equals(asins, inlineResponse200.asins) &&
        Objects.equals(message, inlineResponse200.message);
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

