/**
 * 
 */
package com.code;

 /**
 * @author 邓志立
 * @date 2018年7月23日
 * Description: 给定一个正整数，检查他是否为交替位二进制数：换句话说，就是他的二进制数相邻的两个位数永不相等。
 */
public class Code4 {

	public static void main(String[] args) {
		System.out.println(hasAlternatingBits(10));
	}
	//思路：把n转换成二进制字符串，然后判断相邻的字符是否相同
	public static boolean hasAlternatingBits(int n) {
	       String binaryStr= Integer.toBinaryString(n);
	       for(int i=0;i<binaryStr.length()-1;i++) {
	    	   if(binaryStr.charAt(i)==binaryStr.charAt(i+1)) {
	    		   return false;
	    	   }
	       }
	       return true;
	}
}
