public class missingNumber{
    public static int missingNum(int arr[]) {
        // code here
        //logic
        //1- compute the expected sum using n*(n+1)/2
        //2- compute the actual sum for given 1-n
        //subtract actual sum - expected sum
        
        int n = arr.length+1;   //adding +1 because given array contains missing.
        long num = (long)n*(long)(n+1);
        long expectedSum = num/2;
        
        
        //looping given array and finding actual sum.
        int sum = arr[0];
        for(int i = 1;i < arr.length;i++){
            sum = sum+arr[i];
        }
        
        int mis = (int)expectedSum-sum;
        
        return mis;
    }


    //main
    public static void main(String[] args){
    int arr[] = {8, 2, 4, 5, 3, 7, 1};
    int missingNumber  = missingNum(arr);
    System.out.println(missingNumber);
    }
}
