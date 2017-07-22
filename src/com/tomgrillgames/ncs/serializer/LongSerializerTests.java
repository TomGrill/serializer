package com.tomgrillgames.ncs.serializer;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongSerializerTests {

    @Test
    public void serializeDeserializeTest() {
        assertEquals(Long.MAX_VALUE, LongSerializer.deserialize(LongSerializer.serialize(Long.MAX_VALUE)));
        assertEquals(Long.MIN_VALUE, LongSerializer.deserialize(LongSerializer.serialize(Long.MIN_VALUE)));
        assertEquals(0L, LongSerializer.deserialize(LongSerializer.serialize(0L)));
        assertEquals(412303333333L, LongSerializer.deserialize(LongSerializer.serialize(412303333333L)));
        assertEquals(-41230L, LongSerializer.deserialize(LongSerializer.serialize(-41230L)));

    }

    @Test
    public void serializeDeserializeWithResultTest() {
        byte[] result = new byte[8];
        LongSerializer.serialize(result, Long.MAX_VALUE);
        assertEquals(Long.MAX_VALUE, LongSerializer.deserialize(result));
    }
}
