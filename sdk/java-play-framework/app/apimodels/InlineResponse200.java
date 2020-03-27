package apimodels;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-03-27T18:10:03.884-04:00[America/New_York]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class InlineResponse200   {
  @JsonProperty("upcs")
  private List<String> upcs = null;

  @JsonProperty("eans")
  private List<String> eans = null;

  @JsonProperty("asins")
  private List<String> asins = null;

  @JsonProperty("message")
  private String message;

  public InlineResponse200 upcs(List<String> upcs) {
    this.upcs = upcs;
    return this;
  }

  public InlineResponse200 addUpcsItem(String upcsItem) {
    if (upcs == null) {
      upcs = new ArrayList<>();
    }
    upcs.add(upcsItem);
    return this;
  }

   /**
   * A list of UPCs
   * @return upcs
  **/
    public List<String> getUpcs() {
    return upcs;
  }

  public void setUpcs(List<String> upcs) {
    this.upcs = upcs;
  }

  public InlineResponse200 eans(List<String> eans) {
    this.eans = eans;
    return this;
  }

  public InlineResponse200 addEansItem(String eansItem) {
    if (eans == null) {
      eans = new ArrayList<>();
    }
    eans.add(eansItem);
    return this;
  }

   /**
   * A list of EANs
   * @return eans
  **/
    public List<String> getEans() {
    return eans;
  }

  public void setEans(List<String> eans) {
    this.eans = eans;
  }

  public InlineResponse200 asins(List<String> asins) {
    this.asins = asins;
    return this;
  }

  public InlineResponse200 addAsinsItem(String asinsItem) {
    if (asins == null) {
      asins = new ArrayList<>();
    }
    asins.add(asinsItem);
    return this;
  }

   /**
   * A list of ASINs
   * @return asins
  **/
    public List<String> getAsins() {
    return asins;
  }

  public void setAsins(List<String> asins) {
    this.asins = asins;
  }

  public InlineResponse200 message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

