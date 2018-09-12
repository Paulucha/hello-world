import java.util.ArrayList;
import java.util.List;

public class TheCore {
    /**
     * You are given a two-digit integer n. Return the sum of its digits.
     * <p>
     * Example
     * <p>
     * For n = 29, the output should be
     * addTwoDigits(n) = 11.
     */

    int addTwoDigits(int n) {
        int sum = 0;
        List<Integer> digits = new ArrayList<>();
        while (n > 0) {
            digits.add(n % 10);
            n = n / 10;
        }
        for (int i = 0; i < digits.size(); i++) {
            sum = sum + digits.get(i);
        }

        return sum;
    }

    /**
     * Given an array a that contains only numbers in the range from 1 to a.length, find the first duplicate number for which the second occurrence has the minimal index. In other words, if there are more than 1 duplicated numbers, return the number for which the second occurrence has a smaller index than the second occurrence of the other number does. If there are no such elements, return -1.
     */
    int firstDuplicate(int[] a) {
        if (a.length <= 1) return -1;
        for (int i = 0; i < a.length; i++) {
            int pos = Math.abs(a[i]) - 1;
            if (a[pos] < 0) return pos + 1;
            else a[pos] = -a[pos];
        }
        return -1;
    }

    /**
     * Given an integer n, return the largest number that contains exactly n digits.
     * Example
     * For n = 2, the output should be
     * largestNumber(n) = 99.
     */
   static int largestNumber(int n) {
        double number=0;
        for (int i = 0; i < n; i++) {
            number = number + ((Math.pow(10,i)) *9);
        }
        return (int) number;
    }

/**
 n children have got m pieces of candy. They want to eat as much candy as they can, but each child must eat exactly the same amount of candy as any other child. Determine how many pieces of candy will be eaten by all the children together. Individual pieces of candy cannot be split.

 Example

 For n = 3 and m = 10, the output should be
 candies(n, m) = 9.

 Each child will eat 3 pieces. So the answer is 9.
 */

int candies(int n, int m) {

    int candiesToEat=(m/n) *n;


return candiesToEat;
}
}
