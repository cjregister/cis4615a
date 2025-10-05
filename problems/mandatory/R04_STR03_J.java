// STR03-J: binary in String loses integrity, avoid new String
import java.util.Arrays;
public class R04_STR03_J {
  public static void main(String[] a) {
    byte[] raw = new byte[]{(byte)0xC3,(byte)0x28}; // invalid UTF-8
    String bad = new String(raw);                   // noncompliant
    System.out.println("bad length: " + bad.length());
  }
}
