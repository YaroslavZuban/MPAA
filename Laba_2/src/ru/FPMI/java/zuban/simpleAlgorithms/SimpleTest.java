package ru.FPMI.java.zuban.simpleAlgorithms;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.*;

class SimpleTest {

    @Test
    void has_duplicates() {
        int n=100000;
        ArrayList<Integer> list=new ArrayList<>();
        Simple<Integer> simple=new Simple<>();
        for(int i=0;i<n;i++){
            list.add(i);
        }

        int addElement=n-2;
        list.add(addElement);
        Assert.assertEquals("Проверка на коректность работы на дублирования функции: ",simple.has_duplicates(list),true);

        ArrayList<Integer> list1=new ArrayList<>();
        for(int i=0;i<n;i++){
            list1.add(i);
        }

        Assert.assertEquals("Проверка на коректность работы на дублирования функции: ",simple.has_duplicates(list1),false);
    }

    @Test
    void get_duplicates() {
        int n=1000;
        ArrayList<Integer> list=new ArrayList<>();
        Simple<Integer> simple=new Simple<>();
        for(int i=0;i<n;i++){
            list.add(i);
        }

        int addElement=n-2;
        list.add(addElement);

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(addElement);

        Assert.assertEquals("Проверка на коректность работы на дублирования функции: ",simple.get_duplicates(list),list1);

        list.add(addElement+1);
        list1.add(addElement+1);
        Assert.assertEquals("Проверка на коректность работы на дублирования функции: ",simple.get_duplicates(list),list1);


    }
}