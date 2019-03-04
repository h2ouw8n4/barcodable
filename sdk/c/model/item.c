#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item.h"



item_t *item_create(
    char *upc,
    char *ean,
    char *isbn,
    char *asin,
    char *title,
    char *sku,
    char *mpn,
    char *part_number,
    list_t *upcs,
    char *description,
    char *brand,
    char *manufacturer,
    char *color,
    double new_price,
    double used_price,
    char *currency_code,
    char *url,
    list_t *features,
    list_t *dimensions,
    list_t *images,
    list_t *matched_items,
    list_t *iso_country_codes,
    char *company_name,
    char *company_address,
    list_t *categories,
    list_t *category_hierarchies
    ) {
	item_t *item = malloc(sizeof(item_t));
	item->upc = upc;
	item->ean = ean;
	item->isbn = isbn;
	item->asin = asin;
	item->title = title;
	item->sku = sku;
	item->mpn = mpn;
	item->part_number = part_number;
	item->upcs = upcs;
	item->description = description;
	item->brand = brand;
	item->manufacturer = manufacturer;
	item->color = color;
	item->new_price = new_price;
	item->used_price = used_price;
	item->currency_code = currency_code;
	item->url = url;
	item->features = features;
	item->dimensions = dimensions;
	item->images = images;
	item->matched_items = matched_items;
	item->iso_country_codes = iso_country_codes;
	item->company_name = company_name;
	item->company_address = company_address;
	item->categories = categories;
	item->category_hierarchies = category_hierarchies;

	return item;
}


void item_free(item_t *item) {
    listEntry_t *listEntry;
    free(item->upc);
    free(item->ean);
    free(item->isbn);
    free(item->asin);
    free(item->title);
    free(item->sku);
    free(item->mpn);
    free(item->part_number);
	list_ForEach(listEntry, item->upcs) {
		free(listEntry->data);
	}
	list_free(item->upcs);
    free(item->description);
    free(item->brand);
    free(item->manufacturer);
    free(item->color);
    free(item->currency_code);
    free(item->url);
	list_ForEach(listEntry, item->features) {
		free(listEntry->data);
	}
	list_free(item->features);
		list_ForEach(listEntry, item->dimensions) {
		object_free(listEntry->data);
	}
	list_free(item->dimensions);
	list_ForEach(listEntry, item->images) {
		free(listEntry->data);
	}
	list_free(item->images);
		list_ForEach(listEntry, item->matched_items) {
		object_free(listEntry->data);
	}
	list_free(item->matched_items);
	list_ForEach(listEntry, item->iso_country_codes) {
		free(listEntry->data);
	}
	list_free(item->iso_country_codes);
    free(item->company_name);
    free(item->company_address);
	list_ForEach(listEntry, item->categories) {
		free(listEntry->data);
	}
	list_free(item->categories);
	list_ForEach(listEntry, item->category_hierarchies) {
		free(listEntry->data);
	}
	list_free(item->category_hierarchies);

	free(item);
}

cJSON *item_convertToJSON(item_t *item) {
	cJSON *item = cJSON_CreateObject();
	// item->upc
    if(cJSON_AddStringToObject(item, "upc", item->upc) == NULL) {
    goto fail; //String
    }

	// item->ean
    if(cJSON_AddStringToObject(item, "ean", item->ean) == NULL) {
    goto fail; //String
    }

	// item->isbn
    if(cJSON_AddStringToObject(item, "isbn", item->isbn) == NULL) {
    goto fail; //String
    }

	// item->asin
    if(cJSON_AddStringToObject(item, "asin", item->asin) == NULL) {
    goto fail; //String
    }

	// item->title
    if(cJSON_AddStringToObject(item, "title", item->title) == NULL) {
    goto fail; //String
    }

	// item->sku
    if(cJSON_AddStringToObject(item, "sku", item->sku) == NULL) {
    goto fail; //String
    }

	// item->mpn
    if(cJSON_AddStringToObject(item, "mpn", item->mpn) == NULL) {
    goto fail; //String
    }

	// item->part_number
    if(cJSON_AddStringToObject(item, "part_number", item->part_number) == NULL) {
    goto fail; //String
    }

	// item->upcs
	cJSON *upcs = cJSON_AddArrayToObject(item, "upcs");
	if(upcs == NULL) {
		goto fail; //primitive container
	}

	listEntry_t *upcsListEntry;
    list_ForEach(upcsListEntry, item->upcs) {
        if(cJSON_AddStringToObject(upcs, "", (char*)upcsListEntry->data) == NULL)
        {
            goto fail;
        }
    }

	// item->description
    if(cJSON_AddStringToObject(item, "description", item->description) == NULL) {
    goto fail; //String
    }

	// item->brand
    if(cJSON_AddStringToObject(item, "brand", item->brand) == NULL) {
    goto fail; //String
    }

	// item->manufacturer
    if(cJSON_AddStringToObject(item, "manufacturer", item->manufacturer) == NULL) {
    goto fail; //String
    }

	// item->color
    if(cJSON_AddStringToObject(item, "color", item->color) == NULL) {
    goto fail; //String
    }

	// item->new_price
    if(cJSON_AddNumberToObject(item, "new_price", item->new_price) == NULL) {
    goto fail; //Numeric
    }

	// item->used_price
    if(cJSON_AddNumberToObject(item, "used_price", item->used_price) == NULL) {
    goto fail; //Numeric
    }

	// item->currency_code
    if(cJSON_AddStringToObject(item, "currency_code", item->currency_code) == NULL) {
    goto fail; //String
    }

	// item->url
    if(cJSON_AddStringToObject(item, "url", item->url) == NULL) {
    goto fail; //String
    }

	// item->features
	cJSON *features = cJSON_AddArrayToObject(item, "features");
	if(features == NULL) {
		goto fail; //primitive container
	}

	listEntry_t *featuresListEntry;
    list_ForEach(featuresListEntry, item->features) {
        if(cJSON_AddStringToObject(features, "", (char*)featuresListEntry->data) == NULL)
        {
            goto fail;
        }
    }

	// item->dimensions
    cJSON *dimensions = cJSON_AddArrayToObject(item, "dimensions");
	if(dimensions == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *dimensionsListEntry;
	list_ForEach(dimensionsListEntry, item->dimensions) {
		cJSON *item = object_convertToJSON(dimensionsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(dimensions, item);
	}

	// item->images
	cJSON *images = cJSON_AddArrayToObject(item, "images");
	if(images == NULL) {
		goto fail; //primitive container
	}

	listEntry_t *imagesListEntry;
    list_ForEach(imagesListEntry, item->images) {
        if(cJSON_AddStringToObject(images, "", (char*)imagesListEntry->data) == NULL)
        {
            goto fail;
        }
    }

	// item->matched_items
    cJSON *matched_items = cJSON_AddArrayToObject(item, "matched_items");
	if(matched_items == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *matched_itemsListEntry;
	list_ForEach(matched_itemsListEntry, item->matched_items) {
		cJSON *item = object_convertToJSON(matched_itemsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(matched_items, item);
	}

	// item->iso_country_codes
	cJSON *iso_country_codes = cJSON_AddArrayToObject(item, "iso_country_codes");
	if(iso_country_codes == NULL) {
		goto fail; //primitive container
	}

	listEntry_t *iso_country_codesListEntry;
    list_ForEach(iso_country_codesListEntry, item->iso_country_codes) {
        if(cJSON_AddStringToObject(iso_country_codes, "", (char*)iso_country_codesListEntry->data) == NULL)
        {
            goto fail;
        }
    }

	// item->company_name
    if(cJSON_AddStringToObject(item, "company_name", item->company_name) == NULL) {
    goto fail; //String
    }

	// item->company_address
    if(cJSON_AddStringToObject(item, "company_address", item->company_address) == NULL) {
    goto fail; //String
    }

	// item->categories
	cJSON *categories = cJSON_AddArrayToObject(item, "categories");
	if(categories == NULL) {
		goto fail; //primitive container
	}

	listEntry_t *categoriesListEntry;
    list_ForEach(categoriesListEntry, item->categories) {
        if(cJSON_AddStringToObject(categories, "", (char*)categoriesListEntry->data) == NULL)
        {
            goto fail;
        }
    }

	// item->category_hierarchies
	cJSON *category_hierarchies = cJSON_AddArrayToObject(item, "category_hierarchies");
	if(category_hierarchies == NULL) {
		goto fail; //primitive container
	}

	listEntry_t *category_hierarchiesListEntry;
    list_ForEach(category_hierarchiesListEntry, item->category_hierarchies) {
        if(cJSON_AddStringToObject(category_hierarchies, "", (char*)category_hierarchiesListEntry->data) == NULL)
        {
            goto fail;
        }
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

item_t *item_parseFromJSON(char *jsonString){

    item_t *item = NULL;
    cJSON *itemJSON = cJSON_Parse(jsonString);
    if(itemJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // item->upc
    cJSON *upc = cJSON_GetObjectItemCaseSensitive(itemJSON, "upc");
    if(!cJSON_IsString(upc) || (upc->valuestring == NULL)){
    goto end; //String
    }

    // item->ean
    cJSON *ean = cJSON_GetObjectItemCaseSensitive(itemJSON, "ean");
    if(!cJSON_IsString(ean) || (ean->valuestring == NULL)){
    goto end; //String
    }

    // item->isbn
    cJSON *isbn = cJSON_GetObjectItemCaseSensitive(itemJSON, "isbn");
    if(!cJSON_IsString(isbn) || (isbn->valuestring == NULL)){
    goto end; //String
    }

    // item->asin
    cJSON *asin = cJSON_GetObjectItemCaseSensitive(itemJSON, "asin");
    if(!cJSON_IsString(asin) || (asin->valuestring == NULL)){
    goto end; //String
    }

    // item->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(itemJSON, "title");
    if(!cJSON_IsString(title) || (title->valuestring == NULL)){
    goto end; //String
    }

    // item->sku
    cJSON *sku = cJSON_GetObjectItemCaseSensitive(itemJSON, "sku");
    if(!cJSON_IsString(sku) || (sku->valuestring == NULL)){
    goto end; //String
    }

    // item->mpn
    cJSON *mpn = cJSON_GetObjectItemCaseSensitive(itemJSON, "mpn");
    if(!cJSON_IsString(mpn) || (mpn->valuestring == NULL)){
    goto end; //String
    }

    // item->part_number
    cJSON *part_number = cJSON_GetObjectItemCaseSensitive(itemJSON, "part_number");
    if(!cJSON_IsString(part_number) || (part_number->valuestring == NULL)){
    goto end; //String
    }

    // item->upcs
    cJSON *upcs;
    cJSON *upcsJSON = cJSON_GetObjectItemCaseSensitive(itemJSON, "upcs");
    if(!cJSON_IsArray(upcsJSON)) {
        goto end;//primitive container
    }
    list_t *upcsList = list_create();

    cJSON_ArrayForEach(upcs, upcsJSON)
    {
        if(!cJSON_IsString(upcs))
        {
            goto end;
        }
        list_addElement(upcsList , strdup(upcs->valuestring));

    }

    // item->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(itemJSON, "description");
    if(!cJSON_IsString(description) || (description->valuestring == NULL)){
    goto end; //String
    }

    // item->brand
    cJSON *brand = cJSON_GetObjectItemCaseSensitive(itemJSON, "brand");
    if(!cJSON_IsString(brand) || (brand->valuestring == NULL)){
    goto end; //String
    }

    // item->manufacturer
    cJSON *manufacturer = cJSON_GetObjectItemCaseSensitive(itemJSON, "manufacturer");
    if(!cJSON_IsString(manufacturer) || (manufacturer->valuestring == NULL)){
    goto end; //String
    }

    // item->color
    cJSON *color = cJSON_GetObjectItemCaseSensitive(itemJSON, "color");
    if(!cJSON_IsString(color) || (color->valuestring == NULL)){
    goto end; //String
    }

    // item->new_price
    cJSON *new_price = cJSON_GetObjectItemCaseSensitive(itemJSON, "new_price");
    if(!cJSON_IsNumber(new_price))
    {
    goto end; //Numeric
    }

    // item->used_price
    cJSON *used_price = cJSON_GetObjectItemCaseSensitive(itemJSON, "used_price");
    if(!cJSON_IsNumber(used_price))
    {
    goto end; //Numeric
    }

    // item->currency_code
    cJSON *currency_code = cJSON_GetObjectItemCaseSensitive(itemJSON, "currency_code");
    if(!cJSON_IsString(currency_code) || (currency_code->valuestring == NULL)){
    goto end; //String
    }

    // item->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(itemJSON, "url");
    if(!cJSON_IsString(url) || (url->valuestring == NULL)){
    goto end; //String
    }

    // item->features
    cJSON *features;
    cJSON *featuresJSON = cJSON_GetObjectItemCaseSensitive(itemJSON, "features");
    if(!cJSON_IsArray(featuresJSON)) {
        goto end;//primitive container
    }
    list_t *featuresList = list_create();

    cJSON_ArrayForEach(features, featuresJSON)
    {
        if(!cJSON_IsString(features))
        {
            goto end;
        }
        list_addElement(featuresList , strdup(features->valuestring));

    }

    // item->dimensions
    cJSON *dimensions;
    cJSON *dimensionsJSON = cJSON_GetObjectItemCaseSensitive(itemJSON,"dimensions");
    if(!cJSON_IsArray(dimensionsJSON)){
        goto end; //nonprimitive container
    }

    list_t *dimensionsList = list_create();

    cJSON_ArrayForEach(dimensions,dimensionsJSON )
    {
        if(!cJSON_IsObject(dimensions)){
            goto end;
        }
		char *JSONData = cJSON_Print(dimensions);
        object_t *dimensionsItem = object_parseFromJSON(JSONData);

        list_addElement(dimensionsList, dimensionsItem);
        free(JSONData);
    }

    // item->images
    cJSON *images;
    cJSON *imagesJSON = cJSON_GetObjectItemCaseSensitive(itemJSON, "images");
    if(!cJSON_IsArray(imagesJSON)) {
        goto end;//primitive container
    }
    list_t *imagesList = list_create();

    cJSON_ArrayForEach(images, imagesJSON)
    {
        if(!cJSON_IsString(images))
        {
            goto end;
        }
        list_addElement(imagesList , strdup(images->valuestring));

    }

    // item->matched_items
    cJSON *matched_items;
    cJSON *matched_itemsJSON = cJSON_GetObjectItemCaseSensitive(itemJSON,"matched_items");
    if(!cJSON_IsArray(matched_itemsJSON)){
        goto end; //nonprimitive container
    }

    list_t *matched_itemsList = list_create();

    cJSON_ArrayForEach(matched_items,matched_itemsJSON )
    {
        if(!cJSON_IsObject(matched_items)){
            goto end;
        }
		char *JSONData = cJSON_Print(matched_items);
        object_t *matched_itemsItem = object_parseFromJSON(JSONData);

        list_addElement(matched_itemsList, matched_itemsItem);
        free(JSONData);
    }

    // item->iso_country_codes
    cJSON *iso_country_codes;
    cJSON *iso_country_codesJSON = cJSON_GetObjectItemCaseSensitive(itemJSON, "iso_country_codes");
    if(!cJSON_IsArray(iso_country_codesJSON)) {
        goto end;//primitive container
    }
    list_t *iso_country_codesList = list_create();

    cJSON_ArrayForEach(iso_country_codes, iso_country_codesJSON)
    {
        if(!cJSON_IsString(iso_country_codes))
        {
            goto end;
        }
        list_addElement(iso_country_codesList , strdup(iso_country_codes->valuestring));

    }

    // item->company_name
    cJSON *company_name = cJSON_GetObjectItemCaseSensitive(itemJSON, "company_name");
    if(!cJSON_IsString(company_name) || (company_name->valuestring == NULL)){
    goto end; //String
    }

    // item->company_address
    cJSON *company_address = cJSON_GetObjectItemCaseSensitive(itemJSON, "company_address");
    if(!cJSON_IsString(company_address) || (company_address->valuestring == NULL)){
    goto end; //String
    }

    // item->categories
    cJSON *categories;
    cJSON *categoriesJSON = cJSON_GetObjectItemCaseSensitive(itemJSON, "categories");
    if(!cJSON_IsArray(categoriesJSON)) {
        goto end;//primitive container
    }
    list_t *categoriesList = list_create();

    cJSON_ArrayForEach(categories, categoriesJSON)
    {
        if(!cJSON_IsString(categories))
        {
            goto end;
        }
        list_addElement(categoriesList , strdup(categories->valuestring));

    }

    // item->category_hierarchies
    cJSON *category_hierarchies;
    cJSON *category_hierarchiesJSON = cJSON_GetObjectItemCaseSensitive(itemJSON, "category_hierarchies");
    if(!cJSON_IsArray(category_hierarchiesJSON)) {
        goto end;//primitive container
    }
    list_t *category_hierarchiesList = list_create();

    cJSON_ArrayForEach(category_hierarchies, category_hierarchiesJSON)
    {
        if(!cJSON_IsString(category_hierarchies))
        {
            goto end;
        }
        list_addElement(category_hierarchiesList , strdup(category_hierarchies->valuestring));

    }


    item = item_create (
        strdup(upc->valuestring),
        strdup(ean->valuestring),
        strdup(isbn->valuestring),
        strdup(asin->valuestring),
        strdup(title->valuestring),
        strdup(sku->valuestring),
        strdup(mpn->valuestring),
        strdup(part_number->valuestring),
        upcsList,
        strdup(description->valuestring),
        strdup(brand->valuestring),
        strdup(manufacturer->valuestring),
        strdup(color->valuestring),
        new_price->valuedouble,
        used_price->valuedouble,
        strdup(currency_code->valuestring),
        strdup(url->valuestring),
        featuresList,
        dimensionsList,
        imagesList,
        matched_itemsList,
        iso_country_codesList,
        strdup(company_name->valuestring),
        strdup(company_address->valuestring),
        categoriesList,
        category_hierarchiesList
        );
 cJSON_Delete(itemJSON);
    return item;
end:
    cJSON_Delete(itemJSON);
    return NULL;

}

