#include<stdio.h>
#include<stdlib.h>

typedef struct Node{
	int data;
	struct Node* next;
}Node;


//create Node function.
Node* createNewNode(int data){
	//creating newnode and assigning memory and value to it.
	Node* newNode = (Node*)malloc(sizeof(Node));
	
	//Initialize
	newNode->data = data;
	newNode->next = NULL;
}


//Function to insert at last and return head node after list is updated.
Node* insertAtLast(Node* head,int value){
	
	//creating newNOde that holds last node value.
	Node* lastNode = createNewNode(10);		//using this function that create newNode and return it.
	lastNode->next = NULL;

	//If head is alredy NULL
	if(head == NULL){
		head = lastNode;
		return head;
	}

	//Secodn case: if head exist, traverse to lastNode.
	//Since lastNode needs to be inserted as Last Position, we need to traverse to existing lastNode in list.
	//therefore using a temp Node to store head 
	Node* Curr = head;

	while(Curr->next != NULL){
		Curr = Curr->next;
	}

	//add the last node in the list.
	Curr->next = lastNode;

	return head;
}


void printList(Node* head){

	Node* temp =  head;

	while(temp != NULL){
		printf("%d -> ",temp->data);
	}

	printf("NULL\n");
}

int main(){

	Node* head = createNewNode(2);
	Node* first = createNewNode(4);
	Node* second = createNewNode(6);

	//Linking node
	head->next = first;
	first->next = second;
	second->next = NULL;


	printf("Eelements of exisitng list.");
	printList(head);

	//allocating memory to last node
	Node* lastNode = (Node*)malloc(sizeof(Node));

	printf("\n Enter value for last NOde:");
	scanf("%d",&lastNode->data);

	printList(head);
}
