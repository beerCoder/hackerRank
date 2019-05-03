package com.java.datastructure;
 
//Print Singly linked list in reverse order
public class PrintLinkedListInReverseOrder {
   
   static class Node{
      private int data;
      private Node next;
      
      public Node(int data) {
       this.data = data;
      }
      public void setNext(Node next) {
       this.next = next;
      }
      public Node getNext() {
       return next;
      }
      public int getData() {
       return data;
      }
      public void setData(int data) {
       this.data = data;
      }
     }
   
   
 Node startNode=null;
 
 public static void main(String[] args) {
  new PrintLinkedListInReverseOrder();
 }
 public PrintLinkedListInReverseOrder() {
  Node n1 = new Node(10);
  Node n2 = new Node(20);
  Node n3 = new Node(30);
  Node n4 = new Node(40);
  Node n5 = new Node(50);
  Node n6 = new Node(60);
  Node n7 = new Node(70);
  Node n8 = new Node(80);
 
  n1.setNext(n2);
  n2.setNext(n3);
  n3.setNext(n4);
  n4.setNext(n5);
  n5.setNext(n6);
  n6.setNext(n7);
  n7.setNext(n8);
 
  startNode = n1; 
  printLinkedListInReverse(startNode);
 }
 
 //Recursive approach.
 private void printLinkedListInReverse(Node startNode){
  if(startNode==null){
   return;
  }
  printLinkedListInReverse(startNode.getNext());
  System.out.print(startNode.getData() + " " );
 }
}