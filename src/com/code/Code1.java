/**
 * 
 */
package com.code;

import java.util.HashSet;
import java.util.Set;

/*
  * 
  * 给定一个字符串，找出不含有重复字符的最长子串的长度。
示例：
给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。
给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。
给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串。
  */
public class Code1 {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		System.out.println(lengthOfLongestSubstring("c"));
		System.out.println(lengthOfLongestSubstring("bbbbb"));
		System.out.println(lengthOfLongestSubstring("asjrgape"));

	}

	//最初想法 用一个Set判断是否有重复字符，没有加加到Set集合 有就和当前最大的子串长度判断 算法复杂度 O（n2） 超时
//	public static int lengthOfLongestSubstring(String s) {
//		int maxLength = 1;
//		Set<Character> charSet = new HashSet<Character>();
//		for (int i = 0; i < s.length(); i++) {
//			for(int j=i;j<s.length();j++)
//			{
//				char c=s.charAt(j);
//				if (charSet.contains(c)) {
//					if(maxLength<charSet.size()) {
//						maxLength=charSet.size();
//					}
//					charSet.clear();
//				}
//				charSet.add(c);
//			}
//			if(maxLength<charSet.size()) {
//				maxLength=charSet.size();
//			}
//			charSet.clear();
//		}
//		return maxLength;
//	}
	
	//通过代码  思路如下：start 标记开始值 每次遍历 查看是否有重复字符 ，没有currentLength++
	//否则和最大长度判断 并且修改start的值和currentLength 继续遍历
	public static int lengthOfLongestSubstring(String s) {
		if(s==null||"".equals(s)) {
			return 0;
		}
	    int maxLength=1;
	    int currentLength=1;
	    int start=0;
	    char[] chars=s.toCharArray();
		for(int i=1;i<chars.length;i++) {
		int charIndex=index(chars,start,i,chars[i]);
	       if(charIndex==-1) {
	    	   currentLength++;
	       }else {
	    	   if(currentLength>maxLength) {
	    		   maxLength=currentLength;
	    	   }
	    	   start=charIndex+1;
	    	   currentLength=i-charIndex;
	       }
	    }
		if(currentLength>maxLength) {
			maxLength=currentLength;
		}
		return maxLength;
    }
	private static int index(char[] chars,int start,int end, char c) {
		for(int i=start;i<end;i++) {
			if(chars[i]==c) {
				return i;
			}
		}
		return -1;
	}

}
