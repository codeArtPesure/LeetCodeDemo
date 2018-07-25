/**
 * 
 */
package com.code;

import java.util.Arrays;

/**
 * @author 邓志立
 * @date 2018年7月23日 Description:给定一个包含红色、白色和蓝色，一共 n
 *       个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。 此题中，我们使用整数 0、 1 和 2
 *       分别表示红色、白色和蓝色。 输入: [2,0,2,1,1,0] 输出: [0,0,1,1,2,2]
 */
public class Code6 {

	public static void main(String[] args) {
		int[] arr= {2,0,2,1,1,0};
		sortColors(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void sortColors(int[] nums) {
		int zeroCount=0;
		int oneCount=0;
		int twoCount=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0) {
				zeroCount++;
				continue;
			}
			if(nums[i]==1) {
				oneCount++;
				continue;
			}
			if(nums[i]==2) {
				twoCount++;
			}
		}
		for(int i=0;i<zeroCount;i++) {
			nums[i]=0;
		}
		for(int i=0;i<oneCount;i++) {
			nums[i+zeroCount]=1;
		}
		for(int i=0;i<twoCount;i++) {
			nums[i+oneCount+zeroCount]=2;
		}
	}
}
