package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class InlineResponse400List implements ListWrapper {
        // This declaration below of _inline_response_400_obj_class is to force flash compiler to include this class
        private var _inlineResponse400_obj_class: org.openapitools.client.model.InlineResponse400 = null;
        [XmlElements(name="inlineResponse400", type="org.openapitools.client.model.InlineResponse400")]
        public var inlineResponse400: Array = new Array();

        public function getList(): Array{
            return inlineResponse400;
        }

}

}
