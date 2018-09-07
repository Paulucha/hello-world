import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Intro {


//INTRO

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
        int max = inputArray[0] * inputArray[1];
        for (int i = 2; i < inputArray.length; i++)
            if (max < inputArray[i - 1] * inputArray[i])
                max = inputArray[i - 1] * inputArray[i];
        return max;
    }

    /**
     * Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.
     * A 1-interesting polygon is just a square with a side of length 1.
     * n-interesting polygon is obtained by taking the n - 1-interesting polygon
     * and appending 1-interesting polygons to its rim, side by side.
     * You can see the 1-, 2-, 3- and 4-interesting polygons in the picture below.
     */

    int shapeArea(int n) {
        int area;

        if (n > 1) {
            return area = ((4 * (n - 1)) + (shapeArea(n - 1)));
        } else
            return area = 1;
    }

    /**
     * Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an non-negative integer size. Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly by 1. He may need some additional statues to be able to accomplish that. Help him figure out the minimum number of additional statues needed.
     */

    static int makeArrayConsecutive2(int[] statues) {

        ArrayList<Integer> arrayStatues = new ArrayList<>();
        for (int i = 0; i < statues.length; i++) {
            arrayStatues.add(statues[i]);
        }
        Collections.sort(arrayStatues);
int first = arrayStatues.get(0);
int length= arrayStatues.size();
int last = arrayStatues.get(length-1);
return last - first +1 - arrayStatues.size();


}
}
