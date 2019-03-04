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

  static List<InvalidCode> listFromJson(List<dynamic> json) {
    return json == null ? new List<InvalidCode>() : json.map((value) => new InvalidCode.fromJson(value)).toList();
  }

  static Map<String, InvalidCode> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InvalidCode>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InvalidCode.fromJson(value));
    }
    return map;
  }
}

