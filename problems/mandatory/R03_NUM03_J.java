// NUM03-J: unsigned must fit, choose proper type
public class R03_NUM03_J {
  public static void main(String[] a) {
    int u32 = 0xF0000000;                 // noncompliant, negative in int
    System.out.println("u32 as int: " + u32);
  }
}
