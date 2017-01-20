
/*
326. Power of Three

Given an integer, write a function to determine if it is a power of three. 

Follow up:
 Could you do it without using any loop / recursion? 


*/

public class PowerofThree {
	
	public static void main(String[] args) {
		System.out.println(new PowerofThree().isPowerOfThree(2147483646));
	}
	
	public boolean isPowerOfThree(int n) {
		if (n == 1) {
			return true;
		}
		long num = 3;
		while (num < n) {
			num *= 3;
		}
		return num == n;
	}

}
