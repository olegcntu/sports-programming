package codeforces_800;

import java.util.Scanner;

public class AntonAndDanik {
    private int count;
    private int AntonWin=0;
    private int DanikWin=0;
    private String st1;

    public static void main(String[] args) {
        AntonAndDanik antonAndDanik=new AntonAndDanik();
        antonAndDanik.inputData();;
        antonAndDanik.logics();

    }

    private void inputData() {
        Scanner in = new Scanner(System.in);
        String firstLine = in.nextLine();
        count = Integer.parseInt(firstLine);

        st1 = in.nextLine();
    }

    private void logics(){
        char[] charsArr = st1.toCharArray();

        for(int i=0;i<charsArr.length;i++){
            if(charsArr[i]=='D'){DanikWin++;}
            else {AntonWin++;}
        }

        if (AntonWin>DanikWin){
            System.out.println("Anton");
        }
        else if(AntonWin<DanikWin){
            System.out.println("Danik");
        }
        else {
            System.out.println("Friendship");
        }
    }

}

// https://codeforces.com/problemset/problem/734/A

/*
A. Anton and Danik
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
Anton likes to play chess, and so does his friend Danik.

Once they have played n games in a row. For each game it's known who was the winner — Anton or Danik. None of the games ended with a tie.

Now Anton wonders, who won more games, he or Danik? Help him determine this.

Input
The first line of the input contains a single integer n (1 ≤ n ≤ 100 000) — the number of games played.

The second line contains a string s, consisting of n uppercase English letters 'A' and 'D' — the outcome of each of the games. The i-th character of the string is equal to 'A' if the Anton won the i-th game and 'D' if Danik won the i-th game.

Output
If Anton won more games than Danik, print "Anton" (without quotes) in the only line of the output.

If Danik won more games than Anton, print "Danik" (without quotes) in the only line of the output.

If Anton and Danik won the same number of games, print "Friendship" (without quotes).
*/
