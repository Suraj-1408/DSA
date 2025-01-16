/*
 Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.

*/

#include<stdio.h>
#include<stdlib.h>

int uniqueElement(int arr[],int n){
	
	int index  = 1;
	
	for(int i = 1 ; i < n;i++){
		//comparing the value the index 0 and 1. if they are not same, update the value at current index.
		if(arr[i -1] != arr[i]){
			arr[index]  = arr[i];		//updating new index value with current index value. 
			index++;
		}
	}

	//atlast return index , representing unique element.
	return index;
}


int main(){
	
	//int arr[] = {1,1,2};
	int arr[] = {0,0,1,1,1,2,2,3,3,4};
	int n = sizeof(arr)/sizeof(arr[0]);
	
	printf("Intial elements of array.\n");
	for(int i = 0; i < n;i++){
		printf("%d\t",arr[i]);
	}


	int res = uniqueElement(arr,n);
	printf("\nNO. of unique elements in array:%d\n",res);
}



