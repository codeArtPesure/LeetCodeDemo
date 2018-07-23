/**
 * 
 */
package com.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
 */
public class Code2 {
	
	public static void main(String[] args) {
		System.out.println(frequencySort("aaatreedd"));
	}

	//思路 用map 统计出各个字符的频率 然后根据频率排序结果 拼接输出
	 public static String frequencySort(String s) {
	   Map<Character,Integer> map=new HashMap<Character,Integer>();    
	   for(int i=0;i<s.length();i++) {
		   Character c=s.charAt(i);
		   if(map.containsKey(c))
		   {
			   map.put(c, map.get(c)+1);
		   }else {
			   map.put(c, 1);
		   }
	   }
	   Iterator<Integer> iterator=map.values().iterator();
	   int k=0;
	   int[] valueArray=new int[map.values().size()];
	   while(iterator.hasNext()) {
		   valueArray[k++]=iterator.next();
	   }
	   Arrays.sort(valueArray);
	   StringBuffer stringBuffer=new StringBuffer();
	   Set<Entry<Character, Integer>> entrySet= map.entrySet();
	   for(int i=valueArray.length-1;i>=0;i--) {
		   for(Entry<Character, Integer> entry:entrySet) {
			   if(entry.getValue()==valueArray[i]) {
				   for(int j=0;j<entry.getValue();j++) {
					   stringBuffer.append(entry.getKey());
				   }
				   entry.setValue(0);
			   }
		   }
	   }
		 return stringBuffer.toString();
	 }
}
