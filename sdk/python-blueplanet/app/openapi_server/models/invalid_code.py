# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from openapi_server import util


class InvalidCode(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, message: str=None, status: int=None):  # noqa: E501
        """InvalidCode - a model defined in Swagger

        :param message: The message of this InvalidCode.  # noqa: E501
        :type message: str
        :param status: The status of this InvalidCode.  # noqa: E501
        :type status: int
        """
        self.swagger_types = {
            'message': str,
            'status': int
        }

        self.attribute_map = {
            'message': 'message',
            'status': 'status'
        }

        self._message = message
        self._status = status

    @classmethod
    def from_dict(cls, dikt) -> 'InvalidCode':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The invalid_code of this InvalidCode.  # noqa: E501
        :rtype: InvalidCode
        """
        return util.deserialize_model(dikt, cls)

    @property
    def message(self) -> str:
        """Gets the message of this InvalidCode.


        :return: The message of this InvalidCode.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message: str):
        """Sets the message of this InvalidCode.


        :param message: The message of this InvalidCode.
        :type message: str
        """

        self._message = message

    @property
    def status(self) -> int:
        """Gets the status of this InvalidCode.


        :return: The status of this InvalidCode.
        :rtype: int
        """
        return self._status

    @status.setter
    def status(self, status: int):
        """Sets the status of this InvalidCode.


        :param status: The status of this InvalidCode.
        :type status: int
        """

        self._status = status