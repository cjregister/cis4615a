import java.util.Scanner;
import java.util.logging.Logger;

public class R00_IDS03_J {
  private static final Logger LOG = Logger.getLogger(R00_IDS03_J.class.getName());

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter username: ");
    String user = sc.nextLine();
    System.out.print("Enter password: ");
    String pwd = sc.nextLine();

    // NONCOMPLIANT: logs unsanitized user input and a secret
    LOG.info("Login attempt by user=" + user + " password=" + pwd);

    System.out.println("Logged (noncompliant).");
  }
}
