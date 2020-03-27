package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
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
public class Item   {
  
  private @Valid String upc;
  private @Valid String ean;
  private @Valid String isbn;
  private @Valid String asin;
  private @Valid String title;
  private @Valid String sku;
  private @Valid String mpn;
  private @Valid String partNumber;
  private @Valid List<String> upcs = new ArrayList<String>();
  private @Valid String description;
  private @Valid String brand;
  private @Valid String manufacturer;
  private @Valid String color;
  private @Valid BigDecimal newPrice;
  private @Valid BigDecimal usedPrice;
  private @Valid String currencyCode;
  private @Valid String url;
  private @Valid List<String> features = new ArrayList<String>();
  private @Valid List<Object> dimensions = new ArrayList<Object>();
  private @Valid List<String> images = new ArrayList<String>();
  private @Valid List<Object> matchedItems = new ArrayList<Object>();
  private @Valid List<String> isoCountryCodes = new ArrayList<String>();
  private @Valid String companyName;
  private @Valid String companyAddress;
  private @Valid List<String> categories = new ArrayList<String>();
  private @Valid List<String> categoryHierarchies = new ArrayList<String>();

  /**
   **/
  public Item upc(String upc) {
    this.upc = upc;
    return this;
  }

  
  @ApiModelProperty(example = "190198155795", value = "")
  @JsonProperty("upc")
  public String getUpc() {
    return upc;
  }
  public void setUpc(String upc) {
    this.upc = upc;
  }

  /**
   **/
  public Item ean(String ean) {
    this.ean = ean;
    return this;
  }

  
  @ApiModelProperty(example = "190198155795", value = "")
  @JsonProperty("ean")
  public String getEan() {
    return ean;
  }
  public void setEan(String ean) {
    this.ean = ean;
  }

  /**
   **/
  public Item isbn(String isbn) {
    this.isbn = isbn;
    return this;
  }

  
  @ApiModelProperty(example = "9780198155795", value = "")
  @JsonProperty("isbn")
  public String getIsbn() {
    return isbn;
  }
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  /**
   **/
  public Item asin(String asin) {
    this.asin = asin;
    return this;
  }

  
  @ApiModelProperty(example = "B01M1EXQY4", value = "")
  @JsonProperty("asin")
  public String getAsin() {
    return asin;
  }
  public void setAsin(String asin) {
    this.asin = asin;
  }

  /**
   **/
  public Item title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(example = "Apple iPhone 7 Unlocked Phone 128 GB - US Version (Black)", value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  public Item sku(String sku) {
    this.sku = sku;
    return this;
  }

  
  @ApiModelProperty(example = "903061477", value = "")
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   **/
  public Item mpn(String mpn) {
    this.mpn = mpn;
    return this;
  }

  
  @ApiModelProperty(example = "A1660", value = "")
  @JsonProperty("mpn")
  public String getMpn() {
    return mpn;
  }
  public void setMpn(String mpn) {
    this.mpn = mpn;
  }

  /**
   **/
  public Item partNumber(String partNumber) {
    this.partNumber = partNumber;
    return this;
  }

  
  @ApiModelProperty(example = "14", value = "")
  @JsonProperty("part_number")
  public String getPartNumber() {
    return partNumber;
  }
  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  /**
   * A list of matching upc codes.
   **/
  public Item upcs(List<String> upcs) {
    this.upcs = upcs;
    return this;
  }

  
  @ApiModelProperty(example = "[\"190198071835, 647627503790, 759776410383, 190198068507\"]", value = "A list of matching upc codes.")
  @JsonProperty("upcs")
  public List<String> getUpcs() {
    return upcs;
  }
  public void setUpcs(List<String> upcs) {
    this.upcs = upcs;
  }

  /**
   **/
  public Item description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "The latest iPhone with advanced camera, better battery life, immersive speakers and water resistance!", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public Item brand(String brand) {
    this.brand = brand;
    return this;
  }

  
  @ApiModelProperty(example = "Apple", value = "")
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   **/
  public Item manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

  
  @ApiModelProperty(example = "Apple", value = "")
  @JsonProperty("manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  /**
   **/
  public Item color(String color) {
    this.color = color;
    return this;
  }

  
  @ApiModelProperty(example = "Black", value = "")
  @JsonProperty("color")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  /**
   **/
  public Item newPrice(BigDecimal newPrice) {
    this.newPrice = newPrice;
    return this;
  }

  
  @ApiModelProperty(example = "799.95", value = "")
  @JsonProperty("new_price")
  public BigDecimal getNewPrice() {
    return newPrice;
  }
  public void setNewPrice(BigDecimal newPrice) {
    this.newPrice = newPrice;
  }

  /**
   **/
  public Item usedPrice(BigDecimal usedPrice) {
    this.usedPrice = usedPrice;
    return this;
  }

  
  @ApiModelProperty(example = "659.95", value = "")
  @JsonProperty("used_price")
  public BigDecimal getUsedPrice() {
    return usedPrice;
  }
  public void setUsedPrice(BigDecimal usedPrice) {
    this.usedPrice = usedPrice;
  }

  /**
   **/
  public Item currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  
  @ApiModelProperty(example = "USD", value = "")
  @JsonProperty("currency_code")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   **/
  public Item url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(example = "https://www.amazon.com/Apple-iPhone-Unlocked-Phone-128/dp/B01M1EXQY4", value = "")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * A list of product feature descriptions.
   **/
  public Item features(List<String> features) {
    this.features = features;
    return this;
  }

  
  @ApiModelProperty(example = "[\"Smooth, continuous unibody design. 3D Touch, Live Photos, an A9 chip, advanced cameras, and a 4.7-inch Retina HD display. And so much more.\",\"The most advanced chip ever in a smartphone is even faster and now features an integrated M9 motion coprocessor.\"]", value = "A list of product feature descriptions.")
  @JsonProperty("features")
  public List<String> getFeatures() {
    return features;
  }
  public void setFeatures(List<String> features) {
    this.features = features;
  }

  /**
   * Product dimensions and weight.  (&#39;meters&#39;, &#39;centimeters&#39;, &#39;millimeters&#39;, &#39;inches&#39;, &#39;feet&#39;, &#39;yards&#39;, &#39;ounces&#39;, &#39;pounds&#39;, &#39;grams&#39;, &#39;milligrams&#39;, &#39;kilograms&#39;)
   **/
  public Item dimensions(List<Object> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  
  @ApiModelProperty(value = "Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms')")
  @JsonProperty("dimensions")
  public List<Object> getDimensions() {
    return dimensions;
  }
  public void setDimensions(List<Object> dimensions) {
    this.dimensions = dimensions;
  }

  /**
   * A list product images.
   **/
  public Item images(List<String> images) {
    this.images = images;
    return this;
  }

  
  @ApiModelProperty(example = "[\"https://images-na.ssl-images-amazon.com/images/I/317AuSoRaHL.jpg\",\"https://images-na.ssl-images-amazon.com/images/I/41Whf3N9i2L.jpg\"]", value = "A list product images.")
  @JsonProperty("images")
  public List<String> getImages() {
    return images;
  }
  public void setImages(List<String> images) {
    this.images = images;
  }

  /**
   * Matched items for this product.
   **/
  public Item matchedItems(List<Object> matchedItems) {
    this.matchedItems = matchedItems;
    return this;
  }

  
  @ApiModelProperty(value = "Matched items for this product.")
  @JsonProperty("matched_items")
  public List<Object> getMatchedItems() {
    return matchedItems;
  }
  public void setMatchedItems(List<Object> matchedItems) {
    this.matchedItems = matchedItems;
  }

  /**
   * A list of country codes from which this item belongs.
   **/
  public Item isoCountryCodes(List<String> isoCountryCodes) {
    this.isoCountryCodes = isoCountryCodes;
    return this;
  }

  
  @ApiModelProperty(example = "[\"US\",\"GB\"]", value = "A list of country codes from which this item belongs.")
  @JsonProperty("iso_country_codes")
  public List<String> getIsoCountryCodes() {
    return isoCountryCodes;
  }
  public void setIsoCountryCodes(List<String> isoCountryCodes) {
    this.isoCountryCodes = isoCountryCodes;
  }

  /**
   * The company name registered to the product&#39;s UPC or EAN.
   **/
  public Item companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  
  @ApiModelProperty(example = "Apple Inc.", value = "The company name registered to the product's UPC or EAN.")
  @JsonProperty("company_name")
  public String getCompanyName() {
    return companyName;
  }
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  /**
   * The company address registered to the product&#39;s UPC or EAN.
   **/
  public Item companyAddress(String companyAddress) {
    this.companyAddress = companyAddress;
    return this;
  }

  
  @ApiModelProperty(example = "101 Infinite Loop, Cupertino, CA 95014", value = "The company address registered to the product's UPC or EAN.")
  @JsonProperty("company_address")
  public String getCompanyAddress() {
    return companyAddress;
  }
  public void setCompanyAddress(String companyAddress) {
    this.companyAddress = companyAddress;
  }

  /**
   * A list of categories for this product.
   **/
  public Item categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  
  @ApiModelProperty(example = "[\"Unlocked Cell Phones\",\"Electronics\"]", value = "A list of categories for this product.")
  @JsonProperty("categories")
  public List<String> getCategories() {
    return categories;
  }
  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  /**
   * A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.
   **/
  public Item categoryHierarchies(List<String> categoryHierarchies) {
    this.categoryHierarchies = categoryHierarchies;
    return this;
  }

  
  @ApiModelProperty(example = "[[\"Cell Phones & Accessories\",\"Cell Phones\",\"Unlocked Cell Phones\"]]", value = "A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.")
  @JsonProperty("category_hierarchies")
  public List<String> getCategoryHierarchies() {
    return categoryHierarchies;
  }
  public void setCategoryHierarchies(List<String> categoryHierarchies) {
    this.categoryHierarchies = categoryHierarchies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.upc, item.upc) &&
        Objects.equals(this.ean, item.ean) &&
        Objects.equals(this.isbn, item.isbn) &&
        Objects.equals(this.asin, item.asin) &&
        Objects.equals(this.title, item.title) &&
        Objects.equals(this.sku, item.sku) &&
        Objects.equals(this.mpn, item.mpn) &&
        Objects.equals(this.partNumber, item.partNumber) &&
        Objects.equals(this.upcs, item.upcs) &&
        Objects.equals(this.description, item.description) &&
        Objects.equals(this.brand, item.brand) &&
        Objects.equals(this.manufacturer, item.manufacturer) &&
        Objects.equals(this.color, item.color) &&
        Objects.equals(this.newPrice, item.newPrice) &&
        Objects.equals(this.usedPrice, item.usedPrice) &&
        Objects.equals(this.currencyCode, item.currencyCode) &&
        Objects.equals(this.url, item.url) &&
        Objects.equals(this.features, item.features) &&
        Objects.equals(this.dimensions, item.dimensions) &&
        Objects.equals(this.images, item.images) &&
        Objects.equals(this.matchedItems, item.matchedItems) &&
        Objects.equals(this.isoCountryCodes, item.isoCountryCodes) &&
        Objects.equals(this.companyName, item.companyName) &&
        Objects.equals(this.companyAddress, item.companyAddress) &&
        Objects.equals(this.categories, item.categories) &&
        Objects.equals(this.categoryHierarchies, item.categoryHierarchies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upc, ean, isbn, asin, title, sku, mpn, partNumber, upcs, description, brand, manufacturer, color, newPrice, usedPrice, currencyCode, url, features, dimensions, images, matchedItems, isoCountryCodes, companyName, companyAddress, categories, categoryHierarchies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
    sb.append("    isbn: ").append(toIndentedString(isbn)).append("\n");
    sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    mpn: ").append(toIndentedString(mpn)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    upcs: ").append(toIndentedString(upcs)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    newPrice: ").append(toIndentedString(newPrice)).append("\n");
    sb.append("    usedPrice: ").append(toIndentedString(usedPrice)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    matchedItems: ").append(toIndentedString(matchedItems)).append("\n");
    sb.append("    isoCountryCodes: ").append(toIndentedString(isoCountryCodes)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    companyAddress: ").append(toIndentedString(companyAddress)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    categoryHierarchies: ").append(toIndentedString(categoryHierarchies)).append("\n");
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

