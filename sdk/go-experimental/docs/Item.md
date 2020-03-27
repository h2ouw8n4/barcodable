# Item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Upc** | Pointer to **string** |  | [optional] 
**Ean** | Pointer to **string** |  | [optional] 
**Isbn** | Pointer to **string** |  | [optional] 
**Asin** | Pointer to **string** |  | [optional] 
**Title** | Pointer to **string** |  | [optional] 
**Sku** | Pointer to **string** |  | [optional] 
**Mpn** | Pointer to **string** |  | [optional] 
**PartNumber** | Pointer to **string** |  | [optional] 
**Upcs** | Pointer to **[]string** | A list of matching upc codes. | [optional] 
**Description** | Pointer to **string** |  | [optional] 
**Brand** | Pointer to **string** |  | [optional] 
**Manufacturer** | Pointer to **string** |  | [optional] 
**Color** | Pointer to **string** |  | [optional] 
**NewPrice** | Pointer to **float32** |  | [optional] 
**UsedPrice** | Pointer to **float32** |  | [optional] 
**CurrencyCode** | Pointer to **string** |  | [optional] 
**Url** | Pointer to **string** |  | [optional] 
**Features** | Pointer to **[]string** | A list of product feature descriptions. | [optional] 
**Dimensions** | Pointer to **[]map[string]interface{}** | Product dimensions and weight.  (&#39;meters&#39;, &#39;centimeters&#39;, &#39;millimeters&#39;, &#39;inches&#39;, &#39;feet&#39;, &#39;yards&#39;, &#39;ounces&#39;, &#39;pounds&#39;, &#39;grams&#39;, &#39;milligrams&#39;, &#39;kilograms&#39;) | [optional] 
**Images** | Pointer to **[]string** | A list product images. | [optional] 
**MatchedItems** | Pointer to **[]map[string]interface{}** | Matched items for this product. | [optional] 
**IsoCountryCodes** | Pointer to **[]string** | A list of country codes from which this item belongs. | [optional] 
**CompanyName** | Pointer to **string** | The company name registered to the product&#39;s UPC or EAN. | [optional] 
**CompanyAddress** | Pointer to **string** | The company address registered to the product&#39;s UPC or EAN. | [optional] 
**Categories** | Pointer to **[]string** | A list of categories for this product. | [optional] 
**CategoryHierarchies** | Pointer to **[]string** | A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category. | [optional] 

## Methods

### NewItem

`func NewItem() *Item`

NewItem instantiates a new Item object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemWithDefaults

`func NewItemWithDefaults() *Item`

NewItemWithDefaults instantiates a new Item object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUpc

`func (o *Item) GetUpc() string`

GetUpc returns the Upc field if non-nil, zero value otherwise.

### GetUpcOk

`func (o *Item) GetUpcOk() (*string, bool)`

GetUpcOk returns a tuple with the Upc field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpc

`func (o *Item) SetUpc(v string)`

SetUpc sets Upc field to given value.

### HasUpc

`func (o *Item) HasUpc() bool`

HasUpc returns a boolean if a field has been set.

### GetEan

`func (o *Item) GetEan() string`

GetEan returns the Ean field if non-nil, zero value otherwise.

### GetEanOk

`func (o *Item) GetEanOk() (*string, bool)`

GetEanOk returns a tuple with the Ean field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEan

`func (o *Item) SetEan(v string)`

SetEan sets Ean field to given value.

### HasEan

`func (o *Item) HasEan() bool`

HasEan returns a boolean if a field has been set.

### GetIsbn

`func (o *Item) GetIsbn() string`

GetIsbn returns the Isbn field if non-nil, zero value otherwise.

### GetIsbnOk

`func (o *Item) GetIsbnOk() (*string, bool)`

GetIsbnOk returns a tuple with the Isbn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsbn

`func (o *Item) SetIsbn(v string)`

SetIsbn sets Isbn field to given value.

### HasIsbn

`func (o *Item) HasIsbn() bool`

HasIsbn returns a boolean if a field has been set.

### GetAsin

`func (o *Item) GetAsin() string`

GetAsin returns the Asin field if non-nil, zero value otherwise.

### GetAsinOk

`func (o *Item) GetAsinOk() (*string, bool)`

GetAsinOk returns a tuple with the Asin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAsin

`func (o *Item) SetAsin(v string)`

SetAsin sets Asin field to given value.

### HasAsin

`func (o *Item) HasAsin() bool`

HasAsin returns a boolean if a field has been set.

### GetTitle

`func (o *Item) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *Item) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *Item) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *Item) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### GetSku

`func (o *Item) GetSku() string`

GetSku returns the Sku field if non-nil, zero value otherwise.

### GetSkuOk

`func (o *Item) GetSkuOk() (*string, bool)`

GetSkuOk returns a tuple with the Sku field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSku

`func (o *Item) SetSku(v string)`

SetSku sets Sku field to given value.

### HasSku

`func (o *Item) HasSku() bool`

HasSku returns a boolean if a field has been set.

### GetMpn

`func (o *Item) GetMpn() string`

GetMpn returns the Mpn field if non-nil, zero value otherwise.

### GetMpnOk

`func (o *Item) GetMpnOk() (*string, bool)`

GetMpnOk returns a tuple with the Mpn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMpn

`func (o *Item) SetMpn(v string)`

SetMpn sets Mpn field to given value.

### HasMpn

`func (o *Item) HasMpn() bool`

HasMpn returns a boolean if a field has been set.

### GetPartNumber

`func (o *Item) GetPartNumber() string`

GetPartNumber returns the PartNumber field if non-nil, zero value otherwise.

### GetPartNumberOk

`func (o *Item) GetPartNumberOk() (*string, bool)`

GetPartNumberOk returns a tuple with the PartNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartNumber

`func (o *Item) SetPartNumber(v string)`

SetPartNumber sets PartNumber field to given value.

### HasPartNumber

`func (o *Item) HasPartNumber() bool`

HasPartNumber returns a boolean if a field has been set.

### GetUpcs

`func (o *Item) GetUpcs() []string`

GetUpcs returns the Upcs field if non-nil, zero value otherwise.

### GetUpcsOk

`func (o *Item) GetUpcsOk() (*[]string, bool)`

GetUpcsOk returns a tuple with the Upcs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpcs

`func (o *Item) SetUpcs(v []string)`

SetUpcs sets Upcs field to given value.

### HasUpcs

`func (o *Item) HasUpcs() bool`

HasUpcs returns a boolean if a field has been set.

### GetDescription

`func (o *Item) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *Item) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *Item) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *Item) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetBrand

`func (o *Item) GetBrand() string`

GetBrand returns the Brand field if non-nil, zero value otherwise.

### GetBrandOk

`func (o *Item) GetBrandOk() (*string, bool)`

GetBrandOk returns a tuple with the Brand field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBrand

`func (o *Item) SetBrand(v string)`

SetBrand sets Brand field to given value.

### HasBrand

`func (o *Item) HasBrand() bool`

HasBrand returns a boolean if a field has been set.

### GetManufacturer

`func (o *Item) GetManufacturer() string`

GetManufacturer returns the Manufacturer field if non-nil, zero value otherwise.

### GetManufacturerOk

`func (o *Item) GetManufacturerOk() (*string, bool)`

GetManufacturerOk returns a tuple with the Manufacturer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetManufacturer

`func (o *Item) SetManufacturer(v string)`

SetManufacturer sets Manufacturer field to given value.

### HasManufacturer

`func (o *Item) HasManufacturer() bool`

HasManufacturer returns a boolean if a field has been set.

### GetColor

`func (o *Item) GetColor() string`

GetColor returns the Color field if non-nil, zero value otherwise.

### GetColorOk

`func (o *Item) GetColorOk() (*string, bool)`

GetColorOk returns a tuple with the Color field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColor

`func (o *Item) SetColor(v string)`

SetColor sets Color field to given value.

### HasColor

`func (o *Item) HasColor() bool`

HasColor returns a boolean if a field has been set.

### GetNewPrice

`func (o *Item) GetNewPrice() float32`

GetNewPrice returns the NewPrice field if non-nil, zero value otherwise.

### GetNewPriceOk

`func (o *Item) GetNewPriceOk() (*float32, bool)`

GetNewPriceOk returns a tuple with the NewPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewPrice

`func (o *Item) SetNewPrice(v float32)`

SetNewPrice sets NewPrice field to given value.

### HasNewPrice

`func (o *Item) HasNewPrice() bool`

HasNewPrice returns a boolean if a field has been set.

### GetUsedPrice

`func (o *Item) GetUsedPrice() float32`

GetUsedPrice returns the UsedPrice field if non-nil, zero value otherwise.

### GetUsedPriceOk

`func (o *Item) GetUsedPriceOk() (*float32, bool)`

GetUsedPriceOk returns a tuple with the UsedPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsedPrice

`func (o *Item) SetUsedPrice(v float32)`

SetUsedPrice sets UsedPrice field to given value.

### HasUsedPrice

`func (o *Item) HasUsedPrice() bool`

HasUsedPrice returns a boolean if a field has been set.

### GetCurrencyCode

`func (o *Item) GetCurrencyCode() string`

GetCurrencyCode returns the CurrencyCode field if non-nil, zero value otherwise.

### GetCurrencyCodeOk

`func (o *Item) GetCurrencyCodeOk() (*string, bool)`

GetCurrencyCodeOk returns a tuple with the CurrencyCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrencyCode

`func (o *Item) SetCurrencyCode(v string)`

SetCurrencyCode sets CurrencyCode field to given value.

### HasCurrencyCode

`func (o *Item) HasCurrencyCode() bool`

HasCurrencyCode returns a boolean if a field has been set.

### GetUrl

`func (o *Item) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *Item) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *Item) SetUrl(v string)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *Item) HasUrl() bool`

HasUrl returns a boolean if a field has been set.

### GetFeatures

`func (o *Item) GetFeatures() []string`

GetFeatures returns the Features field if non-nil, zero value otherwise.

### GetFeaturesOk

`func (o *Item) GetFeaturesOk() (*[]string, bool)`

GetFeaturesOk returns a tuple with the Features field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeatures

`func (o *Item) SetFeatures(v []string)`

SetFeatures sets Features field to given value.

### HasFeatures

`func (o *Item) HasFeatures() bool`

HasFeatures returns a boolean if a field has been set.

### GetDimensions

`func (o *Item) GetDimensions() []map[string]interface{}`

GetDimensions returns the Dimensions field if non-nil, zero value otherwise.

### GetDimensionsOk

`func (o *Item) GetDimensionsOk() (*[]map[string]interface{}, bool)`

GetDimensionsOk returns a tuple with the Dimensions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDimensions

`func (o *Item) SetDimensions(v []map[string]interface{})`

SetDimensions sets Dimensions field to given value.

### HasDimensions

`func (o *Item) HasDimensions() bool`

HasDimensions returns a boolean if a field has been set.

### GetImages

`func (o *Item) GetImages() []string`

GetImages returns the Images field if non-nil, zero value otherwise.

### GetImagesOk

`func (o *Item) GetImagesOk() (*[]string, bool)`

GetImagesOk returns a tuple with the Images field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImages

`func (o *Item) SetImages(v []string)`

SetImages sets Images field to given value.

### HasImages

`func (o *Item) HasImages() bool`

HasImages returns a boolean if a field has been set.

### GetMatchedItems

`func (o *Item) GetMatchedItems() []map[string]interface{}`

GetMatchedItems returns the MatchedItems field if non-nil, zero value otherwise.

### GetMatchedItemsOk

`func (o *Item) GetMatchedItemsOk() (*[]map[string]interface{}, bool)`

GetMatchedItemsOk returns a tuple with the MatchedItems field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMatchedItems

`func (o *Item) SetMatchedItems(v []map[string]interface{})`

SetMatchedItems sets MatchedItems field to given value.

### HasMatchedItems

`func (o *Item) HasMatchedItems() bool`

HasMatchedItems returns a boolean if a field has been set.

### GetIsoCountryCodes

`func (o *Item) GetIsoCountryCodes() []string`

GetIsoCountryCodes returns the IsoCountryCodes field if non-nil, zero value otherwise.

### GetIsoCountryCodesOk

`func (o *Item) GetIsoCountryCodesOk() (*[]string, bool)`

GetIsoCountryCodesOk returns a tuple with the IsoCountryCodes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsoCountryCodes

`func (o *Item) SetIsoCountryCodes(v []string)`

SetIsoCountryCodes sets IsoCountryCodes field to given value.

### HasIsoCountryCodes

`func (o *Item) HasIsoCountryCodes() bool`

HasIsoCountryCodes returns a boolean if a field has been set.

### GetCompanyName

`func (o *Item) GetCompanyName() string`

GetCompanyName returns the CompanyName field if non-nil, zero value otherwise.

### GetCompanyNameOk

`func (o *Item) GetCompanyNameOk() (*string, bool)`

GetCompanyNameOk returns a tuple with the CompanyName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompanyName

`func (o *Item) SetCompanyName(v string)`

SetCompanyName sets CompanyName field to given value.

### HasCompanyName

`func (o *Item) HasCompanyName() bool`

HasCompanyName returns a boolean if a field has been set.

### GetCompanyAddress

`func (o *Item) GetCompanyAddress() string`

GetCompanyAddress returns the CompanyAddress field if non-nil, zero value otherwise.

### GetCompanyAddressOk

`func (o *Item) GetCompanyAddressOk() (*string, bool)`

GetCompanyAddressOk returns a tuple with the CompanyAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompanyAddress

`func (o *Item) SetCompanyAddress(v string)`

SetCompanyAddress sets CompanyAddress field to given value.

### HasCompanyAddress

`func (o *Item) HasCompanyAddress() bool`

HasCompanyAddress returns a boolean if a field has been set.

### GetCategories

`func (o *Item) GetCategories() []string`

GetCategories returns the Categories field if non-nil, zero value otherwise.

### GetCategoriesOk

`func (o *Item) GetCategoriesOk() (*[]string, bool)`

GetCategoriesOk returns a tuple with the Categories field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategories

`func (o *Item) SetCategories(v []string)`

SetCategories sets Categories field to given value.

### HasCategories

`func (o *Item) HasCategories() bool`

HasCategories returns a boolean if a field has been set.

### GetCategoryHierarchies

`func (o *Item) GetCategoryHierarchies() []string`

GetCategoryHierarchies returns the CategoryHierarchies field if non-nil, zero value otherwise.

### GetCategoryHierarchiesOk

`func (o *Item) GetCategoryHierarchiesOk() (*[]string, bool)`

GetCategoryHierarchiesOk returns a tuple with the CategoryHierarchies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryHierarchies

`func (o *Item) SetCategoryHierarchies(v []string)`

SetCategoryHierarchies sets CategoryHierarchies field to given value.

### HasCategoryHierarchies

`func (o *Item) HasCategoryHierarchies() bool`

HasCategoryHierarchies returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


