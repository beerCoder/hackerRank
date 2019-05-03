package com.java.thread;

public class Snippet
{
   public static void main(String[] args) {
   new Thread( () -> { System.out.println("Thread running"+ Thread.currentThread().getName()); } ).start();
   }
}

