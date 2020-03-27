import connexion
import six

from app.openapi_server.models.invalid_code import InvalidCode  # noqa: E501
from app.openapi_server.models.item import Item  # noqa: E501
from app.openapi_server.models.not_found import NotFound  # noqa: E501
from openapi_server import util


def get_item_by_asin(asin):  # noqa: E501
    """Find item by asin code

    Returns a single item # noqa: E501

    :param asin: ASIN code of item to return
    :type asin: str

    :rtype: Item
    """
    return 'do some magic!'


def get_item_by_ean(ean):  # noqa: E501
    """Find item by UPC code

    Returns a single item # noqa: E501

    :param ean: EAN code of item to return
    :type ean: str

    :rtype: Item
    """
    return 'do some magic!'


def get_item_by_upc(upc):  # noqa: E501
    """Find item by UPC code

    Returns a single item # noqa: E501

    :param upc: UPC code of item to return
    :type upc: str

    :rtype: Item
    """
    return 'do some magic!'
