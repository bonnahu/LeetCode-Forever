package aug_2017;

/**
 * Given an integer, convert it to a roman numeral.
 * Input is guaranteed to be within the range from 1 to 3999.
 * 
 * @author Lei
 *
 */
public class IntegerToRoman {
	/**
	 * First finish date: 20170812
	 * @param num
	 * @return
	 */
	public String intToRoman(int num) {
		int[] valArr = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
		// instead of using a hashmap to get the corresponding roman num,
		// we could use a string array to store the roman num, whose order 
		// are consistent with the valArr
		String[] romanArr = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		
		int curNum=num;
		int index=0;
		StringBuilder retSB= new StringBuilder();
		while(curNum>0){
			if(curNum>=valArr[index]){
				curNum-=valArr[index];
				retSB.append(romanArr[index]);
			}else{
				index++;
			}
		}
		System.out.println(retSB);
		return retSB.toString();
		
	}
	public static void main(String[] args){
		IntegerToRoman testObj= new IntegerToRoman();
		testObj.intToRoman(2);
	}
}
