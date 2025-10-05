// THI00-J — Compliant: start thread, join
public class R10_THI00_J {
  public static void main(String[] a) throws InterruptedException {
    Runnable r = () -> System.out.println("work");
    Thread t = new Thread(r);
    t.start();
    t.join();
  }
}
