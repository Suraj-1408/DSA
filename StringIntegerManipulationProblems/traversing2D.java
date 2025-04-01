import java.util.ArrayList;
import java.util.Arrays;

class traversing2D{
	
	//method to search a element in 2D Array.
	public static ArrayList<Integer> search(int[][] nums,int val){
		
		ArrayList<Integer> arr = new ArrayList<>();
		//arr = {-1,-1};

		for(int i = 0;i < nums.length;i++){
			for(int j = 0;j < nums.length;j++){
				
				if(nums[i][j] == val){
					arr.add(i);
					arr.add(j);
					
					return arr;
				}
			}
		}

		return arr;
	}

	//method to print given data.
	public static void data(int[][] arr){
	
		System.out.println("Given 2D array elements");

		for(int i = 0;i < arr.length;i++){
			for(int j = 0;j < arr.length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("");
		}

		System.out.println("");
	}
	
	//main
	public static void main(String[] args){
		
		int[][] nums = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};

		int key = 3;
		
		data(nums);

		ArrayList res  = search(nums,key);
		System.out.println("ELement "+key+" found at index "+res);

	}
}
