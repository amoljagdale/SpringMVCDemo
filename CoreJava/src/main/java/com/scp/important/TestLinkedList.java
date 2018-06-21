package com.scp.important;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList.Node head = new LinkedList.Node(1);
		LinkedList linkedList= new LinkedList(head);
		
		linkedList.add(new LinkedList.Node(2));
		linkedList.add(new LinkedList.Node(3));
		
		linkedList.print();
		linkedList.reverse();
		linkedList.print();
	}
}
class LinkedList{
	static class Node{
		private int data;
		private Node next;
		
		public Node(int data)
		{
			this.data= data;
		}
		public int data(){
			return data;
		}
		public Node next(){
			return next;
		}
	}
	private Node head;
	
	public LinkedList (Node head) {
		this.head= head;
	}
	public void add(Node node) {
		Node current = head;
		while (current!=null)
		{
			if(current.next==null) {
				current.next=node;
				break;
			}
			current = current.next;
		}
	}
	public void print() {
		Node node = head;
		while(node!=null) {
			System.out.println(node.data()+" ");
			node = node.next();
		}
		System.out.println();
	}
	
	public void reverse() {
		Node pointer = head;
		
		Node previous=null;
		Node current = null;
		while(pointer!=null) {
			current = pointer;
			pointer = pointer.next;
			
			//reverse link
			current.next = previous;
			previous = current;
			head = current;
		}
	}
	
	
	
}