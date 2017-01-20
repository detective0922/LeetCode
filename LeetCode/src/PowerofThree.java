
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
		
		//a better solution
		// 1162261467 is 3^19,  3^20 is bigger than int  
		//return ( n>0 &&  1162261467%n==0);
			

	}

}
