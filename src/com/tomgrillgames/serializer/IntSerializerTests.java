package com.tomgrillgames.serializer;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntSerializerTests {

    @Test
    public void serializeDeserializeTest() {
        assertEquals(Integer.MAX_VALUE, IntSerializer.deserialize(IntSerializer.serialize(Integer.MAX_VALUE)));
        assertEquals(Integer.MIN_VALUE, IntSerializer.deserialize(IntSerializer.serialize(Integer.MIN_VALUE)));
        assertEquals(0, IntSerializer.deserialize(IntSerializer.serialize(0)));
        assertEquals(41230, IntSerializer.deserialize(IntSerializer.serialize(41230)));
        assertEquals(-41230, IntSerializer.deserialize(IntSerializer.serialize(-41230)));

    }

    @Test
    public void serializeDeserializeWithResultTest() {
        byte[] result = new byte[4];
        IntSerializer.serialize(result, Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, IntSerializer.deserialize(result));
    }
}
