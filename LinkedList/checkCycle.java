//3,2,0,-4
//linked list position starts from 0.
//(3,0),(2,1),(0,2),(-4,3)

//using fast   & slow pointer technique.
//s = 0 ;s = 1 ;s = 2 ;s = 3
//f = 0; f = 2 ;f = 1 ;f = 3;

//IN above technique we can ,fast pointer meets the slow pointer after some steps ahead. this concludes that there exist a cycle in the list.

//Note - we have to keep checking until OUR FAST REACHES NULL OR FAST MEETS SLOW POINTER.

//Now in order to implement we linked list , we will create a class wiht linked list data memembers .
//AND make use of constructor to initialize the class Node.

class Node{
	//data memebers.
	int data;
	Node next;

	//constructor to initialize the data members.
	Node(int val){
		this.data = val;
		this.next = null;
	}
}


class checkCycle{

	//method to detect if cycle exist in the list or not.
	//APPROACH -
	//USE TWO POINTER  - SLOW & FAST , MOVE SLOW BY ONE NODE  & FAST BY TWO NODES AHEAD FOR EACH INCREMENT.
	//KEEP DOING THIS UNTIL EITHER FAST REACHES NULL OR FAST DOES NOT MEET SLOW.
	

	public static boolean checkCycle(Node head){
		
		//check edges case, if list contains single node or no node .
		if(head == null || head.next == null){
			return false;	//i.e no cycle exist.
		}

		//using two node pointer slow & fast , both initially assigned to head node.
		Node slow =  head;
		Node fast = head;

		//until fast is not null & fast.next != null
		while(fast != null && fast.next != null){
			
			//move slow by one node.
			slow = slow.next;

			//move fast by two node.
			fast =  fast.next.next;

			/* THIS IS WRONG WE SHOULD NEVER CHECK VALUE , INSTEAD CHECK POINTERS 
			//check slow and fast point to same node value.
			if(slow.data == fast.data){
				return true;
			}
			*/

			//INstead of checking pointer points to same value, check if both points to same node or memory address.
			if(fast == slow){
				return true;
			}
		}

		return false;
	}

	//mehtod to print the given list.
	public static void list(Node head){
		
		Node temp = head;
		
		while(temp.next != null){
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println("");
	}

	//main
	public static void main(String[] args){
		
		Node head = new Node(2);
		Node second = new Node(4);
		Node third  = new Node(6);
		Node fourth = new Node(8);

		//linking the node given.
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = second;	//intentionally making pointer of fourth node pointing to second node or some other existing node/
	
		//System.out.println("Given List:");
		//list(head);

		boolean res = checkCycle(head);

		if(res){
			System.out.println("Cycle Exist!");
		}

		else{
			System.out.println("No Cycle Exist.");
		}
	}
}
