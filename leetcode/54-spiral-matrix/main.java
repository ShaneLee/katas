import java.util.LinkedList;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length -1;
        int top = 0;
        int bottom = matrix.length -1;

        final List<Integer> res = new LinkedList<>();

        while ((left <= right) && (top <= bottom)) {
            for (int x = left; x <= right; x++) {
                res.add(matrix[top][x]);
            }
            top++;

            for (int x = top; x <= bottom; x++) {
                res.add(matrix[x][right]);
            }

            right--;
            
            if (top <= bottom) {
                for (int x = right; x >= left; x--) {
                    res.add(matrix[bottom][x]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int x = bottom; x >= top; x--) {
                    res.add(matrix[x][left]);
                }
                left++;
            }

        }

        return res;
        
    }
}
