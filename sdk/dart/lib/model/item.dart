part of openapi.api;

class Item {
  
  String upc = null;
  
  String ean = null;
  
  String isbn = null;
  
  String asin = null;
  
  String title = null;
  
  String sku = null;
  
  String mpn = null;
  
  String partNumber = null;
  /* A list of matching upc codes. */
  List<String> upcs = [];
  
  String description = null;
  
  String brand = null;
  
  String manufacturer = null;
  
  String color = null;
  
  num newPrice = null;
  
  num usedPrice = null;
  
  String currencyCode = null;
  
  String url = null;
  /* A list of product feature descriptions. */
  List<String> features = [];
  /* Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms') */
  List<Object> dimensions = [];
  /* A list product images. */
  List<String> images = [];
  /* Matched items for this product. */
  List<Object> matchedItems = [];
  /* A list of country codes from which this item belongs. */
  List<String> isoCountryCodes = [];
  /* The company name registered to the product's UPC or EAN. */
  String companyName = null;
  /* The company address registered to the product's UPC or EAN. */
  String companyAddress = null;
  /* A list of categories for this product. */
  List<String> categories = [];
  /* A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category. */
  List<String> categoryHierarchies = [];
  Item();

  @override
  String toString() {
    return 'Item[upc=$upc, ean=$ean, isbn=$isbn, asin=$asin, title=$title, sku=$sku, mpn=$mpn, partNumber=$partNumber, upcs=$upcs, description=$description, brand=$brand, manufacturer=$manufacturer, color=$color, newPrice=$newPrice, usedPrice=$usedPrice, currencyCode=$currencyCode, url=$url, features=$features, dimensions=$dimensions, images=$images, matchedItems=$matchedItems, isoCountryCodes=$isoCountryCodes, companyName=$companyName, companyAddress=$companyAddress, categories=$categories, categoryHierarchies=$categoryHierarchies, ]';
  }

  Item.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    upc = json['upc'];
    ean = json['ean'];
    isbn = json['isbn'];
    asin = json['asin'];
    title = json['title'];
    sku = json['sku'];
    mpn = json['mpn'];
    partNumber = json['part_number'];
    upcs = (json['upcs'] == null) ?
      null :
      (json['upcs'] as List).cast<String>();
    description = json['description'];
    brand = json['brand'];
    manufacturer = json['manufacturer'];
    color = json['color'];
    newPrice = json['new_price'];
    usedPrice = json['used_price'];
    currencyCode = json['currency_code'];
    url = json['url'];
    features = (json['features'] == null) ?
      null :
      (json['features'] as List).cast<String>();
    dimensions = (json['dimensions'] == null) ?
      null :
      Object.listFromJson(json['dimensions']);
    images = (json['images'] == null) ?
      null :
      (json['images'] as List).cast<String>();
    matchedItems = (json['matched_items'] == null) ?
      null :
      Object.listFromJson(json['matched_items']);
    isoCountryCodes = (json['iso_country_codes'] == null) ?
      null :
      (json['iso_country_codes'] as List).cast<String>();
    companyName = json['company_name'];
    companyAddress = json['company_address'];
    categories = (json['categories'] == null) ?
      null :
      (json['categories'] as List).cast<String>();
    categoryHierarchies = (json['category_hierarchies'] == null) ?
      null :
      (json['category_hierarchies'] as List).cast<String>();
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (upc != null)
      json['upc'] = upc;
    if (ean != null)
      json['ean'] = ean;
    if (isbn != null)
      json['isbn'] = isbn;
    if (asin != null)
      json['asin'] = asin;
    if (title != null)
      json['title'] = title;
    if (sku != null)
      json['sku'] = sku;
    if (mpn != null)
      json['mpn'] = mpn;
    if (partNumber != null)
      json['part_number'] = partNumber;
    if (upcs != null)
      json['upcs'] = upcs;
    if (description != null)
      json['description'] = description;
    if (brand != null)
      json['brand'] = brand;
    if (manufacturer != null)
      json['manufacturer'] = manufacturer;
    if (color != null)
      json['color'] = color;
    if (newPrice != null)
      json['new_price'] = newPrice;
    if (usedPrice != null)
      json['used_price'] = usedPrice;
    if (currencyCode != null)
      json['currency_code'] = currencyCode;
    if (url != null)
      json['url'] = url;
    if (features != null)
      json['features'] = features;
    if (dimensions != null)
      json['dimensions'] = dimensions;
    if (images != null)
      json['images'] = images;
    if (matchedItems != null)
      json['matched_items'] = matchedItems;
    if (isoCountryCodes != null)
      json['iso_country_codes'] = isoCountryCodes;
    if (companyName != null)
      json['company_name'] = companyName;
    if (companyAddress != null)
      json['company_address'] = companyAddress;
    if (categories != null)
      json['categories'] = categories;
    if (categoryHierarchies != null)
      json['category_hierarchies'] = categoryHierarchies;
    return json;
  }

  static List<Item> listFromJson(List<dynamic> json) {
    return json == null ? List<Item>() : json.map((value) => Item.fromJson(value)).toList();
  }

  static Map<String, Item> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, Item>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = Item.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of Item-objects as value to a dart map
  static Map<String, List<Item>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<Item>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = Item.listFromJson(value);
       });
     }
     return map;
  }
}

