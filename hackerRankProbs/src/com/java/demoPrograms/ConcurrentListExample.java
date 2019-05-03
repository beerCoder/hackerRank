package com.java.demoPrograms;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentListExample {

    public static void main(String[] args) {
        //List<String> list = new ArrayList<>();
        CopyOnWriteArrayList <String> list = new CopyOnWriteArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        
        // get the iterator
        Iterator<String> it = list.iterator();
        list.add("11");
        list.add("10");
        list.add("12");
        list.add("13");
        list.remove("5");
        list.remove("13");
        System.out.println("list i111s:"+list);
        //manipulate list while iterating
        while(it.hasNext()){
           // System.out.println("list is:"+list);
            String str = it.next();
            //System.out.println(str);
            
            list.remove("1");
            list.add("8");
           
            /*if(str.equals("2"))list.remove("5");
            //it.remove();unsupportedOperation
            if(str.equals("3"))list.add("6");
            //below code don't throw ConcurrentModificationException
            //because it doesn't change modCount variable of list
            if(str.equals("4")) list.set(1, "7");*/
        }
       // System.out.println("list is end:"+list);
    }

}