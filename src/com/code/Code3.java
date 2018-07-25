/**
 * 
 */
package com.code;

/**
 * @date 2018年7月23日 Description:给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * 注意事项：您可以假定该字符串只包含小写字母。
 */
public class Code3 {

	public static void main(String[] args) {
		System.out.println(firstUniqChar("loveleetcode"));
		System.out.println(firstUniqChar("leetcode"));
		System.out.println(firstUniqChar("dddccdbba"));
		System.out.println(firstUniqChar("aadadaad"));
		System.out.println(firstUniqChar("cc"));
		System.out.println(firstUniqChar("z"));


	}

	// 遍历字符串 判断其后面是否有相同字符，有则将相同字母编程字符'A' 没有则继续遍历 遇到字符'A'直接跳过
	public static int firstUniqChar(String s) {
		if (s == null || "".equals(s)) {
			return -1;
		}
		if(s.length()==1) {
			return 0;
		}
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			boolean flag=true;
			char c = chars[i];
			if(c=='A') {
				continue;
			}
			int k = i + 1;
			for (; k < chars.length; k++) {
				if (c == chars[k]) {
					chars[k]='A';
					flag=false;
				}
			}
			if(flag) {
				return i;
			}
		}
		return -1;
	}
}
