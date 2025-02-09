public class correctSearchSubstring{

	public static int strStr(String haystack, String needle) {	
	
	for(int i = 0;i <= haystack.length() - needle.length();i++){
        
	int j = 0;     //used to just compare length of smaller string after inner loop ends
        
	for(j = 0; j < needle.length();j++){

            //check if current index characters doesn;t matches the break;
            if(haystack.charAt(i+j) != needle.charAt(j)){
                break;  //here for large string we use i+j index keeping i constant represent start index,
                        //if mathch found j varies helping large string to access next character 
            }
        }

            //check length of smaller string.
            if(j == needle.length()){
                return i;
            }
        }
        
	return -1;
   	
	}	
	


	//main()
         public static void main(String[] args){

         String large = new String("abcde");
         System.out.println("Large String:"+large);

         String small = new String("cd");
         System.out.println("Smaller String:"+small);
         int index = strStr(large,small);

         if(index >= 0){
          System.out.println("Substring start index found at "+index);
          }
         else{
           System.out.println("Substring not found "+index );
          }
       }	
}
