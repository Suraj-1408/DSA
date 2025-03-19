import java.util.PriorityQueue;

class kthLargest{
	
	//method to return kthLargest.
	public static int findKthLargest(int[] nums,int k){
		
	//Uisng priority Queue min heap to find out the kth Largest element..
        //selected min heap, because eveyr parents node of it smaller than its childer.
        //we go on removing smaller element when heap size exceeds kth size,
        //at last we will be left with 2 largest elements, , since its min , return root, as root is smallest and is our 2nd largest element.

        //By default the priority queue uses min heap.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i = 0; i < nums.length;i++){
            //initially we go on adding element into min heap until it strictly exceeds k size.
            minHeap.add(nums[i]);

            if(minHeap.size() > k){
                //remove the smallest element i.e the root. using poll() method.
                minHeap.poll();  //this removes the root element
            }
        }

        //at last when only two elements are left ,it would exit the loop.
        //we need to return peek element as that would our kth largest.
        return minHeap.peek();

	}


	//main
	public static void main(String[] args){
		

		int[] nums = {3,2,3,1,2,4,5,5,6};
		int k = 4;
		
		System.out.println("Elements of arrays are follow:");
		for(int i = 0;i < nums.length;i++){
			System.out.print(nums[i]+"\t");
		}
		System.out.println("");

		int res = findKthLargest(nums,k);
		System.out.println("Kth largest element is:"+res);
	}

}
