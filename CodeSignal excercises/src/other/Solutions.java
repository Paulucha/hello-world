package other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solutions {
    /**
     * 1. Napisz metodę, która pobierze Stringa i zwróci Stringa zawierającego wszystkie litery, które nie występują w Stringu wejściowym.
     * 2. Pomijamy białem znaki i znaki specjalne.
     * 3. Bierzemy pod uwagę tylko małe znaki US-ASCII (a, b, c, d, ..., z)
     */

    static String negativeString(String s) {

        String negative = "";
        String alphabet = "qwertyuiopasdfghjklzxcvbnm";
        String[] splitedAlphabet = alphabet.split("");
        List<String> splitedAlphabetList = new ArrayList<String>(Arrays.asList(splitedAlphabet));

        String[] splitedString = s.split("");
        List<String> splitedStringList = new ArrayList<String>(Arrays.asList(splitedString));

        for (int i = 0; i < splitedStringList.size(); i++) {
            if (splitedAlphabetList.contains(splitedStringList.get(i))) {
                splitedAlphabetList.remove(splitedStringList.get(i));
            }

        }
        Collections.sort(splitedAlphabetList);
        return splitedAlphabetList.toString();
    }

    /**
     * 1. Napisz metodę, która pobierze liczbę całkowitą (n) i zwróci n-ty element ciągu Fibonacciego (https://pl.wikipedia.org/wiki/Ciąg_Fibonacciego)
     * 2. Przetestuj metodę dla n = 0, 1, 2, 3, 5, 10 i 100
     */

    static int nFibRecursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return (nFibRecursive(n - 1) + nFibRecursive(n - 2));
        }
    }

    static int nFib(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        }
        int f1 = 0;
        int f2 = 1;
        int res = 0;
        for (int i = 1; i < n; i++) {
            res = f1 + f2;
            f1 = f2;
            f2 = res;
        }
        return res;
    }
}
