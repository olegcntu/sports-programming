package codeforces_800;


import java.util.ArrayList;
import java.util.Scanner;

public class ThreeDoor {
    private int count;
    private ArrayList<OneHouse> houses= new ArrayList<>();

    public static void main(String[] args) {
        ThreeDoor threeDoor = new ThreeDoor();
        threeDoor.inputData();
        System.out.println("***********");
        System.out.println(threeDoor.houses.size());
    }


    private void inputData() {
        Scanner in = new Scanner(System.in);
        String firstLine = in.nextLine();
        count = Integer.parseInt(firstLine);

        for (int i = 0; i < count; i++) {
            System.out.println();
            System.out.println("i: "+i);
            String st1 = in.nextLine();
            int key= Integer.parseInt(st1);

            System.out.println("i*: "+i);
            String st2 = in.nextLine();
            System.out.println("i#: "+i);
            String []arrSt=st2.split(" ");

            int dorKey1=Integer.parseInt(arrSt[0]);
            int dorKey2=Integer.parseInt(arrSt[1]);
            int dorKey3=Integer.parseInt(arrSt[2]);


            houses.add(new OneHouse(key,new int[]{ dorKey1, dorKey2, dorKey3}));
        }
    }

}

class OneHouse{
    private int key;
    private int[] dorKey;
    private String result;

    private void logic() {

    }

    public OneHouse(int key, int[] dorKey) {
        System.out.println("in start constructor");
        this.key = key;
        this.dorKey = dorKey;
        this.logic();
        this.resultOutput();
        System.out.println("in end constructor");
    }
    private void resultOutput() {
        System.out.println(key);
        System.out.print(dorKey[0]+" ");
        System.out.print(dorKey[1]+" ");
        System.out.println(dorKey[2]+" ");
    }

}

