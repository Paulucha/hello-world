package codeSignal;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CommonTechniquesTest {

//@Test
//    void sumInRange() {
//        //GIVEN
//        int[] nums = {3, 0, -2, 6, -3, 2};
//        int[][] queries = {{0, 2}, {2, 5}, {0, 5}};
//        CommonTechniques.sumInRange(nums, queries);
////WHEN
//        int result = CommonTechniques.sumInRange(nums, queries);
////THEN
//Assertions.assertEquals(result,10);
//    }

    @Test
    void sumOfTwo() {
        //GIVEN
        int [] a = {1,2,3};
        int [] b = {10, 20,30,40};
        int v = 42;

        //WHEN
        boolean result = CommonTechniques.sumOfTwo(a,b,v);

        //THEN

        Assertions.assertEquals(result,true);
    }
}