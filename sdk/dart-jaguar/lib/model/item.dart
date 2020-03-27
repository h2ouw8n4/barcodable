import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'item.jser.dart';

class Item {
  
  @Alias('upc', isNullable: false,  )
  final String upc;
  
  @Alias('ean', isNullable: false,  )
  final String ean;
  
  @Alias('isbn', isNullable: false,  )
  final String isbn;
  
  @Alias('asin', isNullable: false,  )
  final String asin;
  
  @Alias('title', isNullable: false,  )
  final String title;
  
  @Alias('sku', isNullable: false,  )
  final String sku;
  
  @Alias('mpn', isNullable: false,  )
  final String mpn;
  
  @Alias('part_number', isNullable: false,  )
  final String partNumber;
   /* A list of matching upc codes. */
  @Alias('upcs', isNullable: false,  )
  final List<String> upcs;
  
  @Alias('description', isNullable: false,  )
  final String description;
  
  @Alias('brand', isNullable: false,  )
  final String brand;
  
  @Alias('manufacturer', isNullable: false,  )
  final String manufacturer;
  
  @Alias('color', isNullable: false,  )
  final String color;
  
  @Alias('new_price', isNullable: false,  )
  final num newPrice;
  
  @Alias('used_price', isNullable: false,  )
  final num usedPrice;
  
  @Alias('currency_code', isNullable: false,  )
  final String currencyCode;
  
  @Alias('url', isNullable: false,  )
  final String url;
   /* A list of product feature descriptions. */
  @Alias('features', isNullable: false,  )
  final List<String> features;
   /* Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms') */
  @Alias('dimensions', isNullable: false,  )
  final List<Object> dimensions;
   /* A list product images. */
  @Alias('images', isNullable: false,  )
  final List<String> images;
   /* Matched items for this product. */
  @Alias('matched_items', isNullable: false,  )
  final List<Object> matchedItems;
   /* A list of country codes from which this item belongs. */
  @Alias('iso_country_codes', isNullable: false,  )
  final List<String> isoCountryCodes;
   /* The company name registered to the product's UPC or EAN. */
  @Alias('company_name', isNullable: false,  )
  final String companyName;
   /* The company address registered to the product's UPC or EAN. */
  @Alias('company_address', isNullable: false,  )
  final String companyAddress;
   /* A list of categories for this product. */
  @Alias('categories', isNullable: false,  )
  final List<String> categories;
   /* A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category. */
  @Alias('category_hierarchies', isNullable: false,  )
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

