from typing import List, Dict
from aiohttp import web

from openapi_server.models.inline_response200 import InlineResponse200
from openapi_server.models.inline_response400 import InlineResponse400
from openapi_server import util


async def convert_code(request: web.Request, upc___ean___asin) -> web.Response:
    """Convert between UPC, EAN, and ASIN product codes.

    Returns the converted UPC, EAN, and ASIN codes.

    :param upc___ean___asin: UPC, EAN, or ASIN
    :type upc___ean___asin: str

    """
    return web.Response(status=200)
