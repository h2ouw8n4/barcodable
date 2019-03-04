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
	inline_response_200_t *inline_response_200 = malloc(sizeof(inline_response_200_t));
	inline_response_200->upcs = upcs;
	inline_response_200->eans = eans;
	inline_response_200->asins = asins;
	inline_response_200->message = message;

	return inline_response_200;
}


void inline_response_200_free(inline_response_200_t *inline_response_200) {
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

	// inline_response_200->eans
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

	// inline_response_200->asins
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

	// inline_response_200->message
    if(cJSON_AddStringToObject(item, "message", inline_response_200->message) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_response_200_t *inline_response_200_parseFromJSON(char *jsonString){

    inline_response_200_t *inline_response_200 = NULL;
    cJSON *inline_response_200JSON = cJSON_Parse(jsonString);
    if(inline_response_200JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_response_200->upcs
    cJSON *upcs;
    cJSON *upcsJSON = cJSON_GetObjectItemCaseSensitive(inline_response_200JSON, "upcs");
    if(!cJSON_IsArray(upcsJSON)) {
        goto end;//primitive container
    }
    list_t *upcsList = list_create();

    cJSON_ArrayForEach(upcs, upcsJSON)
    {
        if(!cJSON_IsString(upcs))
        {
            goto end;
        }
        list_addElement(upcsList , strdup(upcs->valuestring));

    }

    // inline_response_200->eans
    cJSON *eans;
    cJSON *eansJSON = cJSON_GetObjectItemCaseSensitive(inline_response_200JSON, "eans");
    if(!cJSON_IsArray(eansJSON)) {
        goto end;//primitive container
    }
    list_t *eansList = list_create();

    cJSON_ArrayForEach(eans, eansJSON)
    {
        if(!cJSON_IsString(eans))
        {
            goto end;
        }
        list_addElement(eansList , strdup(eans->valuestring));

    }

    // inline_response_200->asins
    cJSON *asins;
    cJSON *asinsJSON = cJSON_GetObjectItemCaseSensitive(inline_response_200JSON, "asins");
    if(!cJSON_IsArray(asinsJSON)) {
        goto end;//primitive container
    }
    list_t *asinsList = list_create();

    cJSON_ArrayForEach(asins, asinsJSON)
    {
        if(!cJSON_IsString(asins))
        {
            goto end;
        }
        list_addElement(asinsList , strdup(asins->valuestring));

    }

    // inline_response_200->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(inline_response_200JSON, "message");
    if(!cJSON_IsString(message) || (message->valuestring == NULL)){
    goto end; //String
    }


    inline_response_200 = inline_response_200_create (
        upcsList,
        eansList,
        asinsList,
        strdup(message->valuestring)
        );
 cJSON_Delete(inline_response_200JSON);
    return inline_response_200;
end:
    cJSON_Delete(inline_response_200JSON);
    return NULL;

}

