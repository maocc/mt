package com.maocc.mt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author maocc
 * @description
 * @date: 2019/2/19 16:35
 */
public class ArraysTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3", "4");
        System.out.println(list);

        List<User> users = Arrays.asList(new User("maocc", 29), new User("maoc", 29));

        users.stream().forEach(user -> System.out.println(user.getUserName() + "| " + user.getAge()));

        int[] intArr = {0, 1, 8, 3, 9, 5, 6, 7};
        System.out.println(Arrays.binarySearch(intArr, 7));

        System.out.println(Arrays.binarySearch(intArr, 1, 7, 3));

        int[] ints = Arrays.copyOf(intArr, 2);
        System.out.println(ints.length);

		int[] ints1 = Arrays.copyOf(intArr, intArr.length + 1);
		Arrays.fill(intArr,ints1.length-2,ints1.length-1,100);


		Arrays.sort(intArr);
		Arrays.stream(intArr).forEach(System.out::print);

	}

    static class User {
        private Long id;
        private String userName;
        private Integer age;

        public User(String userName, Integer age) {
            this.userName = userName;
            this.age = age;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}
