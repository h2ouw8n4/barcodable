package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.Object;

    public class ItemList implements ListWrapper {
        // This declaration below of _item_obj_class is to force flash compiler to include this class
        private var _item_obj_class: org.openapitools.client.model.Item = null;
        [XmlElements(name="item", type="org.openapitools.client.model.Item")]
        public var item: Array = new Array();

        public function getList(): Array{
            return item;
        }

}

}
