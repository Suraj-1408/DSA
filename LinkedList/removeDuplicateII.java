//Node class

class Node{
	//every node consist of data value and pointer to next node.
	int val;
	Node next;

	//initializing a node by making use of constructor.
	Node(int data){
		this.val = data;
		this.next = null;
	}
}



public class removeDuplicateII{

	//method to remove all duplicate occurence more than once or twice.
	//Using a temporary node called prev that stores only unique node.
	public static Node removeAllDuplicates(Node head){
		
		Node curr = head;
		Node temp =  new Node(0);
		temp.next = head;

		Node prev = temp;

		while(curr != null){
		
			boolean duplicate = false;	
			//to remove duplicates,we need to reach the last node of duplicate.
			while(curr.next != null && curr.val == curr.next.val){
				duplicate = true;
				curr = curr.next;
			}

			//now here check if(dup) found the prev i.e indirectly traversing original list will point to current't next.
			if(duplicate){
				prev.next = curr.next;
			}
			//if not duplicate simply move prev by 1.
			else{
				prev  = prev.next;
			}

			curr = curr.next;
		}

		return temp.next; 
	}

	/*
	//this approach would remove only two occurrence of duplicate node.
	
	//method to remove duplicate compeletly, not even a single node of duplicate should exist.
	public static Node removeAllDuplicate(Node head){
		
		Node curr = head;
		Node newHead = null;
		Node temp = newHead;

		while(curr != null && curr.next != null){
			
			//if curr.val == curr.next.val
			if(curr.val == curr.next.val){
				curr = curr.next.next;
			}

			else{
				//check if newhead exist, if its null ,initialize newhead with some head.
				if(newHead == null){
					newHead = curr;
					temp = newHead;
				}

				else{
					temp.next = curr;	//make pointer of temp node to point to new node.
					temp = curr;	//move temp to newly added node.
				}
		
				curr = curr.next;
			}

		}	
		
		if(curr.next == null){
			temp.next = curr;
			temp = curr;
		}

		return newHead;
	}
	*/


	
	//print
	public static void print(Node head){
		Node curr = head;

		while(curr != null){
			System.out.print(curr.val+"->");
			curr = curr.next;
		}

		System.out.println("NULL");
	}
	//main
	public static void main(String[] args){
		
		Node head  = new Node(1);
		Node first = new Node(1);
		Node second = new Node(1);

		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(4);
		Node sixth = new Node(5);

		//linking each node.
		head.next = first;
		first.next =second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;

		//printing node value
		System.out.println("Node in linked list are:");
		print(head);

		Node newHead = removeAllDuplicates(head);
		System.out.println("On removing duplicates:");
		print(newHead);

	}

}
