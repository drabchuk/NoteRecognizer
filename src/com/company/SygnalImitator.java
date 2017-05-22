package com.company;

import static com.company.Constatns.*;
import static java.lang.Math.*;

/**
 * Created by new on 22.05.2017.
 */
public class SygnalImitator {

    public static byte[] getSygnal(double frequency, double phase) {
        return SygnalNormalizer.normalize(getAnalogSygnal(frequency, phase));
    }

    private static double[] getAnalogSygnal(double frequency, double phase) {
        double[] sygnal = new double[frameSize];
        double delta = 1.0 / frameSize;
        double fi = 0.0;
        for (int i = 0; i < frameSize; i++, fi += delta) {
            sygnal[i] = Math.sin(2.0 * PI * frequency * (fi + phase / 360.0));
        }
        return sygnal;
    }

}
