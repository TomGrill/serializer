package com.tomgrillgames.serializer;

public class DoubleSerializer {

    public static byte[] serialize(double value) {
        return serialize(new byte[8], value);
    }

    public static byte[] serialize(byte[] result, double value) {
        return LongSerializer.serialize(result, Double.doubleToLongBits(value));
    }

    public static double deserialize(byte[] bytes) {
        return Double.longBitsToDouble(LongSerializer.deserialize(bytes));
    }

}
