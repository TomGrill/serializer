package com.tomgrillgames.ncs.serializer;

public class ByteSerializer {

    public static byte[] serialize(byte value) {
        return new byte[]{value};
    }

    public static byte[] serialize(byte[] result, byte value) {
        result[0] = value;
        return result;
    }

    public static byte deserialize(byte[] bytes) {
        return (byte) (bytes[0] & 0xFF);
    }

}
