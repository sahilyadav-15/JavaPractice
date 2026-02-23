public class numberContinuedPattern {
  public static void main(String[] args) {
    int i, j, n = 5, num = 1;
    for (i = 0; i <= n; i++) {
      for (j = 0; j <= i; j++) {
        System.out.print(num + " ");
        num++;
      }
      System.out.println();
    }
  }
}
