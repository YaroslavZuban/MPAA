package ru.FPMI.java.zuban.simpleAlgorithms;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Scanner;

public class laba_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer>list =new ArrayList<>();
        Simple<Integer> simple=new Simple<>();

        System.out.print("Введите число: ");
        int number=scanner.nextInt();

        for(int i=0;i<number;i++){
            list.add(i);
        }

        list.add(number-2);
        list.add(number-3);
        list.add(number-4);

        Instant time= Instant.now();
        boolean isRepeat=simple.has_duplicates(list);
        System.out.println("Повторы в list: "+isRepeat+" время работы программа: "+ Duration.between(time,Instant.now()));

        Instant time1=Instant.now();
        ArrayList<Integer> list1=simple.get_duplicates(list);
        System.out.println("Время работы программа: "+ Duration.between(time1,Instant.now()));

        System.out.println(list1);
    }
}
