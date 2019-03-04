<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class Item
{
    /**
     * @DTA\Data(field="upc", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $upc;
    /**
     * @DTA\Data(field="ean", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $ean;
    /**
     * @DTA\Data(field="isbn", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $isbn;
    /**
     * @DTA\Data(field="asin", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $asin;
    /**
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $title;
    /**
     * @DTA\Data(field="sku", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $sku;
    /**
     * @DTA\Data(field="mpn", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $mpn;
    /**
     * @DTA\Data(field="part_number", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $part_number;
    /**
     * A list of matching upc codes.
     * @DTA\Data(field="upcs", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Type", "options":{"type":"string"}}
     * }})
     * @var string[]
     */
    public $upcs;
    /**
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $description;
    /**
     * @DTA\Data(field="brand", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $brand;
    /**
     * @DTA\Data(field="manufacturer", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $manufacturer;
    /**
     * @DTA\Data(field="color", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $color;
    /**
     * @DTA\Data(field="new_price", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $new_price;
    /**
     * @DTA\Data(field="used_price", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $used_price;
    /**
     * @DTA\Data(field="currency_code", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $currency_code;
    /**
     * @DTA\Data(field="url", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $url;
    /**
     * A list of product feature descriptions.
     * @DTA\Data(field="features", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Type", "options":{"type":"string"}}
     * }})
     * @var string[]
     */
    public $features;
    /**
     * Product dimensions and weight.  (&#39;meters&#39;, &#39;centimeters&#39;, &#39;millimeters&#39;, &#39;inches&#39;, &#39;feet&#39;, &#39;yards&#39;, &#39;ounces&#39;, &#39;pounds&#39;, &#39;grams&#39;, &#39;milligrams&#39;, &#39;kilograms&#39;)
     * @DTA\Data(field="dimensions", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Type", "options":{"type":"object"}}
     * }})
     * @var object[]
     */
    public $dimensions;
    /**
     * A list product images.
     * @DTA\Data(field="images", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Type", "options":{"type":"string"}}
     * }})
     * @var string[]
     */
    public $images;
    /**
     * Matched items for this product.
     * @DTA\Data(field="matched_items", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Type", "options":{"type":"object"}}
     * }})
     * @var object[]
     */
    public $matched_items;
    /**
     * A list of country codes from which this item belongs.
     * @DTA\Data(field="iso_country_codes", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Type", "options":{"type":"string"}}
     * }})
     * @var string[]
     */
    public $iso_country_codes;
    /**
     * The company name registered to the product&#39;s UPC or EAN.
     * @DTA\Data(field="company_name", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $company_name;
    /**
     * The company address registered to the product&#39;s UPC or EAN.
     * @DTA\Data(field="company_address", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $company_address;
    /**
     * A list of categories for this product.
     * @DTA\Data(field="categories", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Type", "options":{"type":"string"}}
     * }})
     * @var string[]
     */
    public $categories;
    /**
     * A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.
     * @DTA\Data(field="category_hierarchies", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Type", "options":{"type":"string"}}
     * }})
     * @var string[]
     */
    public $category_hierarchies;
}
