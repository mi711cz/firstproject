package org.example;

public class MainClass {
    
    private static final int AGE_CHECK = 16;
    private static final String LOG_LEVEL_ERROR = "WARNING";
    private static final int MIN_THREADS = 10;

    public static void main(String[] args) {
        System.out.println("Hello World :)");

        int zahl1 = 5;
        String zahl2 = "5";

        // Parsen eines Strings in einen Integer
        int zahl3 = Integer.parseInt(zahl2);

        int sum = zahl1 + zahl3;
        System.out.println(sum);

        // Parsen eines Integers zum String
        String zahl4 = String.valueOf(sum);
        System.out.println(zahl4);

        // Kasten von Datentypen int nach double
        int zahl5 = 5;
        double zahl6 = (double) zahl5;
        double zahl7 = 5.6;
        System.out.println(zahl6 + zahl7);

        // Aufruf von Methoden ohne und mit Rückgabewert
        schreibeText("Benutze jetzt eine Methode");
        System.out.println(schreibeTextUndGibReturn(3, 4));

        altersCheck(20);
        switcher(25);
        increment(2);
        schleife();
        konditionellerOperator(99999);

        Internet wurst = new Internet();
        wurst.verbunden();
        System.out.println("Sie waren " + wurst.onlinezeit(3, 5) + " Min online");
        wurst.trennen();

        // Getter und Setter
        GetterUndSetter getUndSet = new GetterUndSetter();
        getUndSet.setBossName("Pavel");
        System.out.println(getUndSet.getBossName());

        for (int var1 = 0; var1 < 5; var1++) {
            System.out.println(var1 + " " + getUndSet.getBossName());
        }

        do_while();

        TestHashMap myHM = new TestHashMap();
        myHM.getTiere().put("Hase", "weiss");
        myHM.getTiere().put("Schwan", "schwarz");
        myHM.getTiere().put("Ara", "bunt");

        for (String i : myHM.getTiere().keySet()) {
            System.out.println("Tier: " + i + " Farbe: " + myHM.getTiere().get(i));
        }
        System.out.println(myHM.getTiere().get("Ara"));

        myHM.getParameter().put("mode", "delete");
        myHM.getParameter().put("logLevel", LOG_LEVEL_ERROR);
        myHM.getParameter().put("threads", String.valueOf(MIN_THREADS));

        for (String i : myHM.getParameter().keySet()) {
            System.out.println("Parameter: " + i + " Value: " + myHM.getParameter().get(i));
            if (i.equals("threads")) {
                int x = Integer.parseInt(myHM.getParameter().get(i));
                System.out.println("Threads: " + x);
            }
        }
    }

    public static void schreibeText(String text) {
        System.out.println(text);
    }

    public static int schreibeTextUndGibReturn(int zahl1, int zahl2) {
        System.out.println("Ausgabe der Summe: " + (zahl1 + zahl2));
        return (zahl1 + zahl2);
    }

    public static void altersCheck(int alter) {
        if (alter < AGE_CHECK) {
            System.out.println("Kein Alk");
        } else if (alter == AGE_CHECK) {
            System.out.println("Nur Bier und Wein");
        } else {
            System.out.println("Alles gibts");
        }
    }

    public static void switcher(int text) {
        switch (text) {
            case 15 -> System.out.println("Die übergabe war: 15 " + text);
            case 17 -> System.out.println("Die übergabe war: 17 " + text);
            case 25 -> System.out.println("Die übergabe war: 25 " + text);
            default -> System.out.println("Die übergabe war: default");
        }
    }

    public static void increment(int zahl) {
        ++zahl;
        System.out.println(zahl);
        zahl++;
        System.out.println(zahl);
        zahl += 10;
        System.out.println(zahl);
    }

    public static void schleife() {
        int zahl = 0;
        while (zahl <= 10) {
            System.out.println("Zahl: " + zahl);
            zahl++;
        }
    }

    public static void konditionellerOperator(int zahl) {
        System.out.println(zahl > 10000 ? "Große Zahl" : "Kleine Zahl");
    }

    public static void do_while() {
        GetterUndSetter getUserObject = new GetterUndSetter();
        getUserObject.setBossName("Hugo");
        int var2 = 1;
        do {
            System.out.println(var2 + " " + getUserObject.getBossName());
            var2++;
        } while (var2 < 5);
    }
}
