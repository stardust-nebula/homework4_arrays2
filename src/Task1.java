import java.util.Scanner;

public class Task1 {

    /**
     * Создание и инициализация трехмерного массив. Далее увеличение каждого элемента массива на задданное число.
     * Числдо задается с консоли.
     *
     */

    public static void main(String[] args) {

        int[][][] array = {{{6, 85, 10}, {33, 41, 50, 3, 95, 8}, {93, 4}}};

        System.out.println("Массив до изменений: ");
        for (int[][] middleArray : array) {
            for (int[] internalArray : middleArray) {
                for (int itemArray : internalArray) {
                    System.out.print(itemArray + " ");
                }
                System.out.println();
            }
        }

        System.out.println("Введите целое число: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("Массив после изменений: ");
        for (int[][] middleArray : array) {
            for (int[] internalArray : middleArray) {
                for (int itemArray : internalArray) {
                    itemArray += number;
                    System.out.print(itemArray + " ");
                }
                System.out.println();
            }
        }
    }
}
