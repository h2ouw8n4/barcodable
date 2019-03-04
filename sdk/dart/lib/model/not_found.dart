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

  static List<NotFound> listFromJson(List<dynamic> json) {
    return json == null ? new List<NotFound>() : json.map((value) => new NotFound.fromJson(value)).toList();
  }

  static Map<String, NotFound> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, NotFound>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new NotFound.fromJson(value));
    }
    return map;
  }
}

