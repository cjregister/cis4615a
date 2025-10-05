// LCK00-J — Noncompliant: synchronizes on external object
public class R09_LCK00_J {
  private final StringBuilder buf = new StringBuilder();
  public void append(String s) {
    synchronized (s) { buf.append(s); }
  }
  public static void main(String[] a) { new R09_LCK00_J().append("hi"); }
}
