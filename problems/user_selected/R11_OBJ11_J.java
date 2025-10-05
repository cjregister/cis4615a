// OBJ11-J — Noncompliant: throws after acquiring resource
import java.io.*;

public class R11_OBJ11_J {
  private final BufferedReader br;
  public R11_OBJ11_J(String path) throws IOException {
    br = new BufferedReader(new FileReader(path));
    if (path == null || !path.endsWith(".txt"))
      throw new IllegalArgumentException("bad path");
  }
  public static void main(String[] a) throws Exception {
    new R11_OBJ11_J("missing.bin");
  }
}
