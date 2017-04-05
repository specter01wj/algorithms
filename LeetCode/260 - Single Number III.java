/**
 *
 * 260. Single Number III
 *     Given an array of numbers nums, in which exactly two elements appear only once and 
 *     all the other elements appear exactly twice. Find the two elements that appear 
 *     only once.
 *     
 *     For example:
 *     
 *     Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
 *     
 *     Note:
 *     The order of the result is not important. So in the above example, [5, 3] is also 
 *     correct.
 *     Your algorithm should run in linear runtime complexity. Could you implement it 
 *     using only constant space complexity?
 *     
 *
 */
import java.util.*;

public class Solution {
	public int[] singleNumber(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int num : nums) {
			if (set.contains(num)) {
				set.remove(num);
			} else {
				set.add(num);
			}
		}
		
		int[] singles = new int[2];
		int i = 0;
		for (int num : set) {
			singles[i++] = num;
		}
		return singles;
	}
}