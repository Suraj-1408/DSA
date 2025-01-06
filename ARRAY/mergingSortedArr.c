#include<stdio.h>


void sort(int num1[],int num2[],int m,int n){
	int index1 = 0 ;
	int index2 = 0;

	printf("\n");
	while(index1 <= m && index2 <= n){
		//if Value at index1 > index2 , swapp & increment index2.
		if(num1[index1] <= num2[index2]){
			index1++;
		}

		else{
			int temp = num1[index1];
			num1[index1] = num2[index2];
			num2[index2] = temp;

			index2++;
		}
	}

	printf("\n");
}


//function to merge two sorted arrays.
void mergeSortedArray(int num1[],int num2[],int m,int n,int mergeArr[],int k){
	
	int index = 0;	//index of mergearray.
	int index1 = 0;	//index of num1
	int index2 = 0; //index of num2;
			//
	while(index < k){
		//push elements of nums1 first.
		if(index1 < m){
			mergeArr[index] = num1[index1];
			index1++;
		}

		else{
			mergeArr[index] = num2[index2];
			index2++;
		}

		index++;
	}
}
void print(int mergeArr[],int k){
	
	for(int i = 0; i < k;i++){
		printf("%d\t",mergeArr[i]);
	}
	printf("\n");
}

int main(){
	int arr1[] = {1,2,3};
	int arr2[] = {2,5,6};

	int m = sizeof(arr1)/sizeof(arr1[0]);
	int n = sizeof(arr2)/sizeof(arr2[0]);

	printf("Initial Elements of Array1:\n");
	print(arr1,m);
	printf("\nInitial Elements of Array2:\n");
	print(arr2,n);
	
	sort(arr1,arr2,m,n);


	printf("The merged Sorted Array is\n");
	int k = m+n;
	int mergeArr[k];
	//calling mergeSorted Array.
	mergeSortedArray(arr1,arr2,m,n,mergeArr,k);
	
	print(mergeArr,k);

	return 0;
}
