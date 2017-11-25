package nov_2017;
/**
 * Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack
 * @author Lei
 * 20171125
 *
 */
public class Strstr {
	public int strStr(String haystack, String needle) {
		if (haystack == null || needle == null) 
			return -1;
	
		int lenHaystack = haystack.length();
		int lenNeedle = needle.length();
		// we just need to consider the index of haystack, 
		// which has enough length to include the needle
		for (int i=0; i <= lenHaystack-lenNeedle; i++) {
			int indexNeedle = 0;
			int indexHaystack = i;
			while (indexNeedle < lenNeedle && needle.charAt(indexNeedle) == haystack.charAt(indexHaystack)) {
				indexNeedle++;
				indexHaystack++;
			}
			// find the substring needle in haystack
			if (indexNeedle == lenNeedle)
				return i;
		}
		return -1;
    }
	
	public static void main(String[] args) {
		Strstr testObj = new Strstr();
		System.out.println(testObj.strStr("hello", "ll"));
		System.out.println(testObj.strStr("hello", "l"));
		System.out.println(testObj.strStr("aaaaa", "bba"));
		System.out.println(testObj.strStr("abcdde", "de"));
		System.out.println(testObj.strStr("abcdde", "abcdde"));
		System.out.println(testObj.strStr("a", "a"));
		System.out.println(testObj.strStr("        ", " "));
	}
}
