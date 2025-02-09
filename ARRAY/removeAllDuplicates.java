import java.util.*;

public class removeAllDuplicates{

	
	//method to remove all duplicates(WORKS ONLY ON SORTED ARRAY)
	//using an index to store the unique elements in given array.
	//comparing each current element with its previous element if unique  adding it to nums using new index.
	
	//2 0 1 1 0
	public static ArrayList<Integer> removeAllDuplicates(ArrayList<Integer> nums){

/*		
		int index = 0 ;	//assuming first element exist 
	
		ArrayList<Integer> unique = new ArrayList<>();

		for(int i = 0;i < nums.size() -2;i++){
			if(nums.get(i) != nums.get(i+1)){
				//int temp = nums.get(i);
				//unique.set(index,temp);
				unique.add(nums.get(i));
				index++;
			}
		
		}

		return unique;
*/


		ArrayList<Integer> unique = new ArrayList<>();
		
		HashSet<Integer> element = new HashSet<>();
		for(int i = 0 ;i < nums.size();i++){
			
			//checking if set element contains the current index value of the array.
			if(element.contains(nums.get(i)) == false){
				unique.add(nums.get(i));
				element.add(nums.get(i));		
			}

		}

		return unique;

	}

	//main method.
	public static void main(String[] args){
		
		ArrayList<Integer> nums = new ArrayList<>();

	//	nums.add(2);
		nums.add(0);
		nums.add(1);
	//	nums.add(0);
		nums.add(1);
		nums.add(2);

		System.out.println("Elements of Array are:\n");
		for(int i = 0;i < nums.size();i++){
			System.out.print(nums.get(i)+"\t");
		}

		System.out.println("");

		ArrayList<Integer> res = removeAllDuplicates(nums);
		System.out.println(res);
	}
	
}
