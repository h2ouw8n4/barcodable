#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Invalid_code.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Invalid_code::Invalid_code()
{
	//__init();
}

Invalid_code::~Invalid_code()
{
	//__cleanup();
}

void
Invalid_code::__init()
{
	//message = std::string();
	//status = int(0);
}

void
Invalid_code::__cleanup()
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
Invalid_code::fromJson(char* jsonStr)
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

Invalid_code::Invalid_code(char* json)
{
	this->fromJson(json);
}

char*
Invalid_code::toJson()
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
Invalid_code::getMessage()
{
	return message;
}

void
Invalid_code::setMessage(std::string  message)
{
	this->message = message;
}

int
Invalid_code::getStatus()
{
	return status;
}

void
Invalid_code::setStatus(int  status)
{
	this->status = status;
}


