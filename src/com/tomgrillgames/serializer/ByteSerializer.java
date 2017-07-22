package com.tomgrillgames.serializer;

public class ByteSerializer {

    public static byte[] serialize(byte value) {
        return serialize(new byte[1], value);
    }

    public static byte[] serialize(byte[] result, byte value) {
        result[0] = value;
        return result;
    }

    public static byte deserialize(byte[] bytes) {
        return (byte) (bytes[0] & 0xFF);
    }

}
