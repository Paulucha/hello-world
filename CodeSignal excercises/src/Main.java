import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String[] aray ={"aba","aa", "ad", "vcd", "aba"};

        Intro.makeArrayConsecutive2(new int[]{2, 3, 6, 9});
        Intro.almostIncreasingSequence(new int[]{2,9, 6, });
        System.out.println(TheCore.largestNumber(3));
//        System.out.println(TheCore.lateRide(1439));
        System.out.println(Other.findRepeat("hello"));
        System.out.println(TheCore.allLongestStrings(aray));
    }
}