package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-03-04T22:38:49.126Z[Etc/UTC]")
public class NotFound   {
  @JsonProperty("message")
  private String message;

  @JsonProperty("status")
  private Integer status;

  /**
   **/
  public NotFound message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(example = "Item not found.", value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  public NotFound status(Integer status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "404", value = "")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotFound notFound = (NotFound) o;
    return Objects.equals(message, notFound.message) &&
        Objects.equals(status, notFound.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotFound {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

