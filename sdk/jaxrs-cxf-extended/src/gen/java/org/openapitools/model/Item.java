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
import com.fasterxml.jackson.annotation.JsonFormat;
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

 /**
  * A list of matching upc codes.
  */
  @ApiModelProperty(example = "[\"190198071835, 647627503790, 759776410383, 190198068507\"]", value = "A list of matching upc codes.")
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

 /**
  * A list of product feature descriptions.
  */
  @ApiModelProperty(example = "[\"Smooth, continuous unibody design. 3D Touch, Live Photos, an A9 chip, advanced cameras, and a 4.7-inch Retina HD display. And so much more.\",\"The most advanced chip ever in a smartphone is even faster and now features an integrated M9 motion coprocessor.\"]", value = "A list of product feature descriptions.")
  private List<String> features = null;

 /**
  * Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms')
  */
  @ApiModelProperty(value = "Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms')")
  private List<Object> dimensions = null;

 /**
  * A list product images.
  */
  @ApiModelProperty(example = "[\"https://images-na.ssl-images-amazon.com/images/I/317AuSoRaHL.jpg\",\"https://images-na.ssl-images-amazon.com/images/I/41Whf3N9i2L.jpg\"]", value = "A list product images.")
  private List<String> images = null;

 /**
  * Matched items for this product.
  */
  @ApiModelProperty(value = "Matched items for this product.")
  private List<Object> matchedItems = null;

 /**
  * A list of country codes from which this item belongs.
  */
  @ApiModelProperty(example = "[\"US\",\"GB\"]", value = "A list of country codes from which this item belongs.")
  private List<String> isoCountryCodes = null;

 /**
  * The company name registered to the product's UPC or EAN.
  */
  @ApiModelProperty(example = "Apple Inc.", value = "The company name registered to the product's UPC or EAN.")
  private String companyName;

 /**
  * The company address registered to the product's UPC or EAN.
  */
  @ApiModelProperty(example = "101 Infinite Loop, Cupertino, CA 95014", value = "The company address registered to the product's UPC or EAN.")
  private String companyAddress;

 /**
  * A list of categories for this product.
  */
  @ApiModelProperty(example = "[\"Unlocked Cell Phones\",\"Electronics\"]", value = "A list of categories for this product.")
  private List<String> categories = null;

 /**
  * A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.
  */
  @ApiModelProperty(example = "[[\"Cell Phones & Accessories\",\"Cell Phones\",\"Unlocked Cell Phones\"]]", value = "A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.")
  private List<String> categoryHierarchies = null;
 /**
  * Get upc
  * @return upc
  */
  @JsonProperty("upc")
  public String getUpc() {
    return upc;
  }

  /**
   * Sets the <code>upc</code> property.
   */
  public void setUpc(String upc) {
    this.upc = upc;
  }

  /**
   * Sets the <code>upc</code> property.
   */
  public Item upc(String upc) {
    this.upc = upc;
    return this;
  }

 /**
  * Get ean
  * @return ean
  */
  @JsonProperty("ean")
  public String getEan() {
    return ean;
  }

  /**
   * Sets the <code>ean</code> property.
   */
  public void setEan(String ean) {
    this.ean = ean;
  }

  /**
   * Sets the <code>ean</code> property.
   */
  public Item ean(String ean) {
    this.ean = ean;
    return this;
  }

 /**
  * Get isbn
  * @return isbn
  */
  @JsonProperty("isbn")
  public String getIsbn() {
    return isbn;
  }

  /**
   * Sets the <code>isbn</code> property.
   */
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  /**
   * Sets the <code>isbn</code> property.
   */
  public Item isbn(String isbn) {
    this.isbn = isbn;
    return this;
  }

 /**
  * Get asin
  * @return asin
  */
  @JsonProperty("asin")
  public String getAsin() {
    return asin;
  }

  /**
   * Sets the <code>asin</code> property.
   */
  public void setAsin(String asin) {
    this.asin = asin;
  }

  /**
   * Sets the <code>asin</code> property.
   */
  public Item asin(String asin) {
    this.asin = asin;
    return this;
  }

 /**
  * Get title
  * @return title
  */
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  /**
   * Sets the <code>title</code> property.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Sets the <code>title</code> property.
   */
  public Item title(String title) {
    this.title = title;
    return this;
  }

 /**
  * Get sku
  * @return sku
  */
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }

  /**
   * Sets the <code>sku</code> property.
   */
  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   * Sets the <code>sku</code> property.
   */
  public Item sku(String sku) {
    this.sku = sku;
    return this;
  }

 /**
  * Get mpn
  * @return mpn
  */
  @JsonProperty("mpn")
  public String getMpn() {
    return mpn;
  }

  /**
   * Sets the <code>mpn</code> property.
   */
  public void setMpn(String mpn) {
    this.mpn = mpn;
  }

  /**
   * Sets the <code>mpn</code> property.
   */
  public Item mpn(String mpn) {
    this.mpn = mpn;
    return this;
  }

 /**
  * Get partNumber
  * @return partNumber
  */
  @JsonProperty("part_number")
  public String getPartNumber() {
    return partNumber;
  }

  /**
   * Sets the <code>partNumber</code> property.
   */
  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  /**
   * Sets the <code>partNumber</code> property.
   */
  public Item partNumber(String partNumber) {
    this.partNumber = partNumber;
    return this;
  }

 /**
  * A list of matching upc codes.
  * @return upcs
  */
  @JsonProperty("upcs")
  public List<String> getUpcs() {
    return upcs;
  }

  /**
   * Sets the <code>upcs</code> property.
   */
  public void setUpcs(List<String> upcs) {
    this.upcs = upcs;
  }

  /**
   * Sets the <code>upcs</code> property.
   */
  public Item upcs(List<String> upcs) {
    this.upcs = upcs;
    return this;
  }

  /**
   * Adds a new item to the <code>upcs</code> list.
   */
  public Item addUpcsItem(String upcsItem) {
    this.upcs.add(upcsItem);
    return this;
  }

 /**
  * Get description
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public Item description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Get brand
  * @return brand
  */
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }

  /**
   * Sets the <code>brand</code> property.
   */
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * Sets the <code>brand</code> property.
   */
  public Item brand(String brand) {
    this.brand = brand;
    return this;
  }

 /**
  * Get manufacturer
  * @return manufacturer
  */
  @JsonProperty("manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }

  /**
   * Sets the <code>manufacturer</code> property.
   */
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  /**
   * Sets the <code>manufacturer</code> property.
   */
  public Item manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

 /**
  * Get color
  * @return color
  */
  @JsonProperty("color")
  public String getColor() {
    return color;
  }

  /**
   * Sets the <code>color</code> property.
   */
  public void setColor(String color) {
    this.color = color;
  }

  /**
   * Sets the <code>color</code> property.
   */
  public Item color(String color) {
    this.color = color;
    return this;
  }

 /**
  * Get newPrice
  * @return newPrice
  */
  @JsonProperty("new_price")
  public BigDecimal getNewPrice() {
    return newPrice;
  }

  /**
   * Sets the <code>newPrice</code> property.
   */
  public void setNewPrice(BigDecimal newPrice) {
    this.newPrice = newPrice;
  }

  /**
   * Sets the <code>newPrice</code> property.
   */
  public Item newPrice(BigDecimal newPrice) {
    this.newPrice = newPrice;
    return this;
  }

 /**
  * Get usedPrice
  * @return usedPrice
  */
  @JsonProperty("used_price")
  public BigDecimal getUsedPrice() {
    return usedPrice;
  }

  /**
   * Sets the <code>usedPrice</code> property.
   */
  public void setUsedPrice(BigDecimal usedPrice) {
    this.usedPrice = usedPrice;
  }

  /**
   * Sets the <code>usedPrice</code> property.
   */
  public Item usedPrice(BigDecimal usedPrice) {
    this.usedPrice = usedPrice;
    return this;
  }

 /**
  * Get currencyCode
  * @return currencyCode
  */
  @JsonProperty("currency_code")
  public String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * Sets the <code>currencyCode</code> property.
   */
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * Sets the <code>currencyCode</code> property.
   */
  public Item currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

 /**
  * Get url
  * @return url
  */
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  /**
   * Sets the <code>url</code> property.
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Sets the <code>url</code> property.
   */
  public Item url(String url) {
    this.url = url;
    return this;
  }

 /**
  * A list of product feature descriptions.
  * @return features
  */
  @JsonProperty("features")
  public List<String> getFeatures() {
    return features;
  }

  /**
   * Sets the <code>features</code> property.
   */
  public void setFeatures(List<String> features) {
    this.features = features;
  }

  /**
   * Sets the <code>features</code> property.
   */
  public Item features(List<String> features) {
    this.features = features;
    return this;
  }

  /**
   * Adds a new item to the <code>features</code> list.
   */
  public Item addFeaturesItem(String featuresItem) {
    this.features.add(featuresItem);
    return this;
  }

 /**
  * Product dimensions and weight.  (&#39;meters&#39;, &#39;centimeters&#39;, &#39;millimeters&#39;, &#39;inches&#39;, &#39;feet&#39;, &#39;yards&#39;, &#39;ounces&#39;, &#39;pounds&#39;, &#39;grams&#39;, &#39;milligrams&#39;, &#39;kilograms&#39;)
  * @return dimensions
  */
  @JsonProperty("dimensions")
  public List<Object> getDimensions() {
    return dimensions;
  }

  /**
   * Sets the <code>dimensions</code> property.
   */
  public void setDimensions(List<Object> dimensions) {
    this.dimensions = dimensions;
  }

  /**
   * Sets the <code>dimensions</code> property.
   */
  public Item dimensions(List<Object> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  /**
   * Adds a new item to the <code>dimensions</code> list.
   */
  public Item addDimensionsItem(Object dimensionsItem) {
    this.dimensions.add(dimensionsItem);
    return this;
  }

 /**
  * A list product images.
  * @return images
  */
  @JsonProperty("images")
  public List<String> getImages() {
    return images;
  }

  /**
   * Sets the <code>images</code> property.
   */
  public void setImages(List<String> images) {
    this.images = images;
  }

  /**
   * Sets the <code>images</code> property.
   */
  public Item images(List<String> images) {
    this.images = images;
    return this;
  }

  /**
   * Adds a new item to the <code>images</code> list.
   */
  public Item addImagesItem(String imagesItem) {
    this.images.add(imagesItem);
    return this;
  }

 /**
  * Matched items for this product.
  * @return matchedItems
  */
  @JsonProperty("matched_items")
  public List<Object> getMatchedItems() {
    return matchedItems;
  }

  /**
   * Sets the <code>matchedItems</code> property.
   */
  public void setMatchedItems(List<Object> matchedItems) {
    this.matchedItems = matchedItems;
  }

  /**
   * Sets the <code>matchedItems</code> property.
   */
  public Item matchedItems(List<Object> matchedItems) {
    this.matchedItems = matchedItems;
    return this;
  }

  /**
   * Adds a new item to the <code>matchedItems</code> list.
   */
  public Item addMatchedItemsItem(Object matchedItemsItem) {
    this.matchedItems.add(matchedItemsItem);
    return this;
  }

 /**
  * A list of country codes from which this item belongs.
  * @return isoCountryCodes
  */
  @JsonProperty("iso_country_codes")
  public List<String> getIsoCountryCodes() {
    return isoCountryCodes;
  }

  /**
   * Sets the <code>isoCountryCodes</code> property.
   */
  public void setIsoCountryCodes(List<String> isoCountryCodes) {
    this.isoCountryCodes = isoCountryCodes;
  }

  /**
   * Sets the <code>isoCountryCodes</code> property.
   */
  public Item isoCountryCodes(List<String> isoCountryCodes) {
    this.isoCountryCodes = isoCountryCodes;
    return this;
  }

  /**
   * Adds a new item to the <code>isoCountryCodes</code> list.
   */
  public Item addIsoCountryCodesItem(String isoCountryCodesItem) {
    this.isoCountryCodes.add(isoCountryCodesItem);
    return this;
  }

 /**
  * The company name registered to the product&#39;s UPC or EAN.
  * @return companyName
  */
  @JsonProperty("company_name")
  public String getCompanyName() {
    return companyName;
  }

  /**
   * Sets the <code>companyName</code> property.
   */
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  /**
   * Sets the <code>companyName</code> property.
   */
  public Item companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

 /**
  * The company address registered to the product&#39;s UPC or EAN.
  * @return companyAddress
  */
  @JsonProperty("company_address")
  public String getCompanyAddress() {
    return companyAddress;
  }

  /**
   * Sets the <code>companyAddress</code> property.
   */
  public void setCompanyAddress(String companyAddress) {
    this.companyAddress = companyAddress;
  }

  /**
   * Sets the <code>companyAddress</code> property.
   */
  public Item companyAddress(String companyAddress) {
    this.companyAddress = companyAddress;
    return this;
  }

 /**
  * A list of categories for this product.
  * @return categories
  */
  @JsonProperty("categories")
  public List<String> getCategories() {
    return categories;
  }

  /**
   * Sets the <code>categories</code> property.
   */
  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  /**
   * Sets the <code>categories</code> property.
   */
  public Item categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  /**
   * Adds a new item to the <code>categories</code> list.
   */
  public Item addCategoriesItem(String categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

 /**
  * A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.
  * @return categoryHierarchies
  */
  @JsonProperty("category_hierarchies")
  public List<String> getCategoryHierarchies() {
    return categoryHierarchies;
  }

  /**
   * Sets the <code>categoryHierarchies</code> property.
   */
  public void setCategoryHierarchies(List<String> categoryHierarchies) {
    this.categoryHierarchies = categoryHierarchies;
  }

  /**
   * Sets the <code>categoryHierarchies</code> property.
   */
  public Item categoryHierarchies(List<String> categoryHierarchies) {
    this.categoryHierarchies = categoryHierarchies;
    return this;
  }

  /**
   * Adds a new item to the <code>categoryHierarchies</code> list.
   */
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

