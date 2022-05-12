import java.util.Arrays;

class P3
{

    private static int[][] printSpiralOrder(int[] arr, int M, int N)
    {
        // base case
        if (arr == null) {
            return null;
        }

        // construct an N × N` matrix
        int[][] mat = new int[M][N];

        int top = 0, bottom = M - 1;
        int left = 0, right = N - 1;

        int index = 0;

        while (true)
        {
            if (left > right) {
                break;
            }

            // print top row
            for (int i = left; i <= right; i++) {
                mat[top][i] = arr[index++];
            }
            top++;

            if (top > bottom) {
                break;
            }

            // print right column
            for (int i = top; i <= bottom; i++) {
                mat[i][right] = arr[index++];
            }
            right--;

            if (left > right) {
                break;
            }

            // print bottom row
            for (int i = right; i >= left; i--) {
                mat[bottom][i] = arr[index++];
            }
            bottom--;

            if (top > bottom) {
                break;
            }

            // print left column
            for (int i = bottom; i >= top; i--) {
                mat[i][left] = arr[index++];
            }
            left++;
        }
        return mat;
    }

    public static void main(String[] args)
    {
        // N × ` matrix
        int M = 5;
        int N = 5;

        // an array of size `N×N`
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };

        int[][] mat = printSpiralOrder(arr, M, N);
        for (var r: mat) {
            System.out.println(Arrays.toString(r));
        }
    }
}