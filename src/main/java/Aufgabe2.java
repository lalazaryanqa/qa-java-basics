/* Erstelle ein Array mit Zahlen von 1 bis 10
und multipliziere alle Zahlen mit einer Schleife
 */

public class Aufgabe2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 1;
        for (int i = 0; i <= nums.length - 1; i++) {
            total *= nums[i];
        }
        System.out.println(total);
    }

}
