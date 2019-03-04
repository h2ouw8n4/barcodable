# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.invalid_code import InvalidCode
from openapi_server.models.item import Item
from openapi_server.models.not_found import NotFound


async def test_get_item_by_asin(client):
    """Test case for get_item_by_asin

    Find item by asin code
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/magicCashew/barcodable/1.0.0/api/v1/asin/{asin}'.format(asin='asin_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_item_by_ean(client):
    """Test case for get_item_by_ean

    Find item by UPC code
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/magicCashew/barcodable/1.0.0/api/v1/ean/{ean}'.format(ean='ean_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_item_by_upc(client):
    """Test case for get_item_by_upc

    Find item by UPC code
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/magicCashew/barcodable/1.0.0/api/v1/upc/{upc}'.format(upc='upc_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

