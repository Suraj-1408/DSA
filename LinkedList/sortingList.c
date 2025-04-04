#include<stdio.h>
#include<stdlib.h>
//Program to sort the nodes in the list.

//defining a node structure.
typedef struct Node{
	struct Node* next;
	int value;
}Node;


//defining a function to createNewNode()
Node* createNewNode(int val){
	
	Node* newNode = (Node*)malloc(sizeof(Node));
	newNode->value = val;
	newNode-> next =  NULL;

	return newNode;
}

//Function to sort nodes in list and return  head of newNode.
Node* sort(Node* head){
	
	if(head == NULL || head->next == NULL){
		return head;
	}

	//using two temporary node.
	Node* newHead = head;
	Node* first = head;
	Node* second = head->next;

	
	while(second != NULL && second->next != NULL){
		
		//compare first node with second node.
		if(first->value > second->value){
			Node* temp = first;
			first = second;
			second = temp;

			//update final newHead.
			newHead = first;	
		}

		first = first->next;
		second = second->next;
	}

	return newHead;
}


//function to print/
void list(Node* head){
	
	Node* temp = head;

	while(temp != NULL && temp->next != NULL){
		printf("%d->",temp->value);
		temp = temp->next;
	}

	printf("NULL\n");
}


int main(){
	
	Node* head = createNewNode(4);
	Node* first = createNewNode(2);
	Node* second = createNewNode(1);
	Node* third = createNewNode(3);

	//linking
	head->next = first;
	first->next = second;
	second->next = third;
	//third->next = NULL;

	//printing given list.
	printf("\nGiven list:\n");
	list(head);


	Node* newHead = sort(head);

	printf("\n\n Sorted List:\n");
	list(newHead);
}

