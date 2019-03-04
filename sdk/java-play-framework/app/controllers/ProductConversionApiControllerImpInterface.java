package controllers;

import apimodels.InlineResponse200;
import apimodels.InlineResponse400;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface ProductConversionApiControllerImpInterface {
    InlineResponse200 convertCode(String upcEanAsin) throws Exception;

}
