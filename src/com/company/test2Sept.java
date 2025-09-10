package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test2Sept {
    public static void main(String[] args) {
//
//     String [] studentName = new String[20];
//
//     studentName[2]="priti";
//     //studentName[20] = ""
//        ArrayList<String> studentName1 = new ArrayList<>();
//        studentName1.add("priya");


        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(12);
        list.add(16);list.add(11);
        list.add(19);

        System.out.println(list);
        for (int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        for (Integer ele : list){
            System.out.println(ele);
        }

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

}