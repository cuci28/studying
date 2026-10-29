public class ArrMMMatrix {
  public static void main(final String[] args) {
    final int N = 3;
    final int M = 4;
    final int[][] nums = new int[N][M];
    System.out.println("Matrix: ");

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        nums[i][j] = (int) (Math.random() * 41 - 20);
        System.out.print(nums[i][j] + "  ");
      }
      System.out.println();
    }
    int min = nums[0][0];
    int max = nums[0][0];

    int minstr = 0;
    int minstolb = 0;
    int maxstr = 0;
    int maxstolb = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {

        if (nums[i][j] < min) {

          min = nums[i][j];

          minstr = i;
          minstolb = j;
        }
        if (nums[i][j] > max) {
          max = nums[i][j];
          maxstr = i;
          maxstolb = j;
        }
      }
    }
    System.out.println("Result of program: ");
    System.out.println(min);
    System.out.println(max);
    System.out.println("Position of min: " + minstolb + minstr);
    System.out.println("Position of max: " + maxstolb + maxstr);
  }

  public ArrMMMatrix() {
  }
}
