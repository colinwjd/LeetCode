/**
 * 
 */
package colin.leetcode;


/**
 * Given two binary strings, return their sum (also a binary string).
 * 
 * For example, a = "11" b = "1" Return "100".
 * 
 * @author Colin Wang Created on Apr 26, 2015
 */
public class AddBinary {

	public String addBinary(String a, String b) {
        if(a == null || a.isEmpty()) {
            return b;
        }
        if(b == null || b.isEmpty()) {
            return a;
        }
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        StringBuilder stb = new StringBuilder();

        int i = aArray.length - 1;
        int j = bArray.length - 1;
        int aByte;
        int bByte;
        int carry = 0;
        int result;

        while(i > -1 || j > -1 || carry == 1) {
            aByte = (i > -1) ? Character.getNumericValue(aArray[i--]) : 0;
            bByte = (j > -1) ? Character.getNumericValue(bArray[j--]) : 0;
            result = aByte ^ bByte ^ carry;
            carry = ((aByte + bByte + carry) >= 2) ? 1 : 0;
            stb.append(result);
        }
        return stb.reverse().toString();
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new AddBinary().addBinary("101", "1"));
		System.out.println(new AddBinary().addBinary("11", "1"));

	}

}
