package LeetCode75;

public class EqualNumberOfRowAndCol {
    public static void main(String[] args) {
        int[][] grid = {{3,2,1},{1,7,6},{2,7,7}};
        int count=0;

        for(int r=0; r<grid.length; r++) {
            for(int c=0; c<grid[0].length; c++) {
                boolean isEqual = true; // Reset isEqual for each new pair of elements
                for(int i=0; i<grid.length; i++) {
                    if(grid[r][i] != grid[i][c]) {
                        isEqual = false;
                        break;
                    }
                }
                if(isEqual) // If all elements in the row and column are equal
                    count++;
            }
        }
        System.out.println(count);
    }
}
