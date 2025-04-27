package Assignment2;
class User {
    private String username;
    private String password;
    public User(String username, String password) {
        this.username = username;
        this.password = encryptPassword(password);
    }
    private String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }
    public String getUsername() {
        return username;
    }
    public boolean authenticate(String password) {
        return this.password.equals(encryptPassword(password));
    }
}
public class SecureUserData {
    public static void main(String[] args) {
        User user = new User("Lakshmi", "secure123");

        System.out.println("Username: " + user.getUsername());
        System.out.println("Authentication (correct password): " + user.authenticate("secure123"));
        System.out.println("Authentication (wrong password): " + user.authenticate("wrongpass"));
    }
}
