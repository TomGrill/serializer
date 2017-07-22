package com.tomgrillgames.ncs.serializer;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleSerializerTests {

    @Test
    public void serializeDeserializeTest() {
        assertEquals(Double.MAX_VALUE, DoubleSerializer.deserialize(DoubleSerializer.serialize(Double.MAX_VALUE)));
        assertEquals(Double.MIN_VALUE, DoubleSerializer.deserialize(DoubleSerializer.serialize(Double.MIN_VALUE)));
        assertEquals(0d, DoubleSerializer.deserialize(DoubleSerializer.serialize(0d)));
        assertEquals(41230d, DoubleSerializer.deserialize(DoubleSerializer.serialize(41230d)));
        assertEquals(-41230d, DoubleSerializer.deserialize(DoubleSerializer.serialize(-41230d)));

    }

    @Test
    public void serializeDeserializeWithResultTest() {
        byte[] result = new byte[8];
        DoubleSerializer.serialize(result, Double.MAX_VALUE);
        assertEquals(Double.MAX_VALUE, DoubleSerializer.deserialize(result));
    }
}
