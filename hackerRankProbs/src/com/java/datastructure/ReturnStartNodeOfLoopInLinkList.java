package com.java.datastructure;

//Find start of loop in linkedlist
�
public class ReturnStartNodeOfLoopInLinkList {
��
�Node startNode;
�
�public static void main(String[] args) {
��
��ReturnStartNodeOfLoopInLinkList g = new ReturnStartNodeOfLoopInLinkList();
���
��Node n1 = new Node(10);
��Node n2 = new Node(20);
��Node n3 = new Node(30);
��Node n4 = new Node(40);
��Node n5 = new Node(50);
��Node n6 = new Node(60);
��Node n7 = new Node(70);
��Node n8 = new Node(80);
���
��g.startNode = n1;
���
��n1.setNext(n2);
��n2.setNext(n3);
��n3.setNext(n4);
��n4.setNext(n5);
��n5.setNext(n6);
��n6.setNext(n7);
��n7.setNext(n8);
��n8.setNext(n6);
���
��Node loopNode = g.getStartNodeOfLoopInLinklist(g.startNode);
���
��if(loopNode==null){
���System.out.println("Loop not present");
��}else{
���System.out.println("Start node of Loop is :"+loopNode.getData()); 
��}
�}
��
�private Node getStartNodeOfLoopInLinklist(Node startNode){
��Node tortoisePointer = startNode; // Initially ptr1 is at starting location.
��Node harePointer = startNode; // Initially ptr2 is at starting location.
���
��// If ptr2 encounters NULL, it means there is no Loop in Linked list.
��while(harePointer!=null && harePointer.getNext()!=null){
���tortoisePointer = tortoisePointer.getNext(); // ptr1 moving one node at at time
���harePointer = harePointer.getNext().getNext(); // ptr2 moving two nodes at at time
����
���// if ptr1 and ptr2 meets, it means linked list contains loop.
���if(tortoisePointer==harePointer){ 
�����
����//After meet, moving tortoisePointer to start node of list.
����tortoisePointer = startNode; 
�����
����//Moving tortoisePointer and harePointer one node at a time till the time they meet at common point. 
����while(tortoisePointer!=harePointer){ 
�����tortoisePointer = tortoisePointer.getNext(); 
�����harePointer = harePointer.getNext();
����}
�����
����//returning start node of loop.
����return tortoisePointer;
�����
���}
��}
���
��// this condition will arise when there is no loop in list.
��return null; 
�}
��
}