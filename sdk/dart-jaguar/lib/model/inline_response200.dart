import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'inline_response200.jser.dart';

class InlineResponse200 {
   /* A list of UPCs */
  @Alias('upcs')
  final List<String> upcs;
   /* A list of EANs */
  @Alias('eans')
  final List<String> eans;
   /* A list of ASINs */
  @Alias('asins')
  final List<String> asins;
  
  @Alias('message')
  final String message;
  

  InlineResponse200(
      

{
     this.upcs = const [],  
     this.eans = const [],  
     this.asins = const [],  
     this.message = null 
    
    }
  );

  @override
  String toString() {
    return 'InlineResponse200[upcs=$upcs, eans=$eans, asins=$asins, message=$message, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineResponse200Serializer extends Serializer<InlineResponse200> with _$InlineResponse200Serializer {

}
