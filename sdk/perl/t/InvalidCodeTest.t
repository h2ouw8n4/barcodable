=begin comment

Barcodable.com API

Barcodable.com API

The version of the OpenAPI document: 1.5.0
Contact: support@barcodable.com
Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by the OpenAPI Generator
# Please update the test cases below to test the model.
# Ref: https://openapi-generator.tech
#
use Test::More tests => 2;
use Test::Exception;

use lib 'lib';
use strict;
use warnings;


use_ok('WWW::OpenAPIClient::Object::InvalidCode');

my $instance = WWW::OpenAPIClient::Object::InvalidCode->new();

isa_ok($instance, 'WWW::OpenAPIClient::Object::InvalidCode');

