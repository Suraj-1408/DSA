public void sort012(int[] arr) {
        // code here
        /*
        for(int i = 0;i < arr.length - 1;i++){
            for(int j = i + 1; j < arr.length;j++){
                
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                
                }
            }
        } */
        
        //Using Dutch National flag  Algorithm.
        //using flag low = 0 , indicating boundary of '0' element .
        //using mid flag to traverse the array , mid = 0;
        //Using high flag , for indicating boundary of 2 , high = n -1;
        
        int size = arr.length;
        int low  = 0;       //boundary of 0.
        int mid = 0 ;   //traversing array .
        int high = size -1; //boundary for 2
        
        
        while(mid <= high){
             
            //if arr[mid] == 0. swapping arr[mid] with arr[low]
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                
                mid++;
                low++;
            }
            
            else if(arr[mid] == 1){
                mid++;
            }
            
            else{
                int temp2 = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp2;
                
                high--;
            }
        }
        
        
    }
}
