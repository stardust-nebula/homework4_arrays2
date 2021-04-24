public class Task5 {
    /**
     * Создание двумерного массива. Вывод диагоналей массива.
     */

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 4, 6}, {7, 8, 9}};
        System.out.println("Массив: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Диагональ 1");
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                break;
            }
        }

        System.out.println('\n' + "Диагональ 2");
        for (int i = 0; i < array.length; i++) {
            for (int j = array[i].length - 1 - i; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
                break;
            }
        }

    }
}
