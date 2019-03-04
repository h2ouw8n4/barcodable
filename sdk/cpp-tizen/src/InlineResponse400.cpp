#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Inline_response_400.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Inline_response_400::Inline_response_400()
{
	//__init();
}

Inline_response_400::~Inline_response_400()
{
	//__cleanup();
}

void
Inline_response_400::__init()
{
	//message = std::string();
	//status = int(0);
}

void
Inline_response_400::__cleanup()
{
	//if(message != NULL) {
	//
	//delete message;
	//message = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
Inline_response_400::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *messageKey = "message";
	node = json_object_get_member(pJsonObject, messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&message, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&status, node, "int", "");
		} else {
			
		}
	}
}

Inline_response_400::Inline_response_400(char* json)
{
	this->fromJson(json);
}

char*
Inline_response_400::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *messageKey = "message";
	json_object_set_member(pJsonObject, messageKey, node);
	if (isprimitive("int")) {
		int obj = getStatus();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Inline_response_400::getMessage()
{
	return message;
}

void
Inline_response_400::setMessage(std::string  message)
{
	this->message = message;
}

int
Inline_response_400::getStatus()
{
	return status;
}

void
Inline_response_400::setStatus(int  status)
{
	this->status = status;
}


