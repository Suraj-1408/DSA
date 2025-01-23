import java.util.*;

class Node{
	int val;
	Node next;

	Node(int val){
		this.val = val;
		this.next = null;
	}
}

public class rotateNodebyK{

	public static Node rotatebyK(Node head,int k){
		//computing the length of list.
		//compute the position of kth starting node uisng k%n or n-k
		//make the list circular by joining the last node to first.
		//visit the node before kth start node , break the list.

		int n = 1;
		Node temp = head;

		while(temp.next != null){
			temp = temp.next;
			n++;
		}

		k = k % n;

		//making list  circular.
		temp.next = head;

		Node newTail = head;	//using temporary newTail node for storing updated tail by traversing from head to newTail.
		for(int i = 1; i < n - k;i++){
			newTail = newTail.next;	
		}

		//now we are at node just before start of Kth node  from where all node after must be shifted to start of list.
		//therefore initializing newHead to newTail of next. and then updating  original head.

		Node newHead = newTail.next;	//making newhead.
		newTail.next  = null;	//breaking the link of list.
		head = newHead;

		return head;
	}


	public static void list(Node head){
		
		Node temp = head;

		while(temp != null){
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		System.out.println("NULL");

	}

	
	//main  method
	public static void main(String[] args){
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);

		head.next = second;
		//first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		System.out.println("Printing given list");
		list(head);

		int k = 2;
		System.out.println("List after rotating by k "+k);
		Node newHead = rotatebyK(head,k);
		list(newHead);
	}

}
