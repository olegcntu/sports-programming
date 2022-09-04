package codeforces_800;

import java.util.Scanner;

public class Elephant {
    private int coordinate;

    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        elephant.inputData();
        System.out.println(elephant.countOfStep());

    }

    private void inputData() {
        Scanner in = new Scanner(System.in);
        coordinate = in.nextInt();
    }

    private int countOfStep() {
        int count = coordinate / 5;
        if (coordinate % 5 != 0) {
            return count + 1;
        } else return count;
    }

}
/*
A. Слоник
ограничение по времени на тест1 секунда
ограничение по памяти на тест256 мегабайт
ввод стандартный ввод
вывод стандартный вывод
Слоник решил сходить в гости к другу. Оказалось, что дом слоника находится в точке 0, а дом его друга в точке
x(x > 0) координатной прямой. За один шаг слоник может переместиться на 1, 2, 3, 4 или 5 позиций вперёд.
Помогите ему определить, за какое минимальное количество шагов он может добраться до дома друга.
 */
