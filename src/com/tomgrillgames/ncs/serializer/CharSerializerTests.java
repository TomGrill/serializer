package com.tomgrillgames.ncs.serializer;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharSerializerTests {

    @Test
    public void serializeDeserializeTest() {
        char a = 'a';
        char p = '.';
        assertEquals(a, CharSerializer.deserialize(CharSerializer.serialize(a)));
        assertEquals(p, CharSerializer.deserialize(CharSerializer.serialize(p)));
        assertEquals('ß', CharSerializer.deserialize(CharSerializer.serialize('ß')));
    }

    @Test
    public void serializeDeserializeWithResultTest() {
        byte[] result = new byte[2];
        CharSerializer.serialize(result, 'f');
        assertEquals('f', CharSerializer.deserialize(result));
    }
}
