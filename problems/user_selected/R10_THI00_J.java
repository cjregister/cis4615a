// THI00-J — Noncompliant: calls run() directly
public class R10_THI00_J {
  public static void main(String[] a) {
    Runnable r = () -> System.out.println("work");
    new Thread(r).run();
  }
}
