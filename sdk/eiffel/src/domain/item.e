note
 description:"[
		Barcodable.com API
 		Barcodable.com API
  		The version of the OpenAPI document: 1.5.0
 	    Contact: support@barcodable.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class ITEM 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    upc: detachable STRING_32 
      
    ean: detachable STRING_32 
      
    isbn: detachable STRING_32 
      
    asin: detachable STRING_32 
      
    title: detachable STRING_32 
      
    sku: detachable STRING_32 
      
    mpn: detachable STRING_32 
      
    part_number: detachable STRING_32 
      
    upcs: detachable LIST [STRING_32] 
      -- A list of matching upc codes.
    description: detachable STRING_32 
      
    brand: detachable STRING_32 
      
    manufacturer: detachable STRING_32 
      
    color: detachable STRING_32 
      
    new_price: REAL_32 
      
    used_price: REAL_32 
      
    currency_code: detachable STRING_32 
      
    url: detachable STRING_32 
      
    features: detachable LIST [STRING_32] 
      -- A list of product feature descriptions.
    dimensions: detachable LIST [ANY] 
      -- Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms')
    images: detachable LIST [STRING_32] 
      -- A list product images.
    matched_items: detachable LIST [ANY] 
      -- Matched items for this product.
    iso_country_codes: detachable LIST [STRING_32] 
      -- A list of country codes from which this item belongs.
    company_name: detachable STRING_32 
      -- The company name registered to the product's UPC or EAN.
    company_address: detachable STRING_32 
      -- The company address registered to the product's UPC or EAN.
    categories: detachable LIST [STRING_32] 
      -- A list of categories for this product.
    category_hierarchies: detachable LIST [STRING_32] 
      -- A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.

feature -- Change Element  
 
    set_upc (a_name: like upc)
        -- Set 'upc' with 'a_name'.
      do
        upc := a_name
      ensure
        upc_set: upc = a_name		
      end

    set_ean (a_name: like ean)
        -- Set 'ean' with 'a_name'.
      do
        ean := a_name
      ensure
        ean_set: ean = a_name		
      end

    set_isbn (a_name: like isbn)
        -- Set 'isbn' with 'a_name'.
      do
        isbn := a_name
      ensure
        isbn_set: isbn = a_name		
      end

    set_asin (a_name: like asin)
        -- Set 'asin' with 'a_name'.
      do
        asin := a_name
      ensure
        asin_set: asin = a_name		
      end

    set_title (a_name: like title)
        -- Set 'title' with 'a_name'.
      do
        title := a_name
      ensure
        title_set: title = a_name		
      end

    set_sku (a_name: like sku)
        -- Set 'sku' with 'a_name'.
      do
        sku := a_name
      ensure
        sku_set: sku = a_name		
      end

    set_mpn (a_name: like mpn)
        -- Set 'mpn' with 'a_name'.
      do
        mpn := a_name
      ensure
        mpn_set: mpn = a_name		
      end

    set_part_number (a_name: like part_number)
        -- Set 'part_number' with 'a_name'.
      do
        part_number := a_name
      ensure
        part_number_set: part_number = a_name		
      end

    set_upcs (a_name: like upcs)
        -- Set 'upcs' with 'a_name'.
      do
        upcs := a_name
      ensure
        upcs_set: upcs = a_name		
      end

    set_description (a_name: like description)
        -- Set 'description' with 'a_name'.
      do
        description := a_name
      ensure
        description_set: description = a_name		
      end

    set_brand (a_name: like brand)
        -- Set 'brand' with 'a_name'.
      do
        brand := a_name
      ensure
        brand_set: brand = a_name		
      end

    set_manufacturer (a_name: like manufacturer)
        -- Set 'manufacturer' with 'a_name'.
      do
        manufacturer := a_name
      ensure
        manufacturer_set: manufacturer = a_name		
      end

    set_color (a_name: like color)
        -- Set 'color' with 'a_name'.
      do
        color := a_name
      ensure
        color_set: color = a_name		
      end

    set_new_price (a_name: like new_price)
        -- Set 'new_price' with 'a_name'.
      do
        new_price := a_name
      ensure
        new_price_set: new_price = a_name		
      end

    set_used_price (a_name: like used_price)
        -- Set 'used_price' with 'a_name'.
      do
        used_price := a_name
      ensure
        used_price_set: used_price = a_name		
      end

    set_currency_code (a_name: like currency_code)
        -- Set 'currency_code' with 'a_name'.
      do
        currency_code := a_name
      ensure
        currency_code_set: currency_code = a_name		
      end

    set_url (a_name: like url)
        -- Set 'url' with 'a_name'.
      do
        url := a_name
      ensure
        url_set: url = a_name		
      end

    set_features (a_name: like features)
        -- Set 'features' with 'a_name'.
      do
        features := a_name
      ensure
        features_set: features = a_name		
      end

    set_dimensions (a_name: like dimensions)
        -- Set 'dimensions' with 'a_name'.
      do
        dimensions := a_name
      ensure
        dimensions_set: dimensions = a_name		
      end

    set_images (a_name: like images)
        -- Set 'images' with 'a_name'.
      do
        images := a_name
      ensure
        images_set: images = a_name		
      end

    set_matched_items (a_name: like matched_items)
        -- Set 'matched_items' with 'a_name'.
      do
        matched_items := a_name
      ensure
        matched_items_set: matched_items = a_name		
      end

    set_iso_country_codes (a_name: like iso_country_codes)
        -- Set 'iso_country_codes' with 'a_name'.
      do
        iso_country_codes := a_name
      ensure
        iso_country_codes_set: iso_country_codes = a_name		
      end

    set_company_name (a_name: like company_name)
        -- Set 'company_name' with 'a_name'.
      do
        company_name := a_name
      ensure
        company_name_set: company_name = a_name		
      end

    set_company_address (a_name: like company_address)
        -- Set 'company_address' with 'a_name'.
      do
        company_address := a_name
      ensure
        company_address_set: company_address = a_name		
      end

    set_categories (a_name: like categories)
        -- Set 'categories' with 'a_name'.
      do
        categories := a_name
      ensure
        categories_set: categories = a_name		
      end

    set_category_hierarchies (a_name: like category_hierarchies)
        -- Set 'category_hierarchies' with 'a_name'.
      do
        category_hierarchies := a_name
      ensure
        category_hierarchies_set: category_hierarchies = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass ITEM%N")
        if attached upc as l_upc then
          Result.append ("%Nupc:")
          Result.append (l_upc.out)
          Result.append ("%N")    
        end  
        if attached ean as l_ean then
          Result.append ("%Nean:")
          Result.append (l_ean.out)
          Result.append ("%N")    
        end  
        if attached isbn as l_isbn then
          Result.append ("%Nisbn:")
          Result.append (l_isbn.out)
          Result.append ("%N")    
        end  
        if attached asin as l_asin then
          Result.append ("%Nasin:")
          Result.append (l_asin.out)
          Result.append ("%N")    
        end  
        if attached title as l_title then
          Result.append ("%Ntitle:")
          Result.append (l_title.out)
          Result.append ("%N")    
        end  
        if attached sku as l_sku then
          Result.append ("%Nsku:")
          Result.append (l_sku.out)
          Result.append ("%N")    
        end  
        if attached mpn as l_mpn then
          Result.append ("%Nmpn:")
          Result.append (l_mpn.out)
          Result.append ("%N")    
        end  
        if attached part_number as l_part_number then
          Result.append ("%Npart_number:")
          Result.append (l_part_number.out)
          Result.append ("%N")    
        end  
        if attached upcs as l_upcs then
          across l_upcs as ic loop
            Result.append ("%N upcs:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
        if attached description as l_description then
          Result.append ("%Ndescription:")
          Result.append (l_description.out)
          Result.append ("%N")    
        end  
        if attached brand as l_brand then
          Result.append ("%Nbrand:")
          Result.append (l_brand.out)
          Result.append ("%N")    
        end  
        if attached manufacturer as l_manufacturer then
          Result.append ("%Nmanufacturer:")
          Result.append (l_manufacturer.out)
          Result.append ("%N")    
        end  
        if attached color as l_color then
          Result.append ("%Ncolor:")
          Result.append (l_color.out)
          Result.append ("%N")    
        end  
        if attached new_price as l_new_price then
          Result.append ("%Nnew_price:")
          Result.append (l_new_price.out)
          Result.append ("%N")    
        end  
        if attached used_price as l_used_price then
          Result.append ("%Nused_price:")
          Result.append (l_used_price.out)
          Result.append ("%N")    
        end  
        if attached currency_code as l_currency_code then
          Result.append ("%Ncurrency_code:")
          Result.append (l_currency_code.out)
          Result.append ("%N")    
        end  
        if attached url as l_url then
          Result.append ("%Nurl:")
          Result.append (l_url.out)
          Result.append ("%N")    
        end  
        if attached features as l_features then
          across l_features as ic loop
            Result.append ("%N features:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
        if attached dimensions as l_dimensions then
          across l_dimensions as ic loop
            Result.append ("%N dimensions:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
        if attached images as l_images then
          across l_images as ic loop
            Result.append ("%N images:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
        if attached matched_items as l_matched_items then
          across l_matched_items as ic loop
            Result.append ("%N matched_items:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
        if attached iso_country_codes as l_iso_country_codes then
          across l_iso_country_codes as ic loop
            Result.append ("%N iso_country_codes:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
        if attached company_name as l_company_name then
          Result.append ("%Ncompany_name:")
          Result.append (l_company_name.out)
          Result.append ("%N")    
        end  
        if attached company_address as l_company_address then
          Result.append ("%Ncompany_address:")
          Result.append (l_company_address.out)
          Result.append ("%N")    
        end  
        if attached categories as l_categories then
          across l_categories as ic loop
            Result.append ("%N categories:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
        if attached category_hierarchies as l_category_hierarchies then
          across l_category_hierarchies as ic loop
            Result.append ("%N category_hierarchies:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
      end
end


