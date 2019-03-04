/*
 * invalid_code.h
 *
 * 
 */

#ifndef _invalid_code_H_
#define _invalid_code_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct invalid_code_t {
        char *message; //no enum string
        int status; //numeric

} invalid_code_t;

invalid_code_t *invalid_code_create(
        char *message,
        int status
);

void invalid_code_free(invalid_code_t *invalid_code);

invalid_code_t *invalid_code_parseFromJSON(char *jsonString);

cJSON *invalid_code_convertToJSON(invalid_code_t *invalid_code);

#endif /* _invalid_code_H_ */

