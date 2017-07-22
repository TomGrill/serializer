package com.tomgrillgames.serializer;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ByteSerializerTests {

    @Test
    public void serializeDeserializeTest() {
        assertEquals(Byte.MAX_VALUE, ByteSerializer.deserialize(ByteSerializer.serialize(Byte.MAX_VALUE)));
        assertEquals(Byte.MIN_VALUE, ByteSerializer.deserialize(ByteSerializer.serialize(Byte.MIN_VALUE)));
        byte b1 = 0;
        assertEquals(b1, ByteSerializer.deserialize(ByteSerializer.serialize((b1))));

        byte b2 = 110;
        assertEquals(b2, ByteSerializer.deserialize(ByteSerializer.serialize((b2))));

        byte b3 = -110;
        assertEquals(b3, ByteSerializer.deserialize(ByteSerializer.serialize((b3))));
    }

    @Test
    public void serializeDeserializeWithResultTest() {
        byte[] result = new byte[1];
        ByteSerializer.serialize(result, Byte.MAX_VALUE);
        assertEquals(Byte.MAX_VALUE, ByteSerializer.deserialize(result));
    }
}
