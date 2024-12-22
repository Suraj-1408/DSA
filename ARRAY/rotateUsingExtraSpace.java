import java.util.*;

public class rotateUsingExtraSpace{
	public static void printSize(int[] arr){
		
		System.out.println("Size of given array is "+arr.length);
		int s1 = arr.length;
		int lastIndexValue = arr[s1-1];

		int[] temp = new int[s1];
		//System.out.println(temp.length);
	
		System.out.println("Array after Rotating by 1.");	
		temp[0] = lastIndexValue;
		System.out.print(+temp[0]);
		for(int i = 1;i < temp.length;i++){
			temp[i] = arr[i-1];
			System.out.print(" "+temp[i]);	
		}
		System.out.println("");
	}

	//main
	public static void main(String[] args){
		int[] arr = {2,1,0,8,4,10,11,3};
		int size = arr.length;
		
		System.out.println("Given Array is:");
		for(int i = 0;i < arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println(" ");
		printSize(arr);
	}
}
