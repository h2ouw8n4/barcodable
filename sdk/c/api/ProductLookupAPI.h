#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../model/invalid_code.h"
#include "../model/item.h"
#include "../model/not_found.h"


// Find item by asin code
//
// Returns a single item
//
item_t*
ProductLookupAPI_getItemByASIN(apiClient_t *apiClient, char * asin );


// Find item by UPC code
//
// Returns a single item
//
item_t*
ProductLookupAPI_getItemByEAN(apiClient_t *apiClient, char * ean );


// Find item by UPC code
//
// Returns a single item
//
item_t*
ProductLookupAPI_getItemByUPC(apiClient_t *apiClient, char * upc );


