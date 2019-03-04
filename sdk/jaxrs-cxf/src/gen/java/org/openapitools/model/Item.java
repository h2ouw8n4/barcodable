package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Item  {
  
  @ApiModelProperty(example = "190198155795", value = "")
  private String upc;

  @ApiModelProperty(example = "190198155795", value = "")
  private String ean;

  @ApiModelProperty(example = "9780198155795", value = "")
  private String isbn;

  @ApiModelProperty(example = "B01M1EXQY4", value = "")
  private String asin;

  @ApiModelProperty(example = "Apple iPhone 7 Unlocked Phone 128 GB - US Version (Black)", value = "")
  private String title;

  @ApiModelProperty(example = "903061477", value = "")
  private String sku;

  @ApiModelProperty(example = "A1660", value = "")
  private String mpn;

  @ApiModelProperty(example = "14", value = "")
  private String partNumber;

  @ApiModelProperty(example = "[\"190198071835, 647627503790, 759776410383, 190198068507\"]", value = "A list of matching upc codes.")
 /**
   * A list of matching upc codes.
  **/
  private List<String> upcs = null;

  @ApiModelProperty(example = "The latest iPhone with advanced camera, better battery life, immersive speakers and water resistance!", value = "")
  private String description;

  @ApiModelProperty(example = "Apple", value = "")
  private String brand;

  @ApiModelProperty(example = "Apple", value = "")
  private String manufacturer;

  @ApiModelProperty(example = "Black", value = "")
  private String color;

  @ApiModelProperty(example = "799.95", value = "")
  @Valid
  private BigDecimal newPrice;

  @ApiModelProperty(example = "659.95", value = "")
  @Valid
  private BigDecimal usedPrice;

  @ApiModelProperty(example = "USD", value = "")
  private String currencyCode;

  @ApiModelProperty(example = "https://www.amazon.com/Apple-iPhone-Unlocked-Phone-128/dp/B01M1EXQY4", value = "")
  private String url;

  @ApiModelProperty(example = "[\"Smooth, continuous unibody design. 3D Touch, Live Photos, an A9 chip, advanced cameras, and a 4.7-inch Retina HD display. And so much more.\",\"The most advanced chip ever in a smartphone is even faster and now features an integrated M9 motion coprocessor.\"]", value = "A list of product feature descriptions.")
 /**
   * A list of product feature descriptions.
  **/
  private List<String> features = null;

  @ApiModelProperty(value = "Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms')")
 /**
   * Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms')
  **/
  private List<Object> dimensions = null;

  @ApiModelProperty(example = "[\"https://images-na.ssl-images-amazon.com/images/I/317AuSoRaHL.jpg\",\"https://images-na.ssl-images-amazon.com/images/I/41Whf3N9i2L.jpg\"]", value = "A list product images.")
 /**
   * A list product images.
  **/
  private List<String> images = null;

  @ApiModelProperty(value = "Matched items for this product.")
 /**
   * Matched items for this product.
  **/
  private List<Object> matchedItems = null;

  @ApiModelProperty(example = "[\"US\",\"GB\"]", value = "A list of country codes from which this item belongs.")
 /**
   * A list of country codes from which this item belongs.
  **/
  private List<String> isoCountryCodes = null;

  @ApiModelProperty(example = "Apple Inc.", value = "The company name registered to the product's UPC or EAN.")
 /**
   * The company name registered to the product's UPC or EAN.
  **/
  private String companyName;

  @ApiModelProperty(example = "101 Infinite Loop, Cupertino, CA 95014", value = "The company address registered to the product's UPC or EAN.")
 /**
   * The company address registered to the product's UPC or EAN.
  **/
  private String companyAddress;

  @ApiModelProperty(example = "[\"Unlocked Cell Phones\",\"Electronics\"]", value = "A list of categories for this product.")
 /**
   * A list of categories for this product.
  **/
  private List<String> categories = null;

  @ApiModelProperty(example = "[[\"Cell Phones & Accessories\",\"Cell Phones\",\"Unlocked Cell Phones\"]]", value = "A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.")
 /**
   * A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.
  **/
  private List<String> categoryHierarchies = null;
 /**
   * Get upc
   * @return upc
  **/
  @JsonProperty("upc")
  public String getUpc() {
    return upc;
  }

  public void setUpc(String upc) {
    this.upc = upc;
  }

  public Item upc(String upc) {
    this.upc = upc;
    return this;
  }

 /**
   * Get ean
   * @return ean
  **/
  @JsonProperty("ean")
  public String getEan() {
    return ean;
  }

  public void setEan(String ean) {
    this.ean = ean;
  }

  public Item ean(String ean) {
    this.ean = ean;
    return this;
  }

 /**
   * Get isbn
   * @return isbn
  **/
  @JsonProperty("isbn")
  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public Item isbn(String isbn) {
    this.isbn = isbn;
    return this;
  }

 /**
   * Get asin
   * @return asin
  **/
  @JsonProperty("asin")
  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
    this.asin = asin;
  }

  public Item asin(String asin) {
    this.asin = asin;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Item title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get sku
   * @return sku
  **/
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public Item sku(String sku) {
    this.sku = sku;
    return this;
  }

 /**
   * Get mpn
   * @return mpn
  **/
  @JsonProperty("mpn")
  public String getMpn() {
    return mpn;
  }

  public void setMpn(String mpn) {
    this.mpn = mpn;
  }

  public Item mpn(String mpn) {
    this.mpn = mpn;
    return this;
  }

 /**
   * Get partNumber
   * @return partNumber
  **/
  @JsonProperty("part_number")
  public String getPartNumber() {
    return partNumber;
  }

  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  public Item partNumber(String partNumber) {
    this.partNumber = partNumber;
    return this;
  }

 /**
   * A list of matching upc codes.
   * @return upcs
  **/
  @JsonProperty("upcs")
  public List<String> getUpcs() {
    return upcs;
  }

  public void setUpcs(List<String> upcs) {
    this.upcs = upcs;
  }

  public Item upcs(List<String> upcs) {
    this.upcs = upcs;
    return this;
  }

  public Item addUpcsItem(String upcsItem) {
    this.upcs.add(upcsItem);
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Item description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get brand
   * @return brand
  **/
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Item brand(String brand) {
    this.brand = brand;
    return this;
  }

 /**
   * Get manufacturer
   * @return manufacturer
  **/
  @JsonProperty("manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public Item manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

 /**
   * Get color
   * @return color
  **/
  @JsonProperty("color")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Item color(String color) {
    this.color = color;
    return this;
  }

 /**
   * Get newPrice
   * @return newPrice
  **/
  @JsonProperty("new_price")
  public BigDecimal getNewPrice() {
    return newPrice;
  }

  public void setNewPrice(BigDecimal newPrice) {
    this.newPrice = newPrice;
  }

  public Item newPrice(BigDecimal newPrice) {
    this.newPrice = newPrice;
    return this;
  }

 /**
   * Get usedPrice
   * @return usedPrice
  **/
  @JsonProperty("used_price")
  public BigDecimal getUsedPrice() {
    return usedPrice;
  }

  public void setUsedPrice(BigDecimal usedPrice) {
    this.usedPrice = usedPrice;
  }

  public Item usedPrice(BigDecimal usedPrice) {
    this.usedPrice = usedPrice;
    return this;
  }

 /**
   * Get currencyCode
   * @return currencyCode
  **/
  @JsonProperty("currency_code")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Item currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

 /**
   * Get url
   * @return url
  **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Item url(String url) {
    this.url = url;
    return this;
  }

 /**
   * A list of product feature descriptions.
   * @return features
  **/
  @JsonProperty("features")
  public List<String> getFeatures() {
    return features;
  }

  public void setFeatures(List<String> features) {
    this.features = features;
  }

  public Item features(List<String> features) {
    this.features = features;
    return this;
  }

  public Item addFeaturesItem(String featuresItem) {
    this.features.add(featuresItem);
    return this;
  }

 /**
   * Product dimensions and weight.  (&#39;meters&#39;, &#39;centimeters&#39;, &#39;millimeters&#39;, &#39;inches&#39;, &#39;feet&#39;, &#39;yards&#39;, &#39;ounces&#39;, &#39;pounds&#39;, &#39;grams&#39;, &#39;milligrams&#39;, &#39;kilograms&#39;)
   * @return dimensions
  **/
  @JsonProperty("dimensions")
  public List<Object> getDimensions() {
    return dimensions;
  }

  public void setDimensions(List<Object> dimensions) {
    this.dimensions = dimensions;
  }

  public Item dimensions(List<Object> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  public Item addDimensionsItem(Object dimensionsItem) {
    this.dimensions.add(dimensionsItem);
    return this;
  }

 /**
   * A list product images.
   * @return images
  **/
  @JsonProperty("images")
  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public Item images(List<String> images) {
    this.images = images;
    return this;
  }

  public Item addImagesItem(String imagesItem) {
    this.images.add(imagesItem);
    return this;
  }

 /**
   * Matched items for this product.
   * @return matchedItems
  **/
  @JsonProperty("matched_items")
  public List<Object> getMatchedItems() {
    return matchedItems;
  }

  public void setMatchedItems(List<Object> matchedItems) {
    this.matchedItems = matchedItems;
  }

  public Item matchedItems(List<Object> matchedItems) {
    this.matchedItems = matchedItems;
    return this;
  }

  public Item addMatchedItemsItem(Object matchedItemsItem) {
    this.matchedItems.add(matchedItemsItem);
    return this;
  }

 /**
   * A list of country codes from which this item belongs.
   * @return isoCountryCodes
  **/
  @JsonProperty("iso_country_codes")
  public List<String> getIsoCountryCodes() {
    return isoCountryCodes;
  }

  public void setIsoCountryCodes(List<String> isoCountryCodes) {
    this.isoCountryCodes = isoCountryCodes;
  }

  public Item isoCountryCodes(List<String> isoCountryCodes) {
    this.isoCountryCodes = isoCountryCodes;
    return this;
  }

  public Item addIsoCountryCodesItem(String isoCountryCodesItem) {
    this.isoCountryCodes.add(isoCountryCodesItem);
    return this;
  }

 /**
   * The company name registered to the product&#39;s UPC or EAN.
   * @return companyName
  **/
  @JsonProperty("company_name")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Item companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

 /**
   * The company address registered to the product&#39;s UPC or EAN.
   * @return companyAddress
  **/
  @JsonProperty("company_address")
  public String getCompanyAddress() {
    return companyAddress;
  }

  public void setCompanyAddress(String companyAddress) {
    this.companyAddress = companyAddress;
  }

  public Item companyAddress(String companyAddress) {
    this.companyAddress = companyAddress;
    return this;
  }

 /**
   * A list of categories for this product.
   * @return categories
  **/
  @JsonProperty("categories")
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public Item categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public Item addCategoriesItem(String categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

 /**
   * A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.
   * @return categoryHierarchies
  **/
  @JsonProperty("category_hierarchies")
  public List<String> getCategoryHierarchies() {
    return categoryHierarchies;
  }

  public void setCategoryHierarchies(List<String> categoryHierarchies) {
    this.categoryHierarchies = categoryHierarchies;
  }

  public Item categoryHierarchies(List<String> categoryHierarchies) {
    this.categoryHierarchies = categoryHierarchies;
    return this;
  }

  public Item addCategoryHierarchiesItem(String categoryHierarchiesItem) {
    this.categoryHierarchies.add(categoryHierarchiesItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

