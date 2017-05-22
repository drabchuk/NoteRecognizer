package com.company;

import static com.company.Constatns.*;

/**
 * Created by new on 22.05.2017.
 */
public class GarmonikiSingleton {

    private static GarmonikiSingleton instance;

    private byte[][][] sygnals;

    private GarmonikiSingleton() {
        this.sygnals = new byte[allNotesCount][phasesCount][frameSize];

        Notes[] notes = Notes.values();
        double[] allFrequencies = new double[allNotesCount];
        for (int i = 1; i < octavesCount + 1; i++) { //octaves
            for (int j = 0; j < notesCount; j++) {//notes
                allFrequencies[notesCount * (i - 1) + j] = notes[j].frequency * i;
            }
        }
        int tmp;
        for (int phase = 0; phase < phasesCount; phase++) {
            for (int j = 0; j < allNotesCount; j++) {
                sygnals[j][phase] = SygnalImitator.getSygnal(allFrequencies[j], phase);
                //System.out.println(j);
            }
            //System.out.println("phase" + phase);
        }

    }

    public byte[] getSygnal(int note, int phase) {
        return sygnals[note][phase];
    }

    public static GarmonikiSingleton getInstance() {
        if (instance == null) {
            instance = new GarmonikiSingleton();
        }
        return instance;
    }

}
