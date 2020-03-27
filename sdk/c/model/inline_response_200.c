#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200.h"



inline_response_200_t *inline_response_200_create(
    list_t *upcs,
    list_t *eans,
    list_t *asins,
    char *message
    ) {
    inline_response_200_t *inline_response_200_local_var = malloc(sizeof(inline_response_200_t));
    if (!inline_response_200_local_var) {
        return NULL;
    }
    inline_response_200_local_var->upcs = upcs;
    inline_response_200_local_var->eans = eans;
    inline_response_200_local_var->asins = asins;
    inline_response_200_local_var->message = message;

    return inline_response_200_local_var;
}


void inline_response_200_free(inline_response_200_t *inline_response_200) {
    if(NULL == inline_response_200){
        return ;
    }
    listEntry_t *listEntry;
    list_ForEach(listEntry, inline_response_200->upcs) {
        free(listEntry->data);
    }
    list_free(inline_response_200->upcs);
    list_ForEach(listEntry, inline_response_200->eans) {
        free(listEntry->data);
    }
    list_free(inline_response_200->eans);
    list_ForEach(listEntry, inline_response_200->asins) {
        free(listEntry->data);
    }
    list_free(inline_response_200->asins);
    free(inline_response_200->message);
    free(inline_response_200);
}

cJSON *inline_response_200_convertToJSON(inline_response_200_t *inline_response_200) {
    cJSON *item = cJSON_CreateObject();

    // inline_response_200->upcs
    if(inline_response_200->upcs) { 
    cJSON *upcs = cJSON_AddArrayToObject(item, "upcs");
    if(upcs == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *upcsListEntry;
    list_ForEach(upcsListEntry, inline_response_200->upcs) {
    if(cJSON_AddStringToObject(upcs, "", (char*)upcsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
     } 


    // inline_response_200->eans
    if(inline_response_200->eans) { 
    cJSON *eans = cJSON_AddArrayToObject(item, "eans");
    if(eans == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *eansListEntry;
    list_ForEach(eansListEntry, inline_response_200->eans) {
    if(cJSON_AddStringToObject(eans, "", (char*)eansListEntry->data) == NULL)
    {
        goto fail;
    }
    }
     } 


    // inline_response_200->asins
    if(inline_response_200->asins) { 
    cJSON *asins = cJSON_AddArrayToObject(item, "asins");
    if(asins == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *asinsListEntry;
    list_ForEach(asinsListEntry, inline_response_200->asins) {
    if(cJSON_AddStringToObject(asins, "", (char*)asinsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
     } 


    // inline_response_200->message
    if(inline_response_200->message) { 
    if(cJSON_AddStringToObject(item, "message", inline_response_200->message) == NULL) {
    goto fail; //String
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

inline_response_200_t *inline_response_200_parseFromJSON(cJSON *inline_response_200JSON){

    inline_response_200_t *inline_response_200_local_var = NULL;

    // inline_response_200->upcs
    cJSON *upcs = cJSON_GetObjectItemCaseSensitive(inline_response_200JSON, "upcs");
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

    // inline_response_200->eans
    cJSON *eans = cJSON_GetObjectItemCaseSensitive(inline_response_200JSON, "eans");
    list_t *eansList;
    if (eans) { 
    cJSON *eans_local;
    if(!cJSON_IsArray(eans)) {
        goto end;//primitive container
    }
    eansList = list_create();

    cJSON_ArrayForEach(eans_local, eans)
    {
        if(!cJSON_IsString(eans_local))
        {
            goto end;
        }
        list_addElement(eansList , strdup(eans_local->valuestring));
    }
    }

    // inline_response_200->asins
    cJSON *asins = cJSON_GetObjectItemCaseSensitive(inline_response_200JSON, "asins");
    list_t *asinsList;
    if (asins) { 
    cJSON *asins_local;
    if(!cJSON_IsArray(asins)) {
        goto end;//primitive container
    }
    asinsList = list_create();

    cJSON_ArrayForEach(asins_local, asins)
    {
        if(!cJSON_IsString(asins_local))
        {
            goto end;
        }
        list_addElement(asinsList , strdup(asins_local->valuestring));
    }
    }

    // inline_response_200->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(inline_response_200JSON, "message");
    if (message) { 
    if(!cJSON_IsString(message))
    {
    goto end; //String
    }
    }


    inline_response_200_local_var = inline_response_200_create (
        upcs ? upcsList : NULL,
        eans ? eansList : NULL,
        asins ? asinsList : NULL,
        message ? strdup(message->valuestring) : NULL
        );

    return inline_response_200_local_var;
end:
    return NULL;

}
