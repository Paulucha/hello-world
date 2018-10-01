package Other;

import java.util.HashSet;

public class Other {

    /**
     * Given a string, find out if there's repeat  characters in it.
     */

    static boolean findRepeat(String s) {

        String[] splited = s.split("");
        HashSet<String> h = new HashSet<>();
        for (int i = 0; i < splited.length; i++) {
            if (h.contains(splited[i])) {
                return true;
            }
            h.add(splited[i]);
        }
        return false;
    }

    /**
     * Napisz program, który sprawdzi czy dana liczba to palindrom (https://pl.wikipedia.org/wiki/Palindrom)
     * <p>
     * Np. 1234321 jest palindromem, 12312 nie jest palindromem
     */
    boolean isPalindrom() {
        return false;
    }

    /*
1. Napisz metodę, która pobierze Stringa i zwróci Stringa zawierającego wszystkie litery, które nie występują w Stringu wejściowym.
2. Pomijamy białem znaki i znaki specjalne.
3. Bierzemy pod uwagę tylko małe znaki US-ASCII (a, b, c, d, ..., z)

     */


    /*
1. Napisz metodę, która pobierze liczbę całkowitą (n) i zwróci n-ty element ciągu Fibonacciego (https://pl.wikipedia.org/wiki/Ciąg_Fibonacciego)
2. Przetestuj metodę dla n = 0, 1, 2, 3, 5, 10 i 100
     */

    /*
1. Stwórz interfejs User, który posiada pole name oraz metodę showInfo()
2. Stwórz klasę Admin oraz Developer, które implementują interfejs User
3. Metoda showInfo() powinna wyświetlać napis w formacie name – role, gdzie rola oznacza typ użytkownika (admin, dev)
4. Stwórz obiekty obydwu typów
5. Wywołaj metodę showInfo() dla każego z nich
     */

    /*
1. Stwórz klasę generyczną
2. Dodaj pole T item
3. Dodaj konstruktor z parametrem T ustawiający to pole
4. Dodaj metodę wypisującą typ elementu item (getClass())
5. Stwórz 2 obiekty generyczne różnego typu
6. Na każdym z obiektów wywołaj metodę z punktu 4)

     */

    /*
1. rzeczytaj jak działa algorytm sortowania bąbelkowego (bubble sort)
2. Stwórz metodę, które wykonuje sortowanie bąbelkowe na zadanej tablicy (int[])
np. [3,6,5,2] → [2,3,5,6]
3. Wyświetl zawartość tablicy podczas sortowanie (np. co każdą iterację)
     */

    /*
1. Stwórz klasę Fraction, która ma 2 pola typu int: counter, denominator, oraz pole typu double: value
2. Stwórz w tej klasie metodę, która wypisze na ekranie wartość oraz ułamek w postaci:
value [counter/denominator]
np. 0.5 [1/2]
3. Stwórz kilka obiektów typu Fraction
4. Wywołaj dla nich powyższą metodę
     */

}
