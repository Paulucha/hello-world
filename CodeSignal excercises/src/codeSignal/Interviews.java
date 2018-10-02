package codeSignal;

import java.util.ArrayList;
import java.util.HashSet;

public class Interviews {

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
}
