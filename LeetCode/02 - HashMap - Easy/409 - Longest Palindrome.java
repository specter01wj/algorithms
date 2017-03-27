/**
 *
 * 409. Longest Palindrome
 * Given a string which consists of lowercase or uppercase letters, find the length of 
 * the longest palindromes that can be built with those letters. This is case sensitive, 
 * for example "Aa" is not considered a palindrome here.
 * Note:
 *     Assume the length of given string will not exceed 1,010.
 * Example:
 *     Input:
 *         "abccccdd"
 *     Output: 7
 * Explanation:
 *     One longest palindrome that can be built is "dccaccd", whose length is 7.
 *
 */
import java.util.*;

public class Solution {
	public int longestPalindrome(String s) {
		HashSet<Character> set = new HashSet<Character>();
		int length = s.length();
		for (char c: s.toCharArray()) {
			if (set.contains(c)) {
				set.remove(c);
			} else {
				set.add(c);
			}
		}
		length -= set.size();
		return set.size() > 0 ? length + 1 : length;
	}
}