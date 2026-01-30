public class HollowRectangle {
  public static void main(String args[]) {
    int i, j, a = 4, b = 6;
    for (i = 0; i <= a; i++) {
      for (j = 0; j <= b; j++) {
        if (i == 0 || j == 0 || i == a || j == b)
          System.out.print("* ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
  }
}
