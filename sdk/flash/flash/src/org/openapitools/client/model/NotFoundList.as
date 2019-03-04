package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class NotFoundList implements ListWrapper {
        // This declaration below of _not_found_obj_class is to force flash compiler to include this class
        private var _notFound_obj_class: org.openapitools.client.model.NotFound = null;
        [XmlElements(name="notFound", type="org.openapitools.client.model.NotFound")]
        public var notFound: Array = new Array();

        public function getList(): Array{
            return notFound;
        }

}

}
