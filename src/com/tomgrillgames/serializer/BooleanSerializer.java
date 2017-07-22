package com.tomgrillgames.serializer;

public class BooleanSerializer {

    public static byte[] serialize(boolean value) {
        return serialize(new byte[1], value);
    }

    public static byte[] serialize(byte[] result, boolean value) {
        final byte t = 1;
        final byte f = 0;
        result[0] = (value ? t : f);
        return result;
    }

    public static boolean deserialize(byte[] bytes) {
        return bytes[0] == 1;
    }

}
