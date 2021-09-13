package ru.FPMI.java.zuban.CountSort;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

public class MainCountSort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CountSort<Integer> array=new CountSort<>();

        System.out.print("Введите число: ");
        int n=scanner.nextInt();

        ArrayList<Integer> arrayList=new ArrayList<>();
        ArrayList<Integer> arrayList1=new ArrayList<>();
        ArrayList<Integer> arrayList2=new ArrayList<>();
        for(int i=n;i>=0;i--){
            arrayList.add(i);
            arrayList1.add(i);
            arrayList2.add(i);
        }

        ArrayList<Integer> arraySort=new ArrayList<>();

        Instant time= Instant.now();
        arraySort=array.count_sort(arrayList,0,arrayList.size());
        System.out.println("Время работы count_Sort: "+ Duration.between(time,Instant.now()));

        Instant time1= Instant.now();
        Collections.sort(arrayList1);
        System.out.println("Время работы Collections.sort: "+ Duration.between(time1,Instant.now()));


        Instant time2= Instant.now();
        Map<Integer,Integer> sort_map=array.count_sort_map(arrayList2,0,arrayList2.size());
        System.out.println("Время работы count_Sort_map: "+ Duration.between(time2,Instant.now()));
    }
}
