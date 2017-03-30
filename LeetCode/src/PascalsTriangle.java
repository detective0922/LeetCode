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
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        triangle.add(new ArrayList<Integer>());
        if (numRows < 1) {
            return triangle;
        }
        for (int i = 0; i < numRows; i++) {
            List<Integer> lineList = new ArrayList<Integer>();
            lineList.add(1);
            for (int j = 1; j<numRows-1;j++){
                if (triangle.get(i-1)==null||triangle.get(i).size()<2){
                    lineList.add(1);

                } else {

                }
            }
            lineList.add(1);
        }

    }
}
