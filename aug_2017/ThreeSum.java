package aug_2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 
 * @author Lei
 *
 */

public class ThreeSum {
	/**
	 * 
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> retList = new ArrayList<List<Integer>>();
        //sort array first
        Arrays.sort(nums);
        int targetVal;
        int start;
        int end;
        // iterate all the sorted array items from 0 to the last 
        // third one, for each item, we start a two sum process
        // on the the rest right part of the array, the target value
        // is the negative value of the item
        for(int i=0; i<nums.length-2; i++){
            targetVal= -nums[i];
            if (i>0 && nums[i]==nums[i-1])
                continue;
            start=i+1;
            end=nums.length-1;
            // start the two sum search for the targetVal
            // from the index start to the index end
            while(start<end){
            	if (nums[start]+nums[end]<targetVal)
            		start++;
            	else if (nums[start]+nums[end]>targetVal)
            		end--;
            	else{
            		// find one matched three numbers
            		List<Integer> matchedTriplet = new ArrayList<Integer>();
            		matchedTriplet.add(nums[i]);
            		matchedTriplet.add(nums[start]);
            		matchedTriplet.add(nums[end]);
            		retList.add(matchedTriplet);
            		start++;
            		end--;
            	}
            }
           
        }
        return retList;
    }
    
    
    public static void main(String[] args){
    	int[] testingArr =  new int[]{0,0,0,0};
    	ThreeSum testingObj = new ThreeSum();
    	System.out.println(testingObj.threeSum(testingArr));
    }
}
