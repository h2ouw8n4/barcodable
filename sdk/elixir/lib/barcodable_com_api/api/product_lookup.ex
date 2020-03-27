# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule BarcodableComAPI.Api.ProductLookup do
  @moduledoc """
  API calls for all endpoints tagged `ProductLookup`.
  """

  alias BarcodableComAPI.Connection
  import BarcodableComAPI.RequestBuilder


  @doc """
  Find item by asin code
  Returns a single item

  ## Parameters

  - connection (BarcodableComAPI.Connection): Connection to server
  - asin (String.t): ASIN code of item to return
  - opts (KeywordList): [optional] Optional parameters
  ## Returns

  {:ok, %BarcodableComAPI.Model.Item{}} on success
  {:error, info} on failure
  """
  @spec get_item_by_asin(Tesla.Env.client, String.t, keyword()) :: {:ok, BarcodableComAPI.Model.Item.t} | {:error, Tesla.Env.t}
  def get_item_by_asin(connection, asin, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/api/v1/asin/#{asin}")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, %BarcodableComAPI.Model.Item{}},
      { 400, %BarcodableComAPI.Model.InvalidCode{}},
      { 404, %BarcodableComAPI.Model.NotFound{}}
    ])
  end

  @doc """
  Find item by UPC code
  Returns a single item

  ## Parameters

  - connection (BarcodableComAPI.Connection): Connection to server
  - ean (String.t): EAN code of item to return
  - opts (KeywordList): [optional] Optional parameters
  ## Returns

  {:ok, %BarcodableComAPI.Model.Item{}} on success
  {:error, info} on failure
  """
  @spec get_item_by_ean(Tesla.Env.client, String.t, keyword()) :: {:ok, BarcodableComAPI.Model.Item.t} | {:error, Tesla.Env.t}
  def get_item_by_ean(connection, ean, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/api/v1/ean/#{ean}")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, %BarcodableComAPI.Model.Item{}},
      { 400, %BarcodableComAPI.Model.InvalidCode{}},
      { 404, %BarcodableComAPI.Model.NotFound{}}
    ])
  end

  @doc """
  Find item by UPC code
  Returns a single item

  ## Parameters

  - connection (BarcodableComAPI.Connection): Connection to server
  - upc (String.t): UPC code of item to return
  - opts (KeywordList): [optional] Optional parameters
  ## Returns

  {:ok, %BarcodableComAPI.Model.Item{}} on success
  {:error, info} on failure
  """
  @spec get_item_by_upc(Tesla.Env.client, String.t, keyword()) :: {:ok, BarcodableComAPI.Model.Item.t} | {:error, Tesla.Env.t}
  def get_item_by_upc(connection, upc, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/api/v1/upc/#{upc}")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, %BarcodableComAPI.Model.Item{}},
      { 400, %BarcodableComAPI.Model.InvalidCode{}},
      { 404, %BarcodableComAPI.Model.NotFound{}}
    ])
  end
end
