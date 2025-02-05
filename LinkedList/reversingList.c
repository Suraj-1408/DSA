#include<stdio.h>
#include<stdlib.h>

typedef struct Node{
	int data;
	struct Node* nxt;
}Node;

//create newNode()
Node* createNode(int val){
	
	Node* newNode = (Node*)malloc(sizeof(Node));
	newNode->data = val;
	newNode->nxt = NULL;

	return newNode;
}


//function to reverse list and return updated head.
Node* reverse(Node* head){
	
	//using three temporary node.
	Node* prev = NULL;
	Node* curr = head;
	Node* next = NULL;
	

	while(curr != NULL){
	/*	
		prev = curr->nxt;		//reserving next node of given list.
		printf("prev->data = %d\n",prev->data);
		next = curr;			//updating next node with current node position
		printf("next->data = %d\n",next->data);
		curr = curr->nxt;		//update current node position to next node.
		printf("curr->data = %d\n",curr->data);
		prev->nxt = next;		//now making prev node to point to next node that stores previous current node.
		printf("prev->data = %d\n",prev->data);
	*/
		//Ex:	1->2->3->NULL
		//here curr = 1;
		//1)reserve the next node of current node.    (next = 2;)
		//2)make curr node point to previous node.	curr->nxt = prev ; 
		//3)update the position of prev node to curr node.	prev = curr =  1
		//4) update curr node position.				curr = next; i.e curr = 2
	

		//storing next of curr node.
		next = curr->nxt;

		//updating pointer of curr node to point to prev node.
		curr->nxt = prev;		//initially prev = null

		//updating position of prev node to curr node .
		prev = curr;

		//updating position of curr to next , where nxt node of curr node is already reserved inside next node.
		curr = next;
	}

	//updating head node.
	//curr = head;
	//prev = curr;
	
	return prev;
}


void list(Node* head){
	
	Node* temp = head;

	while(temp != NULL){
		printf("%d->",temp->data);
		temp = temp->nxt;
	}
	printf("NULL\n");
}

int main(){
	
	Node* head = createNode(2);
	Node* first = createNode(4);
	Node* second =  createNode(6);
	
	head->nxt = first;
	first->nxt = second;

	printf("Given list is\n");
	list(head);

	printf("After Reverse\n");
	Node* newHead = reverse(head);
	list(newHead);

	return 0;
}

