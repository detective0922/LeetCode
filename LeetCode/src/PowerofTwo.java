
/*

231. Power of Two

Given an integer, write a function to determine if it is a power of two. 
*/


public class PowerofTwo {
	public boolean isPowerOfTwo(int n) {
		if (n == 1) {
			return true;
		}
		long num = 2;
		while (num < n) {
			num *= 2;
		}
		return num == n;

	}

}
