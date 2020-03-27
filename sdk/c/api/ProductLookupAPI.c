#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "ProductLookupAPI.h"


#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


// Find item by asin code
//
// Returns a single item
//
item_t*
ProductLookupAPI_getItemByASIN(apiClient_t *apiClient, char * asin )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/api/v1/asin/{asin}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/api/v1/asin/{asin}");


    // Path Params
    long sizeOfPathParams_asin = strlen(asin)+3 + strlen("{ asin }");
    if(asin == NULL) {
        goto end;
    }
    char* localVarToReplace_asin = malloc(sizeOfPathParams_asin);
    sprintf(localVarToReplace_asin, "{%s}", "asin");

    localVarPath = strReplace(localVarPath, localVarToReplace_asin, asin);


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
    if (apiClient->response_code == 404) {
        printf("%s\n","search results matching criteria");
    }
    //nonprimitive not container
    cJSON *ProductLookupAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    item_t *elementToReturn = item_parseFromJSON(ProductLookupAPIlocalVarJSON);
    cJSON_Delete(ProductLookupAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_asin);
    return elementToReturn;
end:
    return NULL;

}

// Find item by UPC code
//
// Returns a single item
//
item_t*
ProductLookupAPI_getItemByEAN(apiClient_t *apiClient, char * ean )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/api/v1/ean/{ean}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/api/v1/ean/{ean}");


    // Path Params
    long sizeOfPathParams_ean = strlen(ean)+3 + strlen("{ ean }");
    if(ean == NULL) {
        goto end;
    }
    char* localVarToReplace_ean = malloc(sizeOfPathParams_ean);
    sprintf(localVarToReplace_ean, "{%s}", "ean");

    localVarPath = strReplace(localVarPath, localVarToReplace_ean, ean);


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
    if (apiClient->response_code == 404) {
        printf("%s\n","search results matching criteria");
    }
    //nonprimitive not container
    cJSON *ProductLookupAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    item_t *elementToReturn = item_parseFromJSON(ProductLookupAPIlocalVarJSON);
    cJSON_Delete(ProductLookupAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_ean);
    return elementToReturn;
end:
    return NULL;

}

// Find item by UPC code
//
// Returns a single item
//
item_t*
ProductLookupAPI_getItemByUPC(apiClient_t *apiClient, char * upc )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/api/v1/upc/{upc}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/api/v1/upc/{upc}");


    // Path Params
    long sizeOfPathParams_upc = strlen(upc)+3 + strlen("{ upc }");
    if(upc == NULL) {
        goto end;
    }
    char* localVarToReplace_upc = malloc(sizeOfPathParams_upc);
    sprintf(localVarToReplace_upc, "{%s}", "upc");

    localVarPath = strReplace(localVarPath, localVarToReplace_upc, upc);


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
    if (apiClient->response_code == 404) {
        printf("%s\n","search results matching criteria");
    }
    //nonprimitive not container
    cJSON *ProductLookupAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    item_t *elementToReturn = item_parseFromJSON(ProductLookupAPIlocalVarJSON);
    cJSON_Delete(ProductLookupAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_upc);
    return elementToReturn;
end:
    return NULL;

}

