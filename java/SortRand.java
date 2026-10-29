public class SortRand {
  public static void main(String[] args) {
    final int N = 5;
    int[] nums = new int[N];

    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int) (Math.random() * 41 - 20);
      System.out.print(nums[i] + " ");
    }

    for (int i = 0; i < nums.length; i++) {
      int min = nums[i];
      int imin = i;
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] < min) {
          min = nums[j];
          imin = j;
        }
      }
      if (i != imin) {
        int temp = nums[i];
        nums[i] = nums[imin];
        nums[imin] = temp;
      }
    }
    System.out.println();
    System.out.println("Sorted -VOZRASTANIE_VIBORKOY- array:");
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
    for (int i = nums.length - 1; i >= 1; i--) {
      boolean sorted = true;

      for (int j = 0; j < i; j++) {
        if (nums[j] < nums[j + 1]) {
          int temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
          sorted = false;
        }
      }
      if (sorted) {
        break;
      }
    }
    System.out.println();
    System.out.println("Sorted -UBIVANIE_PUZIRKOVY- array:");
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
  }
}
