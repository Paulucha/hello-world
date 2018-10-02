package codeSignal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CommonTechniques {

    /**
     * Given an array of integers, write a function that determines whether the array contains any duplicates. Your function should return true if any element appears at least twice in the array, and it should return false if every element is distinct.
     */
    boolean containsDuplicates(int[] a) {
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        if (a.length > list.size()) {
            return true;
        } else return false;
    }

    /**
     * You have two integer arrays, a and b, and an integer target value v. Determine whether there is a pair of numbers, where one number is taken from a and the other from b, that can be added together to get a sum of v. Return true if such a pair exists, otherwise return false.
     */

    static boolean sumOfTwo(int[] a, int[] b, int v) {
        if (a.length == 0 && b.length == 0) return false;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++)
            set.add(v - a[i]);
        for (int i = 0; i < b.length; i++) {
            if (set.contains(b[i])) return true;
        }
        return false;
    }

    /**
     * You have an array of integers nums and an array queries, where queries[i] is a pair of indices (0-based). Find the sum of the elements in nums from the indices at queries[i][0] to queries[i][1] (inclusive) for each query, then add all of the sums for all the queries together. Return that number modulo 109 + 7.
     */

    static int sumInRange(int[] nums, int[][] queries) {
        int mod= 1000000007;
        ArrayList<Integer> list = new ArrayList<>();

        for (int j = 0; j < queries.length; j++) {
            for (int i = queries[j][0]; i <= queries[j][1]; i++) {
                list.add(nums[i]);
                            }
        }
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        return (sum+mod)%mod;
    }


}
