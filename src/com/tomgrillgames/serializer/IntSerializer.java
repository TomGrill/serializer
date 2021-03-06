package com.tomgrillgames.serializer;

public class IntSerializer {

    public static byte[] serialize(int value) {
        return serialize(new byte[4], value);
    }

    public static byte[] serialize(byte[] result, int value) {
        result[0] = (byte) (value >> 24);
        result[1] = (byte) (value >> 16);
        result[2] = (byte) (value >> 8);
        result[3] = (byte) (value);
        return result;
    }

    public static int deserialize(byte[] bytes) {
        return ((bytes[0] & 0xFF) << 24) | ((bytes[1] & 0xFF) << 16) | ((bytes[2] & 0xFF) << 8) | (bytes[3] & 0xFF);
    }

}
