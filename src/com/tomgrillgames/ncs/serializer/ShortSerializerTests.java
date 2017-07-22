package com.tomgrillgames.ncs.serializer;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortSerializerTests {

    @Test
    public void serializeDeserializeTest() {
        assertEquals(Short.MAX_VALUE, ShortSerializer.deserialize(ShortSerializer.serialize(Short.MAX_VALUE)));
        assertEquals(Short.MIN_VALUE, ShortSerializer.deserialize(ShortSerializer.serialize(Short.MIN_VALUE)));
        short b1 = 0;
        assertEquals(b1, ShortSerializer.deserialize(ShortSerializer.serialize(b1)));

        short b2 = 4123;
        assertEquals(b2, ShortSerializer.deserialize(ShortSerializer.serialize(b2)));

        short b3 = -4123;
        assertEquals(b3, ShortSerializer.deserialize(ShortSerializer.serialize(b3)));

    }

    @Test
    public void serializeDeserializeWithResultTest() {
        byte[] result = new byte[2];
        ShortSerializer.serialize(result, Short.MAX_VALUE);
        assertEquals(Short.MAX_VALUE, ShortSerializer.deserialize(result));
    }
}
