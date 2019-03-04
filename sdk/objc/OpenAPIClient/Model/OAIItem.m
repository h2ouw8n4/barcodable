#import "OAIItem.h"

@implementation OAIItem

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"upc": @"upc", @"ean": @"ean", @"isbn": @"isbn", @"asin": @"asin", @"title": @"title", @"sku": @"sku", @"mpn": @"mpn", @"partNumber": @"part_number", @"upcs": @"upcs", @"_description": @"description", @"brand": @"brand", @"manufacturer": @"manufacturer", @"color": @"color", @"varNewPrice": @"new_price", @"usedPrice": @"used_price", @"currencyCode": @"currency_code", @"url": @"url", @"features": @"features", @"dimensions": @"dimensions", @"images": @"images", @"matchedItems": @"matched_items", @"isoCountryCodes": @"iso_country_codes", @"companyName": @"company_name", @"companyAddress": @"company_address", @"categories": @"categories", @"categoryHierarchies": @"category_hierarchies" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"upc", @"ean", @"isbn", @"asin", @"title", @"sku", @"mpn", @"partNumber", @"upcs", @"_description", @"brand", @"manufacturer", @"color", @"varNewPrice", @"usedPrice", @"currencyCode", @"url", @"features", @"dimensions", @"images", @"matchedItems", @"isoCountryCodes", @"companyName", @"companyAddress", @"categories", @"categoryHierarchies"];
  return [optionalProperties containsObject:propertyName];
}

@end
