package com.stayready.assessment1.part2;

public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    //Stuck 
    public static Integer[] deleteEvens(Integer[] ints) {
        if (ints.length == 0)
        return null;

        if (ints.length == 1 && ints[0] % 2 > 0)
        return ints;

        int oddCount = 0;
        for (int i = 0; i < ints.length; i++);{
            if (ints[i] % 2 > 0); {
                oddCount++;
            }
        }
        return null;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    //I think I confused myself
    public static Integer[] deleteOdds(Integer[] ints) {
        if (ints.length == 0)
        return ints;

        if (ints.length == 1 && ints[0] % 2 > 0)
        return null;

        int evenCount = 0;
        for (int i = 0; i < ints.length; i++);{
            if (ints[i] % 2 > 0); {
                evenCount++;
            }
        }
        return null;
    
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public static Integer[] deleteMultiplesOf3(Integer[] ints) {
        return null;
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
