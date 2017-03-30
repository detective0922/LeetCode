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

        int[][] triangleArray = new int[numRows][numRows];
        if (numRows<1){
            return triangleArrayToList(triangleArray);
        }
        triangleArray[0][1] = 1;
        if (numRows == 1){
            return triangleArrayToList(triangleArray);
        }
        triangleArray[1][0] = 1;
        triangleArray[1][1] = 1;
        if (numRows==2){
            return  triangleArrayToList(triangleArray);
        }

        for()


    }

    public List<List<Integer>> triangleArrayToList(int[][] triangleArray){
        List<List<Integer>> triangleList = new ArrayList<List<Integer>>();
        for (int i = 0;i<triangleArray.length;i++){
            List<Integer> lineList = new ArrayList<Integer>();
            for (int j = 0;j<triangleArray[i].length;j++){
                if (triangleArray[i][j]!=0){
                    lineList.add(triangleArray[i][j]);
                }
            }
            triangleList.add(lineList);
        }
        return triangleList;
    }
}
