import java.util.*;

public class arrProdExceptSelf_prefixSuffix{
		
	//method for computing array Product Except self using prefix and Suffix.
	public static ArrayList<Integer> arrProductUsingPrefixSuffix(ArrayList<Integer> nums){
		
	//FOr computing array product uisng prefix and suffix.
	//1) compute prefix product i.e for every current index of array , compute ALL PREVIOUS product and store it in current index (Excluding current index value)
	
	//2)compute suffix product, where each current index stores the product of all elements APPEARING AFETR current index.(Excluding current index value) Note the suffix is 
	//3)once we get the prefix and product , we need to multiply both the array to get the final array product excluding current index.
	//why prefix and suffix is computed from left to rigth and right to left respectively.
	//prefix stores all PREVIOUS element product AT ANY GIVEN INDEX THAT WHYS IT HAS TO START WITH 0 - N
	//Similarly suffix store all element product after specific index , hence it must from Right (n-1) to left (0)
	
	//declaring array for prefix and suffix product.
	
	int n = nums.size();
	ArrayList<Integer> prefix = new ArrayList<Integer>();		//helps allocating memory.
	
	int prod = 1;
	prefix.add(1);

	for(int i = 1;i < n;i++){
		//two way to compute prefix product , Either take variable that stores product before current index and initialize it ot new prefix array .
		//OR directly accesing i-1 index of orginal array and updating to new prefix array.
		prefix.add(prefix.get(i-1) * nums.get(i-1));	
	}
	
	//arrProdExceptSelf_prefixSuffix.list(prefix);
	System.out.println("Prefix:"+prefix);

	//computing suffix product.
	ArrayList<Integer> suffix = new ArrayList<>();
	for (int i = 0; i < n; i++) {
            suffix.add(1); // Initialize with 1
        }


	suffix.set(n-1,1);

	for(int i = n-2;i >=0;i--){
		suffix.set(i,suffix.get(i+1) * nums.get(i+1));
	}
	
//	arrProdExceptSelf_prefixSuffix.list(suffix);
	System.out.println("Suffix:"+suffix);

	//multiplying products of prefix and suffix array.
	ArrayList<Integer> answer = new ArrayList<Integer>();


	System.out.println("PRoduct Array except self:");		
	for(int i = 0;i < n;i++){
		answer.add(prefix.get(i) * suffix.get(i));
	}

	return answer;
	}



	//method to print  the list
	public static void list(ArrayList<Integer> arr){
		
		for(int i = 0;i < arr.size();i++){
			System.out.print(arr.get(i)+"\t");
		}

		System.out.println("");
	}


	//main function
	public static void main(String[] args){
		
		ArrayList<Integer> nums = new ArrayList<>();

		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
	
		System.out.println("Given Array list is:");	
       		arrProdExceptSelf_prefixSuffix.list(nums);
	
       		ArrayList<Integer> result = arrProdExceptSelf_prefixSuffix.arrProductUsingPrefixSuffix(nums);
		System.out.println(result);	
	}
}

