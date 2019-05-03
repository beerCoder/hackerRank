package com.java.datastructure;

import com.java.datastructure.ReverseLinkedList.Node;

public class SinglyLinkedList
{

      private ListNode head; // head node to hold the list
      
      public static void main(String[] agrs)
      {
         //10 --> 8 --> 1--> 11 --> null
         ListNode head     = new ListNode(10);
         ListNode second   = new ListNode(5);
         ListNode third    = new ListNode(8);
         ListNode fourth   = new ListNode(11);
         
         head.next   = second;
         second.next = third;
         third.next  = fourth;   
         
         SinglyLinkedList list = new SinglyLinkedList();
         //list.head = new ListNode(10);
         list.displayListNode(head);
         list.insertAtPosition(head, 2, 16);
         list.displayListNode(head);
         System.out.println("New Node at Start");
         ListNode newHead = list.insertAtFirst(head, 4);
         list.displayListNode(newHead);
         System.out.println("New Node at End");
         ListNode newTail = list.insertAtLast(head, 21);
         list.displayListNode(newTail);
         System.out.println("");
         ListNode nthNode = list.printNthFromLast(3,newTail);
         list.displayListNode(nthNode);
         //System.out.println(head); 
      }

      
      private static class ListNode {
         
         private int data;
         public ListNode next;
         
         public ListNode(int data){
            this.data = data;
            this.next = null;
         }
         
      }
      
      public boolean isEmpty()
      {
         return (head == null);
      }    
      
      // display list items
      public void displayListNode(ListNode head){
         
         if(head== null ){
            return;
         }
         
         ListNode current = head;
         while (current != null){
            System.out.print(current.data + "-->");
            current = current.next;
         } 
         System.out.println("displayListNode "+current);
      }
      
      public int lenghtOfNode (ListNode head){
          
         if(head == null){
            return 0;
         }
         
         ListNode current = head;
         int count = 0;
         while (current != null){
            count++;
            current= current.next;            
         }
         return count;
      }
      
      
      // Insert a node in Linked List at given position
      public ListNode insertAtPosition(ListNode head, int pos, int data){
         
         if(head == null){
            System.out.println("Invalid head");
         }
         ListNode newNode = new ListNode(data);
         ListNode previous = head;
         int count = 1;
         while (count < pos-1){
            previous = previous.next;
            count++;
         }
         
         ListNode current = previous.next;
         newNode.next = current;
         previous.next = newNode;
         
         return head;
         
      }
      
      // Insert a node in Linked List at first position
      public ListNode insertAtFirst(ListNode head, int data){
         
         if(head == null){
            System.out.println("Invalid head");
         }
         ListNode newNode = new ListNode(data);
         newNode.next = head;  
         head = newNode;
         
         return head;
      }
      
      // Insert a node in Linked List at last position
      public ListNode insertAtLast(ListNode head, int data){
         
         if(head == null){
            System.out.println("Invalid head");
         }
         
         ListNode newNode = new ListNode(data);
         ListNode current = head;
                  
         while(current.next != null){
           current = current.next;
         }         
         current.next=newNode;
         return head;
      }
      
      /* Function to get the nth node from the last of a
      linked list */
      public ListNode printNthFromLast(int n, ListNode head)
      {
          int len = 0;
          ListNode temp = head;
   
          // 1) count the number of nodes in Linked List
          while (temp != null)
          {
              temp = temp.next;
              len++;
          }
   
          // check if value of n is not more than length of
          // the linked list
          if (len < n)
              return head;
   
          temp = head;
   
          // 2) get the (n-len+1)th node from the begining
          for (int i = 1; i < len-n+1; i++)
              temp = temp.next;
   
          System.out.println(temp.data);
         return temp;
      }
      
 
      //How to search an element in a linked list
      
    //Checks whether the value x is present in linked list 
      public boolean search(ListNode head, int x) 
      { 
    	  ListNode current = head;    //Initialize current 
          while (current != null) 
          { 
              if (current.data == x) 
                  return true;    //data found 
              current = current.next; 
          } 
          return false;    //data not found 
      } 
      
      /* Function to reverse the linked list */
      public ListNode reverse(ListNode node) {
    	  ListNode prev = null;
    	  ListNode current = node;
    	  ListNode next = null;
          while (current != null) {
              next = current.next;
              current.next = prev;
              prev = current;
              current = next;
          }
          node = prev;
          return node;
      }
      
      /* Given a reference (pointer to pointer) to the head of a list 
      and a position, deletes the node at the given position */
      public void deleteNode(int position) 
	   { 
	       // If linked list is empty 
	       if (head == null) 
	           return; 
	 
	       // Store head node 
	       ListNode temp = head; 
	 
	       // If head needs to be removed 
	       if (position == 0) 
	       { 
	           head = temp.next;   // Change head 
	           return; 
	       } 
	 
	       // Find previous node of the node to be deleted 
	       for (int i=0; temp!=null && i<position-1; i++) 
	           temp = temp.next; 
	 
	       // If position is more than number of ndoes 
	       if (temp == null || temp.next == null) 
	           return; 
	 
	       // Node temp->next is the node to be deleted 
	       // Store pointer to the next of node to be deleted 
	       ListNode next = temp.next.next; 
	 
	       temp.next = next;  // Unlink the deleted node from list 
	   } 
      
     
    /**
      *  Returns a deep copy of the list
      *  Complexity: O(n^2)
     
      public  LinkedList<AnyType> copy1()
      {
         LinkedList<AnyType> twin = new LinkedList<AnyType>();
         Node<AnyType> tmp = head;
         while(tmp != null)
         {
            twin.addLast( tmp.data );
            tmp = tmp.next;
         }

         return twin;
      } */
    /**
      *  Returns a deep copy of the list
      *  Complexity: O(n)
      
      public LinkedList<AnyType> copy2()
      {
         LinkedList<AnyType> twin = new LinkedList<AnyType>();
         Node<AnyType> tmp = head;
         while(tmp != null)
         {
            twin.addFirst( tmp.data );
            tmp = tmp.next;
         }

         return twin.reverse();
}*/
      
      /**
       *  Reverses the list
       *  Complewxity: O(n)
       
       public LinkedList<AnyType> reverse()
       {
          LinkedList<AnyType> list = new LinkedList<AnyType>();
          Node<AnyType> tmp = head;
          while(tmp != null)
          {
             list.addFirst( tmp.data );
             tmp = tmp.next;
          }
          return list;
       }*/
      
      

     
      
     
}
