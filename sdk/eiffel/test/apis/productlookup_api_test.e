note
    description: "API tests for PRODUCTLOOKUP_API"
    date: "$Date$"
    revision: "$Revision$"


class PRODUCTLOOKUP_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_item_by_as_in
            -- Find item by asin code
            -- 
            -- Returns a single item 
        local
            l_response: ITEM
            l_asin: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_asin
                      
            -- l_response := api.item_by_as_in(l_asin)
            assert ("not_implemented", False)
        end
    
    test_item_by_ea_n
            -- Find item by UPC code
            -- 
            -- Returns a single item 
        local
            l_response: ITEM
            l_ean: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ean
                      
            -- l_response := api.item_by_ea_n(l_ean)
            assert ("not_implemented", False)
        end
    
    test_item_by_up_c
            -- Find item by UPC code
            -- 
            -- Returns a single item 
        local
            l_response: ITEM
            l_upc: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_upc
                      
            -- l_response := api.item_by_up_c(l_upc)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: PRODUCTLOOKUP_API
            -- Create an object instance of `PRODUCTLOOKUP_API'.
        once            
            create { PRODUCTLOOKUP_API } Result
        end

end
