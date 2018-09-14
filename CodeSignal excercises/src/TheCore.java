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
        double number = 0;
        for (int i = 0; i < n; i++) {
            number = number + ((Math.pow(10, i)) * 9);
        }
        return (int) number;
    }

    /**
     * n children have got m pieces of candy. They want to eat as much candy as they can, but each child must eat exactly the same amount of candy as any other child. Determine how many pieces of candy will be eaten by all the children together. Individual pieces of candy cannot be split.
     * <p>
     * Example
     * <p>
     * For n = 3 and m = 10, the output should be
     * candies(n, m) = 9.
     * <p>
     * Each child will eat 3 pieces. So the answer is 9.
     */

    int candies(int n, int m) {

        int candiesToEat = (m / n) * n;


        return candiesToEat;
    }

    /**
     * Your friend advised you to see a new performance in the most popular theater in the city. He knows a lot about art and his advice is usually good, but not this time: the performance turned out to be awfully dull. It's so bad you want to sneak out, which is quite simple, especially since the exit is located right behind your row to the left. All you need to do is climb over your seat and make your way to the exit.
     * <p>
     * The main problem is your shyness: you're afraid that you'll end up blocking the view (even if only for a couple of seconds) of all the people who sit behind you and in your column or the columns to your left. To gain some courage, you decide to calculate the number of such people and see if you can possibly make it to the exit without disturbing too many people.
     * <p>
     * Given the total number of rows and columns in the theater (nRows and nCols, respectively), and the row and column you're sitting in, return the number of people who sit strictly behind you and in your column or to the left, assuming all seats are occupied.
     */

    int seatsInTheater(int nCols, int nRows, int col, int row) {

        int people = (nCols - col + 1) * (nRows - row);
        return people;
    }

    /**
     * Given a divisor and a bound, find the largest integer N such that:
     * <p>
     * N is divisible by divisor.
     * N is less than or equal to bound.
     * N is greater than 0.
     * It is guaranteed that such a number exists.
     */

    int maxMultiple(int divisor, int bound) {
        int n = 0;
        for (int i = 2; i <= bound; i++) {
            if (divisor * i <= bound) {
                n = i;
            }
        }
        return n * divisor;

    }
/**
 Consider integer numbers from 0 to n - 1 written down along the circle in such a way that the distance between any two neighboring numbers is equal (note that 0 and n - 1 are neighboring, too).

 Given n and firstNumber, find the number which is written in the radially opposite position to firstNumber.
 */

int circleOfNumbers(int n, int firstNumber) {
    int x = (n/2 + firstNumber)%n;
    return x;
}

}
