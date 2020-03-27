#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../model/inline_response_200.h"
#include "../model/inline_response_400.h"


// Convert between UPC, EAN, and ASIN product codes.
//
// Returns the converted UPC, EAN, and ASIN codes.
//
inline_response_200_t*
ProductConversionAPI_convertCode(apiClient_t *apiClient, char * upc | ean | asin );


