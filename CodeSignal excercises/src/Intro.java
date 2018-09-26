import java.util.ArrayList;
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
        int length = arrayStatues.size();
        int last = arrayStatues.get(length - 1);
        return last - first + 1 - arrayStatues.size();


    }

    /**
     * Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.
     * <p>
     * Example
     * <p>
     * For sequence = [1, 3, 2, 1], the output should be
     * almostIncreasingSequence(sequence) = false.
     * <p>
     * There is no one element in this array that can be removed in order to get a strictly increasing sequence.
     * <p>
     * For sequence = [1, 3, 2], the output should be
     * almostIncreasingSequence(sequence) = true.
     * <p>
     * You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].
     */

    static boolean almostIncreasingSequence(int[] sequence) {
        int count = 0;
        int max = 0;
        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i - 1] >= sequence[i]) {
                count = count + 1;
                max = i;
            }
        }
        if (count > 1) return false;
        if (count == 0) return true;
        if (max == sequence.length - 1 || max == 1) return true;
        if (sequence[max - 1] < sequence[max + 1]) return true;
        if (sequence[max - 2] < sequence[max]) return true;
        else return false;
    }

    /**
     * After they became famous, the CodeBots all decided to move to a new building and live together. The building is represented by a rectangular matrix of rooms. Each cell in the matrix contains an integer that represents the price of the room. Some rooms are free (their cost is 0), but that's probably because they are haunted, so all the bots are afraid of them. That is why any room that is free or is located anywhere below a free room in the same column is not considered suitable for the bots to live in.
     * <p>
     * Help the bots calculate the total price of all the rooms that are suitable for them.
     */

    int matrixElementsSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix[0].length; i++)
            for (int j = 0; j < matrix.length; j++) {
                if ((matrix[j][i] == 0)) {
                    break;
                } else sum = sum + matrix[j][i];

            }
        return sum;
    }


//    int[] sortByHeight(int[] a) {
//        int index1;
//        int index2;
//        int[] b = new int[1000];
//        int currentMinvalue = -1;
//        ArrayList<Integer> lista = new ArrayList<>();
//        for (index2 = 1; index2 < a.length; index2++) {
//            for (index = 1; index < a.length; index++) {
//                if (a[index] < a[index - 1]) {
//                    currentMinvalue = a[index - 1];
//                    a[index - 1] = a[index];
//                    a[index - 1] = currentMinvalue;
//
//                    //this is the tree
//                }
//            }
//        }
//        lista.sort();
//
//        if (a[index] == -1) {
//            //this is the tree
//        } else {
//
//
//        }
//
//
//    }
//
//}

    int [] sortByHeight1(int[] a) {

        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> calaLista = new ArrayList<>();
        ArrayList<Integer> listaWithTrees = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                lista.add(a[i]);
                calaLista.add(a[i]);
            } else calaLista.add(a[i]);
        }
        Collections.sort(lista);
int count = 0;
        for (int j = 0; j < calaLista.size(); j++) {
            if (calaLista.get(j) == -1) {
                listaWithTrees.add(calaLista.get(j));
                count= count+1;
            }
            else listaWithTrees.add(lista.get(j-count));
        }

        int[] arr = listaWithTrees.stream().mapToInt(i -> i).toArray();
        return arr;
    }

/**
 You have a string s that consists of English letters, punctuation marks, whitespace characters, and brackets. It is guaranteed that the parentheses in s form a regular bracket sequence.

 Your task is to reverse the strings contained in each pair of matching parentheses, starting from the innermost pair. The results string should not contain any parentheses.
 */

String reverseParentheses(String s) {
return s;
}

}
