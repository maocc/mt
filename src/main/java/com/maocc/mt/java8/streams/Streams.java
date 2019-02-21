package com.maocc.mt.java8.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author maocc
 * @description
 * @date: 2019/2/19 13:18
 */
public class Streams {



    public static void main(String[] args) {
        final Collection<Task> tasks = Arrays.asList(new Task(Status.OPEN, 5), new Task(Status.OPEN, 13), new Task(Status.CLOSED, 8));

        long totalPointsOfOpenTasks = tasks.stream().filter(task -> task.status.equals(Status.OPEN)).mapToInt(Task::getPoints).sum();

        Integer reduce = tasks.stream().parallel().map(Task::getPoints).reduce(0, Integer::sum);
        System.out.println(reduce);

        tasks.stream().filter(task -> task.status.equals(Status.OPEN)).forEach(task -> System.out.println(task.getStatus() + "|" + task.getPoints()));
        System.out.println("Total points: " + totalPointsOfOpenTasks);



        final Map<Status, List<Task>> map = tasks.stream().collect(Collectors.groupingBy(Task::getStatus));
        System.out.println(map);


        final double totalPoints = tasks.stream().parallel()
                // or map( Task::getPoints )
                .map(task -> task.getPoints()).reduce(0, Integer::sum);

        System.out.println("Total points (all tasks): " + totalPoints);

        // Stream< String >
        final Collection<String> result = tasks.stream()
                // IntStream
                .mapToInt(Task::getPoints)
                // LongStream
                .asLongStream()
                // DoubleStream
                .mapToDouble(points -> points / totalPoints).boxed() // Stream< Double >
                // LongStream
                .mapToLong(weigth -> (long) (weigth * 100))
                // Stream< String>
                .mapToObj(percentage -> percentage + "%")
                // List< String >
                .collect(Collectors.toList());

        System.out.println(result);
    }

    private enum Status {
        /**
         * open 开 关
         */
        OPEN, CLOSED
    };

    private static final class Task {
        private final Status status;
        private final Integer points;

        Task(final Status status, final Integer points) {
            this.status = status;
            this.points = points;
        }

        public Integer getPoints() {
            return points;
        }

        public Status getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return String.format("[%s, %d]", status, points);
        }
    }
}
