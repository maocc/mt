package com.maocc.mt.java8;

import java.util.Optional;

/**
 * @author maocc
 * @description
 * @date: 2019/2/19 10:53
 */
public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> fullName = Optional.ofNullable("2");
        System.out.println("Full Name is set? " + fullName.isPresent());
        System.out.println("Full Name: " + fullName.orElse("[none]"));
        System.out.println(fullName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));
    }
}
