package ar.com.algoritmos;

public class Node implements ListNode {

	int item;
	ListNode next;
			
	public Node() {this.item = 0;next = null;}
	public Node(int item) {this.item = item;}
	public Node(int item, ListNode node) {this.item = item;this.next = node;}
	
	public int getItem() {return this.item;}

	public ListNode getNext() {return next;}
	public void setNext(ListNode next) {this.next = next;}		
}
