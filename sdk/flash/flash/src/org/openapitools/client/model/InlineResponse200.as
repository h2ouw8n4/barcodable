package org.openapitools.client.model {


    [XmlRootNode(name="InlineResponse200")]
    public class InlineResponse200 {
        /* A list of UPCs */
        // This declaration below of _upcs_obj_class is to force flash compiler to include this class
        private var _upcs_obj_class: Array = null;
        [XmlElementWrapper(name="upcs")]
        [XmlElements(name="upcs", type="Array")]
                public var upcs: Array = new Array();
        /* A list of EANs */
        // This declaration below of _eans_obj_class is to force flash compiler to include this class
        private var _eans_obj_class: Array = null;
        [XmlElementWrapper(name="eans")]
        [XmlElements(name="eans", type="Array")]
                public var eans: Array = new Array();
        /* A list of ASINs */
        // This declaration below of _asins_obj_class is to force flash compiler to include this class
        private var _asins_obj_class: Array = null;
        [XmlElementWrapper(name="asins")]
        [XmlElements(name="asins", type="Array")]
                public var asins: Array = new Array();
                [XmlElement(name="message")]
        public var message: String = null;

    public function toString(): String {
        var str: String = "InlineResponse200: ";
        str += " (upcs: " + upcs + ")";
        str += " (eans: " + eans + ")";
        str += " (asins: " + asins + ")";
        str += " (message: " + message + ")";
        return str;
    }

}

}
