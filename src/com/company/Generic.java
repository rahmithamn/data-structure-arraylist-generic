package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class Generic<E extends Comparable<? super E>> {
    private final ArrayList<E> list;

    public Generic(int capacity) {
        int initCapacity = capacity > 0? capacity: 0;
        list = new ArrayList<>(initCapacity);
    }
    public void addData(E values) {
        list.add(values);
    }
    public void displayData() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }
    public void displaySort() {
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }
    public void removeData(E entry) {
        if(entry instanceof ATK){
            list.remove(entry);
        }
        if(entry instanceof Bag){
            list.remove(entry);
        }
    }
    public int getSize() {
        return list.size();
    }

    public ArrayList<E> getData(){
        return list;
    }
    public void updateData(E object1, E object2) {
        int index = list.indexOf(object1);
        list.set(index, object2);
    }
}
