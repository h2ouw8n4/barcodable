using System;
using Nancy;
using Nancy.ModelBinding;
using System.Collections.Generic;
using Sharpility.Base;
using Org.OpenAPITools.mindviserbarcodable1_0_0.Models;
using Org.OpenAPITools.mindviserbarcodable1_0_0.Utils;
using NodaTime;

namespace Org.OpenAPITools.mindviserbarcodable1_0_0.Modules
{ 

    /// <summary>
    /// Module processing requests of ProductLookup domain.
    /// </summary>
    public sealed class ProductLookupModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public ProductLookupModule(ProductLookupService service) : base("/mindviser/barcodable/1.0.0")
        { 
            Get["/api/v1/asin/{asin}"] = parameters =>
            {
                var asin = Parameters.ValueOf<string>(parameters, Context.Request, "asin", ParameterType.Path);
                Preconditions.IsNotNull(asin, "Required parameter: 'asin' is missing at 'GetItemByASIN'");
                
                return service.GetItemByASIN(Context, asin);
            };

            Get["/api/v1/ean/{ean}"] = parameters =>
            {
                var ean = Parameters.ValueOf<string>(parameters, Context.Request, "ean", ParameterType.Path);
                Preconditions.IsNotNull(ean, "Required parameter: 'ean' is missing at 'GetItemByEAN'");
                
                return service.GetItemByEAN(Context, ean);
            };

            Get["/api/v1/upc/{upc}"] = parameters =>
            {
                var upc = Parameters.ValueOf<string>(parameters, Context.Request, "upc", ParameterType.Path);
                Preconditions.IsNotNull(upc, "Required parameter: 'upc' is missing at 'GetItemByUPC'");
                
                return service.GetItemByUPC(Context, upc);
            };
        }
    }

    /// <summary>
    /// Service handling ProductLookup requests.
    /// </summary>
    public interface ProductLookupService
    {
        /// <summary>
        /// Returns a single item
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="asin">ASIN code of item to return</param>
        /// <returns>Item</returns>
        Item GetItemByASIN(NancyContext context, string asin);

        /// <summary>
        /// Returns a single item
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="ean">EAN code of item to return</param>
        /// <returns>Item</returns>
        Item GetItemByEAN(NancyContext context, string ean);

        /// <summary>
        /// Returns a single item
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="upc">UPC code of item to return</param>
        /// <returns>Item</returns>
        Item GetItemByUPC(NancyContext context, string upc);
    }

    /// <summary>
    /// Abstraction of ProductLookupService.
    /// </summary>
    public abstract class AbstractProductLookupService: ProductLookupService
    {
        public virtual Item GetItemByASIN(NancyContext context, string asin)
        {
            return GetItemByASIN(asin);
        }

        public virtual Item GetItemByEAN(NancyContext context, string ean)
        {
            return GetItemByEAN(ean);
        }

        public virtual Item GetItemByUPC(NancyContext context, string upc)
        {
            return GetItemByUPC(upc);
        }

        protected abstract Item GetItemByASIN(string asin);

        protected abstract Item GetItemByEAN(string ean);

        protected abstract Item GetItemByUPC(string upc);
    }

}
