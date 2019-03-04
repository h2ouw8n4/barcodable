# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.inline_response200 import InlineResponse200
from openapi_server.models.inline_response400 import InlineResponse400


async def test_convert_code(client):
    """Test case for convert_code

    Convert between UPC, EAN, and ASIN product codes.
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/magicCashew/barcodable/1.0.0/api/v1/convert/{upc___ean___asin}'.format(upc___ean___asin='upc___ean___asin_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

