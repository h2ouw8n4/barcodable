package = "openapiclient"
version = "1.0.0-1"
source = {
	url = "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
}

description = {
	summary = "API client genreated by OpenAPI Generator",
	detailed = [[
Barcodable.com API]],
	homepage = "https://openapi-generator.tech",
	license = "Unlicense",
	maintainer = "OpenAPI Generator contributors",
}

dependencies = {
	"lua >= 5.2",
	"http",
	"dkjson",
	"basexx"
}

build = {
	type = "builtin",
	modules = {
		["openapiclient.api.product_conversion_api"] = "openapiclient/api/product_conversion_api.lua";
		["openapiclient.api.product_lookup_api"] = "openapiclient/api/product_lookup_api.lua";
		["openapiclient.model.inline_response_200"] = "openapiclient/model/inline_response_200.lua";
		["openapiclient.model.inline_response_400"] = "openapiclient/model/inline_response_400.lua";
		["openapiclient.model.invalid_code"] = "openapiclient/model/invalid_code.lua";
		["openapiclient.model.item"] = "openapiclient/model/item.lua";
		["openapiclient.model.not_found"] = "openapiclient/model/not_found.lua";
	}
}
