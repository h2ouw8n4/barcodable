/*
 * item.h
 *
 * 
 */

#ifndef _item_H_
#define _item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "object.h"



typedef struct item_t {
    char *upc; // string
    char *ean; // string
    char *isbn; // string
    char *asin; // string
    char *title; // string
    char *sku; // string
    char *mpn; // string
    char *part_number; // string
    list_t *upcs; //primitive container
    char *description; // string
    char *brand; // string
    char *manufacturer; // string
    char *color; // string
    double new_price; //numeric
    double used_price; //numeric
    char *currency_code; // string
    char *url; // string
    list_t *features; //primitive container
    list_t *dimensions; //nonprimitive container
    list_t *images; //primitive container
    list_t *matched_items; //nonprimitive container
    list_t *iso_country_codes; //primitive container
    char *company_name; // string
    char *company_address; // string
    list_t *categories; //primitive container
    list_t *category_hierarchies; //primitive container

} item_t;

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
);

void item_free(item_t *item);

item_t *item_parseFromJSON(cJSON *itemJSON);

cJSON *item_convertToJSON(item_t *item);

#endif /* _item_H_ */

