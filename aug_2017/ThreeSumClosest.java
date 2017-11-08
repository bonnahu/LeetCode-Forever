package aug_2017;

import java.util.Arrays;

/**
 * Given an array S of n integers, find three integers
 * in S such that the sum is closest to a given number, target. 
 * Return the sum of the three integers. You may assume 
 * that each input would have exactly one solution.

    For example, given array S = {-1 2 1 -4}, and target = 1.

    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * @author Lei
 *
 */
public class ThreeSumClosest {
	/**
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int threeSumClosest(int[] nums, int target) {
		int clsestVal=nums[0]+nums[1]+nums[2];
		int start;
		int end;
		Arrays.sort(nums);
		// every time we should at least have three items,
		// that's why i put i< arr.length-2
		for(int i=0;i<nums.length-2;i++){
			start=i+1;
			end=nums.length-1;
			//using the typical two pointer strategy
			while(start<end){
				if((nums[start]+nums[end]+nums[i])==target){
					// find the exact match one, just return
					return target;
				}else if (nums[start]+nums[end]+nums[i]<target){
					
					//compare to the closestVal
					if (Math.abs(nums[start]+nums[end]+nums[i]-target) <Math.abs(clsestVal-target)) {
						clsestVal=nums[start]+nums[end]+nums[i];
					}
					start++;
				}else if (nums[start]+nums[end]+nums[i]>target){
					
					//compare to the closestVal
					if (Math.abs(nums[start]+nums[end]+nums[i]-target) <Math.abs(clsestVal-target)) {
						clsestVal=nums[start]+nums[end]+nums[i];
					}
					end--;
				}
			}
		}
		return clsestVal;
	}
	
	public static void main(String[] args){
		ThreeSumClosest testObj= new ThreeSumClosest();
		System.out.println(testObj.threeSumClosest(new int[]{-3,-2,-5,3,-4}, -1));
	}
}
