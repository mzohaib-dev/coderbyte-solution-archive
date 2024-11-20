package easy;

/**
 * Have the function AdditivePersistence(num) take the num parameter being
 * passed
 * which will always be a positive integer
 * and return its additive persistence which is the number of times
 * you must add the digits in num until you reach a single digit.
 * ---
 * For example: if num is 2718 then your program
 * should return 2 because 2 + 7 + 1 + 8 = 18
 * and 1 + 8 = 9, and you stop at 9.
 */

public class AdditivePersistence {

    public static int additiveCounter(int digit) {
        int counter = 0;
        int dNum = digit;

        while (dNum > 9) {
            int localSum = 0;

            String[] strNums = Integer.toString(dNum).split("");

            for (String i : strNums) {
                localSum += Integer.parseInt(i);
            }
            dNum = localSum;
            counter++;
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(additiveCounter(2718));
        // System.out.println(additiveCounter(913));
    }
}
