note
 description:"[
		Barcodable.com API
 		Barcodable.com API
  		The version of the OpenAPI document: 1.5.0
 	    Contact: support@barcodable.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"

class
	PRODUCTLOOKUP_API

inherit

    API_I


feature -- API Access


	item_by_as_in (asin: STRING_32): detachable ITEM
			-- Find item by asin code
			-- Returns a single item
			-- 
			-- argument: asin ASIN code of item to return (required)
			-- 
			-- 
			-- Result ITEM
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/api/v1/asin/{asin}"
			l_path.replace_substring_all ("{"+"asin"+"}", api_client.url_encode (asin.out))


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { ITEM } l_response.data ({ ITEM }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	item_by_ea_n (ean: STRING_32): detachable ITEM
			-- Find item by UPC code
			-- Returns a single item
			-- 
			-- argument: ean EAN code of item to return (required)
			-- 
			-- 
			-- Result ITEM
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/api/v1/ean/{ean}"
			l_path.replace_substring_all ("{"+"ean"+"}", api_client.url_encode (ean.out))


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { ITEM } l_response.data ({ ITEM }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	item_by_up_c (upc: STRING_32): detachable ITEM
			-- Find item by UPC code
			-- Returns a single item
			-- 
			-- argument: upc UPC code of item to return (required)
			-- 
			-- 
			-- Result ITEM
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/api/v1/upc/{upc}"
			l_path.replace_substring_all ("{"+"upc"+"}", api_client.url_encode (upc.out))


			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { ITEM } l_response.data ({ ITEM }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	


end
