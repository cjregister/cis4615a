// FIO01-J — Noncompliant: relies on default permissions
import java.io.*;

public class R08_FIO01_J {
  public static void main(String[] args) throws Exception {
    File f = File.createTempFile("fio01", ".txt");
    System.out.println("Created: " + f.getAbsolutePath());
  }
}
