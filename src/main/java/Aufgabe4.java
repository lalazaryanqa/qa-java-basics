/*
Aufgabe 1:
Erstelle ein Array mit 5 Elementen und gib jedes Element einzeln aus.

Aufgabe 2:
Erstelle ein Array mit 5 Elementen und gib die Summe aller Elemente aus.

Aufgabe 3:
Erstelle ein Array und gib das letzte Element des Arrays aus.
*/

public class Aufgabe4 {

    public static void main(String[] args) {

        // Aufgabe 1
        int[] array1 = {10, 20, 50, 100, 500};

        System.out.println("=== Aufgabe 1 ===");

        System.out.println("Erstes Element: " + array1[0]);
        System.out.println("Zweites Element: " + array1[1]);
        System.out.println("Drittes Element: " + array1[2]);
        System.out.println("Viertes Element: " + array1[3]);
        System.out.println("Fünftes Element: " + array1[4]);

        // Aufgabe 2
        int[] array2 = {50, 100, 500, 10000, 5000};

        int summe = array2[0] + array2[1] + array2[2]
                + array2[3] + array2[4];

        System.out.println("=== Aufgabe 2 ===");
        System.out.println("Die Summe aller Elemente ist: " + summe);

        // Aufgabe 3
        System.out.println("=== Aufgabe 3 ===");

        System.out.println("Das letzte Element ist: "
                + array2[array2.length - 1]);
    }
}