# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.invalid_code import InvalidCode  # noqa: E501
from openapi_server.models.item import Item  # noqa: E501
from openapi_server.models.not_found import NotFound  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProductLookupController(BaseTestCase):
    """ProductLookupController integration test stubs"""

    def test_get_item_by_asin(self):
        """Test case for get_item_by_asin

        Find item by asin code
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/mindviser/barcodable/1.0.0/api/v1/asin/{asin}'.format(asin='asin_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_item_by_ean(self):
        """Test case for get_item_by_ean

        Find item by UPC code
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/mindviser/barcodable/1.0.0/api/v1/ean/{ean}'.format(ean='ean_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_item_by_upc(self):
        """Test case for get_item_by_upc

        Find item by UPC code
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/mindviser/barcodable/1.0.0/api/v1/upc/{upc}'.format(upc='upc_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
