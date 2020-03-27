#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "ProductConversionAPI.h"


#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


// Convert between UPC, EAN, and ASIN product codes.
//
// Returns the converted UPC, EAN, and ASIN codes.
//
inline_response_200_t*
ProductConversionAPI_convertCode(apiClient_t *apiClient, char * upc | ean | asin )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/api/v1/convert/{upc | ean | asin}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/api/v1/convert/{upc | ean | asin}");


    // Path Params
    long sizeOfPathParams_upc | ean | asin = strlen(upc | ean | asin)+3 + strlen("{ upc | ean | asin }");
    if(upc | ean | asin == NULL) {
        goto end;
    }
    char* localVarToReplace_upc | ean | asin = malloc(sizeOfPathParams_upc | ean | asin);
    sprintf(localVarToReplace_upc | ean | asin, "{%s}", "upc | ean | asin");

    localVarPath = strReplace(localVarPath, localVarToReplace_upc | ean | asin, upc | ean | asin);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    if (apiClient->response_code == 200) {
        printf("%s\n","successful operation");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","search results matching criteria");
    }
    //nonprimitive not container
    cJSON *ProductConversionAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    inline_response_200_t *elementToReturn = inline_response_200_parseFromJSON(ProductConversionAPIlocalVarJSON);
    cJSON_Delete(ProductConversionAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_upc | ean | asin);
    return elementToReturn;
end:
    return NULL;

}

