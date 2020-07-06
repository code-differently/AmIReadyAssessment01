package com.stayready.assessment1.part2;
import java.util.ArrayList;

public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public static Integer[] deleteEvens(Integer[] ints) {
        return ansQuestions(ints, 2, 0);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public static Integer[] deleteOdds(Integer[] ints) {
        return ansQuestions(ints, 2, 1);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public static Integer[] deleteMultiplesOf3(Integer[] ints) {
        return ansQuestions(ints, 3, 0);
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public static Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        return ansQuestions(ints, multiple, 0);
    }

    //refactor so that its less copy paste
    public static Integer[] ansQuestions(Integer [] ints, int multiple, int check) {
        ArrayList <Integer> arr = new ArrayList <Integer> ();
        for(int element: ints) {
            //all elements not divisible by multiple
            if(element % multiple != check) {
                arr.add(element);
            }
        }
        Integer [] ans = new Integer [arr.size()];
        int index = 0;
        for(Integer el : arr) {
            ans[index] = el;
            index++;
        }
        //can't cast the array that arraylist can give to an Integer object, so had to create an Integer []
        return ans;
    }
}
