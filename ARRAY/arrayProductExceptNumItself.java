//Printing product of array elements except that number itself.

import java.util.*;

public class arrayProductExceptNumItself{
	public static int[] arrayProduct(int[] nums){
		int size = nums.length;
		int[] answer = new int[size];
		int index = 0;

		for(int i = 0;i < nums.length;i++){
			int product = 1;

			for(int j = 0;j < nums.length;j++){
				//if index not same, include its product.
				if(i != j){
					product = product * nums[j];
				}
			}

			//update the answer[]
			answer[i] = product;
			index++;
		}
	
		return answer;
	}
	

/*
	public static ArrayList<Integer> arrayProduct(int[] nums){
		//Compute the product for all elements except the number itself.
		//comparing the indices , if not same include its product.
		int size = nums.length;
		//resultant array.
		//int[] answer = new int[size];
		ArrayList<Integer> answer = new ArrayList<>();
	
		//int index = 0;		//initial index of resultant array.

		for(int i = 0;i < nums.length;i++){
			int product = 1;

			for(int j = 0;j < nums.length;j++){
				//if indices are not same, compute its product.
				if(i != j){
					product = product * nums[j];
				}
			}

			//update answer[] with recently computed product.
			//answer[index] = product;
			//index++;
			answer.add(product);
		}
		
		return answer;
	}
*/


//Main CLass
public static void main(String[] args){
		int[] arr = {1,2,3,4};
		System.out.println("Given array is:");
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println("");
	
		/* //Using ArrayList.
		System.out.println("\nProduct of array except the number itself is");
		ArrayList<Integer> result = arrayProduct(arr);

		System.out.println(result);
		*/

		int[] result = arrayProduct(arr);
		System.out.println("Product of all elements in array except itself:"+Arrays.toString(result));
	}
}
