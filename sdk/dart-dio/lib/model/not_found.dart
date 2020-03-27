        import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'not_found.g.dart';

abstract class NotFound implements Built<NotFound, NotFoundBuilder> {

    
        @nullable
    @BuiltValueField(wireName: r'message')
    String get message;
    
        @nullable
    @BuiltValueField(wireName: r'status')
    int get status;

    // Boilerplate code needed to wire-up generated code
    NotFound._();

    factory NotFound([updates(NotFoundBuilder b)]) = _$NotFound;
    static Serializer<NotFound> get serializer => _$notFoundSerializer;

}

