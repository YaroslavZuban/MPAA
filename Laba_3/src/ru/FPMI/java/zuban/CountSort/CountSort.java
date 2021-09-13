package ru.FPMI.java.zuban.CountSort;

import java.util.*;

public class CountSort<T extends Comparable> {
     public ArrayList<T> count_sort(ArrayList<T> array,int min,int max){
        ArrayList<T> count=new ArrayList<T>((Collection<? extends T>) Collections.nCopies(max-min+1,0));
        int countNumber;

        for(int i=min;i<max;i++){
            countNumber=0;

            for (T t : array) {
                if (array.get(i).compareTo(t) > 0) {
                    countNumber++;
                }
            }

            count.set(countNumber, array.get(i));
        }

        return count;
    }

    public Map<T,T> count_sort_map(ArrayList<T> array,int min,int max){
        Map<Integer,T> count=new HashMap<>(max-min+1);
        int countNumber;

        for(int i=min;i<max;i++){
            countNumber=0;

            for (T t : array) {
                if (array.get(i).compareTo(t) > 0) {
                    countNumber++;
                }
            }

            count.put(countNumber, (T) array.get(i));
        }

        return (Map<T, T>) count;
    }
}
