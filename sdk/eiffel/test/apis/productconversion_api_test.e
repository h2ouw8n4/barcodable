note
    description: "API tests for PRODUCTCONVERSION_API"
    date: "$Date$"
    revision: "$Revision$"


class PRODUCTCONVERSION_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_convert_code
            -- Convert between UPC, EAN, and ASIN product codes.
            -- 
            -- Returns the converted UPC, EAN, and ASIN codes. 
        local
            l_response: INLINE_RESPONSE_200
            l_upc___ean___asin: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_upc___ean___asin
                      
            -- l_response := api.convert_code(l_upc___ean___asin)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: PRODUCTCONVERSION_API
            -- Create an object instance of `PRODUCTCONVERSION_API'.
        once            
            create { PRODUCTCONVERSION_API } Result
        end

end
