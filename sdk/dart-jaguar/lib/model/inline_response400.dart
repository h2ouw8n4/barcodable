import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'inline_response400.jser.dart';

class InlineResponse400 {
  
  @Alias('message', isNullable: false,  )
  final String message;
  
  @Alias('status', isNullable: false,  )
  final int status;
  

  InlineResponse400(
      

{
     this.message = null,  
     this.status = null 
    
    }
  );

  @override
  String toString() {
    return 'InlineResponse400[message=$message, status=$status, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineResponse400Serializer extends Serializer<InlineResponse400> with _$InlineResponse400Serializer {

}

