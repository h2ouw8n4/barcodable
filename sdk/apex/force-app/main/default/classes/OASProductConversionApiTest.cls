@isTest
private class OASProductConversionApiTest {
    /**
     * Convert between UPC, EAN, and ASIN product codes.
     *
     * Returns the converted UPC, EAN, and ASIN codes.
     */
    @isTest
    private static void convertCodeTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'upcEanAsin' => 'null'
        };

        OASClient client;
        OASProductConversionApi api;
        OASInlineResponse200 response;
        OASInlineResponse200 expectedResponse;
        String js = '';

        api = new OASProductConversionApi(new OASClient());

        js = JSON.serialize(OASInlineResponse200.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASInlineResponse200.getExample();
        response = (OASInlineResponse200) api.convertCode(params);
        System.assertEquals(expectedResponse, response);
    }
}