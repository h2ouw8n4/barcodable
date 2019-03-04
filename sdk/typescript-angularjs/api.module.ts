import * as api from './api/api';
import * as angular from 'angular';

const apiModule = angular.module('api', [])
.service('ProductConversionApi', api.ProductConversionApi)
.service('ProductLookupApi', api.ProductLookupApi)

export default apiModule;
