package codeforcesProject;

import java.util.ArrayList;
import java.util.Scanner;

public class DifferenceOperations {
    private int count;

    public static void main(String[] args) {
        DifferenceOperations differenceOperations = new DifferenceOperations();
        differenceOperations.inputData();
    }

    private void inputData() {
        Scanner in = new Scanner(System.in);
        String firstLine = in.nextLine();
        count = Integer.parseInt(firstLine);

        for (int i = 0; i < count; i++) {
            String st1 = in.nextLine();
            String st2 = in.nextLine();
        }

    }

}

class Element{
    Integer number;
    ArrayList<Integer> combination= new ArrayList<>();
}

//https://codeforces.com/problemset/problem/1708/A
