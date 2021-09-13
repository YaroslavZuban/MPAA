package ru.FPMI.java.zuban.CountSort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class CountSortTest {

    @org.junit.jupiter.api.Test
    void count_sort() {
        CountSort<Integer> array=new CountSort<>();
        ArrayList<Integer> arrayCopy=new ArrayList<>();

        ArrayList<Integer> mass=new ArrayList<>();
        Assert.assertTrue("Программа работает не верно",array.count_sort(mass,0,mass.size()).equals(arrayCopy));

        arrayCopy.add(1);
        mass.add(1);
        Assert.assertTrue("Программа работает не верно",array.count_sort(mass,0,mass.size()).equals(arrayCopy));

        arrayCopy.add(2);
        mass.add(3);

        arrayCopy.add(3);
        mass.add(2);

        arrayCopy.add(4);
        mass.add(4);
        Assert.assertTrue("Программа работает не верно",array.count_sort(mass,0,mass.size()).equals(arrayCopy));
    }

    @org.junit.jupiter.api.Test
    void count_sort_map(){
        CountSort<Integer> array=new CountSort<>();
        ArrayList<Integer> arrayCopy=new ArrayList<>();

        Map<Integer,Integer> mass=new HashMap<> ();
        Assert.assertTrue("Программа работает не верно",array.count_sort_map(arrayCopy,0,arrayCopy.size()).equals(mass));

        arrayCopy.add(1);
        mass.put(0,1);
        Assert.assertTrue("Программа работает не верно",array.count_sort_map(arrayCopy,0,arrayCopy.size()).equals(mass));

       arrayCopy.add(6);
        arrayCopy.add(5);
        arrayCopy.add(4);
        arrayCopy.add(3);

        mass.put(1,3);
        mass.put(2,4);
        mass.put(3,5);
        mass.put(4,6);

        Assert.assertTrue("Программа работает не верно",array.count_sort_map(arrayCopy,0,arrayCopy.size()).equals(mass));
    }
}