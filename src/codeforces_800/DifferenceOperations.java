package codeforces_800;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DifferenceOperations {
    private int count;
    ArrayList<Element> elements = new ArrayList<>();

    public static void main(String[] args) {
        DifferenceOperations differenceOperations = new DifferenceOperations();
        differenceOperations.inputData();
        differenceOperations.callingEachContainer();
    }

    private void inputData() {
        Scanner in = new Scanner(System.in);
        String firstLine = in.nextLine();
        count = Integer.parseInt(firstLine);

        for (int i = 0; i < count; i++) {
            String st1 = in.nextLine();
            String st2 = in.nextLine();
            elements.add(Element.createElement(st1, st2));
        }

    }

    private void callingEachContainer() {
        for (int i = 0; i < count; i++) {
            logicsForAny(elements.get(i));
        }
    }

    private void logicsForAny(Element element) {
        String result = "YES";
        int firstElement = element.combination[0];

        for (int i = 1; i < element.count; i++) {
            if (element.combination[i] % firstElement != 0) {
                result = "NO";
            }
        }
        System.out.println(result);
    }
}

class Element {
    Integer count;
    int combination[];

    public Element(int count, int[] combination) {
        this.count = count;
        this.combination = combination;
    }

    public static Element createElement(String st1, String st2) {
        int count = Integer.parseInt(st1);
        int[] numArr = Arrays.stream(st2.split(" ")).mapToInt(Integer::parseInt).toArray();
        return new Element(count, numArr);
    }

    @Override
    public String toString() {
        return "Element{" +
                "count=" + count +
                ", combination=" + Arrays.toString(combination) +
                "}\n";
    }
}

//https://codeforces.com/problemset/problem/1708/A

/*
A. Разностные операции
    ограничение по времени на тест1 секунда
    ограничение по памяти на тест256 мегабайт
    вводстандартный ввод
    выводстандартный вывод
    Вам дан массив a, состоящий из n целых положительных чисел.

        Вы можете выполнить следующую операцию любое количество раз (возможно, нулевое):

        выбрать индекс i (2≤i≤n) и заменить ai на ai−ai−1.
        Можно ли сделать так, чтобы выполнялось ai=0 для всех 2≤i≤n?

        Входные данные
        Каждый тест состоит из нескольких наборов входных данных. Первая строка входных данных содержит одно целое число t (1≤t≤100) — количество наборов входных данных в тесте. Далее следует описание наборов.

        Первая строка содержит одно целое число n (2≤n≤100) — длину массива a.

        Вторая строка содержит n целых чисел a1,a2,…,an (1≤ai≤109).

        Выходные данные
        Для каждого набора входных данных выведите «YES» (без кавычек), если возможно заменить ai на 0 для всех 2≤i≤n, и «NO» (без кавычек) в противном случае.

        Вы можете выводить буквы в любом регистре (верхнем или нижнем).
*/
