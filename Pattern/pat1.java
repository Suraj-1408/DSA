/*
 *
 * For n= 3,
pattern:  3 3 3 2 2 2 1 1 1
                    3 3 2 2 1 1
                    3 2 1
*/

import java.util.*;

public class pat1{

	public static void  main(String[] args){
		
		ArrayList<Integer> pat =  new ArrayList<>();
		int n = 3;

		/*
		for(int i = n;i >=1;i--){

			for(int j = n`;j >=1 ;j--){
				
				int num = n;				
				int count = n;

				while(count != 0){
					pat.add(num);
					count--;
				}	
				
			}
			
	//		num--;
		}
		*/

		for(int i = 1;i <= n;i++){
			//this loop focuses on number is that is to be printed in single row.
			for(int j = n;j >= 1;j--){
			
				//loop focuses on printing the j for i times(i = 3,2,1)	
				for(int k = 0; k < n - i + 1;k++){
					pat.add(j);
				}
			}
		}

		System.out.println(pat);
	}
}
