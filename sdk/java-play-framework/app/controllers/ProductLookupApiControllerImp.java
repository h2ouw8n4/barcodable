package controllers;

import apimodels.InvalidCode;
import apimodels.Item;
import apimodels.NotFound;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-03-27T18:10:03.884-04:00[America/New_York]")

public class ProductLookupApiControllerImp implements ProductLookupApiControllerImpInterface {
    @Override
    public Item getItemByASIN(String asin) throws Exception {
        //Do your magic!!!
        return new Item();
    }

    @Override
    public Item getItemByEAN(String ean) throws Exception {
        //Do your magic!!!
        return new Item();
    }

    @Override
    public Item getItemByUPC(String upc) throws Exception {
        //Do your magic!!!
        return new Item();
    }

}
