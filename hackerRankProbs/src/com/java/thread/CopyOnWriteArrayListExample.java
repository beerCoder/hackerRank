package com.java.thread;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * Java program to demonstrate What is CopyOnWriteArrayList in Java,
 * Iterator of CopyOnWriteArrayList
 * doesn’t support add, remove or any modification operation.
 *
 * @author Java67
 */
public class CopyOnWriteArrayListExample{

    public static void main(String args[]) {
      
        CopyOnWriteArrayList<String> threadSafeList = new CopyOnWriteArrayList<String>();
        threadSafeList.add("Java");
        threadSafeList.add("J2EE");
        threadSafeList.add("Collection");
        threadSafeList.add("Collectdsfdsion");
        //add, remove operator is not supported by CopyOnWriteArrayList iterator
        Iterator<String> failSafeIterator = threadSafeList.iterator();
        while(failSafeIterator.hasNext()){
           threadSafeList.remove("Java");
           threadSafeList.add("Java8");
            System.out.printf("Read from CopyOnWriteArrayList : %s %n", failSafeIterator.next());
           // failSafeIterator.remove(); //not supported in CopyOnWriteArrayList in Java
           
        }
        
        List<String> mylist = new CopyOnWriteArrayList<String>();
        mylist.add("Javaaaa");
        mylist.add("J2EE1");
        mylist.add("Collectionasd");
        mylist.add("Collectdsfdsionasdf");
        
        Iterator<String> mylist1 = mylist.iterator();
        while(mylist1.hasNext()){
           String value = mylist1.next();
           if(value == "Javaaaa"){
              mylist.remove("J2EE1");
              mylist.add("Java8");
           }
           
            System.out.printf("Read from CopyOnWriteArrayList : %s %n", value);
           // failSafeIterator.remove(); //not supported in CopyOnWriteArrayList in Java
           
        }
        
        
    }
}

