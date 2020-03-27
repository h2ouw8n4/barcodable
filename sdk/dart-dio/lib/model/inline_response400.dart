        import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'inline_response400.g.dart';

abstract class InlineResponse400 implements Built<InlineResponse400, InlineResponse400Builder> {

    
        @nullable
    @BuiltValueField(wireName: r'message')
    String get message;
    
        @nullable
    @BuiltValueField(wireName: r'status')
    int get status;

    // Boilerplate code needed to wire-up generated code
    InlineResponse400._();

    factory InlineResponse400([updates(InlineResponse400Builder b)]) = _$InlineResponse400;
    static Serializer<InlineResponse400> get serializer => _$inlineResponse400Serializer;

}

