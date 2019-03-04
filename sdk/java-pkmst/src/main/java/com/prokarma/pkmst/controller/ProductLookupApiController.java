package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.InvalidCode;
import com.prokarma.pkmst.model.Item;
import com.prokarma.pkmst.model.NotFound;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implemention
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-04T22:38:53.460Z[Etc/UTC]")

@Controller
public class ProductLookupApiController implements ProductLookupApi {
    private final ObjectMapper objectMapper;
@Autowired
    public ProductLookupApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Item> getItemByASIN(@ApiParam(value = "ASIN code of item to return",required=true ) @PathVariable("asin") String asin,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Item>(objectMapper.readValue("", Item.class), HttpStatus.OK);
        }

        return new ResponseEntity<Item>(HttpStatus.OK);
    }

    public ResponseEntity<Item> getItemByEAN(@ApiParam(value = "EAN code of item to return",required=true ) @PathVariable("ean") String ean,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Item>(objectMapper.readValue("", Item.class), HttpStatus.OK);
        }

        return new ResponseEntity<Item>(HttpStatus.OK);
    }

    public ResponseEntity<Item> getItemByUPC(@ApiParam(value = "UPC code of item to return",required=true ) @PathVariable("upc") String upc,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Item>(objectMapper.readValue("", Item.class), HttpStatus.OK);
        }

        return new ResponseEntity<Item>(HttpStatus.OK);
    }

}
