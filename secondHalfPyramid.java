public class secondHalfPyramid {
  public static void main(String args[]) {
    int i, j, n = 5;
    for (i = 0; i <= n; i++) {
      for (j = n; j >= 0; j--) {
        if (i > j) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
