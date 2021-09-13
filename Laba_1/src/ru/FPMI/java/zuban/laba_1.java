package ru.FPMI.java.zuban;

import java.time.Duration;
import java.time.Instant;
import java.util.*;


public class laba_1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число N: ");
            long n = scanner.nextLong();

            //vector заполнения
            Vector<Integer> vector = new Vector<>();
            Instant  time = Instant.now();
            for (int i = 0; i < n; i++) {
                vector.add(i);
            }
            System.out.println("Заполнения вектора: " + Duration.between(time, Instant.now()));

            //list заполнения
            LinkedList<Integer> linkedList = new LinkedList<>();
            Instant  time1 =  Instant.now();;
            for (int i = 0; i < n; i++) {
                linkedList.add(i);
            }
            System.out.println("Заполнения листа: " + Duration.between(time1, Instant.now()));

            //set заполнения
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            Instant  time6 = Instant.now();
            for (int i = 0; i < n; i++) {
                treeMap.put(i, i);
            }
            System.out.println("Заполнения set: " + Duration.between(time6, Instant.now()));

            //unordered_set заполнения
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            Instant  time7 = Instant.now();
            for (int i = 0; i < n; i++) {
                hashMap.put(i, i);
            }
            System.out.println("Заполнения unordered_set: " + Duration.between(time7, Instant.now()));


            Iterator<Integer> iterator = vector.iterator();
            int sum = 0;
            Instant  time2 =  Instant.now();;

            while (iterator.hasNext()) {
                sum += iterator.next();
            }

            System.out.println("Обход через итератор вектора: " + Duration.between(time2, Instant.now()));

            Instant  time3 =  Instant.now();;
            int sum1 = 0;
            Iterator<Integer> iterator1 = linkedList.iterator();
            while (iterator1.hasNext()) {
                sum1 += iterator1.next();
            }
            System.out.println("Обход через итератор list: " + Duration.between(time3, Instant.now()));

            Instant  time9 =  Instant.now();;
            int sum2 = 0;
            Iterator<Map.Entry<Integer, Integer>> iterator2 = treeMap.entrySet().iterator();
            while ((iterator2.hasNext())) {
                Map.Entry<Integer, Integer> pair = iterator2.next();
                sum2 += pair.getKey() + pair.getValue();
            }
            System.out.println("Обход через итератор set: " + Duration.between(time9, Instant.now()));

            Instant  time8 =  Instant.now();;
            int sum3 = 0;
            Iterator<Map.Entry<Integer, Integer>> iterator3 = hashMap.entrySet().iterator();
            while (iterator3.hasNext()) {
                Map.Entry<Integer, Integer> pair1 = iterator3.next();
                sum3 += pair1.getKey() + pair1.getValue();
            }
            System.out.println("Обход через итератор unordered_set: " +Duration.between(time8, Instant.now()));

            int number= scanner.nextInt();
            Instant  time4 =  Instant.now();;
            Optional<Integer> optionalInteger = vector.stream().filter(s -> s > number-1).findFirst();
            System.out.println("Поиск элемента в векторе: " + Duration.between(time4, Instant.now()));

            Instant  time5 =  Instant.now();;
            Optional<Integer> optionalInteger1 = linkedList.stream().filter(s -> s > number-1).findFirst();
            System.out.println("Поиск элемента в листе: " + Duration.between(time5, Instant.now()));

            Instant  time10 =  Instant.now();;
            boolean element = treeMap.containsValue( number);
            System.out.println("Поиск элемента в set: " +element +" время равно: "+ Duration.between(time10, Instant.now()));

            Instant  time11 =  Instant.now();;
            boolean element1 = hashMap.containsValue(number);
            System.out.println("Поиск элемента в хэш-мап: " +element1 +" время равно: "+ Duration.between(time11, Instant.now()));
        }
    }