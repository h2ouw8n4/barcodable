            import 'package:built_collection/built_collection.dart';
            import 'package:built_value/json_object.dart';
        import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item.g.dart';

abstract class Item implements Built<Item, ItemBuilder> {

    
        @nullable
    @BuiltValueField(wireName: r'upc')
    String get upc;
    
        @nullable
    @BuiltValueField(wireName: r'ean')
    String get ean;
    
        @nullable
    @BuiltValueField(wireName: r'isbn')
    String get isbn;
    
        @nullable
    @BuiltValueField(wireName: r'asin')
    String get asin;
    
        @nullable
    @BuiltValueField(wireName: r'title')
    String get title;
    
        @nullable
    @BuiltValueField(wireName: r'sku')
    String get sku;
    
        @nullable
    @BuiltValueField(wireName: r'mpn')
    String get mpn;
    
        @nullable
    @BuiltValueField(wireName: r'part_number')
    String get partNumber;
    /* A list of matching upc codes. */
        @nullable
    @BuiltValueField(wireName: r'upcs')
    BuiltList<String> get upcs;
    
        @nullable
    @BuiltValueField(wireName: r'description')
    String get description;
    
        @nullable
    @BuiltValueField(wireName: r'brand')
    String get brand;
    
        @nullable
    @BuiltValueField(wireName: r'manufacturer')
    String get manufacturer;
    
        @nullable
    @BuiltValueField(wireName: r'color')
    String get color;
    
        @nullable
    @BuiltValueField(wireName: r'new_price')
    num get newPrice;
    
        @nullable
    @BuiltValueField(wireName: r'used_price')
    num get usedPrice;
    
        @nullable
    @BuiltValueField(wireName: r'currency_code')
    String get currencyCode;
    
        @nullable
    @BuiltValueField(wireName: r'url')
    String get url;
    /* A list of product feature descriptions. */
        @nullable
    @BuiltValueField(wireName: r'features')
    BuiltList<String> get features;
    /* Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms') */
        @nullable
    @BuiltValueField(wireName: r'dimensions')
    BuiltList<JsonObject> get dimensions;
    /* A list product images. */
        @nullable
    @BuiltValueField(wireName: r'images')
    BuiltList<String> get images;
    /* Matched items for this product. */
        @nullable
    @BuiltValueField(wireName: r'matched_items')
    BuiltList<JsonObject> get matchedItems;
    /* A list of country codes from which this item belongs. */
        @nullable
    @BuiltValueField(wireName: r'iso_country_codes')
    BuiltList<String> get isoCountryCodes;
    /* The company name registered to the product's UPC or EAN. */
        @nullable
    @BuiltValueField(wireName: r'company_name')
    String get companyName;
    /* The company address registered to the product's UPC or EAN. */
        @nullable
    @BuiltValueField(wireName: r'company_address')
    String get companyAddress;
    /* A list of categories for this product. */
        @nullable
    @BuiltValueField(wireName: r'categories')
    BuiltList<String> get categories;
    /* A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category. */
        @nullable
    @BuiltValueField(wireName: r'category_hierarchies')
    BuiltList<String> get categoryHierarchies;

    // Boilerplate code needed to wire-up generated code
    Item._();

    factory Item([updates(ItemBuilder b)]) = _$Item;
    static Serializer<Item> get serializer => _$itemSerializer;

}

