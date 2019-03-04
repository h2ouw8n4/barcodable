using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class InlineResponse200 {
    /// <summary>
    /// A list of UPCs
    /// </summary>
    /// <value>A list of UPCs</value>
    [DataMember(Name="upcs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "upcs")]
    public List<string> Upcs { get; set; }

    /// <summary>
    /// A list of EANs
    /// </summary>
    /// <value>A list of EANs</value>
    [DataMember(Name="eans", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "eans")]
    public List<string> Eans { get; set; }

    /// <summary>
    /// A list of ASINs
    /// </summary>
    /// <value>A list of ASINs</value>
    [DataMember(Name="asins", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "asins")]
    public List<string> Asins { get; set; }

    /// <summary>
    /// Gets or Sets Message
    /// </summary>
    [DataMember(Name="message", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "message")]
    public string Message { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class InlineResponse200 {\n");
      sb.Append("  Upcs: ").Append(Upcs).Append("\n");
      sb.Append("  Eans: ").Append(Eans).Append("\n");
      sb.Append("  Asins: ").Append(Asins).Append("\n");
      sb.Append("  Message: ").Append(Message).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
