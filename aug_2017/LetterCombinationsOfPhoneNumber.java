package aug_2017;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * Given a digit string, return all possible letter combinations that the number could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 * Input:Digit string "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 
 * @author Lei
 *
 */
public class LetterCombinationsOfPhoneNumber {
	public List<String> letterCombinations(String digits) {
        List<String> retList = new ArrayList<String>();
        Map<Character,String> letterCombMap= new HashMap<Character,String>();
        letterCombMap.put('2', "abc");
        letterCombMap.put('3', "def");
        letterCombMap.put('4', "ghi");
        letterCombMap.put('5', "jkl");
        letterCombMap.put('6', "mno");
        letterCombMap.put('7', "pqrs");
        letterCombMap.put('8', "tuv");
        letterCombMap.put('9', "wxyz");
        if(digits==null || digits.length()==0)
        	return retList;
        
        return letterCombinations_recur(digits, 0,letterCombMap);
    }
	
	public List<String> letterCombinations_recur(String digits, int index, Map<Character,String> letterCombMap) {
		List<String> retList = new ArrayList<String>();
		if(digits==null || digits.length()==0)
        	return retList;
        if(index==-1)
        	return retList;
        else if (index== digits.length()-1) {
	        String tmpStr=letterCombMap.get(digits.charAt(index));
	        for(int i=0; i < tmpStr.length();i++){
	        	retList.add(String.valueOf(tmpStr.charAt(i)));
	        }
        }else{
	        	char curDigit =  digits.charAt(index);
	        	String comStr=letterCombMap.get(curDigit);
	        	List<String> tmpList = letterCombinations_recur(digits, index+1,letterCombMap);
	        	for(String itemStr : tmpList){
	        		for(int i=0; i<comStr.length();i++){
	        			retList.add(String.valueOf(comStr.charAt(i))+ itemStr);
	        		}
	        		
	        	}
	        	
	        }
        
        return retList;
    }
	
	
	public static void main(String[] args){
		LetterCombinationsOfPhoneNumber testObj = new LetterCombinationsOfPhoneNumber();
		System.out.println(testObj.letterCombinations("23"));
	}
}
