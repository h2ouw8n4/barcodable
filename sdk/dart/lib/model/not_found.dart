part of openapi.api;

class NotFound {
  
  String message = null;
  
  int status = null;
  NotFound();

  @override
  String toString() {
    return 'NotFound[message=$message, status=$status, ]';
  }

  NotFound.fromJson(Map<String, dynamic> json) {
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

  static List<NotFound> listFromJson(List<dynamic> json) {
    return json == null ? List<NotFound>() : json.map((value) => NotFound.fromJson(value)).toList();
  }

  static Map<String, NotFound> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, NotFound>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = NotFound.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of NotFound-objects as value to a dart map
  static Map<String, List<NotFound>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<NotFound>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = NotFound.listFromJson(value);
       });
     }
     return map;
  }
}

