package org.example;

import javax.swing.*;

public class Internet {
    
    public void verbunden() {
        System.out.println("Sie sind verbunden");
    }

    public void trennen() {
        System.out.println("Sie werden getrennt");
    }

    public int onlinezeit(int zahl1, int zahl2) {
        onlineZeitGestern();
        return (zahl1 + zahl2);
    }

    public static void onlineZeitGestern() {
        System.out.println("Gestern waren es 8 min");
    }

    public static void dialog(String text) {
        int ergebnis = JOptionPane.showConfirmDialog(null, text);
        System.out.println(ergebnis);

        if (ergebnis == 0) {
            JOptionPane.showMessageDialog(null, "Die Eingabe war JA");
        } else if (ergebnis == 1) {
            JOptionPane.showMessageDialog(null, "Die Eingabe war NEIN");
        } else if (ergebnis == 2) {
            JOptionPane.showMessageDialog(null, "Die Eingabe war Abbruch");
        }
    }

    public static void tryAndCatch() {
        String input = JOptionPane.showInputDialog(null, "Gib eine Zahl ein");
        try {
            int zahl = Integer.parseInt(input);
            JOptionPane.showMessageDialog(null, "Deine Eingabe war: " + zahl);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Deine Eingabe war keine zahl. Eingabe war: " + input);
        } finally {
            JOptionPane.showMessageDialog(null, "Programm mit Fehler abgelaufen ...");
        }
    }
}
