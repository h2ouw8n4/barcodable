/*
 * inline_response_400.h
 *
 * 
 */

#ifndef _inline_response_400_H_
#define _inline_response_400_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct inline_response_400_t {
        char *message; //no enum string
        int status; //numeric

} inline_response_400_t;

inline_response_400_t *inline_response_400_create(
        char *message,
        int status
);

void inline_response_400_free(inline_response_400_t *inline_response_400);

inline_response_400_t *inline_response_400_parseFromJSON(char *jsonString);

cJSON *inline_response_400_convertToJSON(inline_response_400_t *inline_response_400);

#endif /* _inline_response_400_H_ */

