package codeSignal;

public class Main {

    public static void main(String[] args) {

        int[] nums = {3, 0, -2, 6, -3, 2};
        int[][] queries = {{0, 2}, {2, 5}, {0, 5}};
        String[] picture = {"a"};
        System.out.println("Hello World!");
        System.out.println(Intro.addBorder(picture));
        System.out.println(CommonTechniques.sumInRange(nums, queries));
    }
}