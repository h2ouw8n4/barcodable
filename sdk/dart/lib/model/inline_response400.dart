part of openapi.api;

class InlineResponse400 {
  
  String message = null;
  
  int status = null;
  InlineResponse400();

  @override
  String toString() {
    return 'InlineResponse400[message=$message, status=$status, ]';
  }

  InlineResponse400.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    message = json['message'];
    status = json['status'];
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (message != null)
      json['message'] = message;
    if (status != null)
      json['status'] = status;
    return json;
  }

  static List<InlineResponse400> listFromJson(List<dynamic> json) {
    return json == null ? List<InlineResponse400>() : json.map((value) => InlineResponse400.fromJson(value)).toList();
  }

  static Map<String, InlineResponse400> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, InlineResponse400>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = InlineResponse400.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of InlineResponse400-objects as value to a dart map
  static Map<String, List<InlineResponse400>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<InlineResponse400>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = InlineResponse400.listFromJson(value);
       });
     }
     return map;
  }
}

