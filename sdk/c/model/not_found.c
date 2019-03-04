#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "not_found.h"



not_found_t *not_found_create(
    char *message,
    int status
    ) {
	not_found_t *not_found = malloc(sizeof(not_found_t));
	not_found->message = message;
	not_found->status = status;

	return not_found;
}


void not_found_free(not_found_t *not_found) {
    listEntry_t *listEntry;
    free(not_found->message);

	free(not_found);
}

cJSON *not_found_convertToJSON(not_found_t *not_found) {
	cJSON *item = cJSON_CreateObject();
	// not_found->message
    if(cJSON_AddStringToObject(item, "message", not_found->message) == NULL) {
    goto fail; //String
    }

	// not_found->status
    if(cJSON_AddNumberToObject(item, "status", not_found->status) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

not_found_t *not_found_parseFromJSON(char *jsonString){

    not_found_t *not_found = NULL;
    cJSON *not_foundJSON = cJSON_Parse(jsonString);
    if(not_foundJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // not_found->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(not_foundJSON, "message");
    if(!cJSON_IsString(message) || (message->valuestring == NULL)){
    goto end; //String
    }

    // not_found->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(not_foundJSON, "status");
    if(!cJSON_IsNumber(status))
    {
    goto end; //Numeric
    }


    not_found = not_found_create (
        strdup(message->valuestring),
        status->valuedouble
        );
 cJSON_Delete(not_foundJSON);
    return not_found;
end:
    cJSON_Delete(not_foundJSON);
    return NULL;

}

