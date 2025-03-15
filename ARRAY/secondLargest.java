
class secondLargest{

	public static int sort(int[] arr){
	/*
	 * TRAVERSE THE ARRAY TWICE 
	 * IN FIRST TRAVERSAL GET MAXIMUM ELEMENT.
	 * IN THE SECOND TRAVERSAL , SKIPPING OR IGNORING THE FIRST MAXIMUM, GET THE SECOND MAXIMUM AND RETURN IT.*/
	//12, 35, 1, 10, 34, 1
	int firstMax = arr[0];
	
	for(int i  = 1; i < arr.length;i++){
		if((arr[i] > arr[i-1]) && arr[i] > firstMax ){
			firstMax = arr[i];
		}	
	}
	

	//second traversal getting the second by skipping the first max that we got.
	int secondMax = -1;
	for(int i = 0;i <= arr.length-1;i++){
		if(arr[i] > secondMax && arr[i] != firstMax){
			secondMax = arr[i];
		}
	}

	return (secondMax != -1)?secondMax:-1;

	/* this approach lead O(n^2 + n)
	 * first sorting(non decresing order) than traversing from last index until just less than largest element is not found.

	//sorting the elements in non descresing order.	
	for(int i = 0;i < arr.length-1;i++){
            for(int j = i+1; j < arr.length;j++ ){

                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
	
	//now since the elements are sorted, traverse element in reverse order i.e from arr.length-1 upto second largest.
	//as soon as we found element that is NOT EQUAL to largest elements , simplify return that element.
	//if all are found same or if there is no element just less than largest element ,  return -1.
	int secondl = -1;
	for(int i = arr.length-1;i > 0;i--){
		
		if(arr[i-1] < arr[i]){
			secondl = arr[i-1];
			int index = i-1;
			System.out.println("Second last index:"+index);

			return secondl;
		}
	}

	return secondl;
*/
	}


	public static void main(String[] args){
		
		int[] arr = {12,35,1,10,34,1};
		//int[] arr = {10, 5, 10};
		int res = sort(arr);

		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i]+"\t");
		}

		System.out.println("");
		
		int index = arr.length;
		System.out.println("Array length:"+index);
		
		System.out.println(res);
	}
}
