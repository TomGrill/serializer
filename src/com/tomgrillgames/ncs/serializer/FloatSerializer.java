package com.tomgrillgames.ncs.serializer;

public class FloatSerializer {

    public static byte[] serialize(float value) {
        return serialize(new byte[4], value);
    }

    public static byte[] serialize(byte[] result, float value) {
        return IntSerializer.serialize(result, Float.floatToIntBits(value));
    }

    public static float deserialize(byte[] bytes) {
        return Float.intBitsToFloat(IntSerializer.deserialize(bytes));
    }

}
