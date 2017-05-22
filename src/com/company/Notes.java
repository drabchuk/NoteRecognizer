package com.company;

/**
 * Created by new on 22.05.2017.
 */
public enum Notes {

    C(32.7), Cd(34.65), D(36.95), Dd(38.88), E(41.21), F(43.65), Fd(46.25), G(49), Gd(51.9), A(55), Bb(58.26), B(61.74);

    double frequency;

    Notes(double f) {
        this.frequency = f;
    }

}
