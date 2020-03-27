# coding: utf-8

"""
    Barcodable.com API

    Barcodable.com API  # noqa: E501

    The version of the OpenAPI document: 1.5.0
    Contact: support@barcodable.com
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import
import re  # noqa: F401
import sys  # noqa: F401

import six  # noqa: F401
import nulltype  # noqa: F401

from openapi_client.model_utils import (  # noqa: F401
    ModelComposed,
    ModelNormal,
    ModelSimple,
    date,
    datetime,
    file_type,
    int,
    none_type,
    str,
    validate_get_composed_info,
)


class Item(ModelNormal):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Attributes:
      allowed_values (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          with a capitalized key describing the allowed value and an allowed
          value. These dicts store the allowed enum values.
      attribute_map (dict): The key is attribute name
          and the value is json key in definition.
      discriminator_value_class_map (dict): A dict to go from the discriminator
          variable value to the discriminator class name.
      validations (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          that stores validations for max_length, min_length, max_items,
          min_items, exclusive_maximum, inclusive_maximum, exclusive_minimum,
          inclusive_minimum, and regex.
      additional_properties_type (tuple): A tuple of classes accepted
          as additional properties values.
    """

    allowed_values = {
    }

    validations = {
    }

    additional_properties_type = None

    @staticmethod
    def openapi_types():
        """
        This must be a class method so a model may have properties that are
        of type self, this ensures that we don't create a cyclic import

        Returns
            openapi_types (dict): The key is attribute name
                and the value is attribute type.
        """
        return {
            'upc': (str,),  # noqa: E501
            'ean': (str,),  # noqa: E501
            'isbn': (str,),  # noqa: E501
            'asin': (str,),  # noqa: E501
            'title': (str,),  # noqa: E501
            'sku': (str,),  # noqa: E501
            'mpn': (str,),  # noqa: E501
            'part_number': (str,),  # noqa: E501
            'upcs': ([str],),  # noqa: E501
            'description': (str,),  # noqa: E501
            'brand': (str,),  # noqa: E501
            'manufacturer': (str,),  # noqa: E501
            'color': (str,),  # noqa: E501
            'new_price': (float,),  # noqa: E501
            'used_price': (float,),  # noqa: E501
            'currency_code': (str,),  # noqa: E501
            'url': (str,),  # noqa: E501
            'features': ([str],),  # noqa: E501
            'dimensions': ([bool, date, datetime, dict, float, int, list, str],),  # noqa: E501
            'images': ([str],),  # noqa: E501
            'matched_items': ([bool, date, datetime, dict, float, int, list, str],),  # noqa: E501
            'iso_country_codes': ([str],),  # noqa: E501
            'company_name': (str,),  # noqa: E501
            'company_address': (str,),  # noqa: E501
            'categories': ([str],),  # noqa: E501
            'category_hierarchies': ([str],),  # noqa: E501
        }

    @staticmethod
    def discriminator():
        return None

    attribute_map = {
        'upc': 'upc',  # noqa: E501
        'ean': 'ean',  # noqa: E501
        'isbn': 'isbn',  # noqa: E501
        'asin': 'asin',  # noqa: E501
        'title': 'title',  # noqa: E501
        'sku': 'sku',  # noqa: E501
        'mpn': 'mpn',  # noqa: E501
        'part_number': 'part_number',  # noqa: E501
        'upcs': 'upcs',  # noqa: E501
        'description': 'description',  # noqa: E501
        'brand': 'brand',  # noqa: E501
        'manufacturer': 'manufacturer',  # noqa: E501
        'color': 'color',  # noqa: E501
        'new_price': 'new_price',  # noqa: E501
        'used_price': 'used_price',  # noqa: E501
        'currency_code': 'currency_code',  # noqa: E501
        'url': 'url',  # noqa: E501
        'features': 'features',  # noqa: E501
        'dimensions': 'dimensions',  # noqa: E501
        'images': 'images',  # noqa: E501
        'matched_items': 'matched_items',  # noqa: E501
        'iso_country_codes': 'iso_country_codes',  # noqa: E501
        'company_name': 'company_name',  # noqa: E501
        'company_address': 'company_address',  # noqa: E501
        'categories': 'categories',  # noqa: E501
        'category_hierarchies': 'category_hierarchies',  # noqa: E501
    }

    @staticmethod
    def _composed_schemas():
        return None

    required_properties = set([
        '_data_store',
        '_check_type',
        '_from_server',
        '_path_to_item',
        '_configuration',
    ])

    def __init__(self, _check_type=True, _from_server=False, _path_to_item=(), _configuration=None, **kwargs):  # noqa: E501
        """item.Item - a model defined in OpenAPI

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _from_server (bool): True if the data is from the server
                                False if the data is from the client (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            upc (str): [optional]  # noqa: E501
            ean (str): [optional]  # noqa: E501
            isbn (str): [optional]  # noqa: E501
            asin (str): [optional]  # noqa: E501
            title (str): [optional]  # noqa: E501
            sku (str): [optional]  # noqa: E501
            mpn (str): [optional]  # noqa: E501
            part_number (str): [optional]  # noqa: E501
            upcs ([str]): A list of matching upc codes.. [optional]  # noqa: E501
            description (str): [optional]  # noqa: E501
            brand (str): [optional]  # noqa: E501
            manufacturer (str): [optional]  # noqa: E501
            color (str): [optional]  # noqa: E501
            new_price (float): [optional]  # noqa: E501
            used_price (float): [optional]  # noqa: E501
            currency_code (str): [optional]  # noqa: E501
            url (str): [optional]  # noqa: E501
            features ([str]): A list of product feature descriptions.. [optional]  # noqa: E501
            dimensions ([bool, date, datetime, dict, float, int, list, str]): Product dimensions and weight.  (&#39;meters&#39;, &#39;centimeters&#39;, &#39;millimeters&#39;, &#39;inches&#39;, &#39;feet&#39;, &#39;yards&#39;, &#39;ounces&#39;, &#39;pounds&#39;, &#39;grams&#39;, &#39;milligrams&#39;, &#39;kilograms&#39;). [optional]  # noqa: E501
            images ([str]): A list product images.. [optional]  # noqa: E501
            matched_items ([bool, date, datetime, dict, float, int, list, str]): Matched items for this product.. [optional]  # noqa: E501
            iso_country_codes ([str]): A list of country codes from which this item belongs.. [optional]  # noqa: E501
            company_name (str): The company name registered to the product&#39;s UPC or EAN.. [optional]  # noqa: E501
            company_address (str): The company address registered to the product&#39;s UPC or EAN.. [optional]  # noqa: E501
            categories ([str]): A list of categories for this product.. [optional]  # noqa: E501
            category_hierarchies ([str]): A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.. [optional]  # noqa: E501
        """

        self._data_store = {}
        self._check_type = _check_type
        self._from_server = _from_server
        self._path_to_item = _path_to_item
        self._configuration = _configuration

        for var_name, var_value in six.iteritems(kwargs):
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)