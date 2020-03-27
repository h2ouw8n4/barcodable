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
    item_t *item_local_var = malloc(sizeof(item_t));
    if (!item_local_var) {
        return NULL;
    }
    item_local_var->upc = upc;
    item_local_var->ean = ean;
    item_local_var->isbn = isbn;
    item_local_var->asin = asin;
    item_local_var->title = title;
    item_local_var->sku = sku;
    item_local_var->mpn = mpn;
    item_local_var->part_number = part_number;
    item_local_var->upcs = upcs;
    item_local_var->description = description;
    item_local_var->brand = brand;
    item_local_var->manufacturer = manufacturer;
    item_local_var->color = color;
    item_local_var->new_price = new_price;
    item_local_var->used_price = used_price;
    item_local_var->currency_code = currency_code;
    item_local_var->url = url;
    item_local_var->features = features;
    item_local_var->dimensions = dimensions;
    item_local_var->images = images;
    item_local_var->matched_items = matched_items;
    item_local_var->iso_country_codes = iso_country_codes;
    item_local_var->company_name = company_name;
    item_local_var->company_address = company_address;
    item_local_var->categories = categories;
    item_local_var->category_hierarchies = category_hierarchies;

    return item_local_var;
}


void item_free(item_t *item) {
    if(NULL == item){
        return ;
    }
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
    if(item->upc) { 
    if(cJSON_AddStringToObject(item, "upc", item->upc) == NULL) {
    goto fail; //String
    }
     } 


    // item->ean
    if(item->ean) { 
    if(cJSON_AddStringToObject(item, "ean", item->ean) == NULL) {
    goto fail; //String
    }
     } 


    // item->isbn
    if(item->isbn) { 
    if(cJSON_AddStringToObject(item, "isbn", item->isbn) == NULL) {
    goto fail; //String
    }
     } 


    // item->asin
    if(item->asin) { 
    if(cJSON_AddStringToObject(item, "asin", item->asin) == NULL) {
    goto fail; //String
    }
     } 


    // item->title
    if(item->title) { 
    if(cJSON_AddStringToObject(item, "title", item->title) == NULL) {
    goto fail; //String
    }
     } 


    // item->sku
    if(item->sku) { 
    if(cJSON_AddStringToObject(item, "sku", item->sku) == NULL) {
    goto fail; //String
    }
     } 


    // item->mpn
    if(item->mpn) { 
    if(cJSON_AddStringToObject(item, "mpn", item->mpn) == NULL) {
    goto fail; //String
    }
     } 


    // item->part_number
    if(item->part_number) { 
    if(cJSON_AddStringToObject(item, "part_number", item->part_number) == NULL) {
    goto fail; //String
    }
     } 


    // item->upcs
    if(item->upcs) { 
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
     } 


    // item->description
    if(item->description) { 
    if(cJSON_AddStringToObject(item, "description", item->description) == NULL) {
    goto fail; //String
    }
     } 


    // item->brand
    if(item->brand) { 
    if(cJSON_AddStringToObject(item, "brand", item->brand) == NULL) {
    goto fail; //String
    }
     } 


    // item->manufacturer
    if(item->manufacturer) { 
    if(cJSON_AddStringToObject(item, "manufacturer", item->manufacturer) == NULL) {
    goto fail; //String
    }
     } 


    // item->color
    if(item->color) { 
    if(cJSON_AddStringToObject(item, "color", item->color) == NULL) {
    goto fail; //String
    }
     } 


    // item->new_price
    if(item->new_price) { 
    if(cJSON_AddNumberToObject(item, "new_price", item->new_price) == NULL) {
    goto fail; //Numeric
    }
     } 


    // item->used_price
    if(item->used_price) { 
    if(cJSON_AddNumberToObject(item, "used_price", item->used_price) == NULL) {
    goto fail; //Numeric
    }
     } 


    // item->currency_code
    if(item->currency_code) { 
    if(cJSON_AddStringToObject(item, "currency_code", item->currency_code) == NULL) {
    goto fail; //String
    }
     } 


    // item->url
    if(item->url) { 
    if(cJSON_AddStringToObject(item, "url", item->url) == NULL) {
    goto fail; //String
    }
     } 


    // item->features
    if(item->features) { 
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
     } 


    // item->dimensions
    if(item->dimensions) { 
    cJSON *dimensions = cJSON_AddArrayToObject(item, "dimensions");
    if(dimensions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *dimensionsListEntry;
    if (item->dimensions) {
    list_ForEach(dimensionsListEntry, item->dimensions) {
    cJSON *itemLocal = object_convertToJSON(dimensionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(dimensions, itemLocal);
    }
    }
     } 


    // item->images
    if(item->images) { 
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
     } 


    // item->matched_items
    if(item->matched_items) { 
    cJSON *matched_items = cJSON_AddArrayToObject(item, "matched_items");
    if(matched_items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *matched_itemsListEntry;
    if (item->matched_items) {
    list_ForEach(matched_itemsListEntry, item->matched_items) {
    cJSON *itemLocal = object_convertToJSON(matched_itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(matched_items, itemLocal);
    }
    }
     } 


    // item->iso_country_codes
    if(item->iso_country_codes) { 
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
     } 


    // item->company_name
    if(item->company_name) { 
    if(cJSON_AddStringToObject(item, "company_name", item->company_name) == NULL) {
    goto fail; //String
    }
     } 


    // item->company_address
    if(item->company_address) { 
    if(cJSON_AddStringToObject(item, "company_address", item->company_address) == NULL) {
    goto fail; //String
    }
     } 


    // item->categories
    if(item->categories) { 
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
     } 


    // item->category_hierarchies
    if(item->category_hierarchies) { 
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
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

item_t *item_parseFromJSON(cJSON *itemJSON){

    item_t *item_local_var = NULL;

    // item->upc
    cJSON *upc = cJSON_GetObjectItemCaseSensitive(itemJSON, "upc");
    if (upc) { 
    if(!cJSON_IsString(upc))
    {
    goto end; //String
    }
    }

    // item->ean
    cJSON *ean = cJSON_GetObjectItemCaseSensitive(itemJSON, "ean");
    if (ean) { 
    if(!cJSON_IsString(ean))
    {
    goto end; //String
    }
    }

    // item->isbn
    cJSON *isbn = cJSON_GetObjectItemCaseSensitive(itemJSON, "isbn");
    if (isbn) { 
    if(!cJSON_IsString(isbn))
    {
    goto end; //String
    }
    }

    // item->asin
    cJSON *asin = cJSON_GetObjectItemCaseSensitive(itemJSON, "asin");
    if (asin) { 
    if(!cJSON_IsString(asin))
    {
    goto end; //String
    }
    }

    // item->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(itemJSON, "title");
    if (title) { 
    if(!cJSON_IsString(title))
    {
    goto end; //String
    }
    }

    // item->sku
    cJSON *sku = cJSON_GetObjectItemCaseSensitive(itemJSON, "sku");
    if (sku) { 
    if(!cJSON_IsString(sku))
    {
    goto end; //String
    }
    }

    // item->mpn
    cJSON *mpn = cJSON_GetObjectItemCaseSensitive(itemJSON, "mpn");
    if (mpn) { 
    if(!cJSON_IsString(mpn))
    {
    goto end; //String
    }
    }

    // item->part_number
    cJSON *part_number = cJSON_GetObjectItemCaseSensitive(itemJSON, "part_number");
    if (part_number) { 
    if(!cJSON_IsString(part_number))
    {
    goto end; //String
    }
    }

    // item->upcs
    cJSON *upcs = cJSON_GetObjectItemCaseSensitive(itemJSON, "upcs");
    list_t *upcsList;
    if (upcs) { 
    cJSON *upcs_local;
    if(!cJSON_IsArray(upcs)) {
        goto end;//primitive container
    }
    upcsList = list_create();

    cJSON_ArrayForEach(upcs_local, upcs)
    {
        if(!cJSON_IsString(upcs_local))
        {
            goto end;
        }
        list_addElement(upcsList , strdup(upcs_local->valuestring));
    }
    }

    // item->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(itemJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description))
    {
    goto end; //String
    }
    }

    // item->brand
    cJSON *brand = cJSON_GetObjectItemCaseSensitive(itemJSON, "brand");
    if (brand) { 
    if(!cJSON_IsString(brand))
    {
    goto end; //String
    }
    }

    // item->manufacturer
    cJSON *manufacturer = cJSON_GetObjectItemCaseSensitive(itemJSON, "manufacturer");
    if (manufacturer) { 
    if(!cJSON_IsString(manufacturer))
    {
    goto end; //String
    }
    }

    // item->color
    cJSON *color = cJSON_GetObjectItemCaseSensitive(itemJSON, "color");
    if (color) { 
    if(!cJSON_IsString(color))
    {
    goto end; //String
    }
    }

    // item->new_price
    cJSON *new_price = cJSON_GetObjectItemCaseSensitive(itemJSON, "new_price");
    if (new_price) { 
    if(!cJSON_IsNumber(new_price))
    {
    goto end; //Numeric
    }
    }

    // item->used_price
    cJSON *used_price = cJSON_GetObjectItemCaseSensitive(itemJSON, "used_price");
    if (used_price) { 
    if(!cJSON_IsNumber(used_price))
    {
    goto end; //Numeric
    }
    }

    // item->currency_code
    cJSON *currency_code = cJSON_GetObjectItemCaseSensitive(itemJSON, "currency_code");
    if (currency_code) { 
    if(!cJSON_IsString(currency_code))
    {
    goto end; //String
    }
    }

    // item->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(itemJSON, "url");
    if (url) { 
    if(!cJSON_IsString(url))
    {
    goto end; //String
    }
    }

    // item->features
    cJSON *features = cJSON_GetObjectItemCaseSensitive(itemJSON, "features");
    list_t *featuresList;
    if (features) { 
    cJSON *features_local;
    if(!cJSON_IsArray(features)) {
        goto end;//primitive container
    }
    featuresList = list_create();

    cJSON_ArrayForEach(features_local, features)
    {
        if(!cJSON_IsString(features_local))
        {
            goto end;
        }
        list_addElement(featuresList , strdup(features_local->valuestring));
    }
    }

    // item->dimensions
    cJSON *dimensions = cJSON_GetObjectItemCaseSensitive(itemJSON, "dimensions");
    list_t *dimensionsList;
    if (dimensions) { 
    cJSON *dimensions_local_nonprimitive;
    if(!cJSON_IsArray(dimensions)){
        goto end; //nonprimitive container
    }

    dimensionsList = list_create();

    cJSON_ArrayForEach(dimensions_local_nonprimitive,dimensions )
    {
        if(!cJSON_IsObject(dimensions_local_nonprimitive)){
            goto end;
        }
        object_t *dimensionsItem = object_parseFromJSON(dimensions_local_nonprimitive);

        list_addElement(dimensionsList, dimensionsItem);
    }
    }

    // item->images
    cJSON *images = cJSON_GetObjectItemCaseSensitive(itemJSON, "images");
    list_t *imagesList;
    if (images) { 
    cJSON *images_local;
    if(!cJSON_IsArray(images)) {
        goto end;//primitive container
    }
    imagesList = list_create();

    cJSON_ArrayForEach(images_local, images)
    {
        if(!cJSON_IsString(images_local))
        {
            goto end;
        }
        list_addElement(imagesList , strdup(images_local->valuestring));
    }
    }

    // item->matched_items
    cJSON *matched_items = cJSON_GetObjectItemCaseSensitive(itemJSON, "matched_items");
    list_t *matched_itemsList;
    if (matched_items) { 
    cJSON *matched_items_local_nonprimitive;
    if(!cJSON_IsArray(matched_items)){
        goto end; //nonprimitive container
    }

    matched_itemsList = list_create();

    cJSON_ArrayForEach(matched_items_local_nonprimitive,matched_items )
    {
        if(!cJSON_IsObject(matched_items_local_nonprimitive)){
            goto end;
        }
        object_t *matched_itemsItem = object_parseFromJSON(matched_items_local_nonprimitive);

        list_addElement(matched_itemsList, matched_itemsItem);
    }
    }

    // item->iso_country_codes
    cJSON *iso_country_codes = cJSON_GetObjectItemCaseSensitive(itemJSON, "iso_country_codes");
    list_t *iso_country_codesList;
    if (iso_country_codes) { 
    cJSON *iso_country_codes_local;
    if(!cJSON_IsArray(iso_country_codes)) {
        goto end;//primitive container
    }
    iso_country_codesList = list_create();

    cJSON_ArrayForEach(iso_country_codes_local, iso_country_codes)
    {
        if(!cJSON_IsString(iso_country_codes_local))
        {
            goto end;
        }
        list_addElement(iso_country_codesList , strdup(iso_country_codes_local->valuestring));
    }
    }

    // item->company_name
    cJSON *company_name = cJSON_GetObjectItemCaseSensitive(itemJSON, "company_name");
    if (company_name) { 
    if(!cJSON_IsString(company_name))
    {
    goto end; //String
    }
    }

    // item->company_address
    cJSON *company_address = cJSON_GetObjectItemCaseSensitive(itemJSON, "company_address");
    if (company_address) { 
    if(!cJSON_IsString(company_address))
    {
    goto end; //String
    }
    }

    // item->categories
    cJSON *categories = cJSON_GetObjectItemCaseSensitive(itemJSON, "categories");
    list_t *categoriesList;
    if (categories) { 
    cJSON *categories_local;
    if(!cJSON_IsArray(categories)) {
        goto end;//primitive container
    }
    categoriesList = list_create();

    cJSON_ArrayForEach(categories_local, categories)
    {
        if(!cJSON_IsString(categories_local))
        {
            goto end;
        }
        list_addElement(categoriesList , strdup(categories_local->valuestring));
    }
    }

    // item->category_hierarchies
    cJSON *category_hierarchies = cJSON_GetObjectItemCaseSensitive(itemJSON, "category_hierarchies");
    list_t *category_hierarchiesList;
    if (category_hierarchies) { 
    cJSON *category_hierarchies_local;
    if(!cJSON_IsArray(category_hierarchies)) {
        goto end;//primitive container
    }
    category_hierarchiesList = list_create();

    cJSON_ArrayForEach(category_hierarchies_local, category_hierarchies)
    {
        if(!cJSON_IsString(category_hierarchies_local))
        {
            goto end;
        }
        list_addElement(category_hierarchiesList , strdup(category_hierarchies_local->valuestring));
    }
    }


    item_local_var = item_create (
        upc ? strdup(upc->valuestring) : NULL,
        ean ? strdup(ean->valuestring) : NULL,
        isbn ? strdup(isbn->valuestring) : NULL,
        asin ? strdup(asin->valuestring) : NULL,
        title ? strdup(title->valuestring) : NULL,
        sku ? strdup(sku->valuestring) : NULL,
        mpn ? strdup(mpn->valuestring) : NULL,
        part_number ? strdup(part_number->valuestring) : NULL,
        upcs ? upcsList : NULL,
        description ? strdup(description->valuestring) : NULL,
        brand ? strdup(brand->valuestring) : NULL,
        manufacturer ? strdup(manufacturer->valuestring) : NULL,
        color ? strdup(color->valuestring) : NULL,
        new_price ? new_price->valuedouble : 0,
        used_price ? used_price->valuedouble : 0,
        currency_code ? strdup(currency_code->valuestring) : NULL,
        url ? strdup(url->valuestring) : NULL,
        features ? featuresList : NULL,
        dimensions ? dimensionsList : NULL,
        images ? imagesList : NULL,
        matched_items ? matched_itemsList : NULL,
        iso_country_codes ? iso_country_codesList : NULL,
        company_name ? strdup(company_name->valuestring) : NULL,
        company_address ? strdup(company_address->valuestring) : NULL,
        categories ? categoriesList : NULL,
        category_hierarchies ? category_hierarchiesList : NULL
        );

    return item_local_var;
end:
    return NULL;

}
