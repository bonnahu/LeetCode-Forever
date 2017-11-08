package aug_2017;
/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a 
 * point at coordinate (i, ai). n vertical lines are drawn such that the 
 * two endpoints of line i is at (i, ai) and (i, 0). Find two lines, 
 * which together with x-axis forms a container, such that the container 
 * contains the most water.
 * Note: You may not slant the container and n is at least 2.
 * @author Lei
 *
 */
public class ContainerWithMostWater {
	/**
	 * First finish date: 20170810
	 * This question belongs to the two pointer/index category.
	 * Using two index to move towards the center.
	 * The key point is that we need to move the index which has the
	 * shorter height. The reason is that if we move the index which has
	 * the larger height, since the width becomes smaller, so the area 
	 * will always smaller than the previous area, therefore we need to move
	 * the index which has the shorter height.
	 * @param height
	 * @return
	 */
	public int maxArea(int[] height) {
		int start=0;
		int end=height.length-1;
		int maximumArea=0;
		int curArea=0;
		int smallerHeight=0;
		while(start<end){
			if (height[start] < height[end]){
				smallerHeight=height[start];
				curArea= smallerHeight*(end-start);
				start++;
			}else{
				smallerHeight=height[end];
				curArea= smallerHeight*(end-start);
				end--;
			}
			
			maximumArea= Math.max(maximumArea, curArea);
		}
        return maximumArea;
    }
	
	public static void main(String[] args){
		int[] testHeighgArr= new int[]{1,4,1,2,3,4,2,3};
		ContainerWithMostWater testObj= new ContainerWithMostWater();
		System.out.println(testObj.maxArea(testHeighgArr));
	}
}
