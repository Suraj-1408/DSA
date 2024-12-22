import java.util.*;

public class rotateBy1{
	//using shift index.
	public static void rotateByOne(int[] arr){
		int n = arr.length;
		//int lastIndex = arr[n -1];

		for(int i = n-1;i > 0 ;i--){
			int temp = arr[i];
			arr[i] = arr[i-1];
			arr[i-1] = temp;
		}
	
		System.out.println("Rotating  array by 1.");	
		for(int i = 0;i < arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println(" ");

	}

	public static void main(String[] args){
		int[] arr = {1,0,4,5,7,10,8,12};

		rotateByOne(arr);
	}

}
