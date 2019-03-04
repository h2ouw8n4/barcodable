#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Inline_response_200.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Inline_response_200::Inline_response_200()
{
	//__init();
}

Inline_response_200::~Inline_response_200()
{
	//__cleanup();
}

void
Inline_response_200::__init()
{
	//new std::list()std::list> upcs;
	//new std::list()std::list> eans;
	//new std::list()std::list> asins;
	//message = std::string();
}

void
Inline_response_200::__cleanup()
{
	//if(upcs != NULL) {
	//upcs.RemoveAll(true);
	//delete upcs;
	//upcs = NULL;
	//}
	//if(eans != NULL) {
	//eans.RemoveAll(true);
	//delete eans;
	//eans = NULL;
	//}
	//if(asins != NULL) {
	//asins.RemoveAll(true);
	//delete asins;
	//asins = NULL;
	//}
	//if(message != NULL) {
	//
	//delete message;
	//message = NULL;
	//}
	//
}

void
Inline_response_200::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *upcsKey = "upcs";
	node = json_object_get_member(pJsonObject, upcsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			upcs = new_list;
		}
		
	}
	const gchar *eansKey = "eans";
	node = json_object_get_member(pJsonObject, eansKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			eans = new_list;
		}
		
	}
	const gchar *asinsKey = "asins";
	node = json_object_get_member(pJsonObject, asinsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			asins = new_list;
		}
		
	}
	const gchar *messageKey = "message";
	node = json_object_get_member(pJsonObject, messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&message, node, "std::string", "");
		} else {
			
		}
	}
}

Inline_response_200::Inline_response_200(char* json)
{
	this->fromJson(json);
}

char*
Inline_response_200::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getUpcs());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getUpcs());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *upcsKey = "upcs";
	json_object_set_member(pJsonObject, upcsKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getEans());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getEans());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *eansKey = "eans";
	json_object_set_member(pJsonObject, eansKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAsins());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAsins());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *asinsKey = "asins";
	json_object_set_member(pJsonObject, asinsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *messageKey = "message";
	json_object_set_member(pJsonObject, messageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
Inline_response_200::getUpcs()
{
	return upcs;
}

void
Inline_response_200::setUpcs(std::list <std::string> upcs)
{
	this->upcs = upcs;
}

std::list<std::string>
Inline_response_200::getEans()
{
	return eans;
}

void
Inline_response_200::setEans(std::list <std::string> eans)
{
	this->eans = eans;
}

std::list<std::string>
Inline_response_200::getAsins()
{
	return asins;
}

void
Inline_response_200::setAsins(std::list <std::string> asins)
{
	this->asins = asins;
}

std::string
Inline_response_200::getMessage()
{
	return message;
}

void
Inline_response_200::setMessage(std::string  message)
{
	this->message = message;
}


