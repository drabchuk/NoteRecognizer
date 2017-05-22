package com.company;

/**
 * Created by new on 22.05.2017.
 */
public class Alg {

    public static int scalarMult(byte[] a, byte[] b) {
        int length = a.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += a[i] * b[i];
        }
        return sum;
    }

}
