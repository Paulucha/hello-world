package zadaniaRekrutacyjne;

public class solutions {

    /**
     * 1.  prosty program, który sprawdzi, czy dana liczba
     * (int) jest palindromem
     * – dowolny sposób
     * – pracuj tylko na typie int
     */
    public static void main(String[] args) {

        String s = "abcdcba";
        System.out.println(
                isStringPalindrome(s));
    }


    public boolean isIntPalindrom(int number) {
        int palindrome = number;
        int reverse = 0;
        while (palindrome != 0) {
            int counter = palindrome % 10;
            reverse = reverse * 10 + counter;
            palindrome = palindrome / 10;
        }
        return number == reverse;

    }

    /**
     * 2.
     * napisz prosty program, który sprawdzi, czy dany tekst
     * (String) jest palindromem
     * – dowolny sposób
     * – nie korzystając z metody substring()
     */

    public static boolean isStringPalindrome(String s) {

        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        return reverse.equals(s);

    }

}
