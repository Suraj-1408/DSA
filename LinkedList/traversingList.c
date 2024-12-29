// Complete the printLinkedList function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode* next;
 * };
 *
 */
#include<stdio.h>
#include<stdlib.h>

typedef struct SinglyLinkedListNode {
      int data;
      struct SinglyLinkedListNode* next;
}SinglyLinkedListNode;



//function that creates newNode and allocated memory to it.
SinglyLinkedListNode* createNewNode(int data){

	//allocating memory for newly created Node.
	SinglyLinkedListNode* newNode = (SinglyLinkedListNode*)malloc(sizeof(SinglyLinkedListNode));

	newNode->data = data;
	newNode->next = NULL;

	//printf("Created new node with data: %d, address: %p\n", data, newNode);

	return newNode;
}

void printLinkedList(SinglyLinkedListNode* head) {
        //checking if head is NULl
        if(head == NULL){
            return;
        }
        
        
        //temporary node indicating current element node.
        //Neccessary to ensure that head Node is never lost.
        SinglyLinkedListNode *Current = head;
        
        while(Current != NULL){
           // printf("Node data: %d, address: %p, next: %p\n", Current->data, Current, Current->next);

	    printf("%d\n", Current->data);
            Current = Current->next; //pointing current node to next node address
        }

}

int main(){

	SinglyLinkedListNode *head = createNewNode(2);


	SinglyLinkedListNode *secondNode = createNewNode(4);		//allocating memory and initializing
	head->next = secondNode;				//linking head newnode

        SinglyLinkedListNode *thirdNode = createNewNode(6);
	secondNode->next = thirdNode;

        SinglyLinkedListNode *fourthNode = createNewNode(8);
	thirdNode->next = fourthNode;


	printf("Traversing a LinkedList.\n");
	//calling printLinkedList()
	printLinkedList(head);
	
	return 0;
}
