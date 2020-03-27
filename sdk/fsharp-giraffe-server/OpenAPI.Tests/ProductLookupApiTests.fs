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
open ProductLookupApiHandlerTestsHelper
open OpenAPI.ProductLookupApiHandler
open OpenAPI.ProductLookupApiHandlerParams
open OpenAPI.Model.InvalidCode
open OpenAPI.Model.Item
open OpenAPI.Model.NotFound

module ProductLookupApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``GetItemByASIN - Find item by asin code returns 200 where successful operation`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/magicCashew/barcodable/1.0.0/api/v1/asin/{asin}".Replace("asin", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetItemByASIN - Find item by asin code returns 400 where search results matching criteria`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/magicCashew/barcodable/1.0.0/api/v1/asin/{asin}".Replace("asin", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetItemByASIN - Find item by asin code returns 404 where search results matching criteria`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/magicCashew/barcodable/1.0.0/api/v1/asin/{asin}".Replace("asin", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetItemByEAN - Find item by UPC code returns 200 where successful operation`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/magicCashew/barcodable/1.0.0/api/v1/ean/{ean}".Replace("ean", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetItemByEAN - Find item by UPC code returns 400 where search results matching criteria`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/magicCashew/barcodable/1.0.0/api/v1/ean/{ean}".Replace("ean", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetItemByEAN - Find item by UPC code returns 404 where search results matching criteria`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/magicCashew/barcodable/1.0.0/api/v1/ean/{ean}".Replace("ean", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetItemByUPC - Find item by UPC code returns 200 where successful operation`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/magicCashew/barcodable/1.0.0/api/v1/upc/{upc}".Replace("upc", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetItemByUPC - Find item by UPC code returns 400 where search results matching criteria`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/magicCashew/barcodable/1.0.0/api/v1/upc/{upc}".Replace("upc", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetItemByUPC - Find item by UPC code returns 404 where search results matching criteria`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/magicCashew/barcodable/1.0.0/api/v1/upc/{upc}".Replace("upc", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

