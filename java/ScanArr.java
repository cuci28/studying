public class ScanArr {
  public static void main(String[] args) {
     int arr[] = new int[15];
     int max = -51;
     int min = 51;

    for (int i = 0; i < 15; i++) {
      arr[i] = (int) Math.round(Math.random() * 100 - 50);

      if (max<arr[i]) {
        max = arr[i];
      }

      if (min>arr[i]) {
        min = arr[i];
      }
    }
    float sr = (min + max)/2f;

    System.out.println("Min: " + min + " Max: " + max);
    System.out.println(sr);
  }
}
