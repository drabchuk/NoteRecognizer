package com.company;

import static com.company.Constatns.*;

/**
 * Created by new on 22.05.2017.
 */
public class NoteRecognizer {

    public static String recognizeString(byte[] sygnal) {
        int noteId = recognize(sygnal);
        int octave = noteId / notesCount + 1;
        int note = noteId % notesCount;
        Notes n = Notes.values()[note];
        return n.name() + octave;
    }

    public static int recognize(byte[] sygnal) {
        FourierFactorization ff = new FourierFactorization(sygnal);

        int[] fourierFatorization = ff.factorize();

        int max = 0;
        int maxId = 0;
        for (int i = 0; i < allNotesCount; i++) {
            if (max < fourierFatorization[i]) {
                maxId = i;
                max = fourierFatorization[i];
            }
        }
        return maxId;
    }

}
