package com.java.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTraversal {
	private Node rootNode;

	public static void main(String[] args) {
		new BinaryTreeTraversal();
	}

	public BinaryTreeTraversal(){

		addNode(rootNode, 45); 
		addNode(rootNode, 25); 
		addNode(rootNode, 75); 
		addNode(rootNode, 15); 
		addNode(rootNode, 35); 
		
		System.out.println("In Order Traversal :");
		printTreeInOrder(rootNode);
	���
	��System.out.println("\nPre Order Traversal :");
	��printTreePreOrder(rootNode);
	���
	��System.out.println("\nPost Order Traversal :");
	��printTreePostOrder(rootNode);
	���
	��System.out.println("\nLevel Order Traversal :");
	��printTreeLevelOrder(rootNode);
	�}���// Levelorder
	// Printing.
	�

private void printTreeLevelOrder(Node rootNode){
		��if(rootNode==null)
			���return;
		�
		��Queue<Node> queue = new LinkedList<Node>();
		��queue.add(rootNode);
		���
		��while(!queue.isEmpty()){
			���Node obj = (Node)queue.poll();
			����
			���System.out.print(obj.getData() + " ");
			����
			���if(obj.getLeft()!=null)
				����queue.add(obj.getLeft());
			�����
			���if(obj.getRight()!=null)
				����queue.add(obj.getRight());
			��}
		�}��// Inorder
	// Printing.
	�

private void printTreeInOrder(Node rootNode){
			��if(rootNode==null)
				���return;
			��printTreeInOrder(rootNode.getLeft());
			��System.out.print(rootNode.getData() + " ");
			��printTreeInOrder(rootNode.getRight());
			�}���// Preorder
	// Printing.
	�

private void printTreePreOrder(Node rootNode){
				��if(rootNode==null)
					���return;
				��System.out.print(rootNode.getData() + " ");
				��printTreePreOrder(rootNode.getLeft());
				��printTreePreOrder(rootNode.getRight());
				�}��// Postorder
	// Printing.
	�

private void printTreePostOrder(Node rootNode){
					��if(rootNode==null)
						���return;
					��printTreePostOrder(rootNode.getLeft());
					��printTreePostOrder(rootNode.getRight());
					��System.out.print(rootNode.getData() + " ");
						�}����

	private void addNode(Node rootNode, int data){
							��if(rootNode==null){
								���Node temp1 = new Node(data);
								���this.rootNode=temp1;
								��}else{
									���addNodeInProperPlace(rootNode, data);
									��}
							�}���

	private void addNodeInProperPlace(Node rootNode, int data){ 
								��if(data>rootNode.getData()){
									���if(rootNode.getRight()!=null){
										����addNode(rootNode.getRight(), data);
										���}else{
											����Node temp1 = new Node(data);
											����rootNode.setRight(temp1);
											���}
									��}else if(data<rootNode.getData()){
										���if(rootNode.getLeft()!=null){
											����addNode(rootNode.getLeft(), data);
											���}else{
												����Node temp1 = new Node(data);
												����rootNode.setLeft(temp1);
												���}
										��}
								�}��
}