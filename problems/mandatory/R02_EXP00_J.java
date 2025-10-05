import java.io.File;

public class R02_EXP00_J {
  public static void main(String[] args) throws Exception {
    File f = File.createTempFile("exp00", ".tmp");
    System.out.println("Temp: " + f.getAbsolutePath());
    // COMPLIANT: check and act on return value
    boolean deleted = f.delete();
    if (!deleted) {
      System.err.println("Delete failed, marking deleteOnExit");
      f.deleteOnExit();
    } else {
      System.out.println("Deleted ok");
    }
  }
}
