package com.stayready.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public static Integer[] deleteEvens(Integer[] ints) {
        ArrayList<Integer> odds = new ArrayList<Integer>(Arrays.asList(ints));
        for (int i = 0; i < odds.size(); i++) {
            if (odds.get(i) % 2 == 0) {
                odds.remove(i);
            }
        }
        return odds.toArray(new Integer[0]);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public static Integer[] deleteOdds(Integer[] ints) {
        ArrayList<Integer> evens = new ArrayList<Integer>(Arrays.asList(ints));
        for (int i = 0; i < evens.size(); i++) {
            if (evens.get(i) % 2 != 0) {
                evens.remove(i);
            }
        }
        return evens.toArray(new Integer[0]);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public static Integer[] deleteMultiplesOf3(Integer[] ints) {
        ArrayList<Integer> noMultiplesOf3 = new ArrayList<Integer>();
        for (Integer num : ints) {
            if (num % 3 != 0) {
                noMultiplesOf3.add(num);
            }
        }
        return noMultiplesOf3.toArray(new Integer[0]);
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public static Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        ArrayList<Integer> noMultiplesOfN = new ArrayList<Integer>();
        for (Integer num : ints) {
            if (num % multiple != 0) {
                noMultiplesOfN.add(num);
            }
        }
        return noMultiplesOfN.toArray(new Integer[0]);
    }
}
