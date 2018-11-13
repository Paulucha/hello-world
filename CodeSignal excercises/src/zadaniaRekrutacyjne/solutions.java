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

    /**
     * 3.
     * napisz program, który zamienia wartości dwóch liczb
     * ▪ nie korzystaj z pomocniczej zmiennej
     */

    public static void changePlace(int a, int b) {
        print(a, b);

        a = a + b;
        b = a - b;
        a = a - b;

        print(a, b);
    }

    private static void print(int a, int b) {
        System.out.println(a + " " + b);
    }
}

/**
 * 4.
 * zaimplementuj wzorzec singleton
 */
class MySingleton {
    private static MySingleton SINGLETON_INSTANCE;

    private MySingleton() {
    }

    public synchronized static MySingleton getInstance() {
        if (SINGLETON_INSTANCE == null) {
            SINGLETON_INSTANCE = new MySingleton();
        }
        return SINGLETON_INSTANCE;
    }


    public boolean myEquals(String s1, String s2) {


        if (s1.equals(null) || s2.equals(null)) {
            return false;
        }


        if (s1.equals(s2)) {
            return true;
        } else return false;

    }
    public static class Static

    {

        {

            int x = 5;
            boolean a;

            if ( a = true){

        }

        }
if (a = true)

        static int x,y;

        public static void main(String args[])

        {

            x--; myMethod();

            System.out.println(x + y + ++x);

        }

        public static void myMethod()

        {

            y = x++ + ++x;

        }

    }

    public static class Test {

        static int age;

        public static void main (String args []) {

            age = age + 1;

            System.out.println("The age is " + age);

        }

    }

    public boolean myEquals(String s1, String s2) {



        if (s1.equals(null) || s2.equals(null)) {
            return false;
        }

        String str1 = s1.replaceAll(" ","");
        String str2 = s2.replaceAll(" ","");

        if (str1.equals(str2)) {
            return true;
        } else return false;

    }

    class MyThread extends Thread
02
    {
        03
        public void run()
        04
        {
            05
            System.out.println("MyThread: run()");
            06
        }
        07
        public void start()
        08
        {
            09
            System.out.println("MyThread: start()");
            10
        }
        11
    }
12
    class MyRunnable implements Runnable
13
    {
        14
        public void run()
        15
        {
            16
            System.out.println("MyRunnable: run()");
            17
        }
        18
        public void start()
        19
        {
            20
            System.out.println("MyRunnable: start()");
            21
        }
        22
    }
23
    public class MyTest
24
    {
        25
        public static void main(String args[])
        26
        {
            27
            MyThread myThread  =  new MyThread();
            28
            MyRunnable myRunnable = new MyRunnable();
            29
            Thread thread  =  new Thread(myRunnable);
            30
            myThread.start();
            31
            thread.start();
            32
        }

    }


}
