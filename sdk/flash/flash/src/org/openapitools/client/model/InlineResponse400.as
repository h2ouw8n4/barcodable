package org.openapitools.client.model {


    [XmlRootNode(name="InlineResponse400")]
    public class InlineResponse400 {
                [XmlElement(name="message")]
        public var message: String = null;
                [XmlElement(name="status")]
        public var status: Number = 0;

    public function toString(): String {
        var str: String = "InlineResponse400: ";
        str += " (message: " + message + ")";
        str += " (status: " + status + ")";
        return str;
    }

}

}
