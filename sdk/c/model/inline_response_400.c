#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_400.h"



inline_response_400_t *inline_response_400_create(
    char *message,
    int status
    ) {
	inline_response_400_t *inline_response_400 = malloc(sizeof(inline_response_400_t));
	inline_response_400->message = message;
	inline_response_400->status = status;

	return inline_response_400;
}


void inline_response_400_free(inline_response_400_t *inline_response_400) {
    listEntry_t *listEntry;
    free(inline_response_400->message);

	free(inline_response_400);
}

cJSON *inline_response_400_convertToJSON(inline_response_400_t *inline_response_400) {
	cJSON *item = cJSON_CreateObject();
	// inline_response_400->message
    if(cJSON_AddStringToObject(item, "message", inline_response_400->message) == NULL) {
    goto fail; //String
    }

	// inline_response_400->status
    if(cJSON_AddNumberToObject(item, "status", inline_response_400->status) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_response_400_t *inline_response_400_parseFromJSON(char *jsonString){

    inline_response_400_t *inline_response_400 = NULL;
    cJSON *inline_response_400JSON = cJSON_Parse(jsonString);
    if(inline_response_400JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_response_400->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(inline_response_400JSON, "message");
    if(!cJSON_IsString(message) || (message->valuestring == NULL)){
    goto end; //String
    }

    // inline_response_400->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(inline_response_400JSON, "status");
    if(!cJSON_IsNumber(status))
    {
    goto end; //Numeric
    }


    inline_response_400 = inline_response_400_create (
        strdup(message->valuestring),
        status->valuedouble
        );
 cJSON_Delete(inline_response_400JSON);
    return inline_response_400;
end:
    cJSON_Delete(inline_response_400JSON);
    return NULL;

}

