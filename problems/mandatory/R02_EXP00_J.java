import java.io.File;

public class R02_EXP00_J {
  public static void main(String[] args) throws Exception {
    File f = File.createTempFile("exp00", ".tmp");
    System.out.println("Temp: " + f.getAbsolutePath());
    // NONCOMPLIANT: ignore return value, risky
    f.delete();
    System.out.println("Done, maybe deleted");
  }
}
