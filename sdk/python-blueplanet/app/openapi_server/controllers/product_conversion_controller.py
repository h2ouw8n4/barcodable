import connexion
import six

from app.openapi_server.models.inline_response200 import InlineResponse200  # noqa: E501
from app.openapi_server.models.inline_response400 import InlineResponse400  # noqa: E501
from openapi_server import util


def convert_code(upc___ean___asin):  # noqa: E501
    """Convert between UPC, EAN, and ASIN product codes.

    Returns the converted UPC, EAN, and ASIN codes. # noqa: E501

    :param upc___ean___asin: UPC, EAN, or ASIN
    :type upc___ean___asin: str

    :rtype: InlineResponse200
    """
    return 'do some magic!'
