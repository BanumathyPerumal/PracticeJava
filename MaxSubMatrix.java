package javaproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaxSubMatrix {    

    public static void main(String[] args){
        int[][] matrix = {{1,0,1,5,6},{3,3,0,3,3},{2,9,2,1,2},{0,2,4,2,0}};
    int rows = matrix.length;
    int cols = matrix[0].length;
    int size = 2;
        System.out.println(result(rows, cols, size, matrix));
    }

    static int result(int rows, int cols, int size, int[][]matrix){
        int sum_max = 0;
        int sum_current = 0;
        int sum_uniqueElements = 0;
        int startRow = 0;
        int startCol = 0;
        int endRow = (startRow + size) - 1;
        int endCol = 0;
        //declare List of arraylists
        List<List<Integer>> indices = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
           
        while(endRow< rows){           
            startCol = 0;
            endCol = startCol + size - 1;
           
            while(endCol < cols){
                for(int i = startRow; i<=endRow; i++){
                    for(int j = startCol; j<=endCol; j++){                      
                        sum_current = sum_current + matrix[i][j];
                    }
                }
                System.out.println("submatrix start cell: "+startRow +"," +startCol);
                System.out.println("sum current "+sum_current);
                if(sum_current==sum_max)  {
                    indices.add(Arrays.asList(startRow, startCol));
                    System.out.println("adding to the list indices");
                    sum_current = 0;                
                }
                else if(sum_current > sum_max){
                    //clear all the entries of indices and then add the current startRow and startCol
                    indices.clear();
                    System.out.println("After clearing indices: \n"+indices);
                    indices.add(Arrays.asList(startRow, startCol));
                    System.out.println("After adding new element \n"+indices);
                    sum_max = sum_current;
                    System.out.println("Sum max: "+sum_max);
                    sum_current = 0;                
                }
                sum_current = 0;                
                startCol ++;                
                endCol = startCol + size - 1;
            }
            startRow ++;
            endRow = startRow + size - 1;
            // System.out.println("line 60 end row "+endRow);
        }
    // }

    for(List list: indices){
        System.out.println(list);
        // System.out.println(list.get(0));
        // System.out.println(list.get(1));
        startRow = (int) list.get(0);
        startCol = (int) list.get(1);
        endRow = (startRow + size) - 1;
        endCol = startCol + size - 1;
        // System.out.println(startRow + ", "+ startCol);
        for(int i = startRow; i<=endRow; i++){
            for(int j = startCol; j<=endCol; j++){                      
                set.add(matrix[i][j]);
            }
        }
    }
        for(Integer n: set) sum_uniqueElements = sum_uniqueElements +(int)n;
        return sum_uniqueElements;
    }

}
