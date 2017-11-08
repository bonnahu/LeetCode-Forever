package aug_2017;
/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * @author Lei
 *
 */
public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		if (strs==null)
			return "";
		if (strs.length==0)
			return "";
		int index = 0;
		// use the first string strs[0] to compare with other strings
		// by each character
        while(index<strs[0].length()){
        	for(int i=1; i<strs.length;i++){
        		if(index==strs[i].length() || strs[i].charAt(index)!=strs[0].charAt(index)){
        			return strs[0].substring(0,index);
	            }
        	}
        	index++;
        }
        return strs[0].substring(0,index);
    }
	
	public static void main(String[] args){
		LongestCommonPrefix testObj= new LongestCommonPrefix();
		String[] testStrs = new String[]{"abab", "aba",""};
		System.out.println(testObj.longestCommonPrefix(testStrs));
	}
}
