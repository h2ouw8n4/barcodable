/*
 * not_found.h
 *
 * 
 */

#ifndef _not_found_H_
#define _not_found_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct not_found_t {
        char *message; //no enum string
        int status; //numeric

} not_found_t;

not_found_t *not_found_create(
        char *message,
        int status
);

void not_found_free(not_found_t *not_found);

not_found_t *not_found_parseFromJSON(char *jsonString);

cJSON *not_found_convertToJSON(not_found_t *not_found);

#endif /* _not_found_H_ */

