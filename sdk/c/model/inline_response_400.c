#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_400.h"



inline_response_400_t *inline_response_400_create(
    char *message,
    int status
    ) {
    inline_response_400_t *inline_response_400_local_var = malloc(sizeof(inline_response_400_t));
    if (!inline_response_400_local_var) {
        return NULL;
    }
    inline_response_400_local_var->message = message;
    inline_response_400_local_var->status = status;

    return inline_response_400_local_var;
}


void inline_response_400_free(inline_response_400_t *inline_response_400) {
    if(NULL == inline_response_400){
        return ;
    }
    listEntry_t *listEntry;
    free(inline_response_400->message);
    free(inline_response_400);
}

cJSON *inline_response_400_convertToJSON(inline_response_400_t *inline_response_400) {
    cJSON *item = cJSON_CreateObject();

    // inline_response_400->message
    if(inline_response_400->message) { 
    if(cJSON_AddStringToObject(item, "message", inline_response_400->message) == NULL) {
    goto fail; //String
    }
     } 


    // inline_response_400->status
    if(inline_response_400->status) { 
    if(cJSON_AddNumberToObject(item, "status", inline_response_400->status) == NULL) {
    goto fail; //Numeric
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

inline_response_400_t *inline_response_400_parseFromJSON(cJSON *inline_response_400JSON){

    inline_response_400_t *inline_response_400_local_var = NULL;

    // inline_response_400->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(inline_response_400JSON, "message");
    if (message) { 
    if(!cJSON_IsString(message))
    {
    goto end; //String
    }
    }

    // inline_response_400->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(inline_response_400JSON, "status");
    if (status) { 
    if(!cJSON_IsNumber(status))
    {
    goto end; //Numeric
    }
    }


    inline_response_400_local_var = inline_response_400_create (
        message ? strdup(message->valuestring) : NULL,
        status ? status->valuedouble : 0
        );

    return inline_response_400_local_var;
end:
    return NULL;

}
