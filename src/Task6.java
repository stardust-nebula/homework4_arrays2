import java.util.Arrays;

public class Task6 {
    /**
     * Создание двумерного массива целых чисел.
     * Сортировка элементов массива в строках по возрастанию.
     */

    public static void main(String[] args) {
        int[][] array = {{3, 0, 1}, {33, 1, -6}};
        System.out.println("Массив");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Отсортированные строки: ");
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
