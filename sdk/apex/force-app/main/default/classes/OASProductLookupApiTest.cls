@isTest
private class OASProductLookupApiTest {
    /**
     * Find item by asin code
     *
     * Returns a single item
     */
    @isTest
    private static void getItemByASINTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'asin' => 'null'
        };

        OASClient client;
        OASProductLookupApi api;
        OASItem response;
        OASItem expectedResponse;
        String js = '';

        api = new OASProductLookupApi(new OASClient());

        js = JSON.serialize(OASItem.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASItem.getExample();
        response = (OASItem) api.getItemByASIN(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Find item by UPC code
     *
     * Returns a single item
     */
    @isTest
    private static void getItemByEANTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'ean' => 'null'
        };

        OASClient client;
        OASProductLookupApi api;
        OASItem response;
        OASItem expectedResponse;
        String js = '';

        api = new OASProductLookupApi(new OASClient());

        js = JSON.serialize(OASItem.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASItem.getExample();
        response = (OASItem) api.getItemByEAN(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Find item by UPC code
     *
     * Returns a single item
     */
    @isTest
    private static void getItemByUPCTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'upc' => 'null'
        };

        OASClient client;
        OASProductLookupApi api;
        OASItem response;
        OASItem expectedResponse;
        String js = '';

        api = new OASProductLookupApi(new OASClient());

        js = JSON.serialize(OASItem.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASItem.getExample();
        response = (OASItem) api.getItemByUPC(params);
        System.assertEquals(expectedResponse, response);
    }
}