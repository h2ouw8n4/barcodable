<?php
require_once __DIR__ . '/vendor/autoload.php';

use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Silex\Application;

$app = new Silex\Application();


$app->GET('/magicCashew/barcodable/1.0.0/api/v1/convert/{upc | ean | asin}', function(Application $app, Request $request, $upc | ean | asin) {
            return new Response('How about implementing convertCode as a GET method ?');
            });


$app->GET('/magicCashew/barcodable/1.0.0/api/v1/asin/{asin}', function(Application $app, Request $request, $asin) {
            return new Response('How about implementing getItemByASIN as a GET method ?');
            });


$app->GET('/magicCashew/barcodable/1.0.0/api/v1/ean/{ean}', function(Application $app, Request $request, $ean) {
            return new Response('How about implementing getItemByEAN as a GET method ?');
            });


$app->GET('/magicCashew/barcodable/1.0.0/api/v1/upc/{upc}', function(Application $app, Request $request, $upc) {
            return new Response('How about implementing getItemByUPC as a GET method ?');
            });


$app->run();
