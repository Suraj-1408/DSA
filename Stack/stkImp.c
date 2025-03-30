#include<stdio.h>
#include<stdlib.h>

typedef struct stk{
	int* arr;
	int top;
	int size;
}stk;


//initialize
void init(stk* s){
	s->top = -1;
	s->size = 3;
	s->arr = (int*)malloc(s->size*sizeof(int));
}

//function to push elements into stack
int push(stk* s,int val){

	//before inserting we always check whether STACK IS FULL.
	if(s->top == s->size-1){
		printf("Stack is full!\n");
		return -1;
	}

	//else insert the new element at top of stack
	s->top++;			//first increment the top index from -1 to 0;
	printf("Index: %d",s->top);
	int data = s->arr[s->top] = val;
	//size++;		//size variable is never changed dynamically, it remains constant.

	return data;	
}

//function to pop
void pop(stk* s){
	
	//while deleting , we always check whether STACK IS EMPTY.
	if(s->top == -1){
		printf("Stack is empty!\n");
		return;
	}

	//else update top index
	s->top--;
	//size--;		//size variable is never changed dynamically, it remains constant.
}

//main
int main(){

	stk* ptr;		//created pointer for stack, used to points the members of stacks.
	//NOTE - whenever pointer is created and if that pointer is pointin to some existing addresse(i.e initializing pointer to some address) than we must allocate memory to it either using malloc(), calloc() or realloc()
	
	//assigning memory to pointer.
	ptr = (stk*)malloc(sizeof(stk));

	//calling init() that basically initializes stack with some values.
	init(ptr);		//init() expects pointer of stack as parameter, so therefore the pointer created must be passed here.

	int b1 = push(ptr,2);
       	printf(",Data:%d\n",b1);

	int b2 = push(ptr,4);
	printf(",Data:%d\n",b2);	

	return 0;
}
