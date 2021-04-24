public class Task2 {
    /**
     * Создание двумерного массива размером 8x8. Заполнить массив 'W' и 'B' в шахматном порядке начиная с 'W' клетки.
     */


    public static void main(String[] args) {


        char[][] array = new char[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (i == 0 | i % 2 == 0) {
                    if (j == 0 | j % 2 == 0) {
                        array[i][j] = 'W';
                    } else {
                        array[i][j] = 'B';
                    }
                } else {
                    if (j == 0 | j % 2 == 0) {
                        array[i][j] = 'B';
                    } else {
                        array[i][j] = 'W';
                    }
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
