public class Task3 {
    /**
     * Умножение двух матриц размером 3x3.
     */

    public static void main(String[] args) {

        System.out.println("Матрица №1: ");
        int[][] array1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        for (int[] internalArray1 : array1) {
            for (int itemArray1 : internalArray1) {
                System.out.print(itemArray1 + " ");
            }
            System.out.println();
        }

        System.out.println("Матрица №2: ");
        int[][] array2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        for (int[] internalArray2 : array2) {
            for (int itemArray2 : internalArray2) {
                System.out.print(itemArray2 + " ");
            }
            System.out.println();
        }

        int lengthOfArray1 = array1.length;
        int numberOfColumnsOfArray2 = array2[0].length;

        int[][] resultArray = new int[lengthOfArray1][numberOfColumnsOfArray2];


        System.out.println("Результат перемножения в новой матрице: ");


        for (int i = 0; i < lengthOfArray1; i++) {
            for (int j = 0; j < numberOfColumnsOfArray2; j++) {
                for (int z = 0; z < lengthOfArray1; z++) {
                    resultArray[i][j] += array1[i][z] * array2[z][j];
                }
                System.out.print(resultArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
