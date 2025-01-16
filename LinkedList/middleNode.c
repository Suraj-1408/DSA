#include<stdio.h>
#include<stdlib.h>

//creating our own type called Node, having memeber value and pointer, Using struct
typedef struct Node{
	int data;
	struct Node* next;
}Node;


//function to create a newNode and return that node. since it will be returning a node, its return type would be Node.
Node* createNewNode(int data){
	//creating  a newNode & allocating memory for newNode.
	Node* newNode =  (Node*)malloc(sizeof(Node));
	newNode->data = data;
	newNode->next = NULL;

	return newNode;
}


//function for finding out the middle Node of list.
Node* middleNode(Node* head){

	//creating two temporary node slow and fast respectively, which will keep incrementing by one and two node respectively.
	
	//creating slow and fast pointer variable and making it point to same address as that of head.
	Node* slow = head;
	Node* fast = head;

	while(fast != NULL && fast->next != NULL){
		//increment both slow and fast node.
		slow = slow->next;
		fast = fast->next->next;
	}

	//atlast returning the slow node value.
	return slow;
}


void printlist(Node* head){
	
	//creating temp pointer variable and making it point to same address as that of head. Used just for traversing.
	Node* temp = head;

	while(temp != NULL){
		printf("%d->",temp->data);
		temp = temp->next;
	}
	printf("NULL\n");
}

int main(){
	
	Node* head = createNewNode(2);
	Node* first = createNewNode(4);
	Node* second = createNewNode(6);
	Node* third = createNewNode(8);
	Node* fourth = createNewNode(10);
	Node* fifth = createNewNode(12);

	//linking all nodes.
	head->next = first;
	first->next = second;
	second->next = third;
	third->next = fourth;
	fourth->next = fifth;


	printf("Elements of linked list is\n");
	printlist(head);
	Node* middle =  middleNode(head);
	printf("\n");

	printf("Middle node in given list is %d\n ",middle->data);

	return 0;
}
