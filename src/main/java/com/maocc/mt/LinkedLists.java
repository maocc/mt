package com.maocc.mt;

import java.util.LinkedList;
import java.util.List;

/**
 * @author maocc
 * @description
 * @date: 2019/2/20 16:36
 */
public class LinkedLists {
    public static void main(String[] args) {
        List linkedList = new LinkedList();
        for (int i = 0; i < 5; i++) {
            linkedList.add(i + "");
        }
		linkedList.add(3,"999");
    }

}
