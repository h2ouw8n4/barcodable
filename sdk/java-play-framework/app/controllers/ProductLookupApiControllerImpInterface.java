package controllers;

import apimodels.InvalidCode;
import apimodels.Item;
import apimodels.NotFound;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface ProductLookupApiControllerImpInterface {
    Item getItemByASIN(String asin) throws Exception;

    Item getItemByEAN(String ean) throws Exception;

    Item getItemByUPC(String upc) throws Exception;

}
