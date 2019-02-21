package com.maocc.mt;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author maocc
 * @description
 * @date: 2019/2/20 17:40
 */
public class LruCache<K, V> extends LinkedHashMap<K, V> {
    private static final int MAX_ENTRIES = 3;

    LruCache() {
        super(MAX_ENTRIES, 0.75f, true);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > MAX_ENTRIES;
    }

	public static void main(String[] args) {
		LruCache<Integer, String> cache = new LruCache<>();
		cache.put(1, "a");
		cache.put(2, "b");
		cache.put(3, "c");
		cache.get(1);
		cache.put(4, "d");
		System.out.println(cache.keySet());
	}
}
