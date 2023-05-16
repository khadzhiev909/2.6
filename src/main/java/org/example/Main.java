package org.example;

import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        Collections.sort(nums);
        int firstNumbers = 0;
        for (int num : nums) {
            if (num % 2 == 0 && num != firstNumbers) {
                System.out.println(num);
                firstNumbers = num;
            }
        }
    }

    public static void task3() {
        Set<String> str = new HashSet<>(strings);
        System.out.println(str);
    }

    public static void task4() {
        Set<String> str = new HashSet<>(strings);
        int kol = strings.size() - str.size();
        System.out.println("Кол-во дублей равно " + kol);
    }

}