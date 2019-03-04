@isTest
private class OASNotFoundTest {
    @isTest
    private static void equalsSameInstance() {
        OASNotFound notFound1 = OASNotFound.getExample();
        OASNotFound notFound2 = notFound1;
        OASNotFound notFound3 = new OASNotFound();
        OASNotFound notFound4 = notFound3;

        System.assert(notFound1.equals(notFound2));
        System.assert(notFound2.equals(notFound1));
        System.assert(notFound1.equals(notFound1));
        System.assert(notFound3.equals(notFound4));
        System.assert(notFound4.equals(notFound3));
        System.assert(notFound3.equals(notFound3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASNotFound notFound1 = OASNotFound.getExample();
        OASNotFound notFound2 = OASNotFound.getExample();
        OASNotFound notFound3 = new OASNotFound();
        OASNotFound notFound4 = new OASNotFound();

        System.assert(notFound1.equals(notFound2));
        System.assert(notFound2.equals(notFound1));
        System.assert(notFound3.equals(notFound4));
        System.assert(notFound4.equals(notFound3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASNotFound notFound1 = OASNotFound.getExample();
        OASNotFound notFound2 = new OASNotFound();

        System.assertEquals(false, notFound1.equals('foo'));
        System.assertEquals(false, notFound2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASNotFound notFound1 = OASNotFound.getExample();
        OASNotFound notFound2 = new OASNotFound();
        OASNotFound notFound3;

        System.assertEquals(false, notFound1.equals(notFound3));
        System.assertEquals(false, notFound2.equals(notFound3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASNotFound notFound1 = OASNotFound.getExample();
        OASNotFound notFound2 = new OASNotFound();

        System.assertEquals(notFound1.hashCode(), notFound1.hashCode());
        System.assertEquals(notFound2.hashCode(), notFound2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASNotFound notFound1 = OASNotFound.getExample();
        OASNotFound notFound2 = OASNotFound.getExample();
        OASNotFound notFound3 = new OASNotFound();
        OASNotFound notFound4 = new OASNotFound();

        System.assert(notFound1.equals(notFound2));
        System.assert(notFound3.equals(notFound4));
        System.assertEquals(notFound1.hashCode(), notFound2.hashCode());
        System.assertEquals(notFound3.hashCode(), notFound4.hashCode());
    }
}
