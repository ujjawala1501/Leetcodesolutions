//Solution reference
//https://youtu.be/eTty8o7K2_M?si=CtYveIuaWRPl7xZp
/*Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
*/
import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> PascTriangle = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        PascTriangle.add(firstRow); //adding the small array of [1] to the big output array [[1],....]
 
        for(int i=1;i<numRows;i++){
            List<Integer> prevRow = PascTriangle.get(i-1); //the very first row which we have hard coded as 1
            List<Integer> CurRow  = new ArrayList<>();
            
            CurRow.add(1); //setting first column 1
            for(int j=1;j<i;j++){ //for Columns

            CurRow.add(prevRow.get(j-1) + prevRow.get(j));

            }

            CurRow.add(1); //setting last column 1
            PascTriangle.add(CurRow);
        }

        return PascTriangle;
        
    }
}