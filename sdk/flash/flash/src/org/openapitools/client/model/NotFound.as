package org.openapitools.client.model {


    [XmlRootNode(name="NotFound")]
    public class NotFound {
                [XmlElement(name="message")]
        public var message: String = null;
                [XmlElement(name="status")]
        public var status: Number = 0;

    public function toString(): String {
        var str: String = "NotFound: ";
        str += " (message: " + message + ")";
        str += " (status: " + status + ")";
        return str;
    }

}

}
