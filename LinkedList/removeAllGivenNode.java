/*
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]

Input: head = [], val = 1
Output: []

Input: head = [7,7,7,7], val = 7
Output: []
*/

import java.util.*;

//declaring class of Node.
class Node{
	//data members.
	int val;
	Node next;


	//initializing node value using constructor.
	Node(int val){
		this.val = val;
		this.next = null;	
	}
	

	//return new Node(val);	
}

public class removeAllGivenNode{
	public static Node removeGivenNode(Node head,int val){
		
		//handling if all start(Head) node are == val.
		while(head != null && head.val == val){	
			head = head.next;	//update head.
		}


		//Handling intermediate  nodes.
		Node temp = head;
	
		while(temp != null && temp.next != null){
			
			//taking action if encounter node is given node.
			if(temp.next.val == val){
				temp.next = temp.next.next;	//updating the next pointer node.
			}

			else{
				temp = temp.next;	//update temp position.
			}
		}

		return head;	
	}


	//function for printing list.
	public static void printlist(Node head){
		
		Node temp = head;
		
		while(temp != null){
			System.out.print(temp.val+"->");	//print node val
			temp = temp.next;	//update position
		}
		System.out.println("NULL");
	}

	//main function
	public static void main(String[] args){
		
		//intializing the linked list.
		Node head = new Node(2);	
		Node second = new Node(4);
		Node third = new Node(6);
		Node fourth =  new Node(8);
		Node fifth = new Node(10);


		//linking initialized nodes
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		System.out.println("Printing all given nodes.");
		removeAllGivenNode.printlist(head);

		//calling function for removal of given node.
		
		Node newHead = removeAllGivenNode.removeGivenNode(head,2);

		System.out.println("List after removal of given node.");
                removeAllGivenNode.printlist(newHead);


	}
}


