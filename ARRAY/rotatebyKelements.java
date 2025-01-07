//bruteforce 
class Solution {
    public static void rotate(int[] nums, int k) {
        
        //first getting k elements to start of  array.
        for(int i = 0;i < k; i++){
            for(int j = nums.length -1; j > 0; j--){
                //shift last element to first.
                if(nums[j] > nums[j - 1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }       
        }


        //now sorting first k elements in nums.
        for(int i = 0;i < k;i++){
            for(int j = k-1;j > 0;j--){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        
    }
}

//printing elements.
class print{
	public static void printelements(int[] arr){
		
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i]+"\t");
		}

		System.out.println("");
	}
}

//main class
public class rotatebyKelements{
	public static void main(String[] args){
		//array
		int[] arr = {1,2,3,4,5,6,7};
		int k = 3;
		System.out.println("Given Array elements:");
		print.printelements(arr);

		Solution.rotate(arr,k);
		
		System.out.println("Rotating it by "+k+" elements Array is:\n");
		print.printelements(arr);
	}
}
