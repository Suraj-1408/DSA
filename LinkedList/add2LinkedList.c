/*
 You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 Example
	l1: 2->4->3
	l2: 5->6->4
	
	O/P : 7->0->8	
 */

#include<stdio.h>
#include<stdlib.h>

typedef struct Node{
	int val;
	struct Node* next;
}Node;

//function that creates newNode and returns it.
Node* createNewNode(int data){
	Node* newNode = (Node*)malloc(sizeof(Node));
	
	//initialize
	newNode->val = data;
	newNode->next = NULL;

	return newNode;
}


//function that two given list and returns the head of resultant list.

Node* addtwoList(Node* l1,Node* l2){
//1)declaring the head and tail of resultant list and setting it NULL.
//2)Until l1 or l2 or carry is found, compute the following.
//3)fetch the each node value of l1 and l2.
//4)compute sum , carry (if exist) and store the result each node sum.
//5)generate the resultant list by processing the head and tail node of the list,
//6)Process the next node by in list moving the head of list l1 and l2.
//7) result head of resultant list.

	//stores the head of new List. 
	Node* resultHead = (Node*)malloc(sizeof(Node));
	resultHead = NULL;

	//Using another node to keep track of resultant tail node .
	Node* tail = (Node*)malloc(sizeof(Node));
	tail = NULL;


	int carry = 0;
	int sum  = 0;
	while(l1 != NULL || l2 != NULL || carry >0){
		
		int val1,val2;
		if(l1 != NULL){
			val1 = l1->val;
		}
		else{
			val1 = 0;
		}

		//similat fetch node of 2nd list.
		if(l2 != NULL){
			val2 = l2->val;
		}	
		else{
			val2 = 0;
		}
		
		//compute sum and check if carry exist ,if YES update carry.
		//store the sum value as newNode.

		sum = val1 + val2 + carry;
		carry = sum / 10;		//updating carry if found.
		int unit = sum % 10;		//this fetch the value at unit place and needs to be converted into newNode of resultant list.
		Node* newNode = createNewNode(unit);
		
		
		//Now form the resultant list.
		if(resultHead == NULL){
			resultHead = newNode;		//setting head of resultant list.
			tail = newNode;			//this updates the tail node,indicating head and tail are same in newList.
		}		
		else{
			//make current tail node to point out the newNode.
			//udpate the position of tail node.
			tail->next = newNode;
			tail = newNode;
		}
	
		//update resultant head of l1 and l2 for process next node.
		if(l1 != NULL){
			l1  = l1->next;
		}

		if(l2 != NULL){
			l2 = l2->next;
		}
			
		
	}

	return resultHead;
}


//print list function.
void printlist(Node* head){
	
	Node* curr = head;
	while(curr != NULL){
		printf("%d->",curr->val);
		curr = curr->next;
	}
	printf("NULL\n");
}

//main()
int main(){
	//list1
	Node* head1 = createNewNode(2);
	Node* first1 = createNewNode(4);
	Node* second1 = createNewNode(3);

	head1->next = first1;
	first1->next = second1;


	//printing list1;
	printf("List1:");
	printlist(head1);

	//list2
        Node* head2 = createNewNode(5);
        Node* first2 = createNewNode(6);
        Node* second2 = createNewNode(4);

        head2->next = first2;
        first2->next = second2;


        //printing list1;
	printf("\nList2:");
        printlist(head2);

	Node* resultHead = (Node*)malloc(sizeof(Node));
	resultHead = addtwoList(head1,head2);
	printf("\nResult on adding two giving list is:\n");
	printlist(resultHead);
		
	return 0;
}
