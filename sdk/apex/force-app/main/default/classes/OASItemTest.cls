@isTest
private class OASItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASItem item1 = OASItem.getExample();
        OASItem item2 = item1;
        OASItem item3 = new OASItem();
        OASItem item4 = item3;

        System.assert(item1.equals(item2));
        System.assert(item2.equals(item1));
        System.assert(item1.equals(item1));
        System.assert(item3.equals(item4));
        System.assert(item4.equals(item3));
        System.assert(item3.equals(item3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItem item1 = OASItem.getExample();
        OASItem item2 = OASItem.getExample();
        OASItem item3 = new OASItem();
        OASItem item4 = new OASItem();

        System.assert(item1.equals(item2));
        System.assert(item2.equals(item1));
        System.assert(item3.equals(item4));
        System.assert(item4.equals(item3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItem item1 = OASItem.getExample();
        OASItem item2 = new OASItem();

        System.assertEquals(false, item1.equals('foo'));
        System.assertEquals(false, item2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItem item1 = OASItem.getExample();
        OASItem item2 = new OASItem();
        OASItem item3;

        System.assertEquals(false, item1.equals(item3));
        System.assertEquals(false, item2.equals(item3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItem item1 = OASItem.getExample();
        OASItem item2 = new OASItem();

        System.assertEquals(item1.hashCode(), item1.hashCode());
        System.assertEquals(item2.hashCode(), item2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItem item1 = OASItem.getExample();
        OASItem item2 = OASItem.getExample();
        OASItem item3 = new OASItem();
        OASItem item4 = new OASItem();

        System.assert(item1.equals(item2));
        System.assert(item3.equals(item4));
        System.assertEquals(item1.hashCode(), item2.hashCode());
        System.assertEquals(item3.hashCode(), item4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItem item = new OASItem();
        Map<String, String> propertyMappings = item.getPropertyMappings();
        System.assertEquals('partNumber', propertyMappings.get('part_number'));
        System.assertEquals('newPrice', propertyMappings.get('new_price'));
        System.assertEquals('usedPrice', propertyMappings.get('used_price'));
        System.assertEquals('currencyCode', propertyMappings.get('currency_code'));
        System.assertEquals('matchedItems', propertyMappings.get('matched_items'));
        System.assertEquals('isoCountryCodes', propertyMappings.get('iso_country_codes'));
        System.assertEquals('companyName', propertyMappings.get('company_name'));
        System.assertEquals('companyAddress', propertyMappings.get('company_address'));
        System.assertEquals('categoryHierarchies', propertyMappings.get('category_hierarchies'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASItem item = new OASItem();
        System.assertEquals(new List<String>(), item.upcs);
        System.assertEquals(new List<String>(), item.features);
        System.assertEquals(new List<Object>(), item.dimensions);
        System.assertEquals(new List<String>(), item.images);
        System.assertEquals(new List<Object>(), item.matchedItems);
        System.assertEquals(new List<String>(), item.isoCountryCodes);
        System.assertEquals(new List<String>(), item.categories);
        System.assertEquals(new List<String>(), item.categoryHierarchies);
        System.assertEquals(null, item.upc);
        System.assertEquals(null, item.ean);
        System.assertEquals(null, item.isbn);
        System.assertEquals(null, item.asin);
        System.assertEquals(null, item.title);
        System.assertEquals(null, item.sku);
        System.assertEquals(null, item.mpn);
        System.assertEquals(null, item.partNumber);
        System.assertEquals(null, item.description);
        System.assertEquals(null, item.brand);
        System.assertEquals(null, item.manufacturer);
        System.assertEquals(null, item.color);
        System.assertEquals(null, item.newPrice);
        System.assertEquals(null, item.usedPrice);
        System.assertEquals(null, item.currencyCode);
        System.assertEquals(null, item.url);
        System.assertEquals(null, item.companyName);
        System.assertEquals(null, item.companyAddress);
    }
}
