/*
Vergleiche jede Zahl mit der vorherigen Zahl im Array
 */

public class Aufgabe3 {
    public static void main(String[] args) {
        int[] sum = {5, 10, 35, 20, 233, 2, 43000, 8321, 1560, 55311};
        for (int i = 1; i < sum.length; i++) {
            if (sum[i] > sum[i - 1] ) {
                System.out.println("Die Nummer ist groß" + " " + sum[i]);
            } else {
                System.out.println("Die Nummer ist klein" + " " + sum[i]);
            }
        }

    }

}
