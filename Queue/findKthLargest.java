import java.util.PriorityQueue;

public class findKthLargest{
	
	//method to return Kth largest element from the array.
	//OPTIMISED APPROACH- to use the PRIORITY QUEUE UISNG MIN HEAP.
	
	public static int thirdLargest(int[] arr){
	//since we need to find largest , declaring a variable & initializing to respective number.
        int k = 3;

        //using  priority Queue (minHeap) for finding the third largest elemment
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();


        for(int i = 0;i < arr.length;i++){
            //add elements into Minheap.
            minHeap.add(arr[i]);

            //check if heap size exceeds k.
            if(minHeap.size() > k){
                //remove the root element i.e most minimum.
                minHeap.poll();
            }

        }

        //at last ,after processing arr.length - k elements, get peak,
        //which is nothing but our third largest element.
        return minHeap.peek();
	}



	//main
	public static void main(String[] args){
		
		int[] nums = {1, 23, 12, 9, 30, 2, 50};
		
		System.out.println("Elements of array are as follow:");

		for(int i = 0;i < nums.length;i++){
			System.out.print(nums[i]+"\t");	
		}

		System.out.println("");

		int Klargest = thirdLargest(nums);
		System.out.println("Third largest in the given array is:"+Klargest);
	}
}
