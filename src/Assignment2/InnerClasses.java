package Assignment2;
import java.util.Scanner;
class UserAuthentication {
    private String username;
    private String password;
    public UserAuthentication(String username, String password) {
        this.username = username;
        this.password = password;
    }
    class Authenticator {
        public boolean login(String inputUsername, String inputPassword) {
            return username.equals(inputUsername) && password.equals(inputPassword);
        }
    }
}
public class InnerClasses {
    public static void main(String[] args) {
        UserAuthentication auth = new UserAuthentication("user123", "securePass");
        UserAuthentication.Authenticator authenticator = auth.new Authenticator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter Password: ");
        String inputPassword = scanner.nextLine();
        if (authenticator.login(inputUsername, inputPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials!");
        }
        scanner.close();
    }
}
