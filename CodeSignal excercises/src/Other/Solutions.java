package Other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solutions {
      /**
1. Napisz metodę, która pobierze Stringa i zwróci Stringa zawierającego wszystkie litery, które nie występują w Stringu wejściowym.
2. Pomijamy białem znaki i znaki specjalne.
3. Bierzemy pod uwagę tylko małe znaki US-ASCII (a, b, c, d, ..., z)
     */

      static String negativeString (String s){

          String negative = "";
         String alphabet = "qwertyuiopasdfghjklzxcvbnm";
         String[] splitedAlphabet = alphabet.split("");
          List<String> splitedAlphabetList = new ArrayList<String>(Arrays.asList(splitedAlphabet));

         String[] splitedString = s.split("");
          List<String> splitedStringList = new ArrayList<String>(Arrays.asList(splitedString));

         for (int i =0; i<splitedStringList.size(); i++){
             if (splitedAlphabetList.contains(splitedStringList.get(i))){
                 splitedAlphabetList.remove(splitedStringList.get(i));
             }

         }

          return splitedAlphabetList.toString();
      }
}
