#include<stdio.h>
#include<stdlib.h>

#define MAX 5

typedef struct queue{
	int head;
	int tail;
	int* arr;
	int size;	
}queue;

//implementing isFull()
int isFull(queue *q){
	
	if(q->tail == q->size-1){
		return 1;
	}	

	return 0;
}


int  isEmpty(queue *q){
	
	if(q->head == q->tail){
		return 1;
	}

	return 0;
}

void enqueue(queue *q,int value){
	
	//check whether queue is full or not
	if(isFull(q)){
		printf("Queue is full.\n");
	}	

	else{
		//first increment the tail and then insert the element.
		q->tail = q->tail + 1;
		q->arr[q->tail] = value;
		printf("Enqueued element:%d\n",value);
	}

}


int dequeue(queue *q){
	
	int a = -1;
	//check if queue is empty or not.
	if(isEmpty(q)){
		printf("Queue is empty.\n");
		return a;
	}

	else{	
		q->head = q->head + 1;
		a = q->arr[q->head]; 
	}

	return a;
}

//main function
int main(){
	//initialize the queue.
	queue q;

	q.size = 5;
	q.head = -1;
	q.tail = -1;

	//using dynamic memory allocation for assign values in the queue.
	q.arr = (int*)malloc((q.size)*sizeof(int));


	enqueue(&q,2);
	enqueue(&q,4);
	enqueue(&q,6);
	//dequeue(&q);
	//dequeue(&q);
	printf("Dequeued element %d\n",dequeue(&q));
	printf("Dequeued element %d\n",dequeue(&q));
	return 0;

}
