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
        char *upc; //no enum string
        char *ean; //no enum string
        char *isbn; //no enum string
        char *asin; //no enum string
        char *title; //no enum string
        char *sku; //no enum string
        char *mpn; //no enum string
        char *part_number; //no enum string
        list_t *upcs; //primitive container
        char *description; //no enum string
        char *brand; //no enum string
        char *manufacturer; //no enum string
        char *color; //no enum string
        double new_price; //numeric
        double used_price; //numeric
        char *currency_code; //no enum string
        char *url; //no enum string
        list_t *features; //primitive container
        list_t *dimensions; //nonprimitive container
        list_t *images; //primitive container
        list_t *matched_items; //nonprimitive container
        list_t *iso_country_codes; //primitive container
        char *company_name; //no enum string
        char *company_address; //no enum string
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

item_t *item_parseFromJSON(char *jsonString);

cJSON *item_convertToJSON(item_t *item);

#endif /* _item_H_ */

