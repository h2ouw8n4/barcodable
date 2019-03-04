/*
 * inline_response_200.h
 *
 * 
 */

#ifndef _inline_response_200_H_
#define _inline_response_200_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct inline_response_200_t {
        list_t *upcs; //primitive container
        list_t *eans; //primitive container
        list_t *asins; //primitive container
        char *message; //no enum string

} inline_response_200_t;

inline_response_200_t *inline_response_200_create(
        list_t *upcs,
        list_t *eans,
        list_t *asins,
        char *message
);

void inline_response_200_free(inline_response_200_t *inline_response_200);

inline_response_200_t *inline_response_200_parseFromJSON(char *jsonString);

cJSON *inline_response_200_convertToJSON(inline_response_200_t *inline_response_200);

#endif /* _inline_response_200_H_ */

