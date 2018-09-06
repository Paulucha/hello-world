import java.util.ArrayList;
import java.util.List;

public class TheCore {
    /**
     You are given a two-digit integer n. Return the sum of its digits.

     Example

     For n = 29, the output should be
     addTwoDigits(n) = 11.
     */

    int addTwoDigits(int n) {
        int sum = 0;
        List<Integer> digits = new ArrayList<>();
        while (n>0){
            digits.add(n%10);
            n = n/10;
        }
        for (int i =0; i < digits.size(); i++){
            sum = sum + digits.get(i);
        }

        return sum;
    }

}
