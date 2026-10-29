/**
 * FloydAlg
 */
public class FloydAlg {
  public static void main(String[] args) {
    int[][] matrix = {
        { 100, 10, 5, 100, 100, 100, },
        { 100, 100, 100, 5, 100, 100, },
        { 100, 100, 100, 4, 7, 100, },
        { 100, 100, 100, 100, 100, 3, },
        { 100, 100, 100, 100, 100, 12, },
        { 100, 100, 100, 100, 100, 100, }
    };

    int len = matrix.length;
    for (int intermediate = 0; intermediate < len; intermediate++) {
      for (int start = 0; start < len; start++) {
        for (int end = 0; end < len; end++) {
          if (matrix[start][end] > matrix[start][intermediate] + matrix[intermediate][end]) {
            matrix[start][end] = matrix[start][intermediate] + matrix[intermediate][end];
          }
        }
      }
    }
    for (int i = 0; i < len; i++) {
      for (int j = 0; j < len; j++) {
        if (matrix[i][j] == 100) {
          System.out.print("NaN\t");
        } else {
          System.out.print(matrix[i][j] + "\t");
        }
      }
      System.out.println();
    }
  }
}
