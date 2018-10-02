package codeSignal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CommonTechniques {

    /**
    Given an array of integers, write a function that determines whether the array contains any duplicates. Your function should return true if any element appears at least twice in the array, and it should return false if every element is distinct.
     */
    boolean containsDuplicates(int[] a) {
        HashSet<Integer> list = new HashSet<>();
        for (int i=0; i<a.length; i++){
            list.add(a[i]);
    }
    if (a.length > list.size()){
        return true;
    }
    else return false;
    }

    /**
    You have two integer arrays, a and b, and an integer target value v. Determine whether there is a pair of numbers, where one number is taken from a and the other from b, that can be added together to get a sum of v. Return true if such a pair exists, otherwise return false.
     */

    boolean sumOfTwo(int[] a, int[] b, int v) {
        if(a.length==0 && b.length==0) return false;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i< a.length; i++ )
            set.add(v-a[i]);
        for(int i=0; i< b.length; i++){
            if(set.contains(b[i])) return true;
        }
        return false;
    }
}
