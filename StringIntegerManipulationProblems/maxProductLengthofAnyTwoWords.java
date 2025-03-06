class maxProductLengthofAnyTwoWords{
	
	//method to return maxProduct value of any two words in string array s.t those words don;t have common letters in them.
	public static int maxProduct(String[] words){
		/*
		String firstWord = words[0];

		for(int i = 0;i < firstWord.length();i++){
			
			for(int j = 1; j < words.length;j++){
				String nextWord = words[j];
					
					
				for(int k = 0;k < nextWord.length();k++){	
					if(firstWord.charAt(k) == nextWord.charAt(k)){
						break;
					}
				}

				maxLen = firstWord.length() * nextWord.length();
			}
		}

		return maxLen;
		*/

		//another approach, trying all possible combinations of words.
		int maxProduct = 0;
		for(int i = 0; i < words.length;i++){
			String firstWord = words[i];

			for(int j = i+1;j < words.length;j++){
				
				String nextWord = words[j];

				//if firstWord and nextWord dont share common letter , compute the maxProduct.
				if(!hasCommonLetter(firstWord,nextWord)){
					//System.out.println("First Word:"+firstWord+" present at Index:"+i);
					//System.out.println("Second Word:"+nextWord+" present at Index:"+j);
				
					int currProduct = firstWord.length()*nextWord.length();
					maxProduct = (currProduct > maxProduct) ? currProduct:maxProduct;
				}
			}
		}

		return maxProduct;
	}

	//method to check if any two given words has common letters.
	public static boolean hasCommonLetter(String word1,String word2){
		
		int smallWord = (word1.length() < word2.length())?word1.length():word2.length();

		for(int i = 0 ; i < word1.length();i++){
			char ch = word1.charAt(i);

			for(int j = 0;j < word2.length();j++){
				
				if(ch == word2.charAt(j)){
					return true;
				}
			}
		}
		
		return false;
	}


	//main
	public static void main(String[] args){
		
		//String words[] = {"abcw","baz","foo","bar","xtfn","abcdef"};
		String words[]  = {"a","ab","abc","d","cd","bcd","abcd"};

		System.out.println("Given String Array:");
		for(int i = 0 ;i < words.length;i++){
			System.out.print(words[i]+"\t");
		}
		System.out.println("");

		int maxProduct = maxProduct(words);
		System.out.println("MAximum product in String array:"+maxProduct);


	}
}
