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
    if (json['message'] == null) {
      message = null;
    } else {
          message = json['message'];
    }
    if (json['status'] == null) {
      status = null;
    } else {
          status = json['status'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'message': message,
      'status': status
    };
  }

  static List<InlineResponse400> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineResponse400>() : json.map((value) => new InlineResponse400.fromJson(value)).toList();
  }

  static Map<String, InlineResponse400> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineResponse400>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineResponse400.fromJson(value));
    }
    return map;
  }
}

