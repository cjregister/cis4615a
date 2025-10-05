// MET01-J: don't use assert for argument checks
public class R06_MET01_J {
  static int square(Integer n) {
    assert n != null;        // noncompliant, disabled at runtime
    return n * n;
  }
  public static void main(String[] a) {
    System.out.println(square(null));
  }
}
