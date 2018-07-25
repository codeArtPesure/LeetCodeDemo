/**
 * 
 */
package com.code;

 /**
 * @author 邓志立
 * @date 2018年7月23日
 * Description:给定一个 32 位有符号整数，将整数中的数字进行反转。
 */
public class Code5 {

	public static void main(String[] args) {
		System.out.println(reverse(100000));
	}
	
	//判断是否溢出
	public static int reverse(int x) {
        int reverseNumber=getReversrNumber(x);
        if(x%getReversrNumber(reverseNumber)==0) {
        	return reverseNumber;
        }else {
        	return 0;
        }
    }
	private static int getReversrNumber(int x) {
		int result=0;
        while(x!=0) {
        	int temp=x%10;
        	x=x/10;
        	result=result*10+temp;
        }
        return result;
	}
	
}
