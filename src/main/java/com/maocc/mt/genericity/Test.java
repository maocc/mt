package com.maocc.mt.genericity;

/**
 * @author maocc
 * @description
 * @date: 2019/2/18 9:53
 */
public class Test {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<Double> doubleBox = new Box<Double>();
        Box<String> stringBox = new Box<String>();


		Pair<Integer, String> p1 = new Pair<>(1, "apple");
		Pair<Integer, String> p2 = new Pair<>(2, "pear");
		boolean same = Util.compare(p1, p2);

		System.out.println(same);
	}
}
