package com.stayready.assessment1.part2;

public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public static Integer[] deleteEvens(Integer[] ints) {
        int [] temp;
        for (int i = 0; i < ints.length; i++) {
            if(ints[i] % 2 == 0){}
              //ints.remove(i);
        }
        return ints;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public static Integer[] deleteOdds(Integer[] ints) {
        int [] temp;
        for (int i = 0; i < ints.length; i++) {
            if(ints[i] % 2 != 0){}
              //ints.remove(i);
        }
        return ints;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public static Integer[] deleteMultiplesOf3(Integer[] ints) {
        int [] temp;
        for (int i = 0; i < ints.length; i++) {
            if(ints[i] % 3 != 0){}
              //ints.remove(i);
        }
        return ints;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public static Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        return null;
    }
}
