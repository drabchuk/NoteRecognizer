package com.company;

import static com.company.Constatns.*;

public class Main {

    public static void main(String[] args) {

        byte[] dSharp = SygnalImitator.getSygnal(3*38.88, 30);

        String note = NoteRecognizer.recognizeString(dSharp);

        System.out.println(note);

    }

}
