#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "invalid_code.h"



invalid_code_t *invalid_code_create(
    char *message,
    int status
    ) {
    invalid_code_t *invalid_code_local_var = malloc(sizeof(invalid_code_t));
    if (!invalid_code_local_var) {
        return NULL;
    }
    invalid_code_local_var->message = message;
    invalid_code_local_var->status = status;

    return invalid_code_local_var;
}


void invalid_code_free(invalid_code_t *invalid_code) {
    if(NULL == invalid_code){
        return ;
    }
    listEntry_t *listEntry;
    free(invalid_code->message);
    free(invalid_code);
}

cJSON *invalid_code_convertToJSON(invalid_code_t *invalid_code) {
    cJSON *item = cJSON_CreateObject();

    // invalid_code->message
    if(invalid_code->message) { 
    if(cJSON_AddStringToObject(item, "message", invalid_code->message) == NULL) {
    goto fail; //String
    }
     } 


    // invalid_code->status
    if(invalid_code->status) { 
    if(cJSON_AddNumberToObject(item, "status", invalid_code->status) == NULL) {
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

invalid_code_t *invalid_code_parseFromJSON(cJSON *invalid_codeJSON){

    invalid_code_t *invalid_code_local_var = NULL;

    // invalid_code->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(invalid_codeJSON, "message");
    if (message) { 
    if(!cJSON_IsString(message))
    {
    goto end; //String
    }
    }

    // invalid_code->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(invalid_codeJSON, "status");
    if (status) { 
    if(!cJSON_IsNumber(status))
    {
    goto end; //Numeric
    }
    }


    invalid_code_local_var = invalid_code_create (
        message ? strdup(message->valuestring) : NULL,
        status ? status->valuedouble : 0
        );

    return invalid_code_local_var;
end:
    return NULL;

}
