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
    if (json['upcs'] == null) {
      upcs = null;
    } else {
      upcs = (json['upcs'] as List).cast<String>();
    }
    if (json['eans'] == null) {
      eans = null;
    } else {
      eans = (json['eans'] as List).cast<String>();
    }
    if (json['asins'] == null) {
      asins = null;
    } else {
      asins = (json['asins'] as List).cast<String>();
    }
    if (json['message'] == null) {
      message = null;
    } else {
          message = json['message'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'upcs': upcs,
      'eans': eans,
      'asins': asins,
      'message': message
    };
  }

  static List<InlineResponse200> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineResponse200>() : json.map((value) => new InlineResponse200.fromJson(value)).toList();
  }

  static Map<String, InlineResponse200> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineResponse200>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineResponse200.fromJson(value));
    }
    return map;
  }
}

