package com.java.datastructure;
�

//RemoveLoopInLinkList 
public class RemoveLoopInLinkList {
��
�Node startNode;
�public static void main(String[] args) {
��RemoveLoopInLinkList g = new RemoveLoopInLinkList();
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
��//Detect and Remove Loop in a Linked List
��Node newStart = detectAndRemoveLoopInLinkedList(g.startNode);
��g.printList(newStart);
�}
��
�private static Node detectAndRemoveLoopInLinkedList(Node startNode) {
��Node slowPointer=startNode;
��Node fastPointer=startNode;
��Node previousPointer=null;
���
��while(fastPointer!=null && fastPointer.getNext()!=null){
���slowPointer = slowPointer.getNext();
���previousPointer = fastPointer.getNext(); // For capturing just previous node of loop node for setting it to null for breaking loop.
���fastPointer = fastPointer.getNext().getNext();
����
���if(slowPointer==fastPointer){ // Loop identified.
����slowPointer = startNode;
��
����//If loop start node is starting at the root Node, then we slowpointer, fastpointer and head all point at same location. 
����//we already capture previous node, just setting it to null will work in this case.
����if(slowPointer == fastPointer){
�����previousPointer.setNext(null);
������
����}else{
�����// We need to first identify the start of loop node and then by setting just previous node of loop node next to null.� 
�����while(slowPointer.getNext()!=fastPointer.getNext()){
������slowPointer = slowPointer.getNext();
������fastPointer = fastPointer.getNext();
�����}
�����fastPointer.setNext(null);
����}
���}
��}
��return startNode; 
�}
��
�//Print linked list.
�private void printList(Node startNode){
��while(startNode!=null){
���System.out.print(startNode.getData() + " " ); 
���startNode=startNode.getNext();
��}
�}
��
}