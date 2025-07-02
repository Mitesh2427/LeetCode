class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        if (matrix == null || matrix.length == 0) return list;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Traverse top row left to right
            for (int j = left; j <= right; j++) {
                list.add(matrix[top][j]);
            }
            top++;

            // Traverse right column top to bottom
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            // Traverse bottom row right to left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    list.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // Traverse left column bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }
}