package ru.FPMI.java.zuban.simpleAlgorithms;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Simple <T>{
    public  boolean has_duplicates(ArrayList<T> list){
        ArrayList<T> copyList = new ArrayList<>(list);

        int size=copyList.size();
        Set<T> set=new HashSet<>(copyList);

        copyList.clear();
        copyList.addAll(set);

        if(size==copyList.size()){
            return false;
        }

        return true;
    }

    public ArrayList<T> get_duplicates(ArrayList<T> list){
     return (ArrayList<T>) list.stream().collect(Collectors.groupingBy(Function.identity()))
             .entrySet()
             .stream()
             .filter(x->x.getValue().size()>1)
             .map(Map.Entry::getKey)
             .collect(Collectors.toList());
    }
}
