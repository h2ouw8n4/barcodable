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
    if (json['upc'] == null) {
      upc = null;
    } else {
          upc = json['upc'];
    }
    if (json['ean'] == null) {
      ean = null;
    } else {
          ean = json['ean'];
    }
    if (json['isbn'] == null) {
      isbn = null;
    } else {
          isbn = json['isbn'];
    }
    if (json['asin'] == null) {
      asin = null;
    } else {
          asin = json['asin'];
    }
    if (json['title'] == null) {
      title = null;
    } else {
          title = json['title'];
    }
    if (json['sku'] == null) {
      sku = null;
    } else {
          sku = json['sku'];
    }
    if (json['mpn'] == null) {
      mpn = null;
    } else {
          mpn = json['mpn'];
    }
    if (json['part_number'] == null) {
      partNumber = null;
    } else {
          partNumber = json['part_number'];
    }
    if (json['upcs'] == null) {
      upcs = null;
    } else {
      upcs = (json['upcs'] as List).cast<String>();
    }
    if (json['description'] == null) {
      description = null;
    } else {
          description = json['description'];
    }
    if (json['brand'] == null) {
      brand = null;
    } else {
          brand = json['brand'];
    }
    if (json['manufacturer'] == null) {
      manufacturer = null;
    } else {
          manufacturer = json['manufacturer'];
    }
    if (json['color'] == null) {
      color = null;
    } else {
          color = json['color'];
    }
    if (json['new_price'] == null) {
      newPrice = null;
    } else {
          newPrice = json['new_price'];
    }
    if (json['used_price'] == null) {
      usedPrice = null;
    } else {
          usedPrice = json['used_price'];
    }
    if (json['currency_code'] == null) {
      currencyCode = null;
    } else {
          currencyCode = json['currency_code'];
    }
    if (json['url'] == null) {
      url = null;
    } else {
          url = json['url'];
    }
    if (json['features'] == null) {
      features = null;
    } else {
      features = (json['features'] as List).cast<String>();
    }
    if (json['dimensions'] == null) {
      dimensions = null;
    } else {
      dimensions = Object.listFromJson(json['dimensions']);
    }
    if (json['images'] == null) {
      images = null;
    } else {
      images = (json['images'] as List).cast<String>();
    }
    if (json['matched_items'] == null) {
      matchedItems = null;
    } else {
      matchedItems = Object.listFromJson(json['matched_items']);
    }
    if (json['iso_country_codes'] == null) {
      isoCountryCodes = null;
    } else {
      isoCountryCodes = (json['iso_country_codes'] as List).cast<String>();
    }
    if (json['company_name'] == null) {
      companyName = null;
    } else {
          companyName = json['company_name'];
    }
    if (json['company_address'] == null) {
      companyAddress = null;
    } else {
          companyAddress = json['company_address'];
    }
    if (json['categories'] == null) {
      categories = null;
    } else {
      categories = (json['categories'] as List).cast<String>();
    }
    if (json['category_hierarchies'] == null) {
      categoryHierarchies = null;
    } else {
      categoryHierarchies = (json['category_hierarchies'] as List).cast<String>();
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'upc': upc,
      'ean': ean,
      'isbn': isbn,
      'asin': asin,
      'title': title,
      'sku': sku,
      'mpn': mpn,
      'part_number': partNumber,
      'upcs': upcs,
      'description': description,
      'brand': brand,
      'manufacturer': manufacturer,
      'color': color,
      'new_price': newPrice,
      'used_price': usedPrice,
      'currency_code': currencyCode,
      'url': url,
      'features': features,
      'dimensions': dimensions,
      'images': images,
      'matched_items': matchedItems,
      'iso_country_codes': isoCountryCodes,
      'company_name': companyName,
      'company_address': companyAddress,
      'categories': categories,
      'category_hierarchies': categoryHierarchies
    };
  }

  static List<Item> listFromJson(List<dynamic> json) {
    return json == null ? new List<Item>() : json.map((value) => new Item.fromJson(value)).toList();
  }

  static Map<String, Item> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, Item>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new Item.fromJson(value));
    }
    return map;
  }
}

