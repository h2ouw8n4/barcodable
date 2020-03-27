part of openapi.api;

class InlineResponse200 {
  /* A list of UPCs */
  List<String> upcs = [];
  /* A list of EANs */
  List<String> eans = [];
  /* A list of ASINs */
  List<String> asins = [];
  
  String message = null;
  InlineResponse200();

  @override
  String toString() {
    return 'InlineResponse200[upcs=$upcs, eans=$eans, asins=$asins, message=$message, ]';
  }

  InlineResponse200.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    upcs = (json['upcs'] == null) ?
      null :
      (json['upcs'] as List).cast<String>();
    eans = (json['eans'] == null) ?
      null :
      (json['eans'] as List).cast<String>();
    asins = (json['asins'] == null) ?
      null :
      (json['asins'] as List).cast<String>();
    message = json['message'];
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (upcs != null)
      json['upcs'] = upcs;
    if (eans != null)
      json['eans'] = eans;
    if (asins != null)
      json['asins'] = asins;
    if (message != null)
      json['message'] = message;
    return json;
  }

  static List<InlineResponse200> listFromJson(List<dynamic> json) {
    return json == null ? List<InlineResponse200>() : json.map((value) => InlineResponse200.fromJson(value)).toList();
  }

  static Map<String, InlineResponse200> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, InlineResponse200>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = InlineResponse200.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of InlineResponse200-objects as value to a dart map
  static Map<String, List<InlineResponse200>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<InlineResponse200>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = InlineResponse200.listFromJson(value);
       });
     }
     return map;
  }
}

