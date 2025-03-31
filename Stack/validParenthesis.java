import java.util.Stack;

class validParenthesis{
	
	//method to validate whether a given string is valid paranthesis or not.
	public static boolean isValid(String str){
		
		//boolean res = true;

		//using stack class
		Stack<Character> stk = new Stack<>();

		for(int i = 0;i < str.length();i++){
			
			//extract the character.
			char ch = str.charAt(i);

			//push into stack if its , either- (,{ or [
			if(ch == '(' || ch == '{' || ch == '['){
				stk.push(ch);
			}

			else{
				//extract the peek from stack,compare it with encountered character, if same, remove it,
				//and check for next character.
				
				//before popping check if stack is not empty.
				if(stk.isEmpty()){
					return false;
				}

				//get the top.
				char top = stk.peek();

				if((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')){
					System.out.println("Invalid Parenthesis String");
					return false;
				}
				//remove top.
				else{	
					stk.pop();
				}	
			}
		}

		//return res;
		return stk.isEmpty(); //since isEmpty() either return true or false based on elements in stack.
		//used when string only contains opening brackets, we need result as false , isEmpty() helps there.
	}


	//method to print
	public static  void data(String str){
		System.out.println("Given string is:"+ str);
		/*
		for(int i = 0;i < str.length();i++){
			System.out.print(str.charAt(i)+",");
		}
		System.out.println("");
		*/
	}

	//main
	public static void main(String[] args){
		
		//String str = "()[]{}";
		//String str = "(]";
		String str = "((";

		data(str);

		isValid(str);	
	}
}
