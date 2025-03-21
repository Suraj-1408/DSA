import java.util.HashSet;

class happyNumber{
	
	//method to find out whether the given number is happy number or not.
	public static boolean happyNumber(int num){
		
		//APPROACH - using a HashSet to store square of each digit for a number.if the future resultant is contains the any one of the element in the set, than we can conclude that there exist a cycle, and computed square of digit would repeat agian. Hence that number is not a HAPPY NUMBER.
	
		//Using HashSet Class to store elements starting from the given number and for number whose squares are computed.
		int res = 0;

		HashSet<Integer> set = new HashSet<>();
		set.add(num);
		
		while(num != 0){
		
			res = digitSum(num);

			if(res == 1){
				return true;
			}
			
			else if(set.contains(res)){
				return false;
			}

			set.add(res);

			//repeat the process resultant extracted.
			num = res;	
			res = 0;
		}
		
		return false;
	/*
		int res = 0;
		int numres = 0;

		while(num != 0){
			int lastDigit = (num%10);
			
			res = res + sqr(lastDigit);

			//update num.
			num = num/10;
		}

		//here check if the res is zero.
		if(res == 1){
			return true;
		}
		else{
			//reset the res value to 0.
			numres = res;
			res = 0;
			return happyNumber(numres);
		}
	
		return false;
	*/
	}

	//method to compute the sum of each digit for given number.
	public static int digitSum(int num){
		int res = 0;
		
		while(num != 0){
			//extract last digit using mod
			int digit = num%10;
			res = res + sqr(digit);

			//remove the last digit/
			num = num/10;
		}
		
		return res;
	}

	//method to compute the srq.
	public static int sqr(int n){
		return n*n;
	}

	//main
	public static void main(String[] args){
		
		boolean res = happyNumber(19);

		if(res == true){
			System.out.println("Given number is HAPPY NUMBER.");
		}

		else{
			System.out.println("Given Number is Not a HAPPY NUMBER.");
		}
	}

} 
