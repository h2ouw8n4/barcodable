@isTest
private class OASInlineResponse400Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineResponse400 inlineResponse4001 = OASInlineResponse400.getExample();
        OASInlineResponse400 inlineResponse4002 = inlineResponse4001;
        OASInlineResponse400 inlineResponse4003 = new OASInlineResponse400();
        OASInlineResponse400 inlineResponse4004 = inlineResponse4003;

        System.assert(inlineResponse4001.equals(inlineResponse4002));
        System.assert(inlineResponse4002.equals(inlineResponse4001));
        System.assert(inlineResponse4001.equals(inlineResponse4001));
        System.assert(inlineResponse4003.equals(inlineResponse4004));
        System.assert(inlineResponse4004.equals(inlineResponse4003));
        System.assert(inlineResponse4003.equals(inlineResponse4003));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineResponse400 inlineResponse4001 = OASInlineResponse400.getExample();
        OASInlineResponse400 inlineResponse4002 = OASInlineResponse400.getExample();
        OASInlineResponse400 inlineResponse4003 = new OASInlineResponse400();
        OASInlineResponse400 inlineResponse4004 = new OASInlineResponse400();

        System.assert(inlineResponse4001.equals(inlineResponse4002));
        System.assert(inlineResponse4002.equals(inlineResponse4001));
        System.assert(inlineResponse4003.equals(inlineResponse4004));
        System.assert(inlineResponse4004.equals(inlineResponse4003));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineResponse400 inlineResponse4001 = OASInlineResponse400.getExample();
        OASInlineResponse400 inlineResponse4002 = new OASInlineResponse400();

        System.assertEquals(false, inlineResponse4001.equals('foo'));
        System.assertEquals(false, inlineResponse4002.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineResponse400 inlineResponse4001 = OASInlineResponse400.getExample();
        OASInlineResponse400 inlineResponse4002 = new OASInlineResponse400();
        OASInlineResponse400 inlineResponse4003;

        System.assertEquals(false, inlineResponse4001.equals(inlineResponse4003));
        System.assertEquals(false, inlineResponse4002.equals(inlineResponse4003));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineResponse400 inlineResponse4001 = OASInlineResponse400.getExample();
        OASInlineResponse400 inlineResponse4002 = new OASInlineResponse400();

        System.assertEquals(inlineResponse4001.hashCode(), inlineResponse4001.hashCode());
        System.assertEquals(inlineResponse4002.hashCode(), inlineResponse4002.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineResponse400 inlineResponse4001 = OASInlineResponse400.getExample();
        OASInlineResponse400 inlineResponse4002 = OASInlineResponse400.getExample();
        OASInlineResponse400 inlineResponse4003 = new OASInlineResponse400();
        OASInlineResponse400 inlineResponse4004 = new OASInlineResponse400();

        System.assert(inlineResponse4001.equals(inlineResponse4002));
        System.assert(inlineResponse4003.equals(inlineResponse4004));
        System.assertEquals(inlineResponse4001.hashCode(), inlineResponse4002.hashCode());
        System.assertEquals(inlineResponse4003.hashCode(), inlineResponse4004.hashCode());
    }
}
