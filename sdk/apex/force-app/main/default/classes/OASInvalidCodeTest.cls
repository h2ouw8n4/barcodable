@isTest
private class OASInvalidCodeTest {
    @isTest
    private static void equalsSameInstance() {
        OASInvalidCode invalidCode1 = OASInvalidCode.getExample();
        OASInvalidCode invalidCode2 = invalidCode1;
        OASInvalidCode invalidCode3 = new OASInvalidCode();
        OASInvalidCode invalidCode4 = invalidCode3;

        System.assert(invalidCode1.equals(invalidCode2));
        System.assert(invalidCode2.equals(invalidCode1));
        System.assert(invalidCode1.equals(invalidCode1));
        System.assert(invalidCode3.equals(invalidCode4));
        System.assert(invalidCode4.equals(invalidCode3));
        System.assert(invalidCode3.equals(invalidCode3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInvalidCode invalidCode1 = OASInvalidCode.getExample();
        OASInvalidCode invalidCode2 = OASInvalidCode.getExample();
        OASInvalidCode invalidCode3 = new OASInvalidCode();
        OASInvalidCode invalidCode4 = new OASInvalidCode();

        System.assert(invalidCode1.equals(invalidCode2));
        System.assert(invalidCode2.equals(invalidCode1));
        System.assert(invalidCode3.equals(invalidCode4));
        System.assert(invalidCode4.equals(invalidCode3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInvalidCode invalidCode1 = OASInvalidCode.getExample();
        OASInvalidCode invalidCode2 = new OASInvalidCode();

        System.assertEquals(false, invalidCode1.equals('foo'));
        System.assertEquals(false, invalidCode2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInvalidCode invalidCode1 = OASInvalidCode.getExample();
        OASInvalidCode invalidCode2 = new OASInvalidCode();
        OASInvalidCode invalidCode3;

        System.assertEquals(false, invalidCode1.equals(invalidCode3));
        System.assertEquals(false, invalidCode2.equals(invalidCode3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInvalidCode invalidCode1 = OASInvalidCode.getExample();
        OASInvalidCode invalidCode2 = new OASInvalidCode();

        System.assertEquals(invalidCode1.hashCode(), invalidCode1.hashCode());
        System.assertEquals(invalidCode2.hashCode(), invalidCode2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInvalidCode invalidCode1 = OASInvalidCode.getExample();
        OASInvalidCode invalidCode2 = OASInvalidCode.getExample();
        OASInvalidCode invalidCode3 = new OASInvalidCode();
        OASInvalidCode invalidCode4 = new OASInvalidCode();

        System.assert(invalidCode1.equals(invalidCode2));
        System.assert(invalidCode3.equals(invalidCode4));
        System.assertEquals(invalidCode1.hashCode(), invalidCode2.hashCode());
        System.assertEquals(invalidCode3.hashCode(), invalidCode4.hashCode());
    }
}
