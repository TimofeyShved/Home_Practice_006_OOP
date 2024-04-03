package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        myArrayList m1 = new myArrayList();
        m1.add("new");
        m1.add("list");
        m1.add(1);
        for(int i = 0; i< m1.size(); i++) {
            System.out.println(m1.get(i));
        }
    }
}

class myArrayList<T> {

    ArrayList <T> list = new ArrayList<T>();

    myArrayList(){}

    public void add(T t){
        list.add(t);
    }

    public <T> T get(int index){
        return (T) list.get(index);
    }

    public int size(){
        return list.size();
    }
}
