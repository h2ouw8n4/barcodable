#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "invalid_code.h"



invalid_code_t *invalid_code_create(
    char *message,
    int status
    ) {
	invalid_code_t *invalid_code = malloc(sizeof(invalid_code_t));
	invalid_code->message = message;
	invalid_code->status = status;

	return invalid_code;
}


void invalid_code_free(invalid_code_t *invalid_code) {
    listEntry_t *listEntry;
    free(invalid_code->message);

	free(invalid_code);
}

cJSON *invalid_code_convertToJSON(invalid_code_t *invalid_code) {
	cJSON *item = cJSON_CreateObject();
	// invalid_code->message
    if(cJSON_AddStringToObject(item, "message", invalid_code->message) == NULL) {
    goto fail; //String
    }

	// invalid_code->status
    if(cJSON_AddNumberToObject(item, "status", invalid_code->status) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

invalid_code_t *invalid_code_parseFromJSON(char *jsonString){

    invalid_code_t *invalid_code = NULL;
    cJSON *invalid_codeJSON = cJSON_Parse(jsonString);
    if(invalid_codeJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // invalid_code->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(invalid_codeJSON, "message");
    if(!cJSON_IsString(message) || (message->valuestring == NULL)){
    goto end; //String
    }

    // invalid_code->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(invalid_codeJSON, "status");
    if(!cJSON_IsNumber(status))
    {
    goto end; //Numeric
    }


    invalid_code = invalid_code_create (
        strdup(message->valuestring),
        status->valuedouble
        );
 cJSON_Delete(invalid_codeJSON);
    return invalid_code;
end:
    cJSON_Delete(invalid_codeJSON);
    return NULL;

}

