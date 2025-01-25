import java.util.*;

class Node{
	//data members
	int data;
	Node next;

	//constructor.That gets automatically called, when object of class is created.
	Node(int val){
		this.data = val;
		this.next = null;
	}	

}	


//main class
public class removeDuplicatesNode{
	
	//method to remove duplicates node.
	public static Node removeDuplicateNode(Node head){
		
		//if single node exist
		if(head == null || head.next == null){
			return head;
		}

		//using a temp node to traverse and search for duplicate nodes
		Node temp = head;

		while(temp.next != null){
			//since the node are sorted , we can compare node values of current and next node in the list.
			//if current node is <= current. drop the node by pointing the current node to  next.next

			//1->1->2->3->null

			if(temp.data == temp.next.data){
				temp.next = temp.next.next;		//make temp point to next of next(Skipping the middle node.)
			}
			//update the position only when next of current node is != or greater than current node.
			else{
				temp = temp.next;	
			}

		}
		
		return head;
	}

	//method to print list
	public static void list(Node head){
		
		Node temp = head;

		while(temp != null){
			System.out.print(temp.data+"->");	//print current node value
			temp = temp.next;	//move the position of temp.
		}
		System.out.println("NULL");
	}


	//main method
	public static void main(String[] args){
		

		System.out.println("Remove Duplicates node from the list.\n Given list is");
		
		//create objects
		Node head = new Node(1);
		Node second = new Node(1);
		Node third = new Node(2);
		Node fourth =  new Node(3);

		//linking these nodes
		head.next = second;
		second.next = third;
		third.next = fourth;
		//third.next = fourth;

		//printing given list.
		list(head);

		//node calling remove duplicate node.
		//since the methods return a newNode we will create it and initialize it to removeDuplicateNode()
		Node newHead = removeDuplicateNode(head);

		list(newHead);
	}
}



