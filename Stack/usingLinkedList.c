#include<stdio.h>
#include<stdlib.h>

//first creating a structure for node, having data & pointer that will point to next node in linkedlist.
typedef struct Node{
	int data;
	struct Node* next;
}Node;

//creating a function for createNode.
//Note sinces its Node its returns type will be a node.
Node* createNode(int data){
	
	Node* newNode = (Node*)malloc(sizeof(Node));
	newNode->data = data;
	newNode->next = NULL;

	return newNode;
}

//creating a push function for inserting a newNode in the linkedList.
Node*	pushNewNode(Node* head,int data){
	
	Node* newNode = createNode(data);

	//checking head is Null or not,if yes than initiate the linkedList.
	if(head == NULL){
		head = newNode;
		return head;
	}

	//Since the linked is not empty , insert the newNode such that newNode acts a Head pointer.
	//first point the NewNode to current Head Node.
	newNode->next = head;			//the newNode is now linked to prevoius existing linkedlist.
	
	//update the head pointer or newNode.
	head = newNode;
	//printf("%d\n",head->data);

	return head;
}



//Pop function or getting rid of head Node.
Node* popHeadNode(Node* head){
	
	//Inorder to pop head , using a temp Node to store the head Node and making HeadNode pointer to point at previous Node.	
	Node* deleteNode = head;
		
	//Updating the head.
	head = head->next;	

	free(deleteNode);	//Dellocating memory for the headNode.
	return head;		//returnin the updated headNode.
}


//function to print the elements of stack.
void printElements(Node* head){
	
	printf("Stack Base->");
	while(head != NULL){
		printf("%d->",head->data);
		head = head->next;
	}

	printf("NULL->\n");

}

void printReverseList(Node* head){
	
	Node* temp = head;
	
	//base condition
	if(temp == NULL){
		return;
	}
	
	printReverseList(temp->next);
	printf("%d->",temp->data);

}

int main(){
	
	printf("\t Implementing Stack using LinkedList.\n");

	Node* head = NULL;
	head = pushNewNode(head,12);

	head = pushNewNode(head,14);
	head = pushNewNode(head,16);
	head = pushNewNode(head,18);
	head = pushNewNode(head,20);
	head = pushNewNode(head,22);
	head = pushNewNode(head,24);

	//calling printElements();
	printf("\tInitial List Elements Order\n");
	printElements(head);
	
	printf("\tOn calling reverseFunction, order of linkedlist.\n");
	printf("Stack Base->");
	printReverseList(head);
	printf("NULL\n");


	//popping the head node.
	printf("On popping top Element of stack.\n");
	head = popHeadNode(head);
	printf("Elements of stack are:\n");
	printReverseList(head);
	printf("NULL\n");	
	return 0;
}
