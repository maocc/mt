package com.maocc.mt.java8;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author maocc
 * @description
 * @date: 2019/2/19 14:36
 */
public class Base64s {
    public static void main(String[] args) {
        final String text = "Base64 finally in Java 8!";

        final String encoded = Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
        System.out.println(encoded);

        final String decoded = new String(Base64.getDecoder().decode(encoded), StandardCharsets.UTF_8);
        System.out.println(decoded);
    }
}
