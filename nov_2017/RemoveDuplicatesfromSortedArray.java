package nov_2017;
/**
 * Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * @author Lei
 *
 */
public class RemoveDuplicatesfromSortedArray {
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) 
			return 0;
		int nonDupNum = 1;
		int nonDupIndex = 0;
		int index = 1;
		while (index < nums.length) {
			if(nums[index] != nums[index-1]) {
				nonDupIndex++;
				nonDupNum++;
				// if the index is not equal the nonDupIndex+1,
				// then we do the copy
				if (index != nonDupIndex) {
					nums[nonDupIndex] = nums[index];
				}
			}
			index++;
		}
		return nonDupNum;
	}
}
