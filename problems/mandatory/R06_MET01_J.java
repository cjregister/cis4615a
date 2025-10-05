// MET01-J: validate args with explicit checks, throw exceptions
public class R06_MET01_J {
  static int square(Integer n) {
    if (n == null) throw new IllegalArgumentException("n null");
    return Math.multiplyExact(n, n);
  }
  public static void main(String[] a) {
    System.out.println(square(5));
  }
}
