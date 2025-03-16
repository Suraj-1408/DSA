//implementing  a priority queue(similar to normal queue but every element has priority) implemented using BINARY HEAP Which is another data structure & has two types for implemention MinHeap() & MaxHeap(). 
//Using ARRAY TO STORES ELEMENTS OF PRIORITY QUEUE DUE TO INDEX BASED.


#include<stdio.h>
#include<stdlib.h>

#define MAX_SIZE 100

//using a structure to wrap array and size into single unit.
typedef struct {
	int arr[MAX_SIZE];
	int size;
}MinHeap;


//swapping of two element.
void swap(int* p,int* q){
	
	int temp = *p;
	*p = *q;
	*q = temp;
}

//creating a function to insert element into array..
//parameter that we need is pointer that will point the MinHeap and other one is value that is to be added.

void insert(MinHeap* heap ,int data){
	
	//very first condition before insert into priority queue is that.
	//CHECK IF QUEUE IS FULL OR NOT ,IF FULL, WE CAN'T INSERT.
	if(heap->size >= MAX_SIZE){
		printf("Queue is full, Can't insert more element.");
		return;
	}

	//use a variable and initialize it last element of size.
	int i = heap->size;
	heap->arr[i]  = data;
	heap->size++;
	

	//till now element is inserted at last of array and level order for binary tree.
	//we need to check if its following heap property or not, i,e every root element in binary heap must be less than
	//its child element.
	
	while(i > 0){
	
		int parent = (i-1)/2;

		//checking if current 
		if(heap->arr[parent] > heap->arr[i]){
			swap(&heap->arr[i],&heap->arr[parent]);
			i = parent;
		}
		else{
			break;
		}
	}
}


//now implementing heapify() that basically maintains heap property.
void heapifyDown(MinHeap* heap,int i){
	
	int smallest = i;		//assuming the current index is smallest.
	int left = 2*i + 1;		//left index.
	int right = 2*i + 2;		//right index.

	
	//check if element at left index is smallest or not.
	if(left < heap->size && heap->arr[left] < heap->arr[i]){
		//update smallest index to left.
		smallest = left;
	}

	else if(right < heap->size && heap->arr[right] < heap->arr[i]){
		//update smalledt index to right.
		smallest = right;
	}


	//now if smallest index and current i index still same(i.e current index i was the smallest element)
	if(smallest != i){
		swap(&heap->arr[smallest],&heap->arr[i]);
		heapifyDown(heap,smallest);
	}
	
}


//deleting min element , i.e root.
int extractMin(MinHeap* heap){

	//in priority queue min is stored at 0th index.
	int smallest = heap->arr[0];
	
	//now update the 0th index wiht last index element of priority queue.
	heap->arr[0] = heap->arr[heap->size-1];

	//decrease the size of queue by 1.
	heap->size--;

	//run the heapifyDown() to satisfy the heap property in complete binary tree.
	heapifyDown(heap,0);

	return smallest;

/*	
	int i = heap->arr[size-1];	//get the heap size
	int smallest = (i-1)/2;

	//now replacing root element with last index element than applying heapify().
	//i.e first replace root element wiht last index.
	//than decrement the size of heap by 1.
	
	if(heap->arr[smallest] < heap->arr[i]){
		swap(&heap->arr[smallest],&heap->arr[i]);
	}

	heap->size--;
	return smallest;
*/

}


// Function to display the heap
void displayHeap(MinHeap *heap) {
    if (heap->size == 0) {
        printf("Heap is empty!\n");
        return;
    }

    printf("Min Heap: ");
    for (int i = 0; i < heap->size; i++) {
        printf("%d ", heap->arr[i]);
    }
    printf("\n");
}

// Main function to test the implementation
int main() {
    MinHeap heap;
    heap.size = 0;

    insert(&heap, 10);
    insert(&heap, 40);
    insert(&heap, 20);
    insert(&heap, 50);
    insert(&heap, 30);
    insert(&heap, 5);

    displayHeap(&heap);

    printf("Extracted min: %d\n", extractMin(&heap));
    displayHeap(&heap);

    printf("Extracted min: %d\n", extractMin(&heap));
    displayHeap(&heap);

    return 0;
}

