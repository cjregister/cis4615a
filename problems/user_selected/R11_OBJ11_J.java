// OBJ11-J — Compliant: validate first, use factory, avoid leaks
import java.io.*;

public class R11_OBJ11_J {
  private final BufferedReader br;
  private R11_OBJ11_J(BufferedReader br) { this.br = br; }

  public static R11_OBJ11_J open(String path) throws IOException {
    if (path == null || !path.endsWith(".txt"))
      throw new IllegalArgumentException("bad path");
    BufferedReader br = new BufferedReader(new FileReader(path));
    return new R11_OBJ11_J(br);
  }

  public static void main(String[] a) {
    try { open("missing.bin"); }
    catch (Exception e) { System.err.println("open failed, " + e.getMessage()); }
  }
}
