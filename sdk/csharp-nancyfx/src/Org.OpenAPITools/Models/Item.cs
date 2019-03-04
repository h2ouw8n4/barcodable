using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.magicCashewbarcodable1_0_0.Models
{
    /// <summary>
    /// Item
    /// </summary>
    public sealed class Item:  IEquatable<Item>
    { 
        /// <summary>
        /// Upc
        /// </summary>
        public string Upc { get; private set; }

        /// <summary>
        /// Ean
        /// </summary>
        public string Ean { get; private set; }

        /// <summary>
        /// Isbn
        /// </summary>
        public string Isbn { get; private set; }

        /// <summary>
        /// Asin
        /// </summary>
        public string Asin { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// Sku
        /// </summary>
        public string Sku { get; private set; }

        /// <summary>
        /// Mpn
        /// </summary>
        public string Mpn { get; private set; }

        /// <summary>
        /// PartNumber
        /// </summary>
        public string PartNumber { get; private set; }

        /// <summary>
        /// A list of matching upc codes.
        /// </summary>
        public List<string> Upcs { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Brand
        /// </summary>
        public string Brand { get; private set; }

        /// <summary>
        /// Manufacturer
        /// </summary>
        public string Manufacturer { get; private set; }

        /// <summary>
        /// Color
        /// </summary>
        public string Color { get; private set; }

        /// <summary>
        /// NewPrice
        /// </summary>
        public decimal? NewPrice { get; private set; }

        /// <summary>
        /// UsedPrice
        /// </summary>
        public decimal? UsedPrice { get; private set; }

        /// <summary>
        /// CurrencyCode
        /// </summary>
        public string CurrencyCode { get; private set; }

        /// <summary>
        /// Url
        /// </summary>
        public string Url { get; private set; }

        /// <summary>
        /// A list of product feature descriptions.
        /// </summary>
        public List<string> Features { get; private set; }

        /// <summary>
        /// Product dimensions and weight.  (&#39;meters&#39;, &#39;centimeters&#39;, &#39;millimeters&#39;, &#39;inches&#39;, &#39;feet&#39;, &#39;yards&#39;, &#39;ounces&#39;, &#39;pounds&#39;, &#39;grams&#39;, &#39;milligrams&#39;, &#39;kilograms&#39;)
        /// </summary>
        public List<Object> Dimensions { get; private set; }

        /// <summary>
        /// A list product images.
        /// </summary>
        public List<string> Images { get; private set; }

        /// <summary>
        /// Matched items for this product.
        /// </summary>
        public List<Object> MatchedItems { get; private set; }

        /// <summary>
        /// A list of country codes from which this item belongs.
        /// </summary>
        public List<string> IsoCountryCodes { get; private set; }

        /// <summary>
        /// The company name registered to the product&#39;s UPC or EAN.
        /// </summary>
        public string CompanyName { get; private set; }

        /// <summary>
        /// The company address registered to the product&#39;s UPC or EAN.
        /// </summary>
        public string CompanyAddress { get; private set; }

        /// <summary>
        /// A list of categories for this product.
        /// </summary>
        public List<string> Categories { get; private set; }

        /// <summary>
        /// A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.
        /// </summary>
        public List<string> CategoryHierarchies { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Item.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Item()
        {
        }

        private Item(string Upc, string Ean, string Isbn, string Asin, string Title, string Sku, string Mpn, string PartNumber, List<string> Upcs, string Description, string Brand, string Manufacturer, string Color, decimal? NewPrice, decimal? UsedPrice, string CurrencyCode, string Url, List<string> Features, List<Object> Dimensions, List<string> Images, List<Object> MatchedItems, List<string> IsoCountryCodes, string CompanyName, string CompanyAddress, List<string> Categories, List<string> CategoryHierarchies)
        {
            
            this.Upc = Upc;
            
            this.Ean = Ean;
            
            this.Isbn = Isbn;
            
            this.Asin = Asin;
            
            this.Title = Title;
            
            this.Sku = Sku;
            
            this.Mpn = Mpn;
            
            this.PartNumber = PartNumber;
            
            this.Upcs = Upcs;
            
            this.Description = Description;
            
            this.Brand = Brand;
            
            this.Manufacturer = Manufacturer;
            
            this.Color = Color;
            
            this.NewPrice = NewPrice;
            
            this.UsedPrice = UsedPrice;
            
            this.CurrencyCode = CurrencyCode;
            
            this.Url = Url;
            
            this.Features = Features;
            
            this.Dimensions = Dimensions;
            
            this.Images = Images;
            
            this.MatchedItems = MatchedItems;
            
            this.IsoCountryCodes = IsoCountryCodes;
            
            this.CompanyName = CompanyName;
            
            this.CompanyAddress = CompanyAddress;
            
            this.Categories = Categories;
            
            this.CategoryHierarchies = CategoryHierarchies;
            
        }

        /// <summary>
        /// Returns builder of Item.
        /// </summary>
        /// <returns>ItemBuilder</returns>
        public static ItemBuilder Builder()
        {
            return new ItemBuilder();
        }

        /// <summary>
        /// Returns ItemBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ItemBuilder</returns>
        public ItemBuilder With()
        {
            return Builder()
                .Upc(Upc)
                .Ean(Ean)
                .Isbn(Isbn)
                .Asin(Asin)
                .Title(Title)
                .Sku(Sku)
                .Mpn(Mpn)
                .PartNumber(PartNumber)
                .Upcs(Upcs)
                .Description(Description)
                .Brand(Brand)
                .Manufacturer(Manufacturer)
                .Color(Color)
                .NewPrice(NewPrice)
                .UsedPrice(UsedPrice)
                .CurrencyCode(CurrencyCode)
                .Url(Url)
                .Features(Features)
                .Dimensions(Dimensions)
                .Images(Images)
                .MatchedItems(MatchedItems)
                .IsoCountryCodes(IsoCountryCodes)
                .CompanyName(CompanyName)
                .CompanyAddress(CompanyAddress)
                .Categories(Categories)
                .CategoryHierarchies(CategoryHierarchies);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Item other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Item.
        /// </summary>
        /// <param name="left">Compared (Item</param>
        /// <param name="right">Compared (Item</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Item left, Item right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Item.
        /// </summary>
        /// <param name="left">Compared (Item</param>
        /// <param name="right">Compared (Item</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Item left, Item right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Item.
        /// </summary>
        public sealed class ItemBuilder
        {
            private string _Upc;
            private string _Ean;
            private string _Isbn;
            private string _Asin;
            private string _Title;
            private string _Sku;
            private string _Mpn;
            private string _PartNumber;
            private List<string> _Upcs;
            private string _Description;
            private string _Brand;
            private string _Manufacturer;
            private string _Color;
            private decimal? _NewPrice;
            private decimal? _UsedPrice;
            private string _CurrencyCode;
            private string _Url;
            private List<string> _Features;
            private List<Object> _Dimensions;
            private List<string> _Images;
            private List<Object> _MatchedItems;
            private List<string> _IsoCountryCodes;
            private string _CompanyName;
            private string _CompanyAddress;
            private List<string> _Categories;
            private List<string> _CategoryHierarchies;

            internal ItemBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Item.Upc property.
            /// </summary>
            /// <param name="value">Upc</param>
            public ItemBuilder Upc(string value)
            {
                _Upc = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.Ean property.
            /// </summary>
            /// <param name="value">Ean</param>
            public ItemBuilder Ean(string value)
            {
                _Ean = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.Isbn property.
            /// </summary>
            /// <param name="value">Isbn</param>
            public ItemBuilder Isbn(string value)
            {
                _Isbn = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.Asin property.
            /// </summary>
            /// <param name="value">Asin</param>
            public ItemBuilder Asin(string value)
            {
                _Asin = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ItemBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.Sku property.
            /// </summary>
            /// <param name="value">Sku</param>
            public ItemBuilder Sku(string value)
            {
                _Sku = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.Mpn property.
            /// </summary>
            /// <param name="value">Mpn</param>
            public ItemBuilder Mpn(string value)
            {
                _Mpn = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.PartNumber property.
            /// </summary>
            /// <param name="value">PartNumber</param>
            public ItemBuilder PartNumber(string value)
            {
                _PartNumber = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.Upcs property.
            /// </summary>
            /// <param name="value">A list of matching upc codes.</param>
            public ItemBuilder Upcs(List<string> value)
            {
                _Upcs = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ItemBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.Brand property.
            /// </summary>
            /// <param name="value">Brand</param>
            public ItemBuilder Brand(string value)
            {
                _Brand = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.Manufacturer property.
            /// </summary>
            /// <param name="value">Manufacturer</param>
            public ItemBuilder Manufacturer(string value)
            {
                _Manufacturer = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.Color property.
            /// </summary>
            /// <param name="value">Color</param>
            public ItemBuilder Color(string value)
            {
                _Color = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.NewPrice property.
            /// </summary>
            /// <param name="value">NewPrice</param>
            public ItemBuilder NewPrice(decimal? value)
            {
                _NewPrice = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.UsedPrice property.
            /// </summary>
            /// <param name="value">UsedPrice</param>
            public ItemBuilder UsedPrice(decimal? value)
            {
                _UsedPrice = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.CurrencyCode property.
            /// </summary>
            /// <param name="value">CurrencyCode</param>
            public ItemBuilder CurrencyCode(string value)
            {
                _CurrencyCode = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.Url property.
            /// </summary>
            /// <param name="value">Url</param>
            public ItemBuilder Url(string value)
            {
                _Url = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.Features property.
            /// </summary>
            /// <param name="value">A list of product feature descriptions.</param>
            public ItemBuilder Features(List<string> value)
            {
                _Features = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.Dimensions property.
            /// </summary>
            /// <param name="value">Product dimensions and weight.  (&#39;meters&#39;, &#39;centimeters&#39;, &#39;millimeters&#39;, &#39;inches&#39;, &#39;feet&#39;, &#39;yards&#39;, &#39;ounces&#39;, &#39;pounds&#39;, &#39;grams&#39;, &#39;milligrams&#39;, &#39;kilograms&#39;)</param>
            public ItemBuilder Dimensions(List<Object> value)
            {
                _Dimensions = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.Images property.
            /// </summary>
            /// <param name="value">A list product images.</param>
            public ItemBuilder Images(List<string> value)
            {
                _Images = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.MatchedItems property.
            /// </summary>
            /// <param name="value">Matched items for this product.</param>
            public ItemBuilder MatchedItems(List<Object> value)
            {
                _MatchedItems = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.IsoCountryCodes property.
            /// </summary>
            /// <param name="value">A list of country codes from which this item belongs.</param>
            public ItemBuilder IsoCountryCodes(List<string> value)
            {
                _IsoCountryCodes = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.CompanyName property.
            /// </summary>
            /// <param name="value">The company name registered to the product&#39;s UPC or EAN.</param>
            public ItemBuilder CompanyName(string value)
            {
                _CompanyName = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.CompanyAddress property.
            /// </summary>
            /// <param name="value">The company address registered to the product&#39;s UPC or EAN.</param>
            public ItemBuilder CompanyAddress(string value)
            {
                _CompanyAddress = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.Categories property.
            /// </summary>
            /// <param name="value">A list of categories for this product.</param>
            public ItemBuilder Categories(List<string> value)
            {
                _Categories = value;
                return this;
            }

            /// <summary>
            /// Sets value for Item.CategoryHierarchies property.
            /// </summary>
            /// <param name="value">A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.</param>
            public ItemBuilder CategoryHierarchies(List<string> value)
            {
                _CategoryHierarchies = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Item.
            /// </summary>
            /// <returns>Item</returns>
            public Item Build()
            {
                Validate();
                return new Item(
                    Upc: _Upc,
                    Ean: _Ean,
                    Isbn: _Isbn,
                    Asin: _Asin,
                    Title: _Title,
                    Sku: _Sku,
                    Mpn: _Mpn,
                    PartNumber: _PartNumber,
                    Upcs: _Upcs,
                    Description: _Description,
                    Brand: _Brand,
                    Manufacturer: _Manufacturer,
                    Color: _Color,
                    NewPrice: _NewPrice,
                    UsedPrice: _UsedPrice,
                    CurrencyCode: _CurrencyCode,
                    Url: _Url,
                    Features: _Features,
                    Dimensions: _Dimensions,
                    Images: _Images,
                    MatchedItems: _MatchedItems,
                    IsoCountryCodes: _IsoCountryCodes,
                    CompanyName: _CompanyName,
                    CompanyAddress: _CompanyAddress,
                    Categories: _Categories,
                    CategoryHierarchies: _CategoryHierarchies
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}