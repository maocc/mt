package com.maocc.mt.genericity;

/**
 * @author maocc
 * @description
 * @date: 2019/2/18 9:55
 */
public class Pair<K, V> {
	private K key;
	private V value;
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public void setKey(K key) { this.key = key; }
	public void setValue(V value) { this.value = value; }
	public K getKey()   { return key; }
	public V getValue() { return value; }
}
