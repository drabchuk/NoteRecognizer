package com.company;

/**
 * Created by new on 22.05.2017.
 */
public class SygnalNormalizer {

    public static byte[] normalize(double[] analog) {
        int size = analog.length;
        byte[] res = new byte[size];
        for (int i = 0; i < size; i++) {
            res[i] = (byte) (analog[i] * 127.0);
        }
        return res;
    }

}
