<?php
/**
 * Item
 */
namespace app\Models;

/**
 * Item
 */
class Item {

    /** @var string $upc */
    private $upc;

    /** @var string $ean */
    private $ean;

    /** @var string $isbn */
    private $isbn;

    /** @var string $asin */
    private $asin;

    /** @var string $title */
    private $title;

    /** @var string $sku */
    private $sku;

    /** @var string $mpn */
    private $mpn;

    /** @var string $partNumber */
    private $partNumber;

    /** @var string[] $upcs A list of matching upc codes.*/
    private $upcs;

    /** @var string $description */
    private $description;

    /** @var string $brand */
    private $brand;

    /** @var string $manufacturer */
    private $manufacturer;

    /** @var string $color */
    private $color;

    /** @var float $newPrice */
    private $newPrice;

    /** @var float $usedPrice */
    private $usedPrice;

    /** @var string $currencyCode */
    private $currencyCode;

    /** @var string $url */
    private $url;

    /** @var string[] $features A list of product feature descriptions.*/
    private $features;

    /** @var object[] $dimensions Product dimensions and weight.  (&#39;meters&#39;, &#39;centimeters&#39;, &#39;millimeters&#39;, &#39;inches&#39;, &#39;feet&#39;, &#39;yards&#39;, &#39;ounces&#39;, &#39;pounds&#39;, &#39;grams&#39;, &#39;milligrams&#39;, &#39;kilograms&#39;)*/
    private $dimensions;

    /** @var string[] $images A list product images.*/
    private $images;

    /** @var object[] $matchedItems Matched items for this product.*/
    private $matchedItems;

    /** @var string[] $isoCountryCodes A list of country codes from which this item belongs.*/
    private $isoCountryCodes;

    /** @var string $companyName The company name registered to the product&#39;s UPC or EAN.*/
    private $companyName;

    /** @var string $companyAddress The company address registered to the product&#39;s UPC or EAN.*/
    private $companyAddress;

    /** @var string[] $categories A list of categories for this product.*/
    private $categories;

    /** @var string[] $categoryHierarchies A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.*/
    private $categoryHierarchies;

}
