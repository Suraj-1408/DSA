import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class threeSum{
	
	//method to compute the sum of any three indexes in array s..t it equates to 0.
	public static ArrayList<ArrayList<Integer>> computeSum(ArrayList<Integer> nums){
		
		//brute force approach. to check for each indexes using three nested loop.
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();		//stores the 3 elements that on adding gives 0.
		
		
		//using HashSet to store unique sublist.
		HashSet<ArrayList<Integer>> uniqueSublist = new HashSet<>();

		//creating sub ArrayList that will store the possible elements that on sum comes to zero.
		//ArrayList<Integer> sublist = new ArrayList<>();
		int sum = Integer.MIN_VALUE;

		for(int i = 0;i < nums.size();i++){

			for(int j = i+1;j < nums.size();j++){
				
				for(int k = j+1;k < nums.size();k++){
					
					sum = nums.get(i)+nums.get(j)+nums.get(k);
					
					//check sum.
					if(sum == 0){

						//if true create new sub list.
						ArrayList<Integer> sublist = new ArrayList<>();

						sublist.add(nums.get(i));
						sublist.add(nums.get(j));
						sublist.add(nums.get(k));
						
					
						//result.add(sublist);
						
						//Since in final list we wanted distinct sublist, Hence using HashSet.
						//But before directly add into HashSet , sorting elements into sublist,
						//so as to catch the duplicate sublist.

						//add into HashSet if sublist is unique.
						Collections.sort(sublist);
						uniqueSublist.add(sublist);
					}
				}
				
			}
	
		}
		
		//after traversing all possible indexes, add all the sublist caught in uniqueSublist HashSet.	
		result.addAll(uniqueSublist);	
		
		return result;
	}

		
	//method to print the given list.
	public static void list(ArrayList<Integer> nums){
		
		//System.out.println("Given List is:");

		for(int i = 0;i < nums.size();i++){
			System.out.print(nums.get(i)+"\t");
		}

		System.out.println("");
	}

	//main
	public static void main(String[] args){
		
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(-1);
		nums.add(0);
		nums.add(1);
		nums.add(2);
		nums.add(-1);
		nums.add(-4);


		list(nums);

		System.out.println("List of Sublist with sum of element adding to 0 is:");
		ArrayList<ArrayList<Integer>> result = computeSum(nums);
		System.out.println(result);
	}
}
