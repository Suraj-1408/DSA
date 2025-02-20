public class twoSum{

	//method to return indices length of two size , which on adding meets the given target.
	public static int[] twoSum(int[] numbers,int target){
		
		int[] answer = {-1,-1};
		
	/*
		for(int i = 0 ;i < numbers.length-1;i++){
			//int sum = numbers[i];

			for(int j = i+1;j < numbers.length;j++ ){
				if((numbers[i] + numbers[j]) == target){
					answer[0] = i+1;
					answer[1] = j+1;

					return answer;
				}
			}
		}


		return  answer;
	*/
	
	//DIFFERENT APPROACH, SINCE THE ARRAY IS SORTED WE CAN MAKE USE OF TWO POINTERS,
	//START FROM FIRST AND LAST RESPECTIVELY.
	//ON ADDING  VALUE AT EACH ,IF SUM EXCEEDS TARGET, DECREMENT THE LAST INDEX, ELSE INCREMENT START.

	 //1)Starting from last Index of given string.
        //2)Extracting characters and storing it in stringBuilder class variable util space is encounter.
        //3) reversing the character present in that class.
        //4)Adding this word into another resultant stringBuilder class variable.

	int start = 0;
	int last = numbers.length - 1;

	while(start <= last){
		
		if((numbers[start]+numbers[last]) == target){
			answer[0] = start+1;
			answer[1] = last+1;

			return answer;
		}
		
		else if((numbers[start] + numbers[last]) > target){
			last--;
		}

		else if((numbers[start]+numbers[last]) < target){
			start++;
		}
		
	}

		return answer;
	}

	//main()
	public static void main(String[] args){
		
		int[] numbers = {2,7,11,15};
		int target = 26;

		System.out.println("Array elements are:");
		for(int i = 0;i < numbers.length;i++){
			System.out.print(numbers[i]+"\t");
		}
		System.out.println("");

		int[] answer = twoSum(numbers,target);

		System.out.println("Indexes that meets the target:"+answer[0]+"\t"+answer[1]);

	}	
}
