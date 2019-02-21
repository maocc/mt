package com.maocc.mt.genericity;

/**
 * @author maocc
 * @description
 * @date: 2019/2/18 9:51
 */
public class Box<T> {
    public T object;

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
}
