package com.tomgrillgames.ncs.serializer;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BooleanSerializerTests {

    @Test
    public void serializeDeserializeTest() {
        assertEquals(true, BooleanSerializer.deserialize(BooleanSerializer.serialize(true)));
        assertEquals(false, BooleanSerializer.deserialize(BooleanSerializer.serialize(false)));
    }

    @Test
    public void serializeDeserializeWithResultTest() {
        byte[] result = new byte[1];
        BooleanSerializer.serialize(result, true);
        assertEquals(true, BooleanSerializer.deserialize(result));
    }
}
