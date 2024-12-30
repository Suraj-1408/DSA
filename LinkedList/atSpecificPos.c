#include<stdio.h>
#include<stdlib.h>

typedef struct Node{
	int data;
	struct Node* next;
}Node;

Node* createNode(int data){
	Node* newNode = (Node*)malloc(sizeof(Node));

	newNode->data = data;
	newNode->next = NULL;

	return newNode;
}

Node* atSpecificIndex(Node* head,int data,int pos){
	
	Node* newNode = createNode(data);

	int start = 0;		//using index to reach at specific postion.

	//temp Node for traversing to given position.
	Node* temp = head;

	//2->3->1->NULL
	//Insert 10 at position 2, updated list is,
	//2->3->10->1->NULL

	while(temp->next != NULL && start != pos - 1){
		temp = temp->next;
		start++;
	}


	//Now we have reached to one node previous to position when newNode is to be inserted.
	newNode->next = temp->next;//BREAK from Node where temp-next is pointing and make newNode point to Node where temp->next was pointing
	temp->next = newNode;	//updating previous node to point to newNOde.
												
	return head;
}


void List(Node* head){

	//Node* curr = (Node*)malloc(sizeof(Node));
	Node* curr = head;

	int pos = 0;
	while(curr != NULL){
		printf("%d(%d)->",curr->data,pos);	
		curr = curr->next;
		pos = pos + 1;
	}
	printf("NULL\n");

}

int main(){
	Node* head = createNode(10);
	Node* first = createNode(12);
	Node* second = createNode(14);
	Node* third = createNode(16);


	head->next = first;
	first->next = second;
	second->next = third;

	printf("Exisiting elements of linked are:\n");
	List(head);


	int pos,data;
	printf("Enter pos for newNode ");
	scanf("%d",&pos);

	printf("Enter value of node:");
	scanf("%d",&data);

	printf("Updated list is:\n");
	atSpecificIndex(head,data,pos);
	List(head);
	return 0;
}
