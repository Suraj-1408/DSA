import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Collections;

class returnAllKthLargest{
	
	//method to return all Kth largest elements from the array in descending order.
	public static ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        //Using Min Heap priority Queue.
        //Min Heap automatically adjust the order of element whenever
        //new element is added or if any exisiting element is removed. 
        //initially we must keep adding elements into min Heap 
        //until it exceeds K,
        //later for every new element in heap, we remove the root element,
        //since its a MIN HEAP , root will be the minimum elements among others.
        //we go doing this until we left with last elements which are nothing
        //but three largest elements.
        
        //once we reach here , we need to return these elements in decresing order.
        //i.e rigth child first ,left child than root(since root is minimum).
        
        
        //implementation.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        //initially min heap is empty, we iterate over elements and add them
        //into heap until it exceeds k.
        
        for(int i = 0;i < arr.length;i++){
            //add element into heap.
            minHeap.add(arr[i]);
            
            //check if heap size > k, if TRUE , remove the root(minimum element)
            //and automatically adjust the heap property. 
            if(minHeap.size() > k){
                //remove root.
                minHeap.poll();     //this methods gets the root & remove it.
            }
        }
        
        
        /*
        //now we have reached where k largest elements.
        int i = (arr.length-k);
        int root = (i-1)/2;
        int left = 2*i+1;
        int right = 2*i+2;
        
        //declaring ArrayList.
        ArrayList<Integer> largest = new ArrayList<>();
        
        if(arr[right] != null){
            largest.add(arr[right]);
        }
        
        else if(arr[left] != null){
            largest.add(arr[left]);
        }
        
        largest.add(arr[root]);
    
        return largest;
        */
        
        
        //now since in our min Heap we have our kth largest store.
        //using array list to store all those elements.
        ArrayList<Integer> result = new ArrayList<>();
        
        //we need to traverse the min heap until it does not empty.
        while(!minHeap.isEmpty()){
            result.add(minHeap.poll()); //poll() methods delete from heap.
        }
        
        //now we have got all elements into list.
        //using collection class on arraylist to reverse the stored element.
        Collections.reverse(result);
        
        return result;
    }


    //main 
    public static void main(String[] args){
    	
	   int[] nums = {12,5,787, 1, 23};
	   int k = 2;

	   System.out.println("Array elements are:");
	   for(int i = 0;i < nums.length;i++){
	   	System.out.print(nums[i]+"\t");
	   }
	   System.out.println("");

	   
	   ArrayList<Integer> result = kLargest(nums,k);
	   System.out.println("Kth Largest elements uisng Heap in Descending Order:"+result);
    }
}
