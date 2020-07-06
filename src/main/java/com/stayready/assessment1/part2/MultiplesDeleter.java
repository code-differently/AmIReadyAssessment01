package com.stayready.assessment1.part2;

import java.util.ArrayList;

public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public static Integer[] deleteEvens(Integer[] ints) {
        ArrayList<Integer> noEvens = new ArrayList<>();

        for(int i = 0; i < ints.length; i++) {
            if(ints[i] % 2 != 0) {
                noEvens.add(ints[i]);
            }
        }

        Integer[] newArray = new Integer[noEvens.size()];
        for(int j = 0; j < newArray.length; j++) {
            newArray[j] = noEvens.get(j);
        }
        
        return newArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public static Integer[] deleteOdds(Integer[] ints) {
        ArrayList<Integer> noOdds = new ArrayList<>();

        for(int i = 0; i < ints.length; i++) {
            if(ints[i] % 2 == 0) {
                noOdds.add(ints[i]);
            }
        }

        Integer[] newArray = new Integer[noOdds.size()];
        for(int j = 0; j < newArray.length; j++) {
            newArray[j] = noOdds.get(j);
        }
        
        return newArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public static Integer[] deleteMultiplesOf3(Integer[] ints) {
        ArrayList<Integer> noMultiOf3 = new ArrayList<>();

        for(int i = 0; i < ints.length; i++) {
            if(ints[i] % 3 != 0) {
                noMultiOf3.add(ints[i]);
            }
        }

        Integer[] newArray = new Integer[noMultiOf3.size()];
        for(int j = 0; j < newArray.length; j++) {
            newArray[j] = noMultiOf3.get(j);
        }
        
        return newArray;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public static Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        ArrayList<Integer> noMultiOfN = new ArrayList<>();

        for(int i = 0; i < ints.length; i++) {
            if(ints[i] % multiple != 0) {
                noMultiOfN.add(ints[i]);
            }
        }

        Integer[] newArray = new Integer[noMultiOfN.size()];
        for(int j = 0; j < newArray.length; j++) {
            newArray[j] = noMultiOfN.get(j);
        }
        
        return newArray;
    }
}
