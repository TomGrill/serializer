package com.tomgrillgames.ncs.serializer;

public class ShortSerializer {

    public static byte[] serialize(short value) {
        return new byte[]{
                (byte) (value >> 8),
                (byte) (value)
        };
    }

    public static byte[] serialize(byte[] result, short value) {
        result[0] = (byte) (value >> 8);
        result[1] = (byte) (value);
        return result;
    }

    public static short deserialize(byte[] bytes) {
        return (short) (((bytes[0] & 0xFF) << 8) | (bytes[1] & 0xFF));
    }

}
