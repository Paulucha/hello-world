import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }


    /**
     * Given a year, return the century it is in. The first century spans from the year 1 up to and including the year 100,
     * the second - from the year 101 up to and including the year 200, etc.
     * <p>
     * Example
     * For year = 1905, the output should be
     * centuryFromYear(year) = 20;
     * For year = 1700, the output should be
     * centuryFromYear(year) = 17.
     */

    int centuryFromYear(int year) {

        int sto = 100;
        int century = year / sto;
        if (year % sto == 0) {

            return century;
        } else
            return century + 1;
    }

    /**
     * Given the string, check if it is a palindrome.
     * <p>
     * Example
     * <p>
     * For inputString = "aabaa", the output should be
     * checkPalindrome(inputString) = true;
     * For inputString = "abac", the output should be
     * checkPalindrome(inputString) = false;
     * For inputString = "a", the output should be
     * checkPalindrome(inputString) = true.
     */
    boolean checkPalindrome(String inputString) {
        String reverse = new StringBuilder(inputString).reverse().toString();
        if (reverse.equals(inputString)) {
            return true;
        } else return false;

    }

    /**
     * Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
     * <p>
     * Example
     * <p>
     * For inputArray = [3, 6, -2, -5, 7, 3], the output should be
     * adjacentElementsProduct(inputArray) = 21.
     * <p>
     * 7 and 3 produce the largest product.
     */
    int adjacentElementsProduct(int[] inputArray) {
        int max = inputArray[0]*inputArray[1];
        for(int i = 2;i < inputArray.length;i++)
            if(max < inputArray[i-1]*inputArray[i])
                max = inputArray[i-1]*inputArray[i];
        return max;
    }


}