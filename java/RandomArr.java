public class RandomArr {
  public static void main(String[] args) {
    int arr[][] = new int [5][7];

    int max = -51;
    int min = 51;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < 7; j++) {

        arr[i][j] = (int) Math.round(Math.random() * 100 - 50);

        System.out.print("[" + arr[i][j] + "]");

        if (arr[i][j] > max) {
          max = arr[i][j];
        }

        if (arr[i][j] < min) {
          min = arr[i][j];
        }

      }
    System.out.println();
    }
    float sr = (min + max)/2f;

    System.out.println("Min: " + min);
    System.out.println("Max: " + max);

    System.out.println("Medium: " + sr);
  }
}
