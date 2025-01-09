#include<stdio.h>
#include<stdlib.h>

int maxSubString(int arr[],int n,int k){
	int maxSum = 0;
	//int curSum = 0;

	for(int i = 0; i  < n ;i++){	
		
		int curSum = 0;		//updating curSUm

		for(int  j = i;j < i + k;j++){
			curSum = curSum + arr[j];
		}

		if(curSum > maxSum){
			maxSum = curSum;
		}
	}

	return maxSum;
}

int main(){
	int arr[] = {2,1,5,0,4,2,3,-1};
	int size = sizeof(arr)/sizeof(arr[0]);
	int k = 3;

	int res = maxSubString(arr,size,k);
	printf("Substring with maxSum %d\n",res);

	return 0;
}
