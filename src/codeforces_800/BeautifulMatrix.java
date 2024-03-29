package codeforces_800;

import java.util.Scanner;

public class BeautifulMatrix {

    private static final String[][] matrix = new String[5][5];

    public static void main(String[] args) {
        BeautifulMatrix.inputData();
        System.out.println(indexOfElement());

    }

    private static void inputData() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String[] numArr = in.nextLine().split(" ");
            matrix[i] = numArr;

        }
    }

    public static int indexOfElement() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j].equals("1")) {
                    return minimumNumberOfActions(i, j);
                }
            }
        }
        return 0;
    }

    public static int minimumNumberOfActions(int i, int j) {
        int result = 0;
        result = Math.abs(2 - i) + Math.abs(2 - j);
        return result;
    }
}
/*
A. Красивая матрица
ограничение по времени на тест2 секунды
ограничение по памяти на тест256 мегабайт
ввод стандартный ввод
вывод стандартный вывод
Перед Вами матрица размера 5 × 5, состоящая из 24-x нулей и единственной единицы.
 Строки матрицы пронумеруем числами от 1 до 5 сверху вниз, столбцы матрицы пронумеруем числами от 1 до 5 слева направо.
 За один ход разрешается применить к матрице одно из двух следующих преобразований:

Поменять местами две соседние строки матрицы, то есть строки с номерами i и i + 1 для некоторого целого i
(1 ≤ i < 5).
Поменять местами два соседних столбца матрицы, то есть столбцы с номерами j и j + 1 для некоторого целого j
(1 ≤ j < 5).
Вы считаете, что матрица будет выглядеть красиво, если единственная единица этой матрицы будет находиться в ее центре
(в клетке, которая находится на пересечении третьей строки и третьего столбца). Посчитайте,
какое минимальное количество ходов потребуется, чтобы сделать матрицу красивой.

Входные данные
Входные данные состоят из пяти строк, в каждой из которых записаны пять целых чисел: j-ое число в i-ой строке входных данных
обозначает элемент матрицы, стоящий на пересечении i-ой строки и j-ого столбца. Гарантируется, что матрица состоит из
24-x нулей и единственной единицы.
 */
