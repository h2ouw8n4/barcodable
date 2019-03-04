from typing import List, Dict
from aiohttp import web

from openapi_server.models.invalid_code import InvalidCode
from openapi_server.models.item import Item
from openapi_server.models.not_found import NotFound
from openapi_server import util


async def get_item_by_asin(request: web.Request, asin) -> web.Response:
    """Find item by asin code

    Returns a single item

    :param asin: ASIN code of item to return
    :type asin: str

    """
    return web.Response(status=200)


async def get_item_by_ean(request: web.Request, ean) -> web.Response:
    """Find item by UPC code

    Returns a single item

    :param ean: EAN code of item to return
    :type ean: str

    """
    return web.Response(status=200)


async def get_item_by_upc(request: web.Request, upc) -> web.Response:
    """Find item by UPC code

    Returns a single item

    :param upc: UPC code of item to return
    :type upc: str

    """
    return web.Response(status=200)
