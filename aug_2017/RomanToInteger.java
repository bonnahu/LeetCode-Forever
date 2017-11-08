package aug_2017;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	public int romanToInt(String s) {
		Map<String,Integer> romanToIntMap = new HashMap <String,Integer>();
		romanToIntMap.put("M", 1000);
		romanToIntMap.put("CM", 900);
		romanToIntMap.put("D", 500);
		romanToIntMap.put("CD", 400);
		romanToIntMap.put("C", 100);
		romanToIntMap.put("XC", 90);
		romanToIntMap.put("L", 50);
		romanToIntMap.put("XL", 40);
		romanToIntMap.put("X", 10);
		romanToIntMap.put("IX", 9);
		romanToIntMap.put("V", 5);
		romanToIntMap.put("IV", 4);
		romanToIntMap.put("I", 1);
		char curChar;
		char nxtChar;
		int retNum =0;
		int strLen= s.length();
		for(int i = 0; i < strLen; i++){
			curChar = s.charAt(i);
			if (i < strLen-1){
				nxtChar =s.charAt(i+1);
				if(curChar == 'C' && (i+1) < strLen && (nxtChar=='M' || nxtChar=='D')){
					retNum += romanToIntMap.get("C"+ String.valueOf(nxtChar));
					i++;
				}else if(curChar == 'X' && (i+1) < strLen && (nxtChar=='L' || nxtChar=='C')){
					retNum += romanToIntMap.get("X"+ String.valueOf(nxtChar));
					i++;
				}else if(curChar == 'I' && (i+1) < strLen && (nxtChar=='X' || nxtChar=='V')){
					retNum += romanToIntMap.get("I"+ String.valueOf(nxtChar));
					i++;
				}else{
					retNum += romanToIntMap.get(String.valueOf(curChar));
				}
			}else
				retNum += romanToIntMap.get(String.valueOf(curChar));
				
		}
		return retNum;
    }
	
	public static void main(String[] args){
		RomanToInteger testObj = new RomanToInteger();
		System.out.println(testObj.romanToInt("CMCDVI"));
	}
}
