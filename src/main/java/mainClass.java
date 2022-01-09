/**
 * Created by me on 09.01.22
 */
//import java.util.Scanner;

public class mainClass {
    public static void main (String[] args) {
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
        // zahl5 ist eine Zahl vom typ integer, damit die berechnung funktioniert muss der datentyp gewandelt werden
        double zahl6 = (double) zahl5;
        double zahl7 = 5.6;
        System.out.println(zahl6 + zahl7);

        // Aufruf von Methoden ohne und mit Rückgabewert
        schreibeText("Benutze jetzt eine Methode");
        System.out.println(schreibeTextUndGibReturn( 3,  4));

/*         User input und Ausgabe mit der importierten Klasse Scanner
        Scanner userInput = new Scanner(System.in);
        System.out.println("Your input was: " + userInput.nextLine());*/

        altersCheck(20);
        switcher(25);
        increment(2);
        schleife();
        konditionellerOperator(99999);

        internet wurst = new internet();
        wurst.verbunden();
        System.out.println("Sie waren " + wurst.onlinezeit(3,5) + " Min online");
        wurst.trennen();

        // Confirm und Message Dialog
        //wurst.dialog("Was antwortest Du?");

        // try and catch
        //wurst.tryAndCatch();

        //Getter und Setter
        GetterUndSetter getUndSet = new GetterUndSetter();
        getUndSet.setBossName("Pavel");
        System.out.println(getUndSet.getBossName());

        for (int var1=0; var1 < 5 ; var1++){
            System.out.println(var1 + " " + getUndSet.getBossName());
        }

        do_while();

        TestHashMap myHM = new TestHashMap();
        myHM.Tiere.put("Hase","weiss");
        myHM.Tiere.put("Schwan","schwarz");
        myHM.Tiere.put("Ara","bunt");

        for (String i : myHM.Tiere.keySet()) {
            System.out.println("Tier: " + i + " Farbe: " + myHM.Tiere.get(i));
        }
        System.out.println(myHM.Tiere.get("Ara"));

        myHM.Parameter.put("mode", "delete");
        myHM.Parameter.put("logLevel","WARM");
        myHM.Parameter.put("threads","10");

        for (String i : myHM.Parameter.keySet()) {
            System.out.println("Parameter: " + i + " Value: " + myHM.Parameter.get(i));
            if (i.equals("threads")) {
                int x = Integer.parseInt(myHM.Parameter.get(i));
                System.out.println("Threads: " + x);
            }
        }


    }

    public static void schreibeText(String text) {
        System.out.println(text);
    }

    public static int schreibeTextUndGibReturn(int zahl1, int zahl2) {
        System.out.println("Ausgabe der Summe: " + (zahl1+zahl2));
        return (zahl1+zahl2);
    }

    public static void altersCheck(int alter){
        if (alter < 16){
            System.out.println("Kein Alk");
        } else if (alter == 16) {
            System.out.println("Nur Bier unf Wein");
        } else {
            System.out.println("Alles gibts");
        }
    }

    public static void switcher(int text){
        switch (text){
            case 15:{
                System.out.println("Die übergabe war: 15 " + text);
                break;
            }
            case 17: {
                System.out.println("Die übergabe war: 17 " + text);
                break;
            }
            case 25: {
                System.out.println("Die übergabe war: 25 " + text);
                break;
            }
            default: {
                System.out.println("Die übergabe war: default");
                break;
            }
        }
    }

    public static void increment(int zahl){
        ++zahl;
        System.out.println(zahl);
        zahl++;
        System.out.println(zahl);
        zahl+=10;
        System.out.println(zahl);
    }

    public static void schleife(){
        int zahl = 0;
        while (zahl<= 10){
            System.out.println("Zahl: " + zahl);
            zahl++;
        }
    }

    public static void konditionellerOperator(int zahl){
        // wenn Bedingung erfüllt "?" DANN ":" SONST
        System.out.println(zahl > 10000 ? "Große Zahl" : "Kleine Zahl");
    }

    public static void do_while(){
        GetterUndSetter getUserObject = new GetterUndSetter();
        getUserObject.setBossName("Hugo");
        int var2 = 1;
        do{
            System.out.println(var2 + " " + getUserObject.getBossName());
            var2++;
        }while (var2 < 5);
    }

}
