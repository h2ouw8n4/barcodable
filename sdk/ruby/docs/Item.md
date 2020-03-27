# OpenapiClient::Item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**upc** | **String** |  | [optional] 
**ean** | **String** |  | [optional] 
**isbn** | **String** |  | [optional] 
**asin** | **String** |  | [optional] 
**title** | **String** |  | [optional] 
**sku** | **String** |  | [optional] 
**mpn** | **String** |  | [optional] 
**part_number** | **String** |  | [optional] 
**upcs** | **Array&lt;String&gt;** | A list of matching upc codes. | [optional] 
**description** | **String** |  | [optional] 
**brand** | **String** |  | [optional] 
**manufacturer** | **String** |  | [optional] 
**color** | **String** |  | [optional] 
**new_price** | **Float** |  | [optional] 
**used_price** | **Float** |  | [optional] 
**currency_code** | **String** |  | [optional] 
**url** | **String** |  | [optional] 
**features** | **Array&lt;String&gt;** | A list of product feature descriptions. | [optional] 
**dimensions** | **Array&lt;Object&gt;** | Product dimensions and weight.  (&#39;meters&#39;, &#39;centimeters&#39;, &#39;millimeters&#39;, &#39;inches&#39;, &#39;feet&#39;, &#39;yards&#39;, &#39;ounces&#39;, &#39;pounds&#39;, &#39;grams&#39;, &#39;milligrams&#39;, &#39;kilograms&#39;) | [optional] 
**images** | **Array&lt;String&gt;** | A list product images. | [optional] 
**matched_items** | **Array&lt;Object&gt;** | Matched items for this product. | [optional] 
**iso_country_codes** | **Array&lt;String&gt;** | A list of country codes from which this item belongs. | [optional] 
**company_name** | **String** | The company name registered to the product&#39;s UPC or EAN. | [optional] 
**company_address** | **String** | The company address registered to the product&#39;s UPC or EAN. | [optional] 
**categories** | **Array&lt;String&gt;** | A list of categories for this product. | [optional] 
**category_hierarchies** | **Array&lt;String&gt;** | A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::Item.new(upc: 190198155795,
                                 ean: 190198155795,
                                 isbn: 9780198155795,
                                 asin: B01M1EXQY4,
                                 title: Apple iPhone 7 Unlocked Phone 128 GB - US Version (Black),
                                 sku: 903061477,
                                 mpn: A1660,
                                 part_number: 14,
                                 upcs: [&quot;190198071835, 647627503790, 759776410383, 190198068507&quot;],
                                 description: The latest iPhone with advanced camera, better battery life, immersive speakers and water resistance!,
                                 brand: Apple,
                                 manufacturer: Apple,
                                 color: Black,
                                 new_price: 799.95,
                                 used_price: 659.95,
                                 currency_code: USD,
                                 url: https://www.amazon.com/Apple-iPhone-Unlocked-Phone-128/dp/B01M1EXQY4,
                                 features: [&quot;Smooth, continuous unibody design. 3D Touch, Live Photos, an A9 chip, advanced cameras, and a 4.7-inch Retina HD display. And so much more.&quot;,&quot;The most advanced chip ever in a smartphone is even faster and now features an integrated M9 motion coprocessor.&quot;],
                                 dimensions: null,
                                 images: [&quot;https://images-na.ssl-images-amazon.com/images/I/317AuSoRaHL.jpg&quot;,&quot;https://images-na.ssl-images-amazon.com/images/I/41Whf3N9i2L.jpg&quot;],
                                 matched_items: null,
                                 iso_country_codes: [&quot;US&quot;,&quot;GB&quot;],
                                 company_name: Apple Inc.,
                                 company_address: 101 Infinite Loop, Cupertino, CA 95014,
                                 categories: [&quot;Unlocked Cell Phones&quot;,&quot;Electronics&quot;],
                                 category_hierarchies: [[&quot;Cell Phones &amp; Accessories&quot;,&quot;Cell Phones&quot;,&quot;Unlocked Cell Phones&quot;]])
```


