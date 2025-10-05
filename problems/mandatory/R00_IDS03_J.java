import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class R00_IDS03_J {
  private static final Logger LOG = Logger.getLogger(R00_IDS03_J.class.getName());

  // Remove control chars ( to prevent log forging
  private static String sanitizeForLog(String s) {
    if (s == null) return null;
    s = s.replace('\r', ' ').replace('\n', ' ').replace('\t', ' ');
    return s.replaceAll("[\\x00-\\x1F\\x7F]", "?");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter username: ");
    String user = sc.nextLine();
    System.out.print("Enter password: ");
    String pwd = sc.nextLine();

    // COMPLIANT: do not log the password, sanitize user-controlled data
    LOG.log(Level.INFO, "Login attempt user={0} pwd_length={1}",
        new Object[]{ sanitizeForLog(user), (pwd == null ? 0 : pwd.length()) });

    System.out.println("Logged (compliant).");
  }
}
