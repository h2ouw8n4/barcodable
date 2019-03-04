=begin comment

Barcodable.com API

Barcodable.com API

OpenAPI spec version: 1.5.0
Contact: support@barcodable.com
Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator
# Please update the test cases below to test the API endpoints.
# Ref: https://openapi-generator.tech
#
use Test::More tests => 1; #TODO update number of test cases
use Test::Exception;

use lib 'lib';
use strict;
use warnings;

use_ok('WWW::OpenAPIClient::ProductConversionApi');

my $api = WWW::OpenAPIClient::ProductConversionApi->new();
isa_ok($api, 'WWW::OpenAPIClient::ProductConversionApi');

#
# convert_code test
#
{
    my $upc_|_ean_|_asin = undef; # replace NULL with a proper value
    my $result = $api->convert_code(upc_|_ean_|_asin => $upc_|_ean_|_asin);
}


1;
