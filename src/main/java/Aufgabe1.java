/* Überprüfe, ob die Zahl gerade oder ungerade ist
 */

public class Aufgabe1 {
    public static void main(String[] args) {
        int[] sum = {5, 10, 35, 88, 233, 1524, 4300, 8321, 10560, 55311};
        for (int i = 0; i <= sum.length - 1; i++) {
            if (sum[i] % 2 == 0) {
                System.out.println("Gerade Zahl ist" + " " + sum[i]);
            } else {
                System.out.println("Ungerade Zahl ist" + " " + sum[i]);
            }
        }
    }

}
