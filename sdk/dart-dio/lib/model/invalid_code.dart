        import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'invalid_code.g.dart';

abstract class InvalidCode implements Built<InvalidCode, InvalidCodeBuilder> {

    
        @nullable
    @BuiltValueField(wireName: r'message')
    String get message;
    
        @nullable
    @BuiltValueField(wireName: r'status')
    int get status;

    // Boilerplate code needed to wire-up generated code
    InvalidCode._();

    factory InvalidCode([updates(InvalidCodeBuilder b)]) = _$InvalidCode;
    static Serializer<InvalidCode> get serializer => _$invalidCodeSerializer;

}

