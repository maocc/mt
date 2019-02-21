package com.maocc.mt;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author maocc
 * @description
 * @date: 2019/2/20 9:45
 */
public class ArrayLists {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.remove(2);

        String file = "G:\\Data\\arraylist.txt";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(list);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        ArrayList<String> arrayList = (ArrayList<String>) ois.readObject();
        arrayList.stream().forEach(System.out::println);
    }
}
