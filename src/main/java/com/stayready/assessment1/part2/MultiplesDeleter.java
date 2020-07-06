package com.stayready.assessment1.part2;

public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public static Integer[] deleteEvens(Integer[] ints) {
        int valid=0;
        int index=0;
        for (int i = 0; i < ints.length; i++) {
            if(ints[i]%2==0)
                ints[i]=null;
            else
                valid++;
        }
        Integer[] removed=new Integer[valid];
        for (int j = 0; j < ints.length; j++) {
            if(ints[j]!=null){
                removed[index]=ints[j];
                index++;
            }
        }
        return removed;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public static Integer[] deleteOdds(Integer[] ints) {
        int valid=0;
        int index=0;
        for (int i = 0; i < ints.length; i++) {
            if(ints[i]%2==1)
                ints[i]=null;
            else
                valid++;
        }
        Integer[] removed=new Integer[valid];
        for (int j = 0; j < ints.length; j++) {
            if(ints[j]!=null){
                removed[index]=ints[j];
                index++;
            }
        }
        return removed;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public static Integer[] deleteMultiplesOf3(Integer[] ints) {
        int valid=0;
        int index=0;
        for (int i = 0; i < ints.length; i++) {
            if(ints[i]%3==0)
                ints[i]=null;
            else
                valid++;
        }
        Integer[] removed=new Integer[valid];
        for (int j = 0; j < ints.length; j++) {
            if(ints[j]!=null){
                removed[index]=ints[j];
                index++;
            }
        }
        return removed;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public static Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        int valid=0;
        int index=0;
        for (int i = 0; i < ints.length; i++) {
            if(ints[i]%multiple==0)
                ints[i]=null;
            else
                valid++;
        }
        Integer[] removed=new Integer[valid];
        for (int j = 0; j < ints.length; j++) {
            if(ints[j]!=null){
                removed[index]=ints[j];
                index++;
            }
        }
        return removed;
    }
}
