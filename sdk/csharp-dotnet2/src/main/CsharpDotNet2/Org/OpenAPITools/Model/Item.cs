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
  public class Item {
    /// <summary>
    /// Gets or Sets Upc
    /// </summary>
    [DataMember(Name="upc", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "upc")]
    public string Upc { get; set; }

    /// <summary>
    /// Gets or Sets Ean
    /// </summary>
    [DataMember(Name="ean", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ean")]
    public string Ean { get; set; }

    /// <summary>
    /// Gets or Sets Isbn
    /// </summary>
    [DataMember(Name="isbn", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "isbn")]
    public string Isbn { get; set; }

    /// <summary>
    /// Gets or Sets Asin
    /// </summary>
    [DataMember(Name="asin", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "asin")]
    public string Asin { get; set; }

    /// <summary>
    /// Gets or Sets Title
    /// </summary>
    [DataMember(Name="title", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "title")]
    public string Title { get; set; }

    /// <summary>
    /// Gets or Sets Sku
    /// </summary>
    [DataMember(Name="sku", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sku")]
    public string Sku { get; set; }

    /// <summary>
    /// Gets or Sets Mpn
    /// </summary>
    [DataMember(Name="mpn", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mpn")]
    public string Mpn { get; set; }

    /// <summary>
    /// Gets or Sets PartNumber
    /// </summary>
    [DataMember(Name="part_number", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "part_number")]
    public string PartNumber { get; set; }

    /// <summary>
    /// A list of matching upc codes.
    /// </summary>
    /// <value>A list of matching upc codes.</value>
    [DataMember(Name="upcs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "upcs")]
    public List<string> Upcs { get; set; }

    /// <summary>
    /// Gets or Sets Description
    /// </summary>
    [DataMember(Name="description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "description")]
    public string Description { get; set; }

    /// <summary>
    /// Gets or Sets Brand
    /// </summary>
    [DataMember(Name="brand", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "brand")]
    public string Brand { get; set; }

    /// <summary>
    /// Gets or Sets Manufacturer
    /// </summary>
    [DataMember(Name="manufacturer", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "manufacturer")]
    public string Manufacturer { get; set; }

    /// <summary>
    /// Gets or Sets Color
    /// </summary>
    [DataMember(Name="color", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "color")]
    public string Color { get; set; }

    /// <summary>
    /// Gets or Sets NewPrice
    /// </summary>
    [DataMember(Name="new_price", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "new_price")]
    public decimal? NewPrice { get; set; }

    /// <summary>
    /// Gets or Sets UsedPrice
    /// </summary>
    [DataMember(Name="used_price", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "used_price")]
    public decimal? UsedPrice { get; set; }

    /// <summary>
    /// Gets or Sets CurrencyCode
    /// </summary>
    [DataMember(Name="currency_code", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "currency_code")]
    public string CurrencyCode { get; set; }

    /// <summary>
    /// Gets or Sets Url
    /// </summary>
    [DataMember(Name="url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "url")]
    public string Url { get; set; }

    /// <summary>
    /// A list of product feature descriptions.
    /// </summary>
    /// <value>A list of product feature descriptions.</value>
    [DataMember(Name="features", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "features")]
    public List<string> Features { get; set; }

    /// <summary>
    /// Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms')
    /// </summary>
    /// <value>Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms')</value>
    [DataMember(Name="dimensions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dimensions")]
    public List<Object> Dimensions { get; set; }

    /// <summary>
    /// A list product images.
    /// </summary>
    /// <value>A list product images.</value>
    [DataMember(Name="images", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "images")]
    public List<string> Images { get; set; }

    /// <summary>
    /// Matched items for this product.
    /// </summary>
    /// <value>Matched items for this product.</value>
    [DataMember(Name="matched_items", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "matched_items")]
    public List<Object> MatchedItems { get; set; }

    /// <summary>
    /// A list of country codes from which this item belongs.
    /// </summary>
    /// <value>A list of country codes from which this item belongs.</value>
    [DataMember(Name="iso_country_codes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "iso_country_codes")]
    public List<string> IsoCountryCodes { get; set; }

    /// <summary>
    /// The company name registered to the product's UPC or EAN.
    /// </summary>
    /// <value>The company name registered to the product's UPC or EAN.</value>
    [DataMember(Name="company_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "company_name")]
    public string CompanyName { get; set; }

    /// <summary>
    /// The company address registered to the product's UPC or EAN.
    /// </summary>
    /// <value>The company address registered to the product's UPC or EAN.</value>
    [DataMember(Name="company_address", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "company_address")]
    public string CompanyAddress { get; set; }

    /// <summary>
    /// A list of categories for this product.
    /// </summary>
    /// <value>A list of categories for this product.</value>
    [DataMember(Name="categories", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "categories")]
    public List<string> Categories { get; set; }

    /// <summary>
    /// A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.
    /// </summary>
    /// <value>A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.</value>
    [DataMember(Name="category_hierarchies", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "category_hierarchies")]
    public List<string> CategoryHierarchies { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Item {\n");
      sb.Append("  Upc: ").Append(Upc).Append("\n");
      sb.Append("  Ean: ").Append(Ean).Append("\n");
      sb.Append("  Isbn: ").Append(Isbn).Append("\n");
      sb.Append("  Asin: ").Append(Asin).Append("\n");
      sb.Append("  Title: ").Append(Title).Append("\n");
      sb.Append("  Sku: ").Append(Sku).Append("\n");
      sb.Append("  Mpn: ").Append(Mpn).Append("\n");
      sb.Append("  PartNumber: ").Append(PartNumber).Append("\n");
      sb.Append("  Upcs: ").Append(Upcs).Append("\n");
      sb.Append("  Description: ").Append(Description).Append("\n");
      sb.Append("  Brand: ").Append(Brand).Append("\n");
      sb.Append("  Manufacturer: ").Append(Manufacturer).Append("\n");
      sb.Append("  Color: ").Append(Color).Append("\n");
      sb.Append("  NewPrice: ").Append(NewPrice).Append("\n");
      sb.Append("  UsedPrice: ").Append(UsedPrice).Append("\n");
      sb.Append("  CurrencyCode: ").Append(CurrencyCode).Append("\n");
      sb.Append("  Url: ").Append(Url).Append("\n");
      sb.Append("  Features: ").Append(Features).Append("\n");
      sb.Append("  Dimensions: ").Append(Dimensions).Append("\n");
      sb.Append("  Images: ").Append(Images).Append("\n");
      sb.Append("  MatchedItems: ").Append(MatchedItems).Append("\n");
      sb.Append("  IsoCountryCodes: ").Append(IsoCountryCodes).Append("\n");
      sb.Append("  CompanyName: ").Append(CompanyName).Append("\n");
      sb.Append("  CompanyAddress: ").Append(CompanyAddress).Append("\n");
      sb.Append("  Categories: ").Append(Categories).Append("\n");
      sb.Append("  CategoryHierarchies: ").Append(CategoryHierarchies).Append("\n");
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
