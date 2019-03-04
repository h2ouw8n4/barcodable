package org.openapitools.client.model {


    [XmlRootNode(name="InvalidCode")]
    public class InvalidCode {
                [XmlElement(name="message")]
        public var message: String = null;
                [XmlElement(name="status")]
        public var status: Number = 0;

    public function toString(): String {
        var str: String = "InvalidCode: ";
        str += " (message: " + message + ")";
        str += " (status: " + status + ")";
        return str;
    }

}

}
