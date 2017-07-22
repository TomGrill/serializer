package com.tomgrillgames.ncs.serializer;

public class LongSerializer {

    public static byte[] serialize(long value) {
        return serialize(new byte[8], value);
    }

    public static byte[] serialize(byte[] result, long value) {
        result[7] = (byte) (value);
        result[6] = (byte) (value >>= 8);
        result[5] = (byte) (value >>= 8);
        result[4] = (byte) (value >>= 8);
        result[3] = (byte) (value >>= 8);
        result[2] = (byte) (value >>= 8);
        result[1] = (byte) (value >>= 8);
        result[0] = (byte) (value >> 8);
        return result;
    }

    public static long deserialize(byte[] bytes) {
        long result = 0;
        for (int i = 0; i < 8; i++) {
            result <<= 8;
            result |= (bytes[i] & 0xFF);
        }
        return result;
    }

}
