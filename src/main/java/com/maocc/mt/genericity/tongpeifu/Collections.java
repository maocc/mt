package com.maocc.mt.genericity.tongpeifu;

import java.util.List;

/**
 * @author maocc
 * @description
 * @date: 2019/2/18 10:23
 */
public class Collections {
	public static <T> void copy(List<? super T> dest, List<? extends T> src) {
		for (int i=0; i<src.size(); i++) {
			dest.set(i, src.get(i));
		}
	}
}
