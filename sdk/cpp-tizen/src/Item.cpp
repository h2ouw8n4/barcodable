#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Item.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Item::Item()
{
	//__init();
}

Item::~Item()
{
	//__cleanup();
}

void
Item::__init()
{
	//upc = std::string();
	//ean = std::string();
	//isbn = std::string();
	//asin = std::string();
	//title = std::string();
	//sku = std::string();
	//mpn = std::string();
	//part_number = std::string();
	//new std::list()std::list> upcs;
	//description = std::string();
	//brand = std::string();
	//manufacturer = std::string();
	//color = std::string();
	//new_price = double(0);
	//used_price = double(0);
	//currency_code = std::string();
	//url = std::string();
	//new std::list()std::list> features;
	//new std::list()std::list> dimensions;
	//new std::list()std::list> images;
	//new std::list()std::list> matched_items;
	//new std::list()std::list> iso_country_codes;
	//company_name = std::string();
	//company_address = std::string();
	//new std::list()std::list> categories;
	//new std::list()std::list> category_hierarchies;
}

void
Item::__cleanup()
{
	//if(upc != NULL) {
	//
	//delete upc;
	//upc = NULL;
	//}
	//if(ean != NULL) {
	//
	//delete ean;
	//ean = NULL;
	//}
	//if(isbn != NULL) {
	//
	//delete isbn;
	//isbn = NULL;
	//}
	//if(asin != NULL) {
	//
	//delete asin;
	//asin = NULL;
	//}
	//if(title != NULL) {
	//
	//delete title;
	//title = NULL;
	//}
	//if(sku != NULL) {
	//
	//delete sku;
	//sku = NULL;
	//}
	//if(mpn != NULL) {
	//
	//delete mpn;
	//mpn = NULL;
	//}
	//if(part_number != NULL) {
	//
	//delete part_number;
	//part_number = NULL;
	//}
	//if(upcs != NULL) {
	//upcs.RemoveAll(true);
	//delete upcs;
	//upcs = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(brand != NULL) {
	//
	//delete brand;
	//brand = NULL;
	//}
	//if(manufacturer != NULL) {
	//
	//delete manufacturer;
	//manufacturer = NULL;
	//}
	//if(color != NULL) {
	//
	//delete color;
	//color = NULL;
	//}
	//if(new_price != NULL) {
	//
	//delete new_price;
	//new_price = NULL;
	//}
	//if(used_price != NULL) {
	//
	//delete used_price;
	//used_price = NULL;
	//}
	//if(currency_code != NULL) {
	//
	//delete currency_code;
	//currency_code = NULL;
	//}
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//if(features != NULL) {
	//features.RemoveAll(true);
	//delete features;
	//features = NULL;
	//}
	//if(dimensions != NULL) {
	//dimensions.RemoveAll(true);
	//delete dimensions;
	//dimensions = NULL;
	//}
	//if(images != NULL) {
	//images.RemoveAll(true);
	//delete images;
	//images = NULL;
	//}
	//if(matched_items != NULL) {
	//matched_items.RemoveAll(true);
	//delete matched_items;
	//matched_items = NULL;
	//}
	//if(iso_country_codes != NULL) {
	//iso_country_codes.RemoveAll(true);
	//delete iso_country_codes;
	//iso_country_codes = NULL;
	//}
	//if(company_name != NULL) {
	//
	//delete company_name;
	//company_name = NULL;
	//}
	//if(company_address != NULL) {
	//
	//delete company_address;
	//company_address = NULL;
	//}
	//if(categories != NULL) {
	//categories.RemoveAll(true);
	//delete categories;
	//categories = NULL;
	//}
	//if(category_hierarchies != NULL) {
	//category_hierarchies.RemoveAll(true);
	//delete category_hierarchies;
	//category_hierarchies = NULL;
	//}
	//
}

void
Item::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *upcKey = "upc";
	node = json_object_get_member(pJsonObject, upcKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&upc, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *eanKey = "ean";
	node = json_object_get_member(pJsonObject, eanKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ean, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *isbnKey = "isbn";
	node = json_object_get_member(pJsonObject, isbnKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&isbn, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *asinKey = "asin";
	node = json_object_get_member(pJsonObject, asinKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&asin, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *titleKey = "title";
	node = json_object_get_member(pJsonObject, titleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&title, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *skuKey = "sku";
	node = json_object_get_member(pJsonObject, skuKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&sku, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *mpnKey = "mpn";
	node = json_object_get_member(pJsonObject, mpnKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&mpn, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *part_numberKey = "part_number";
	node = json_object_get_member(pJsonObject, part_numberKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&part_number, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *upcsKey = "upcs";
	node = json_object_get_member(pJsonObject, upcsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			upcs = new_list;
		}
		
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *brandKey = "brand";
	node = json_object_get_member(pJsonObject, brandKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&brand, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *manufacturerKey = "manufacturer";
	node = json_object_get_member(pJsonObject, manufacturerKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&manufacturer, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *colorKey = "color";
	node = json_object_get_member(pJsonObject, colorKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&color, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *new_priceKey = "new_price";
	node = json_object_get_member(pJsonObject, new_priceKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&new_price, node, "long long", "");
		} else {
			
		}
	}
	const gchar *used_priceKey = "used_price";
	node = json_object_get_member(pJsonObject, used_priceKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&used_price, node, "long long", "");
		} else {
			
		}
	}
	const gchar *currency_codeKey = "currency_code";
	node = json_object_get_member(pJsonObject, currency_codeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&currency_code, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *featuresKey = "features";
	node = json_object_get_member(pJsonObject, featuresKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			features = new_list;
		}
		
	}
	const gchar *dimensionsKey = "dimensions";
	node = json_object_get_member(pJsonObject, dimensionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			dimensions = new_list;
		}
		
	}
	const gchar *imagesKey = "images";
	node = json_object_get_member(pJsonObject, imagesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			images = new_list;
		}
		
	}
	const gchar *matched_itemsKey = "matched_items";
	node = json_object_get_member(pJsonObject, matched_itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			matched_items = new_list;
		}
		
	}
	const gchar *iso_country_codesKey = "iso_country_codes";
	node = json_object_get_member(pJsonObject, iso_country_codesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			iso_country_codes = new_list;
		}
		
	}
	const gchar *company_nameKey = "company_name";
	node = json_object_get_member(pJsonObject, company_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&company_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *company_addressKey = "company_address";
	node = json_object_get_member(pJsonObject, company_addressKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&company_address, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *categoriesKey = "categories";
	node = json_object_get_member(pJsonObject, categoriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			categories = new_list;
		}
		
	}
	const gchar *category_hierarchiesKey = "category_hierarchies";
	node = json_object_get_member(pJsonObject, category_hierarchiesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			category_hierarchies = new_list;
		}
		
	}
}

Item::Item(char* json)
{
	this->fromJson(json);
}

char*
Item::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getUpc();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *upcKey = "upc";
	json_object_set_member(pJsonObject, upcKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEan();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *eanKey = "ean";
	json_object_set_member(pJsonObject, eanKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getIsbn();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *isbnKey = "isbn";
	json_object_set_member(pJsonObject, isbnKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAsin();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *asinKey = "asin";
	json_object_set_member(pJsonObject, asinKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTitle();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *titleKey = "title";
	json_object_set_member(pJsonObject, titleKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSku();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *skuKey = "sku";
	json_object_set_member(pJsonObject, skuKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMpn();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *mpnKey = "mpn";
	json_object_set_member(pJsonObject, mpnKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPartNumber();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *part_numberKey = "part_number";
	json_object_set_member(pJsonObject, part_numberKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getUpcs());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getUpcs());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *upcsKey = "upcs";
	json_object_set_member(pJsonObject, upcsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBrand();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *brandKey = "brand";
	json_object_set_member(pJsonObject, brandKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getManufacturer();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *manufacturerKey = "manufacturer";
	json_object_set_member(pJsonObject, manufacturerKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getColor();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *colorKey = "color";
	json_object_set_member(pJsonObject, colorKey, node);
	if (isprimitive("long long")) {
		long long obj = getNewPrice();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *new_priceKey = "new_price";
	json_object_set_member(pJsonObject, new_priceKey, node);
	if (isprimitive("long long")) {
		long long obj = getUsedPrice();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *used_priceKey = "used_price";
	json_object_set_member(pJsonObject, used_priceKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCurrencyCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *currency_codeKey = "currency_code";
	json_object_set_member(pJsonObject, currency_codeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getFeatures());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getFeatures());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *featuresKey = "features";
	json_object_set_member(pJsonObject, featuresKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getDimensions());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getDimensions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<std::string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			std::string obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *dimensionsKey = "dimensions";
	json_object_set_member(pJsonObject, dimensionsKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getImages());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getImages());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *imagesKey = "images";
	json_object_set_member(pJsonObject, imagesKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getMatchedItems());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getMatchedItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<std::string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			std::string obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *matched_itemsKey = "matched_items";
	json_object_set_member(pJsonObject, matched_itemsKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getIsoCountryCodes());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getIsoCountryCodes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *iso_country_codesKey = "iso_country_codes";
	json_object_set_member(pJsonObject, iso_country_codesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCompanyName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *company_nameKey = "company_name";
	json_object_set_member(pJsonObject, company_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCompanyAddress();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *company_addressKey = "company_address";
	json_object_set_member(pJsonObject, company_addressKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCategories());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCategories());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *categoriesKey = "categories";
	json_object_set_member(pJsonObject, categoriesKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCategoryHierarchies());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCategoryHierarchies());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *category_hierarchiesKey = "category_hierarchies";
	json_object_set_member(pJsonObject, category_hierarchiesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Item::getUpc()
{
	return upc;
}

void
Item::setUpc(std::string  upc)
{
	this->upc = upc;
}

std::string
Item::getEan()
{
	return ean;
}

void
Item::setEan(std::string  ean)
{
	this->ean = ean;
}

std::string
Item::getIsbn()
{
	return isbn;
}

void
Item::setIsbn(std::string  isbn)
{
	this->isbn = isbn;
}

std::string
Item::getAsin()
{
	return asin;
}

void
Item::setAsin(std::string  asin)
{
	this->asin = asin;
}

std::string
Item::getTitle()
{
	return title;
}

void
Item::setTitle(std::string  title)
{
	this->title = title;
}

std::string
Item::getSku()
{
	return sku;
}

void
Item::setSku(std::string  sku)
{
	this->sku = sku;
}

std::string
Item::getMpn()
{
	return mpn;
}

void
Item::setMpn(std::string  mpn)
{
	this->mpn = mpn;
}

std::string
Item::getPartNumber()
{
	return part_number;
}

void
Item::setPartNumber(std::string  part_number)
{
	this->part_number = part_number;
}

std::list<std::string>
Item::getUpcs()
{
	return upcs;
}

void
Item::setUpcs(std::list <std::string> upcs)
{
	this->upcs = upcs;
}

std::string
Item::getDescription()
{
	return description;
}

void
Item::setDescription(std::string  description)
{
	this->description = description;
}

std::string
Item::getBrand()
{
	return brand;
}

void
Item::setBrand(std::string  brand)
{
	this->brand = brand;
}

std::string
Item::getManufacturer()
{
	return manufacturer;
}

void
Item::setManufacturer(std::string  manufacturer)
{
	this->manufacturer = manufacturer;
}

std::string
Item::getColor()
{
	return color;
}

void
Item::setColor(std::string  color)
{
	this->color = color;
}

long long
Item::getNewPrice()
{
	return new_price;
}

void
Item::setNewPrice(long long  new_price)
{
	this->new_price = new_price;
}

long long
Item::getUsedPrice()
{
	return used_price;
}

void
Item::setUsedPrice(long long  used_price)
{
	this->used_price = used_price;
}

std::string
Item::getCurrencyCode()
{
	return currency_code;
}

void
Item::setCurrencyCode(std::string  currency_code)
{
	this->currency_code = currency_code;
}

std::string
Item::getUrl()
{
	return url;
}

void
Item::setUrl(std::string  url)
{
	this->url = url;
}

std::list<std::string>
Item::getFeatures()
{
	return features;
}

void
Item::setFeatures(std::list <std::string> features)
{
	this->features = features;
}

std::list<std::string>
Item::getDimensions()
{
	return dimensions;
}

void
Item::setDimensions(std::list <std::string> dimensions)
{
	this->dimensions = dimensions;
}

std::list<std::string>
Item::getImages()
{
	return images;
}

void
Item::setImages(std::list <std::string> images)
{
	this->images = images;
}

std::list<std::string>
Item::getMatchedItems()
{
	return matched_items;
}

void
Item::setMatchedItems(std::list <std::string> matched_items)
{
	this->matched_items = matched_items;
}

std::list<std::string>
Item::getIsoCountryCodes()
{
	return iso_country_codes;
}

void
Item::setIsoCountryCodes(std::list <std::string> iso_country_codes)
{
	this->iso_country_codes = iso_country_codes;
}

std::string
Item::getCompanyName()
{
	return company_name;
}

void
Item::setCompanyName(std::string  company_name)
{
	this->company_name = company_name;
}

std::string
Item::getCompanyAddress()
{
	return company_address;
}

void
Item::setCompanyAddress(std::string  company_address)
{
	this->company_address = company_address;
}

std::list<std::string>
Item::getCategories()
{
	return categories;
}

void
Item::setCategories(std::list <std::string> categories)
{
	this->categories = categories;
}

std::list<std::string>
Item::getCategoryHierarchies()
{
	return category_hierarchies;
}

void
Item::setCategoryHierarchies(std::list <std::string> category_hierarchies)
{
	this->category_hierarchies = category_hierarchies;
}


