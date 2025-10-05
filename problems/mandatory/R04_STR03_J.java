// STR03-J: keep binary as bytes, if text needed, use Base64
import java.util.Base64;
public class R04_STR03_J {
  public static void main(String[] a) {
    byte[] raw = new byte[]{(byte)0xC3,(byte)0x28};
    String b64 = Base64.getEncoder().encodeToString(raw); // compliant
    System.out.println("base64: " + b64);
  }
}