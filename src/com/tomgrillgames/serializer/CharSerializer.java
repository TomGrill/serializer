package com.tomgrillgames.serializer;

public class CharSerializer {

    public static byte[] serialize(char value) {
        return serialize(new byte[2], value);
    }

    public static byte[] serialize(byte[] result, char value) {
        ShortSerializer.serialize(result, (short) value);
        return result;
    }

    public static char deserialize(byte[] bytes) {
        return (char) ShortSerializer.deserialize(bytes);
    }

}
