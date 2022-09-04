package codeforces_800;

import java.util.*;

public class GreatSuccession {
    private int count;
    private final List<Subsequence> subsequences = new ArrayList<>();

    public static void main(String[] args) {
        GreatSuccession greatSuccession = new GreatSuccession();
        greatSuccession.inputData();
    }

    private void inputData() {
        Scanner in = new Scanner(System.in);
        String firstLine = in.nextLine();
        count = Integer.parseInt(firstLine);

        for (int i = 0; i < count; i++) {
            String st1 = in.nextLine();
            String st2 = in.nextLine();
            subsequences.add(new Subsequence(st1, st2));
        }
        for (int i = 0; i < count; i++) {
            System.out.println(countOfAdd(subsequences.get(i)));
        }

    }

    private int countOfAdd(Subsequence subsequence) {
        int result = 0;
        boolean flag = true;
        int size = subsequence.setOfNumbers.size();


            for (int j = 0; j < subsequence.setOfNumbers.size(); j++) {

                for (int i = 0; i < subsequence.setOfNumbers.size(); i++) {

                    if (i == j) {
                        continue;
                    }

                    if ((subsequence.setOfNumbers.get(j) * subsequence.number == subsequence.setOfNumbers.get(i)) ||
                            (subsequence.setOfNumbers.get(i) * subsequence.number == subsequence.setOfNumbers.get(j))) {

                        if (j < i) {
                            subsequence.setOfNumbers.remove(j);
                            subsequence.setOfNumbers.remove(i - 1);
                        } else {
                            subsequence.setOfNumbers.remove(i);
                            subsequence.setOfNumbers.remove(j - 1);
                        }
                        break;
                    }
                }
            }
        return subsequence.setOfNumbers.size();
    }


    class Subsequence {
        private int countOfNumber;
        private Integer number;
        private List<Integer> setOfNumbers = new ArrayList();

        public Subsequence(String st1, String st2) {
            this.stToDate(st1, st2);
        }

        @Override
        public String toString() {
            return countOfNumber + " " + number +
                    setOfNumbers;
        }

        public void stToDate(String st1, String st2) {
            this.countOfNumber = Integer.parseInt(st1.split(" ")[0]);
            this.number = Integer.parseInt(st1.split(" ")[1]);

            String[] arrOfNumberSt = st2.split(" ");

            for (int i = 0; i < countOfNumber; i++) {
                setOfNumbers.add(Integer.parseInt(arrOfNumberSt[i]));
            }

        }
    }

}
/*
for (int j = 0; j < subsequence.countOfNumber; j++) {
            for (int i = 0; i < subsequence.countOfNumber; i++) {
                if (i == j) {
                    continue;
                }
                if ((subsequence.setOfNumbers[j] + subsequence.number) == subsequence.setOfNumbers[i]) {
                    result++;
                }
            }
        }
 */
