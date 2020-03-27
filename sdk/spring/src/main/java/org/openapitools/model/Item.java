package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Item
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-27T18:11:19.626-04:00[America/New_York]")

public class Item   {
  @JsonProperty("upc")
  private String upc;

  @JsonProperty("ean")
  private String ean;

  @JsonProperty("isbn")
  private String isbn;

  @JsonProperty("asin")
  private String asin;

  @JsonProperty("title")
  private String title;

  @JsonProperty("sku")
  private String sku;

  @JsonProperty("mpn")
  private String mpn;

  @JsonProperty("part_number")
  private String partNumber;

  @JsonProperty("upcs")
  @Valid
  private List<String> upcs = null;

  @JsonProperty("description")
  private String description;

  @JsonProperty("brand")
  private String brand;

  @JsonProperty("manufacturer")
  private String manufacturer;

  @JsonProperty("color")
  private String color;

  @JsonProperty("new_price")
  private BigDecimal newPrice;

  @JsonProperty("used_price")
  private BigDecimal usedPrice;

  @JsonProperty("currency_code")
  private String currencyCode;

  @JsonProperty("url")
  private String url;

  @JsonProperty("features")
  @Valid
  private List<String> features = null;

  @JsonProperty("dimensions")
  @Valid
  private List<Object> dimensions = null;

  @JsonProperty("images")
  @Valid
  private List<String> images = null;

  @JsonProperty("matched_items")
  @Valid
  private List<Object> matchedItems = null;

  @JsonProperty("iso_country_codes")
  @Valid
  private List<String> isoCountryCodes = null;

  @JsonProperty("company_name")
  private String companyName;

  @JsonProperty("company_address")
  private String companyAddress;

  @JsonProperty("categories")
  @Valid
  private List<String> categories = null;

  @JsonProperty("category_hierarchies")
  @Valid
  private List<String> categoryHierarchies = null;

  public Item upc(String upc) {
    this.upc = upc;
    return this;
  }

  /**
   * Get upc
   * @return upc
  */
  @ApiModelProperty(example = "190198155795", value = "")


  public String getUpc() {
    return upc;
  }

  public void setUpc(String upc) {
    this.upc = upc;
  }

  public Item ean(String ean) {
    this.ean = ean;
    return this;
  }

  /**
   * Get ean
   * @return ean
  */
  @ApiModelProperty(example = "190198155795", value = "")


  public String getEan() {
    return ean;
  }

  public void setEan(String ean) {
    this.ean = ean;
  }

  public Item isbn(String isbn) {
    this.isbn = isbn;
    return this;
  }

  /**
   * Get isbn
   * @return isbn
  */
  @ApiModelProperty(example = "9780198155795", value = "")


  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public Item asin(String asin) {
    this.asin = asin;
    return this;
  }

  /**
   * Get asin
   * @return asin
  */
  @ApiModelProperty(example = "B01M1EXQY4", value = "")


  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
    this.asin = asin;
  }

  public Item title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(example = "Apple iPhone 7 Unlocked Phone 128 GB - US Version (Black)", value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Item sku(String sku) {
    this.sku = sku;
    return this;
  }

  /**
   * Get sku
   * @return sku
  */
  @ApiModelProperty(example = "903061477", value = "")


  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public Item mpn(String mpn) {
    this.mpn = mpn;
    return this;
  }

  /**
   * Get mpn
   * @return mpn
  */
  @ApiModelProperty(example = "A1660", value = "")


  public String getMpn() {
    return mpn;
  }

  public void setMpn(String mpn) {
    this.mpn = mpn;
  }

  public Item partNumber(String partNumber) {
    this.partNumber = partNumber;
    return this;
  }

  /**
   * Get partNumber
   * @return partNumber
  */
  @ApiModelProperty(example = "14", value = "")


  public String getPartNumber() {
    return partNumber;
  }

  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  public Item upcs(List<String> upcs) {
    this.upcs = upcs;
    return this;
  }

  public Item addUpcsItem(String upcsItem) {
    if (this.upcs == null) {
      this.upcs = new ArrayList<>();
    }
    this.upcs.add(upcsItem);
    return this;
  }

  /**
   * A list of matching upc codes.
   * @return upcs
  */
  @ApiModelProperty(example = "[\"190198071835, 647627503790, 759776410383, 190198068507\"]", value = "A list of matching upc codes.")


  public List<String> getUpcs() {
    return upcs;
  }

  public void setUpcs(List<String> upcs) {
    this.upcs = upcs;
  }

  public Item description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(example = "The latest iPhone with advanced camera, better battery life, immersive speakers and water resistance!", value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Item brand(String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   * @return brand
  */
  @ApiModelProperty(example = "Apple", value = "")


  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Item manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

  /**
   * Get manufacturer
   * @return manufacturer
  */
  @ApiModelProperty(example = "Apple", value = "")


  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public Item color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
  */
  @ApiModelProperty(example = "Black", value = "")


  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Item newPrice(BigDecimal newPrice) {
    this.newPrice = newPrice;
    return this;
  }

  /**
   * Get newPrice
   * @return newPrice
  */
  @ApiModelProperty(example = "799.95", value = "")

  @Valid

  public BigDecimal getNewPrice() {
    return newPrice;
  }

  public void setNewPrice(BigDecimal newPrice) {
    this.newPrice = newPrice;
  }

  public Item usedPrice(BigDecimal usedPrice) {
    this.usedPrice = usedPrice;
    return this;
  }

  /**
   * Get usedPrice
   * @return usedPrice
  */
  @ApiModelProperty(example = "659.95", value = "")

  @Valid

  public BigDecimal getUsedPrice() {
    return usedPrice;
  }

  public void setUsedPrice(BigDecimal usedPrice) {
    this.usedPrice = usedPrice;
  }

  public Item currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   * @return currencyCode
  */
  @ApiModelProperty(example = "USD", value = "")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Item url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  @ApiModelProperty(example = "https://www.amazon.com/Apple-iPhone-Unlocked-Phone-128/dp/B01M1EXQY4", value = "")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Item features(List<String> features) {
    this.features = features;
    return this;
  }

  public Item addFeaturesItem(String featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

  /**
   * A list of product feature descriptions.
   * @return features
  */
  @ApiModelProperty(example = "[\"Smooth, continuous unibody design. 3D Touch, Live Photos, an A9 chip, advanced cameras, and a 4.7-inch Retina HD display. And so much more.\",\"The most advanced chip ever in a smartphone is even faster and now features an integrated M9 motion coprocessor.\"]", value = "A list of product feature descriptions.")


  public List<String> getFeatures() {
    return features;
  }

  public void setFeatures(List<String> features) {
    this.features = features;
  }

  public Item dimensions(List<Object> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  public Item addDimensionsItem(Object dimensionsItem) {
    if (this.dimensions == null) {
      this.dimensions = new ArrayList<>();
    }
    this.dimensions.add(dimensionsItem);
    return this;
  }

  /**
   * Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms')
   * @return dimensions
  */
  @ApiModelProperty(value = "Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms')")


  public List<Object> getDimensions() {
    return dimensions;
  }

  public void setDimensions(List<Object> dimensions) {
    this.dimensions = dimensions;
  }

  public Item images(List<String> images) {
    this.images = images;
    return this;
  }

  public Item addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * A list product images.
   * @return images
  */
  @ApiModelProperty(example = "[\"https://images-na.ssl-images-amazon.com/images/I/317AuSoRaHL.jpg\",\"https://images-na.ssl-images-amazon.com/images/I/41Whf3N9i2L.jpg\"]", value = "A list product images.")


  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public Item matchedItems(List<Object> matchedItems) {
    this.matchedItems = matchedItems;
    return this;
  }

  public Item addMatchedItemsItem(Object matchedItemsItem) {
    if (this.matchedItems == null) {
      this.matchedItems = new ArrayList<>();
    }
    this.matchedItems.add(matchedItemsItem);
    return this;
  }

  /**
   * Matched items for this product.
   * @return matchedItems
  */
  @ApiModelProperty(value = "Matched items for this product.")


  public List<Object> getMatchedItems() {
    return matchedItems;
  }

  public void setMatchedItems(List<Object> matchedItems) {
    this.matchedItems = matchedItems;
  }

  public Item isoCountryCodes(List<String> isoCountryCodes) {
    this.isoCountryCodes = isoCountryCodes;
    return this;
  }

  public Item addIsoCountryCodesItem(String isoCountryCodesItem) {
    if (this.isoCountryCodes == null) {
      this.isoCountryCodes = new ArrayList<>();
    }
    this.isoCountryCodes.add(isoCountryCodesItem);
    return this;
  }

  /**
   * A list of country codes from which this item belongs.
   * @return isoCountryCodes
  */
  @ApiModelProperty(example = "[\"US\",\"GB\"]", value = "A list of country codes from which this item belongs.")


  public List<String> getIsoCountryCodes() {
    return isoCountryCodes;
  }

  public void setIsoCountryCodes(List<String> isoCountryCodes) {
    this.isoCountryCodes = isoCountryCodes;
  }

  public Item companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * The company name registered to the product's UPC or EAN.
   * @return companyName
  */
  @ApiModelProperty(example = "Apple Inc.", value = "The company name registered to the product's UPC or EAN.")


  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Item companyAddress(String companyAddress) {
    this.companyAddress = companyAddress;
    return this;
  }

  /**
   * The company address registered to the product's UPC or EAN.
   * @return companyAddress
  */
  @ApiModelProperty(example = "101 Infinite Loop, Cupertino, CA 95014", value = "The company address registered to the product's UPC or EAN.")


  public String getCompanyAddress() {
    return companyAddress;
  }

  public void setCompanyAddress(String companyAddress) {
    this.companyAddress = companyAddress;
  }

  public Item categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public Item addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * A list of categories for this product.
   * @return categories
  */
  @ApiModelProperty(example = "[\"Unlocked Cell Phones\",\"Electronics\"]", value = "A list of categories for this product.")


  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public Item categoryHierarchies(List<String> categoryHierarchies) {
    this.categoryHierarchies = categoryHierarchies;
    return this;
  }

  public Item addCategoryHierarchiesItem(String categoryHierarchiesItem) {
    if (this.categoryHierarchies == null) {
      this.categoryHierarchies = new ArrayList<>();
    }
    this.categoryHierarchies.add(categoryHierarchiesItem);
    return this;
  }

  /**
   * A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.
   * @return categoryHierarchies
  */
  @ApiModelProperty(example = "[[\"Cell Phones & Accessories\",\"Cell Phones\",\"Unlocked Cell Phones\"]]", value = "A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.")


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

