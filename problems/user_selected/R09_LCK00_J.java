// LCK00-J — Compliant: private final lock object
public class R09_LCK00_J {
  private final Object lock = new Object();
  private final StringBuilder buf = new StringBuilder();
  public void append(String s) {
    synchronized (lock) { buf.append(s); }
  }
  public static void main(String[] a) { new R09_LCK00_J().append("hi"); }
}
