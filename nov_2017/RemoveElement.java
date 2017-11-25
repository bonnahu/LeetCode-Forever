package nov_2017;
/**
 * Given an array and a value, remove all instances of that value in-place 
 * and return the new length. Do not allocate extra space for another array, 
 * you must do this by modifying the input array in-place with O(1) extra memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * 
 * @author Lei
 *
 */
public class RemoveElement {
	public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) 
        	return 0;
        int indexAfterRemove = -1;
        for(int i = 0; i < nums.length; i++) {
        	// skip all the item to be removed, to save the copy time
        	while (i < nums.length && nums[i] == val)
        		i++;
        	// if hit the end of the array
        	if (i == nums.length) 
        		break;
        	else { // if the current element is to be save
        		nums[++indexAfterRemove] = nums[i];
        	}
        }
        return indexAfterRemove+1;
	}
	
	public static void main(String[] args) {
		System.out.println(removeElement(new int[] {2,2,3,3,3}, 1));
	}
}
