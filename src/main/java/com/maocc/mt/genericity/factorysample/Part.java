package com.maocc.mt.genericity.factorysample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author maocc
 * @description
 * @date: 2019/2/18 10:43
 */
public class Part {

    static List<Factory<? extends Part>> partFactories = new ArrayList<>();
    private static Random rand = new Random(47);

    static {
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new FanBelt.Factory());
        // partFactories.add(new PowerSteeringBelt.Factory());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Part.createRandom());
        }
    }

    public static Part createRandom() {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
