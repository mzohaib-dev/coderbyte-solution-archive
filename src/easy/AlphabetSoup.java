package easy;

import java.util.Arrays;

public class AlphabetSoup {
    public static String alphSoup(String str) {

        char[] letters = str.toCharArray();
        Arrays.sort(letters);
        return String.valueOf(letters);

    }

    public static void main(String[] args) {
        System.out.println(alphSoup("leftfield"));
        System.out.println(alphSoup("underworld"));
    }
}
