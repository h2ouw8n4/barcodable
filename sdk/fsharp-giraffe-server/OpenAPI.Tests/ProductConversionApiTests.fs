namespace OpenAPI.Tests

open System
open System.Net
open System.Net.Http
open System.IO
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.TestHost
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open Xunit
open System.Text
open Newtonsoft
open TestHelper
open ProductConversionApiHandlerTestsHelper
open OpenAPI.ProductConversionApiHandler
open OpenAPI.ProductConversionApiHandlerParams
open OpenAPI.Model.InlineResponse200
open OpenAPI.Model.InlineResponse400

module ProductConversionApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``ConvertCode - Convert between UPC, EAN, and ASIN product codes. returns 200 where successful operation`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/magicCashew/barcodable/1.0.0/api/v1/convert/{upc | ean | asin}".Replace("upcEanAsin", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ConvertCode - Convert between UPC, EAN, and ASIN product codes. returns 400 where search results matching criteria`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/magicCashew/barcodable/1.0.0/api/v1/convert/{upc | ean | asin}".Replace("upcEanAsin", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

