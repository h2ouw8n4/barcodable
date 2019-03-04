package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Item   {
  
  private String upc;
  private String ean;
  private String isbn;
  private String asin;
  private String title;
  private String sku;
  private String mpn;
  private String partNumber;
  private List<String> upcs = new ArrayList<>();
  private String description;
  private String brand;
  private String manufacturer;
  private String color;
  private BigDecimal newPrice;
  private BigDecimal usedPrice;
  private String currencyCode;
  private String url;
  private List<String> features = new ArrayList<>();
  private List<Object> dimensions = new ArrayList<>();
  private List<String> images = new ArrayList<>();
  private List<Object> matchedItems = new ArrayList<>();
  private List<String> isoCountryCodes = new ArrayList<>();
  private String companyName;
  private String companyAddress;
  private List<String> categories = new ArrayList<>();
  private List<String> categoryHierarchies = new ArrayList<>();

  public Item () {

  }

  public Item (String upc, String ean, String isbn, String asin, String title, String sku, String mpn, String partNumber, List<String> upcs, String description, String brand, String manufacturer, String color, BigDecimal newPrice, BigDecimal usedPrice, String currencyCode, String url, List<String> features, List<Object> dimensions, List<String> images, List<Object> matchedItems, List<String> isoCountryCodes, String companyName, String companyAddress, List<String> categories, List<String> categoryHierarchies) {
    this.upc = upc;
    this.ean = ean;
    this.isbn = isbn;
    this.asin = asin;
    this.title = title;
    this.sku = sku;
    this.mpn = mpn;
    this.partNumber = partNumber;
    this.upcs = upcs;
    this.description = description;
    this.brand = brand;
    this.manufacturer = manufacturer;
    this.color = color;
    this.newPrice = newPrice;
    this.usedPrice = usedPrice;
    this.currencyCode = currencyCode;
    this.url = url;
    this.features = features;
    this.dimensions = dimensions;
    this.images = images;
    this.matchedItems = matchedItems;
    this.isoCountryCodes = isoCountryCodes;
    this.companyName = companyName;
    this.companyAddress = companyAddress;
    this.categories = categories;
    this.categoryHierarchies = categoryHierarchies;
  }

    
  @JsonProperty("upc")
  public String getUpc() {
    return upc;
  }
  public void setUpc(String upc) {
    this.upc = upc;
  }

    
  @JsonProperty("ean")
  public String getEan() {
    return ean;
  }
  public void setEan(String ean) {
    this.ean = ean;
  }

    
  @JsonProperty("isbn")
  public String getIsbn() {
    return isbn;
  }
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

    
  @JsonProperty("asin")
  public String getAsin() {
    return asin;
  }
  public void setAsin(String asin) {
    this.asin = asin;
  }

    
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

    
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

    
  @JsonProperty("mpn")
  public String getMpn() {
    return mpn;
  }
  public void setMpn(String mpn) {
    this.mpn = mpn;
  }

    
  @JsonProperty("part_number")
  public String getPartNumber() {
    return partNumber;
  }
  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

    
  @JsonProperty("upcs")
  public List<String> getUpcs() {
    return upcs;
  }
  public void setUpcs(List<String> upcs) {
    this.upcs = upcs;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }

    
  @JsonProperty("manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

    
  @JsonProperty("color")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

    
  @JsonProperty("new_price")
  public BigDecimal getNewPrice() {
    return newPrice;
  }
  public void setNewPrice(BigDecimal newPrice) {
    this.newPrice = newPrice;
  }

    
  @JsonProperty("used_price")
  public BigDecimal getUsedPrice() {
    return usedPrice;
  }
  public void setUsedPrice(BigDecimal usedPrice) {
    this.usedPrice = usedPrice;
  }

    
  @JsonProperty("currency_code")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

    
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

    
  @JsonProperty("features")
  public List<String> getFeatures() {
    return features;
  }
  public void setFeatures(List<String> features) {
    this.features = features;
  }

    
  @JsonProperty("dimensions")
  public List<Object> getDimensions() {
    return dimensions;
  }
  public void setDimensions(List<Object> dimensions) {
    this.dimensions = dimensions;
  }

    
  @JsonProperty("images")
  public List<String> getImages() {
    return images;
  }
  public void setImages(List<String> images) {
    this.images = images;
  }

    
  @JsonProperty("matched_items")
  public List<Object> getMatchedItems() {
    return matchedItems;
  }
  public void setMatchedItems(List<Object> matchedItems) {
    this.matchedItems = matchedItems;
  }

    
  @JsonProperty("iso_country_codes")
  public List<String> getIsoCountryCodes() {
    return isoCountryCodes;
  }
  public void setIsoCountryCodes(List<String> isoCountryCodes) {
    this.isoCountryCodes = isoCountryCodes;
  }

    
  @JsonProperty("company_name")
  public String getCompanyName() {
    return companyName;
  }
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

    
  @JsonProperty("company_address")
  public String getCompanyAddress() {
    return companyAddress;
  }
  public void setCompanyAddress(String companyAddress) {
    this.companyAddress = companyAddress;
  }

    
  @JsonProperty("categories")
  public List<String> getCategories() {
    return categories;
  }
  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

    
  @JsonProperty("category_hierarchies")
  public List<String> getCategoryHierarchies() {
    return categoryHierarchies;
  }
  public void setCategoryHierarchies(List<String> categoryHierarchies) {
    this.categoryHierarchies = categoryHierarchies;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(upc, item.upc) &&
        Objects.equals(ean, item.ean) &&
        Objects.equals(isbn, item.isbn) &&
        Objects.equals(asin, item.asin) &&
        Objects.equals(title, item.title) &&
        Objects.equals(sku, item.sku) &&
        Objects.equals(mpn, item.mpn) &&
        Objects.equals(partNumber, item.partNumber) &&
        Objects.equals(upcs, item.upcs) &&
        Objects.equals(description, item.description) &&
        Objects.equals(brand, item.brand) &&
        Objects.equals(manufacturer, item.manufacturer) &&
        Objects.equals(color, item.color) &&
        Objects.equals(newPrice, item.newPrice) &&
        Objects.equals(usedPrice, item.usedPrice) &&
        Objects.equals(currencyCode, item.currencyCode) &&
        Objects.equals(url, item.url) &&
        Objects.equals(features, item.features) &&
        Objects.equals(dimensions, item.dimensions) &&
        Objects.equals(images, item.images) &&
        Objects.equals(matchedItems, item.matchedItems) &&
        Objects.equals(isoCountryCodes, item.isoCountryCodes) &&
        Objects.equals(companyName, item.companyName) &&
        Objects.equals(companyAddress, item.companyAddress) &&
        Objects.equals(categories, item.categories) &&
        Objects.equals(categoryHierarchies, item.categoryHierarchies);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
