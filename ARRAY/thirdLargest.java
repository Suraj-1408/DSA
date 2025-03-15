class thirdLargest{
	
	//method to return third largest.
	public static int thirdLargest(int[] arr){
		
		/*Approach get the second largest using O(n).
		 * for every arr[i], if its > than largest than update largest to arr[i] and sl to larg			est.*/


		//getting second largest.
		int largest = arr[0];
		int sl = -1;

		for(int i = 1; i < arr.length;i++){
			
			if(arr[i] > largest){
				sl = largest;
				largest = arr[i];
			}

			else if(arr[i] < largest && arr[i] > sl){
				sl = arr[i];
			}
		}

		//now from above we can get second largest.
		//extracting third largest.

		int third = -1;

		for(int i = 0; i < arr.length;i++){
			
			if((arr[i] != sl) && (arr[i] != largest) && arr[i] > third){
				third = arr[i];
			}
		}

		return third;
	}

        public static void main(String[] args){

                int[] arr = {12,35,1,10,34,1};
                //int[] arr = {10, 5, 10};
                int res = thirdLargest(arr);

                for(int i = 0;i < arr.length;i++){
                        System.out.print(arr[i]+"\t");
                }

                System.out.println("");

                int index = arr.length;
                System.out.println("Array length:"+index);
                
                System.out.println(res);
        }
	

}
