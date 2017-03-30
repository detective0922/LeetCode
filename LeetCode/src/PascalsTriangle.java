import java.util.ArrayList;
import java.util.List;

/*
118. Pascal's Triangle

Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
 Return
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]

*/
public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(new PascalsTriangle().generate(5));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangleList = new ArrayList<List<Integer>>();
        int[][] triangleArray = new int[numRows][numRows];


    }
}
