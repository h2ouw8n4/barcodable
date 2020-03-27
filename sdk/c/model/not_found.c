#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "not_found.h"



not_found_t *not_found_create(
    char *message,
    int status
    ) {
    not_found_t *not_found_local_var = malloc(sizeof(not_found_t));
    if (!not_found_local_var) {
        return NULL;
    }
    not_found_local_var->message = message;
    not_found_local_var->status = status;

    return not_found_local_var;
}


void not_found_free(not_found_t *not_found) {
    if(NULL == not_found){
        return ;
    }
    listEntry_t *listEntry;
    free(not_found->message);
    free(not_found);
}

cJSON *not_found_convertToJSON(not_found_t *not_found) {
    cJSON *item = cJSON_CreateObject();

    // not_found->message
    if(not_found->message) { 
    if(cJSON_AddStringToObject(item, "message", not_found->message) == NULL) {
    goto fail; //String
    }
     } 


    // not_found->status
    if(not_found->status) { 
    if(cJSON_AddNumberToObject(item, "status", not_found->status) == NULL) {
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

not_found_t *not_found_parseFromJSON(cJSON *not_foundJSON){

    not_found_t *not_found_local_var = NULL;

    // not_found->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(not_foundJSON, "message");
    if (message) { 
    if(!cJSON_IsString(message))
    {
    goto end; //String
    }
    }

    // not_found->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(not_foundJSON, "status");
    if (status) { 
    if(!cJSON_IsNumber(status))
    {
    goto end; //Numeric
    }
    }


    not_found_local_var = not_found_create (
        message ? strdup(message->valuestring) : NULL,
        status ? status->valuedouble : 0
        );

    return not_found_local_var;
end:
    return NULL;

}
