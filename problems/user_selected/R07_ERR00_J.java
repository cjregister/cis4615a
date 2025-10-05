// ERR00-J — Noncompliant: swallows checked exception
import java.io.*;

public class R07_ERR00_J {
  static void readBad() {
    try (InputStream in = new FileInputStream("nope.txt")) {
      in.read();
    } catch (IOException e) {
      // swallowed
    }
  }
  public static void main(String[] args) { readBad(); System.out.println("done"); }
}
