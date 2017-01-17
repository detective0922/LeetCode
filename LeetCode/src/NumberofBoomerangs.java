import java.util.HashMap;
import java.util.Map;

/*
447. Number of Boomerangs

Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k) such that the distance between i and j equals the distance between i and k (the order of the tuple matters).

Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).

Example:

Input:
[[0,0],[1,0],[2,0]]

Output:
2

Explanation:
The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]

*/

public class NumberofBoomerangs {
	public int numberOfBoomerangs(int[][] points) {
		int total = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points.length && j != i; j++) {
				int length = Math.abs((points[i][0] - points[j][0])) * Math.abs((points[i][0] - points[j][0]))
						+ Math.abs((points[i][1] - points[j][1])) * Math.abs((points[i][1] - points[j][1]));
				int count = 1;
				if (map.containsKey(length)) {
					count = map.get(length);
				}
				map.put(length, count);
			}
			for (int cnt : map.values()) {
				if (cnt > 1) {
					total += cnt * (cnt - 1);
				}
			}
			
		}
		
		return total;

	}

}
