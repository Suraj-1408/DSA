#include<stdio.h>
#include<stdlib.h>

//Implemenating stack using Array. basically used to store stack elements.

//for implementing stack , we need a data type such a way that it maintains stack property.
//a stack must have , index that track top element, size of stack, and array pointer to store element of stack.

//defining a custom data type.
typedef struct{
	char* arr;
	int top;	//index to track top element of stack.
	int size;	//capacity of stack for elements.
}stk;


//initialzing the above stack.
//in order to access any element of stack we need a POINTER OF STACK OR STACK POINTER.
void init(stk* ptr){
	
	ptr->top = -1;
	ptr->size = 5;		//this is initialize before arr , because we need size to compute total space required for arr
	ptr->arr =(char*)malloc(ptr->size*sizeof(char));	//ACCORDING TO SIZE VALUE ,ARR POINTER WILL ALLOCATE THAT MUCH OF SIZE.
	//ptr->arr = (stk*)malloc(sizeof(stk));
}


//defining push method.
char push(stk* ptr , char value){
	
	//before inserting any value,we check whether out stack has space or not, accordingly we perform push operation.
	if(ptr->top == ptr->size){
		printf("Stack size is full.Cannot push more elements.\n");
		return '0';
	}

	//else
	//increment the top index , and push that character into stack ,i.e pushing into arr.
	ptr->top++;
	ptr->arr[ptr->top] = value;
	char ch = ptr->arr[ptr->top];

	return ch;
}


//defining pop()
void pop(stk* ptr){
	//check if stack is not empty, popping element from empty stack may lead to undefined behaviour.
	if(ptr->top == -1){
		printf("Cannot remove elements from empty stack.\n");
		return;
	}

	printf("Popping elements from Stack:\n");
	char ch = ptr->arr[ptr->top];
	printf("Popped up %c character.\n",ch);

	//int add = ptr->top;
	ptr->top--;

	//free(&add);
}



//method to print stack elemetsn.
void data(stk* ptr){

	printf("\nExisting & updated stack elements\n");

	int i = 0;
	while(i <= ptr->top){
		printf("%c\t",ptr->arr[i]);
		i++;
	}
	printf("\n");
}


int main(){
	
	//declaring stack pointer  and allocation memory for it.
	stk *ptr;
	
	ptr = (stk*)malloc(sizeof(stk));
	
	//calling init() function to initialize the stack.
	init(ptr);

	//push elements into stack.
	char ch = push(ptr,'S');
	char ch2 = push(ptr,'u');
	char ch3 = push(ptr,'r');
	char ch4 = push(ptr,'a');
	char ch5 = push(ptr,'j');


	data(ptr);	

	pop(ptr);
	data(ptr);

	pop(ptr);
	data(ptr);	
	
 	pop(ptr);
        data(ptr);
	
	pop(ptr);
        data(ptr);
	
	pop(ptr);
        data(ptr);
	
	pop(ptr);
	return 0;
}
