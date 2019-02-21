package com.maocc.mt.genericity;

/**
 * @author maocc
 * @description
 * @date: 2019/2/18 9:54
 */
public class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray) {
            if (e.compareTo(elem) > 0) {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Integer[] arri = {1,2,3,4,5};
        int middle = 3;
        System.out.println( countGreaterThan(arri,middle));
    }
}


