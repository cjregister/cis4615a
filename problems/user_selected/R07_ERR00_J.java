// ERR00-J — Compliant: propagate, then handle
import java.io.*;

public class R07_ERR00_J {
  static void readGood() throws IOException {
    try (InputStream in = new FileInputStream("nope.txt")) {
      in.read();
    }
  }
  public static void main(String[] args) {
    try { readGood(); }
    catch (IOException e) { System.err.println("IO failed, " + e.getMessage()); }
  }
}
