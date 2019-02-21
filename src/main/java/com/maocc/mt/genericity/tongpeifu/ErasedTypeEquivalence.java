package com.maocc.mt.genericity.tongpeifu;

import java.util.ArrayList;

/**
 * @author maocc
 * @description
 * @date: 2019/2/18 10:25
 */
public class ErasedTypeEquivalence {
	public static void main(String[] args) {
		Class c1 = new ArrayList<String>().getClass();
		Class c2 = new ArrayList<Integer>().getClass();
		// true
		System.out.println(c1 == c2);
	}
}
