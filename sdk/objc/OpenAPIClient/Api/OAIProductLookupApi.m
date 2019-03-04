#import "OAIProductLookupApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIInvalidCode.h"
#import "OAIItem.h"
#import "OAINotFound.h"


@interface OAIProductLookupApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIProductLookupApi

NSString* kOAIProductLookupApiErrorDomain = @"OAIProductLookupApiErrorDomain";
NSInteger kOAIProductLookupApiMissingParamErrorCode = 234513;

@synthesize apiClient = _apiClient;

#pragma mark - Initialize methods

- (instancetype) init {
    return [self initWithApiClient:[OAIApiClient sharedClient]];
}


-(instancetype) initWithApiClient:(OAIApiClient *)apiClient {
    self = [super init];
    if (self) {
        _apiClient = apiClient;
        _mutableDefaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

-(NSString*) defaultHeaderForKey:(NSString*)key {
    return self.mutableDefaultHeaders[key];
}

-(void) setDefaultHeaderValue:(NSString*) value forKey:(NSString*)key {
    [self.mutableDefaultHeaders setValue:value forKey:key];
}

-(NSDictionary *)defaultHeaders {
    return self.mutableDefaultHeaders;
}

#pragma mark - Api Methods

///
/// Find item by asin code
/// Returns a single item
///  @param asin ASIN code of item to return 
///
///  @returns OAIItem*
///
-(NSURLSessionTask*) getItemByASINWithAsin: (NSString*) asin
    completionHandler: (void (^)(OAIItem* output, NSError* error)) handler {
    // verify the required parameter 'asin' is set
    if (asin == nil) {
        NSParameterAssert(asin);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"asin"] };
            NSError* error = [NSError errorWithDomain:kOAIProductLookupApiErrorDomain code:kOAIProductLookupApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/v1/asin/{asin}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (asin != nil) {
        pathParams[@"asin"] = asin;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIItem*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIItem*)data, error);
                                }
                            }];
}

///
/// Find item by UPC code
/// Returns a single item
///  @param ean EAN code of item to return 
///
///  @returns OAIItem*
///
-(NSURLSessionTask*) getItemByEANWithEan: (NSString*) ean
    completionHandler: (void (^)(OAIItem* output, NSError* error)) handler {
    // verify the required parameter 'ean' is set
    if (ean == nil) {
        NSParameterAssert(ean);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"ean"] };
            NSError* error = [NSError errorWithDomain:kOAIProductLookupApiErrorDomain code:kOAIProductLookupApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/v1/ean/{ean}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (ean != nil) {
        pathParams[@"ean"] = ean;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIItem*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIItem*)data, error);
                                }
                            }];
}

///
/// Find item by UPC code
/// Returns a single item
///  @param upc UPC code of item to return 
///
///  @returns OAIItem*
///
-(NSURLSessionTask*) getItemByUPCWithUpc: (NSString*) upc
    completionHandler: (void (^)(OAIItem* output, NSError* error)) handler {
    // verify the required parameter 'upc' is set
    if (upc == nil) {
        NSParameterAssert(upc);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"upc"] };
            NSError* error = [NSError errorWithDomain:kOAIProductLookupApiErrorDomain code:kOAIProductLookupApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/v1/upc/{upc}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (upc != nil) {
        pathParams[@"upc"] = upc;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIItem*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIItem*)data, error);
                                }
                            }];
}



@end
