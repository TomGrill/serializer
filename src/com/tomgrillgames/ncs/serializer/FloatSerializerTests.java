package com.tomgrillgames.ncs.serializer;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FloatSerializerTests {

    @Test
    public void serializeDeserializeTest() {
        assertEquals(Float.MAX_VALUE, FloatSerializer.deserialize(FloatSerializer.serialize(Float.MAX_VALUE)));
        assertEquals(Float.MIN_VALUE, FloatSerializer.deserialize(FloatSerializer.serialize(Float.MIN_VALUE)));
        assertEquals(0f, FloatSerializer.deserialize(FloatSerializer.serialize(0f)));
        assertEquals(41230f, FloatSerializer.deserialize(FloatSerializer.serialize(41230f)));
        assertEquals(-41230f, FloatSerializer.deserialize(FloatSerializer.serialize(-41230f)));

    }

    @Test
    public void serializeDeserializeWithResultTest() {
        byte[] result = new byte[4];
        FloatSerializer.serialize(result, Float.MAX_VALUE);
        assertEquals(Float.MAX_VALUE, FloatSerializer.deserialize(result));
    }
}
