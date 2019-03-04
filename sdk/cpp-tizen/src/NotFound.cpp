#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Not_found.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Not_found::Not_found()
{
	//__init();
}

Not_found::~Not_found()
{
	//__cleanup();
}

void
Not_found::__init()
{
	//message = std::string();
	//status = int(0);
}

void
Not_found::__cleanup()
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
Not_found::fromJson(char* jsonStr)
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

Not_found::Not_found(char* json)
{
	this->fromJson(json);
}

char*
Not_found::toJson()
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
Not_found::getMessage()
{
	return message;
}

void
Not_found::setMessage(std::string  message)
{
	this->message = message;
}

int
Not_found::getStatus()
{
	return status;
}

void
Not_found::setStatus(int  status)
{
	this->status = status;
}


