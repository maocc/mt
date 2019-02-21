package com.maocc.mt;

import com.sun.org.apache.xpath.internal.functions.FuncSubstring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author maocc
 * @description
 * @date: 2019/1/31 14:27
 */
public class Test {

    public static void main(String[] args) {
        Integer integer = 134;
        System.out.println(integer);


        List<String> list = new ArrayList<String>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        addList(list);
        Integer[] integer1 = {2, 3, 4};
        add(integer1);
        System.out.println(list);
        System.out.println(Arrays.asList(integer1));

        String string = "你好，中国";
		substring(string);
		System.out.println(string);

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("nihaoa");



		int result = 17;
		int x = 100123;
		result = 31 * result + x;
		int y = 200333;
		result = 31 * result + y;
		int z = 388541;
		result = 31 * result + z;
		System.out.println(result);
	}

	private static void substring(String string) {
		string = string.substring(0,1);

		System.out.println(string);
	}

	private static void add(Integer[] integer1) {
        integer1[0] = 2000000000;
    }

    private static void addList(List<String> list) {
        list.add("你是不是咸鱼");
    }
}
