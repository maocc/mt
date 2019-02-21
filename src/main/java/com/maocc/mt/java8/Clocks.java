package com.maocc.mt.java8;

import java.time.*;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author maocc
 * @description
 * @date: 2019/2/19 13:56
 */
public class Clocks {

    public static void main(String[] args) throws ScriptException {
        final Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
        System.out.println(clock.millis());
        final LocalDate date = LocalDate.now();
        final LocalDate dateFromClock = LocalDate.now(clock);

        System.out.println(date);
        System.out.println(dateFromClock);

        // Get the local date and local time
        final LocalTime time = LocalTime.now();
        final LocalTime timeFromClock = LocalTime.now(clock);

        System.out.println(time);
        System.out.println(timeFromClock);
        System.out.println(LocalDateTime.now());


        LocalDateTime of = LocalDateTime.of(LocalDate.of(2019, 02, 18), LocalTime.of(12, 00, 00));
        LocalDateTime of1 = LocalDateTime.of(LocalDate.now(), LocalTime.now());

        Duration between = Duration.between(of, of1);
        System.out.println("days= " + between.toDays() + " hours= " + between.toHours() + " mins= " + between.toMinutes());



        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        System.out.println(engine.getClass().getName());
        System.out.println("Result:" + engine.eval("function f() { return 1; }; f() + 1;"));
    }
}
