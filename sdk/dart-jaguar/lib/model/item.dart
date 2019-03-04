import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/object.dart';
part 'item.jser.dart';

class Item {
  
  @Alias('upc')
  final String upc;
  
  @Alias('ean')
  final String ean;
  
  @Alias('isbn')
  final String isbn;
  
  @Alias('asin')
  final String asin;
  
  @Alias('title')
  final String title;
  
  @Alias('sku')
  final String sku;
  
  @Alias('mpn')
  final String mpn;
  
  @Alias('part_number')
  final String partNumber;
   /* A list of matching upc codes. */
  @Alias('upcs')
  final List<String> upcs;
  
  @Alias('description')
  final String description;
  
  @Alias('brand')
  final String brand;
  
  @Alias('manufacturer')
  final String manufacturer;
  
  @Alias('color')
  final String color;
  
  @Alias('new_price')
  final num newPrice;
  
  @Alias('used_price')
  final num usedPrice;
  
  @Alias('currency_code')
  final String currencyCode;
  
  @Alias('url')
  final String url;
   /* A list of product feature descriptions. */
  @Alias('features')
  final List<String> features;
   /* Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms') */
  @Alias('dimensions')
  final List<Object> dimensions;
   /* A list product images. */
  @Alias('images')
  final List<String> images;
   /* Matched items for this product. */
  @Alias('matched_items')
  final List<Object> matchedItems;
   /* A list of country codes from which this item belongs. */
  @Alias('iso_country_codes')
  final List<String> isoCountryCodes;
   /* The company name registered to the product's UPC or EAN. */
  @Alias('company_name')
  final String companyName;
   /* The company address registered to the product's UPC or EAN. */
  @Alias('company_address')
  final String companyAddress;
   /* A list of categories for this product. */
  @Alias('categories')
  final List<String> categories;
   /* A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category. */
  @Alias('category_hierarchies')
  final List<String> categoryHierarchies;
  

  Item(
      

{
     this.upc = null,  
     this.ean = null,  
     this.isbn = null,  
     this.asin = null,  
     this.title = null,  
     this.sku = null,  
     this.mpn = null,  
     this.partNumber = null,  
     this.upcs = const [],  
     this.description = null,  
     this.brand = null,  
     this.manufacturer = null,  
     this.color = null,  
     this.newPrice = null,  
     this.usedPrice = null,  
     this.currencyCode = null,  
     this.url = null,  
     this.features = const [],  
     this.dimensions = const [],  
     this.images = const [],  
     this.matchedItems = const [],  
     this.isoCountryCodes = const [],  
     this.companyName = null,  
     this.companyAddress = null,  
     this.categories = const [],  
     this.categoryHierarchies = const [] 
    
    }
  );

  @override
  String toString() {
    return 'Item[upc=$upc, ean=$ean, isbn=$isbn, asin=$asin, title=$title, sku=$sku, mpn=$mpn, partNumber=$partNumber, upcs=$upcs, description=$description, brand=$brand, manufacturer=$manufacturer, color=$color, newPrice=$newPrice, usedPrice=$usedPrice, currencyCode=$currencyCode, url=$url, features=$features, dimensions=$dimensions, images=$images, matchedItems=$matchedItems, isoCountryCodes=$isoCountryCodes, companyName=$companyName, companyAddress=$companyAddress, categories=$categories, categoryHierarchies=$categoryHierarchies, ]';
  }
}

@GenSerializer(nullableFields: true)
class ItemSerializer extends Serializer<Item> with _$ItemSerializer {

}
