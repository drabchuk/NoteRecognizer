package com.company;

import static com.company.Constatns.*;

public class Main {

    public static void main(String[] args) {

        byte[] dSharp = SygnalImitator.getSygnal(3*38.88, 30);
        //byte[] dSharp = SygnalImitator.getSygnal(32.7, 30);
        byte[] n1 = SygnalImitator.getSygnal(34.6, 0);
        byte[] n2 = SygnalImitator.getSygnal(36.7 , 0);
        byte[] n3 = SygnalImitator.getSygnal(38.9, 0);
        byte[] n4 = SygnalImitator.getSygnal(41.2, 0);
        byte[] n5 = SygnalImitator.getSygnal(43.6, 0);
        byte[] n6 = SygnalImitator.getSygnal(46.2 , 0);
        byte[] n7 = SygnalImitator.getSygnal(49, 30);

        String note = NoteRecognizer.recognizeString(dSharp);
        String note1 = NoteRecognizer.recognizeString(n1);
        String note2 = NoteRecognizer.recognizeString(n2);
        String note3 = NoteRecognizer.recognizeString(n3);
        String note4 = NoteRecognizer.recognizeString(n4);
        String note5 = NoteRecognizer.recognizeString(n5);
        String note6 = NoteRecognizer.recognizeString(n6);
        String note7 = NoteRecognizer.recognizeString(n7);

        System.out.println(note);
        System.out.println(note1);
        System.out.println(note2);
        System.out.println(note3);
        System.out.println(note4);
        System.out.println(note5);
        System.out.println(note6);
        System.out.println(note7);

    }

}
