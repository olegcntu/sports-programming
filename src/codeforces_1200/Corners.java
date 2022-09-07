package codeforces_1200;

import codeforces_800.AntonAndDanik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Corners {
    private int count;
    private ArrayList<Element> elements=new ArrayList<>();

    public static void main(String[] args) {
        Corners сorners = new Corners();
        сorners.inputData();
    }

    private void inputData() {
        Scanner in = new Scanner(System.in);
        String firstLine = in.nextLine();
        count = Integer.parseInt(firstLine);

        for (int i = 0; i < count; i++) {
            String[] stRowAndColumn = in.nextLine().split(" ");
            int row = Integer.parseInt(stRowAndColumn[0]);
            int column = Integer.parseInt(stRowAndColumn[1]);
            int localArr[] = new int[row * column];

            int counter = 0;
            for (int j = 0; j < row; j++) {
                String line = in.nextLine();
                String[] stNum = line.split("");

                for (int y = 0; y < column; y++)
                    localArr[counter] = Integer.parseInt(stNum[y]);
                    System.out.println(localArr[counter]);
                    counter++;
            }
            System.out.println(Arrays.toString(localArr));
            elements.add(new Element(localArr));
        }

        System.out.println(elements);

    }
}

class Element {
    int arrNum[];

    public Element(int[] arrNum) {
        this.arrNum = arrNum;
    }

    @Override
    public String toString() {
        return "Element{" +
                "arrNum=" + Arrays.toString(arrNum) +
                '}';
    }
}


//https://codeforces.com/problemset/problem/1720/C

/*
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
You are given a matrix consisting of n rows and m columns. Each cell of this matrix contains 0 or 1.

Let's call a square of size 2×2 without one corner cell an L-shape figure. In one operation you can take one L-shape figure, with at least one cell containing 1 and replace all numbers in it with zeroes.

Find the maximum number of operations that you can do with the given matrix.

Input
The first line contains one integer t (1≤t≤500) — the number of test cases. Then follow the descriptions of each test case.

The first line of each test case contains two integers n and m (2≤n,m≤500) — the size of the matrix.

Each of the following n lines contains a binary string of length m — the description of the matrix.

It is guaranteed that the sum of n and the sum of m over all test cases does not exceed 1000.

Output
For each test case output the maximum number of operations you can do with the given matrix.
 */
