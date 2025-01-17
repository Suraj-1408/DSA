import java.util.*;

//creating Node of struct type
class Node{
	int data;
	Node next;

	//creating a constructor to initialize of every newNode.i.e is created.
	Node(int data){
	//in order to initialize node value we make use of this keyword in java.
	this.data = data;
	this.next = null;
	}

}

//Class for deletingNodeWithoutUsingHead
class deletingNodeWithoutUsingHead{
	public static void deleteNodeWithoutHead(Node del){
		//Inorder to remove any given node , wihtout given any start or head node.
		//1) Update the given node that is to be deleted with next node of it.GO doing this until for next node becomes null.

		Node temp = del;

	
		/*
		//1)APPROACH - If node that is to be deleted is not the 2nd last node.otherwise for this case it will fail.
	
		//until (temp and temp.next) != null, update the value of temp node with that of temp.next
		while(temp != null && temp.next != null){	
				
			//keep on updating current node value with next node value until we reach to 2nd last node.
			temp.data = temp.next.data;	//value update
		       	temp = temp.next;		//position update.

			//check if we reached to 2nd last node.
			if(temp.next.next == null){
				temp.data = temp.next.data;
				temp.next = null;
				break;
			}

				
			//temp.data = temp.next.data;	//updated the temp node with its next node.
			//temp.next = null;
			//temp = temp.next;		//updating the position of temp to next.
			
		}
		*/
		

		//2nd APPROACH , directly updating the current node with next node value.AND then making it point to next of next node.
		
		//Update the current node
		temp.data = temp.next.data;

		//making current node point to next of next node (removal of desired node from list.) 
		temp.next = temp.next.next;

		//2->3->4->5
		//remove 3
		//RESULT : 2->4->5

		//with the helps of update statement i.e temp.data = temp.next.data, list becomes
		//2->4->4->5
		//here temp is still present on second node.
		//using statement : temp.next = temp.next.next; list becomes.
		//2->4->5


	}
}


//class for printlist
class list{
	public static void printlist(Node head){
		
		Node temp = head;

		while(temp != null){
			System.out.print(temp.data+"->");
			temp = temp.next;
		}

		System.out.println("null");
	}
}

//main class
public class deleteNodeWithoutHead{
	
	public static void main(String[] args){
		Node head;
		head = new Node(2);
		Node first = new Node(4);	
		Node second = new Node(6);
		Node third = new Node(8);
		Node fourth = new Node(10);


		//linking each of them
		head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;

		//calling printlist
		list.printlist(head);


		System.out.println("Calling deleteNodeWithoutUsingHead class ");
		deletingNodeWithoutUsingHead.deleteNodeWithoutHead(second);

		//calling printlist function again from class list.
		list.printlist(head);
	}
}
