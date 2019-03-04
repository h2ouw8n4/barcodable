import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'invalid_code.jser.dart';

class InvalidCode {
  
  @Alias('message')
  final String message;
  
  @Alias('status')
  final int status;
  

  InvalidCode(
      

{
     this.message = null,  
     this.status = null 
    
    }
  );

  @override
  String toString() {
    return 'InvalidCode[message=$message, status=$status, ]';
  }
}

@GenSerializer(nullableFields: true)
class InvalidCodeSerializer extends Serializer<InvalidCode> with _$InvalidCodeSerializer {

}
