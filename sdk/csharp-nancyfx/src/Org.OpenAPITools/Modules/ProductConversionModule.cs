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
    /// Module processing requests of ProductConversion domain.
    /// </summary>
    public sealed class ProductConversionModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public ProductConversionModule(ProductConversionService service) : base("/mindviser/barcodable/1.0.0")
        { 
            Get["/api/v1/convert/{upc | ean | asin}"] = parameters =>
            {
                var upcEanAsin = Parameters.ValueOf<string>(parameters, Context.Request, "upcEanAsin", ParameterType.Path);
                Preconditions.IsNotNull(upcEanAsin, "Required parameter: 'upcEanAsin' is missing at 'ConvertCode'");
                
                return service.ConvertCode(Context, upcEanAsin);
            };
        }
    }

    /// <summary>
    /// Service handling ProductConversion requests.
    /// </summary>
    public interface ProductConversionService
    {
        /// <summary>
        /// Returns the converted UPC, EAN, and ASIN codes.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="upcEanAsin">UPC, EAN, or ASIN</param>
        /// <returns>InlineResponse200</returns>
        InlineResponse200 ConvertCode(NancyContext context, string upcEanAsin);
    }

    /// <summary>
    /// Abstraction of ProductConversionService.
    /// </summary>
    public abstract class AbstractProductConversionService: ProductConversionService
    {
        public virtual InlineResponse200 ConvertCode(NancyContext context, string upcEanAsin)
        {
            return ConvertCode(upcEanAsin);
        }

        protected abstract InlineResponse200 ConvertCode(string upcEanAsin);
    }

}
