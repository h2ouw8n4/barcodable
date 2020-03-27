library serializers;

import 'package:built_value/serializer.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/standard_json_plugin.dart';

import 'package:openapi/model/inline_response200.dart';
import 'package:openapi/model/inline_response400.dart';
import 'package:openapi/model/invalid_code.dart';
import 'package:openapi/model/item.dart';
import 'package:openapi/model/not_found.dart';


part 'serializers.g.dart';

@SerializersFor(const [
InlineResponse200,
InlineResponse400,
InvalidCode,
Item,
NotFound,

])

//allow all models to be serialized within a list
Serializers serializers = (_$serializers.toBuilder()
..addBuilderFactory(
const FullType(BuiltList, const [const FullType(InlineResponse200)]),
() => new ListBuilder<InlineResponse200>())
..addBuilderFactory(
const FullType(BuiltList, const [const FullType(InlineResponse400)]),
() => new ListBuilder<InlineResponse400>())
..addBuilderFactory(
const FullType(BuiltList, const [const FullType(InvalidCode)]),
() => new ListBuilder<InvalidCode>())
..addBuilderFactory(
const FullType(BuiltList, const [const FullType(Item)]),
() => new ListBuilder<Item>())
..addBuilderFactory(
const FullType(BuiltList, const [const FullType(NotFound)]),
() => new ListBuilder<NotFound>())

).build();

Serializers standardSerializers =
(serializers.toBuilder()
..addPlugin(StandardJsonPlugin())).build();
