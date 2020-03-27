part of openapi.api;

class InvalidCode {
  
  String message = null;
  
  int status = null;
  InvalidCode();

  @override
  String toString() {
    return 'InvalidCode[message=$message, status=$status, ]';
  }

  InvalidCode.fromJson(Map<String, dynamic> json) {
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

  static List<InvalidCode> listFromJson(List<dynamic> json) {
    return json == null ? List<InvalidCode>() : json.map((value) => InvalidCode.fromJson(value)).toList();
  }

  static Map<String, InvalidCode> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, InvalidCode>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = InvalidCode.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of InvalidCode-objects as value to a dart map
  static Map<String, List<InvalidCode>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<InvalidCode>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = InvalidCode.listFromJson(value);
       });
     }
     return map;
  }
}

