/**
 *
 * 258. Add Digits 
 *     Given a non-negative integer num, repeatedly add all its digits until the result 
 *     has only one digit.
 *     
 *     For example:
 *     
 *     Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one 
 *     digit, return it.
 *     
 *
 */
import java.util.*;

public class Solution {
	public int addDigits(int num) {
		return 1 + (num - 1) % 9;
	}
}