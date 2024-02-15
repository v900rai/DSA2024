/**
 * recursion
 */
public class recursion {
  public static void main(String[] args) {
    int n = 5;
    printNumber(n);
  }

  public static void printNumber(int n) {
    if (n == 0) {
      return;
    }
    System.out.print(n + "  ");// print
    printNumber(n - 1);
  }
}