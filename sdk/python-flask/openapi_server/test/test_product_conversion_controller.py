# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.inline_response200 import InlineResponse200  # noqa: E501
from openapi_server.models.inline_response400 import InlineResponse400  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProductConversionController(BaseTestCase):
    """ProductConversionController integration test stubs"""

    def test_convert_code(self):
        """Test case for convert_code

        Convert between UPC, EAN, and ASIN product codes.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/magicCashew/barcodable/1.0.0/api/v1/convert/{upc___ean___asin}'.format(upc___ean___asin='upc___ean___asin_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
