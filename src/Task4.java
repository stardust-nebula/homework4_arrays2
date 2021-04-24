public class Task4 {
    /**
     * Создание двумерного массива. Вывод результаты суммы всех элементов массива.
     */

    public static void main(String[] args) {

        int[][] array = {{6,2,7,4,1}, {33, 0, 21}};
        System.out.println("Массив: ");
        for (int[] internalArray: array){
            for (int itemArray: internalArray){
                System.out.print(itemArray + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int[] internalArray: array){
            for (int itemArray: internalArray){
                sum += itemArray;
            }
        }
        System.out.println("Результат сложения всех элементов массива: " + sum);
    }
}
