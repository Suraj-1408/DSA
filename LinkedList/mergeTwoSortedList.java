import java.util.*;

class Node{
	//data members 
	int data;
	Node next;

	//initialize using constructor and storing in heap memory.
	Node(int val){
		this.data = val;
		this.next = null;
	}

} 

public class mergeTwoSortedList{
	
	//method to merge two given  list.
	public static Node mergeList(Node list1,Node list2){
		
		//newnode for merge list.
		Node list3 = null;
		Node temp = null;

		//note since new head that is to be returned is for the newly created node and not the existing given head node.
		//hence updating the given head won't matter.

		while(list1 != null && list2 != null){
			
			//compare values of given node.ADD it to list3 if node value is <= other node.
			if(list1.data <= list2.data){
				//since the head is not created yet, we make head.
				if(list3 == null){
					list3 = list1;		
					temp  = list1;		//this is keeps track of last node without updating newhead
				}

				else{
					temp.next  = list1;	//add node to list.
					temp = temp.next;	//move temp to last node.
				}


				list1 = list1.next;		//update the list1 position
			}


			else{
				//check for null(if list2 values is smaller)
				if(list3 == null){
					list3 =  list2;		//set newHead.
					temp = list2;		//move temp to newHead.
				}
				else{
					temp.next = list2;		//Add node to list3.
					temp = temp.next;		//move temp to last node.
				}
			
				list2 = list2.next;
			}

		}

		//working for remianing node.
		while(list1 != null){
			temp.next = list1;	//add node to list.
			temp = temp.next;	//move temp to last node.
						
			list1 = list1.next;	//update position of list1.
		}


		//similarly for other node.
		while(list2 != null){
			temp.next = list2;
			temp = temp.next;

			list2 = list2.next;
		}

		return list3;
		
	}


	//method to print the list
	public static void list(Node head){
		
		Node temp = head;

		while(temp != null){
			System.out.print(temp.data+"->");
			temp = temp.next;
		}

		System.out.println("NULL");
	}


	//main method
	public static void main(String[] args){
		
		Node head1 = new Node(1);
		Node f1 = new Node(3);
		Node f2 = new Node(5);

		//linking
		head1.next = f1;
		f1.next = f2;

		Node h2 = new Node(2);
		Node t1 = new Node(4);
		Node t2 = new Node(6);

		//linking
		h2.next =t1;
		t1.next = t2;

		System.out.println("Given list are");
		list(head1);
		System.out.println("");
		list(h2);


		//calling method to merger two given list.
	//Since it return head

		System.out.println("On merging the sorted list is:");
		Node newHead = mergeList(head1,h2);
		list(newHead);

	}
}
