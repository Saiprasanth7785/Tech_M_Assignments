package Assignment4;
import java.util.*;
class User {
    String username;
    
    public User(String username) {
        this.username = username;
    }
    
    @Override
    public String toString() {
        return username;
    }
}

public class SocialMediaFollowingSystem {
    public static void main(String[] args) {
        HashSet<User> followers = new HashSet<>();
        TreeSet<User> sortedFollowers = new TreeSet<>(Comparator.comparing(u -> u.username));
        
        User u1 = new User("Prasanth");
        User u2 = new User("Sri");
        User u3 = new User("Siri");
        
        followers.add(u1);
        followers.add(u2);
        followers.add(u3);
        
        sortedFollowers.addAll(followers);
        
        System.out.println("Followers (Unordered):");
        Iterator<User> iterator = followers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println("\nFollowers (Sorted Order):");
        Iterator<User> sortedIterator = sortedFollowers.iterator();
        while (sortedIterator.hasNext()) {
            System.out.println(sortedIterator.next());
        }
    }
}
