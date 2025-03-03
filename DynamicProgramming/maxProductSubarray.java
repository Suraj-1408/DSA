public class maxProductSubarray{

	//method to return maxProduct Subarray/
	public static int maxProductSubarray(int[] nums){
	
	/*	
		int currProd = nums[0];
		int maxProd = nums[0];

		for(int i = 1; i < nums.length;i++){
		//first check.Adding current element in existing product ,does it increases the exisiting product.If Yes, include that element.
				
			if((currProd * nums[i]) > nums[i]){
				currProd =  currProd * nums[i];
			}

			//else if not , than simply start computing new subarray product. by updating currProd =  nums[i];
			else{
				currProd = nums[i];
			}

			//At LAst, update maxPRoduct.
			if(currProd > maxProd){
				maxProd = currProd;
			}
			
		}

		return  maxProd;	
	*/

		//in above code we only keep track of MAximum product i.e Only positive value. We should also keep track of negative values, 
		//Reason to keep track of MinProd i.e Negative product is that.
		//if minProd is negative , multiplying it wiht next element if negative may result in MAxProduct i.e postitive.
		//if minPrid is positive, multiplyinh it with next element  if positive may keep the MaxPROduct GROWING.

		int minProd = nums[0];		//only keep track of minproduct only.
		int maxProd = nums[0];		//only tarck of maxProduct only.
		int result = nums[0];		

		for(int i = 1;i < nums.length;i++){
			//now if current nums[i] is NEGATIVE , than mutliplying minProd that stores min product value would lead to Larger value(+ve) when compared to larger value(+ve) multiplied to negative  leading larger negative value, hence by swapping is necessary.

		       if(nums[i] < 0){
		       		int temp = maxProd;
				maxProd = minProd;
				minProd = temp;
		       }	

		       //now at each step i,e for each nums[i] compute which is minProduct and  maxProduct.
		       minProd = ((minProd*nums[i]) < nums[i])?(minProd*nums[i]):(nums[i]);

		       maxProd = ((maxProd*nums[i]) > nums[i])?(maxProd*nums[i]):(nums[i]);

		       result = (maxProd > result)?maxProd:result;
		}
		
		return result;
	}


	//main
	public static void main(String[] args){
		
		//int[] nums ={2,3,-2,4};
		int[] nums = {-2,0,-1};	
		int res = maxProductSubarray(nums);
		System.out.println("MAximum Subarray Product is:"+res);
	}
}
