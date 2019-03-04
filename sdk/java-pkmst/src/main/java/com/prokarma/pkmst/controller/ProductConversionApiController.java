package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.InlineResponse200;
import com.prokarma.pkmst.model.InlineResponse400;

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
public class ProductConversionApiController implements ProductConversionApi {
    private final ObjectMapper objectMapper;
@Autowired
    public ProductConversionApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<InlineResponse200> convertCode(@ApiParam(value = "UPC, EAN, or ASIN",required=true ) @PathVariable("upc | ean | asin") String upcEanAsin,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<InlineResponse200>(objectMapper.readValue("", InlineResponse200.class), HttpStatus.OK);
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
    }

}
