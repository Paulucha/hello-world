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
     * Consider integer numbers from 0 to n - 1 written down along the circle in such a way that the distance between any two neighboring numbers is equal (note that 0 and n - 1 are neighboring, too).
     * <p>
     * Given n and firstNumber, find the number which is written in the radially opposite position to firstNumber.
     */

    int circleOfNumbers(int n, int firstNumber) {
        int x = (n / 2 + firstNumber) % n;
        return x;
    }

    /**
     * One night you go for a ride on your motorcycle. At 00:00 you start your engine, and the built-in timer automatically begins counting the length of your ride, in minutes. Off you go to explore the neighborhood.
     * <p>
     * When you finally decide to head back, you realize there's a chance the bridges on your route home are up, leaving you stranded! Unfortunately, you don't have your watch on you and don't know what time it is. All you know thanks to the bike's timer is that n minutes have passed since 00:00.
     * <p>
     * Using the bike's timer, calculate the current time. Return an answer as the sum of digits that the digital timer in the format hh:mm would show.
     */


    int lateRide(int n) {

        int h = n / 60;
        int minutes = n % 60;
        int sumHour = 0;
        int sumMin = 0;


        List<Integer> hour = new ArrayList<>();
        while (h > 0) {
            hour.add((int) (h % 10));
            h = h / 10;
        }
        for (int i = 0; i < hour.size(); i++) {
            sumHour = sumHour + hour.get(i);
        }

        List<Integer> min = new ArrayList<>();
        while (minutes > 0) {
            min.add((int) (minutes % 10));
            minutes = minutes / 10;
        }
        for (int i = 0; i < min.size(); i++) {
            sumMin = sumMin + min.get(i);
        }

        return sumHour + sumMin;

    }

    /**
     * Some phone usage rate may be described as follows:
     * <p>
     * first minute of a call costs min1 cents,
     * each minute from the 2nd up to 10th (inclusive) costs min2_10 cents
     * each minute after 10th costs min11 cents.
     * You have s cents on your account before the call. What is the duration of the longest call (in minutes rounded down to the nearest integer) you can have?
     */

    int phoneCall(int min1, int min2_10, int min11, int s) {
        if (s < min1) {
            return 0;
        }
        for (int i = 2; i <= 10; i++) {
            if (s < min1 + min2_10 * (i - 1)) {
                return i - 1;
            }
        }
        return 10 + (s - min1 - min2_10 * 9) / min11;
    }

    /**
     * Given an array of strings, return another array containing all of its longest strings.
     */

    static String[] allLongestStrings(String[] inputArray) {

        ArrayList<String> lista = new ArrayList<>();
        int max = 0;
        for (String anInputArray : inputArray) {
            if (anInputArray.length() > max) {
                max = anInputArray.length();
            }
        }
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() == max) {
                lista.add(inputArray[i]);
            }

        }
        return lista.toArray(new String[lista.size()]);
    }

    /**
     * Given two strings, find the number of common characters between them.
     */

    int commonCharacterCount(String s1, String s2) {
        int count = 0;
        String[] parts1 = s1.split("");


        for (int i = 0; i < parts1.length; i++) {
            if (s2.contains(parts1[i])) {

                count = count + 1;
            }
            s2 = s2.replaceFirst(parts1[i], ".");
        }
        return count;
    }

    /**
     * Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.
     * <p>
     * Given a ticket number n, determine if it's lucky or not.
     */

    boolean isLucky(int n) {

        ArrayList<Integer> lista = new ArrayList<>();
        int sum1 = 0;
        int sum2 = 0;
        while (n > 0) {
            lista.add(n % 10);
            n = n / 10;
        }
        for (int i = 0; i < (lista.size() / 2); i++) {
            sum1 = sum1 + lista.get(i);
        }
        for (int i = lista.size() / 2; i < lista.size(); i++) {
            sum2 = sum2 + lista.get(i);

        }
        if (sum1 == sum2) {
            return true;
        } else return false;

    }

    /**
     * You are playing an RPG game. Currently your experience points (XP) total is equal to experience. To reach the next level your XP should be at least at threshold. If you kill the monster in front of you, you will gain more experience points in the amount of the reward.
     * <p>
     * Given values experience, threshold and reward, check if you reach the next level after killing the monster.
     */

    boolean reachNextLevel(int experience, int threshold, int reward) {

        if (experience + reward >= threshold) {
            return true;
        } else return false;
    }

    /**
     * You found two items in a treasure chest! The first item weighs weight1 and is worth value1, and the second item weighs weight2 and is worth value2. What is the total maximum value of the items you can take with you, assuming that your max weight capacity is maxW and you can't come back for the items later?
     * <p>
     * Note that there are only two items and you can't bring more than one item of each type, i.e. you can't take two first items or two second items.
     */

    int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {

        if (weight1 >= maxW && weight2 <= maxW) {
            return value2;
        } else if (weight2 >= maxW && weight1 <= maxW) {
            return value1;
        } else if (weight1 + weight2 <= maxW) {
            return value1 + value2;
        } else if (weight1 >= maxW && weight2 >= maxW) {
            return 0;
        } else if (weight1 <= maxW && weight2 <= maxW) {
            if (value1 > value2) {
                return value1;
            } else if (value2 > value1) {
                return value2;
            }
        }
        return value1;
    }

    /**
     * You're given three integers, a, b and c. It is guaranteed that two of these integers are equal to each other. What is the value of the third integer?
     */

    int extraNumber(int a, int b, int c) {

        if (a == b) {
            return c;
        }
        if (b == c) {
            return a;
        } else
            return b;
    }

    int extraNumber2(int a, int b, int c) {
        return a ^ b ^ c;
    }

    /**
     * Given integers a and b, determine whether the following pseudocode results in an infinite loop
     * <p>
     * while a is not equal to b do
     * increase a by 1
     * decrease b by 1
     * Assume that the program is executed on a virtual machine which can store arbitrary long numbers and execute forever.
     */

    boolean isInfiniteProcess(int a, int b) {

        if (a > b) {
            return true;
        } else if ((b - a) % 2 == 0) {
            return false;
        } else return true;
    }

    /**
     * Consider an arithmetic expression of the form a#b=c. Check whether it is possible to replace # with one of the four signs: +, -, * or / to obtain a correct expression.
     */

    boolean arithmeticExpression(int a, int b, int c) {


        if ((a + b == c) || (a * b == c) || (a / b == c) && a % b == 0 || (a - b == c)) {

            return true;
        } else return false;

    }
    /**
    In tennis, a set is finished when one of the players wins 6 games and the other one wins less than 5, or, if both players win at least 5 games, until one of the players wins 7 games.

Determine if it is possible for a tennis set to be finished with the score score1 : score2.
     */

    boolean tennisSet(int score1, int score2) {
        if (score1==score2){
            return false;
        }
        if ((score1==6 && score2<5)||(score2==6 && score1<5)||(score1==7 & score2>=5)||(score2==7 & score1>=5)){
            return true;
        }

        else return false;
    }
/**
Once Mary heard a famous song, and a line from it stuck in her head. That line was "Will you still love me when I'm no longer young and beautiful?". Mary believes that a person is loved if and only if he/she is both young and beautiful, but this is quite a depressing thought, so she wants to put her belief to the test.

Knowing whether a person is young, beautiful and loved, find out if they contradict Mary's belief.

A person contradicts Mary's belief if one of the following statements is true:

they are young and beautiful but not loved;
they are loved but not young or not beautiful.
 */


boolean willYou(boolean young, boolean beautiful, boolean loved) {
    return (young &&beautiful)^loved;}


    /**
    You just bought a public transit card that allows you to ride the Metro for a certain number of days.

Here is how it works: upon first receiving the card, the system allocates you a 31-day pass, which equals the number of days in January. The second time you pay for the card, your pass is extended by 28 days, i.e. the number of days in February (note that leap years are not considered), and so on. The 13th time you extend the pass, you get 31 days again.

You just ran out of days on the card, and unfortunately you've forgotten how many times your pass has been extended so far. However, you do remember the number of days you were able to ride the Metro during this most recent month. Figure out the number of days by which your pass will now be extended, and return all the options as an array sorted in increasing order.
     */
    int[] metroCard(int lastNumberOfDays) {

        if (lastNumberOfDays == 30){
            return new int[]{31};
        }
        else if (lastNumberOfDays==28){
            return new int []{31};
        }
        else return new int[]{28,30,31};
    }

}
