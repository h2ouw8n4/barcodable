public class OASClient extends OAS.ApiClient {
    public OASClient() {
        basePath = 'https://virtserver.swaggerhub.com/mindviser/barcodable/1.0.0';
        calloutName = 'Barcodable_com_API';
        authentications.put('ApiKeyAuth', new OAS.ApiKeyHeaderAuth('Authorization'));
    }
}
