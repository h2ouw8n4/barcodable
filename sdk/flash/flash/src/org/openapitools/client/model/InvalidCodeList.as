package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class InvalidCodeList implements ListWrapper {
        // This declaration below of _invalid_code_obj_class is to force flash compiler to include this class
        private var _invalidCode_obj_class: org.openapitools.client.model.InvalidCode = null;
        [XmlElements(name="invalidCode", type="org.openapitools.client.model.InvalidCode")]
        public var invalidCode: Array = new Array();

        public function getList(): Array{
            return invalidCode;
        }

}

}
