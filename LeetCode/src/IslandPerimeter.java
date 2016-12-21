import java.util.ArrayList;
import java.util.List;

/*
463. Island Perimeter

You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. 
Grid cells are connected horizontally/vertically (not diagonally). 
The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). 
The island doesn't have "lakes" (water inside that isn't connected to the water around the island). 
One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. 
Determine the perimeter of the island.

*/

public class IslandPerimeter {
	
	public int IslandPerimeter(int[][] grid) {
		int x = grid[0].length;
		int y = grid.length;
		int perimeter = 0;
		int cellPerimeter = 0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				cellPerimeter = 4;
				if (grid[i][j]==0) {
					continue;
				}
				
				
			}
			
		}
		return perimeter;
	}

}
