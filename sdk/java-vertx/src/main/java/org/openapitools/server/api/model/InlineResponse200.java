package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InlineResponse200   {
  
  private List<String> upcs = new ArrayList<>();
  private List<String> eans = new ArrayList<>();
  private List<String> asins = new ArrayList<>();
  private String message;

  public InlineResponse200 () {

  }

  public InlineResponse200 (List<String> upcs, List<String> eans, List<String> asins, String message) {
    this.upcs = upcs;
    this.eans = eans;
    this.asins = asins;
    this.message = message;
  }

    
  @JsonProperty("upcs")
  public List<String> getUpcs() {
    return upcs;
  }
  public void setUpcs(List<String> upcs) {
    this.upcs = upcs;
  }

    
  @JsonProperty("eans")
  public List<String> getEans() {
    return eans;
  }
  public void setEans(List<String> eans) {
    this.eans = eans;
  }

    
  @JsonProperty("asins")
  public List<String> getAsins() {
    return asins;
  }
  public void setAsins(List<String> asins) {
    this.asins = asins;
  }

    
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
