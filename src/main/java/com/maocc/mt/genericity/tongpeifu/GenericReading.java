package com.maocc.mt.genericity.tongpeifu;

import java.util.Arrays;
import java.util.List;

/**
 * @author maocc
 * @description
 * @date: 2019/2/18 10:14
 */
public class GenericReading {
    static List<Apple> apples = Arrays.asList(new Apple());
    static List<Fruit> fruit = Arrays.asList(new Fruit());

    static void f1() {
        Reader<Fruit> fruitReader = new Reader<Fruit>();
        // Errors: List<Fruit> cannot be applied to List<Apple>.
        // Fruit f = fruitReader.readExact(apples);
    }


    static void f2() {
        CovariantReader<Fruit> fruitReader = new CovariantReader<>();
        fruitReader.readCovariant(fruit);
        fruitReader.readCovariant(apples);
    }

    public static void main(String[] args) {
        f2();
    }

    static class Reader<T> {
        T readExact(List<T> list) {
            return list.get(0);
        }
    }

    static class CovariantReader<T> {
        T readCovariant(List<? extends T> list) {
            return list.get(0);
        }
    }
}
