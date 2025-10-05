// NUM03-J: unsigned must fit, use long or exact ops
public class R03_NUM03_J {
  public static void main(String[] a) {
    long u32 = Integer.toUnsignedLong(0xF0000000); // compliant, full range
    System.out.println("u32 as long: " + u32);
  }
}
