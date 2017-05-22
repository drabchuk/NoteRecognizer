package com.company;

import static com.company.Alg.*;
import static com.company.Constatns.*;

/**
 * Created by new on 22.05.2017.
 */
public class FourierFactorization {

    private byte[] sygnal;

    public FourierFactorization(byte[] sygnal) {
        this.sygnal = sygnal;
    }

    public int[] factorize() {

        int[] res = new int[allNotesCount];

        /*Notes[] notes = Notes.values();
        double[] allFrequencies = new double[allNotesCount];
        for (int i = 1; i < octavesCount + 1; i++) { //octaves
            for (int j = 0; j < notesCount; j++) {//notes
                allFrequencies[notesCount * (i - 1) + j] = notes[j].frequency * i;
            }
        }*/
        int tmp;
        for (int phase = 0; phase < 360; phase++) {
            for (int j = 0; j < allNotesCount; j++) {
                //tmp = factorizeGarmonic(allFrequencies[j], phase);
                tmp = factorizeGarmonic(j, phase);
                if (tmp > res[j]) {
                    res[j] = tmp;
                }
            }
        }
        return res;
    }

    private int factorizeGarmonic(double frequency, double phase) {
        byte[] garmonika = SygnalImitator.getSygnal(frequency, phase);
        return scalarMult(sygnal, garmonika);
    }

    private int factorizeGarmonic(int note, int phase) {
        byte[] garmonika = GarmonikiSingleton.getInstance().getSygnal(note, phase);
        return scalarMult(sygnal, garmonika);
    }

}
