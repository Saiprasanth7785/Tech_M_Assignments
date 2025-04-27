package Assignment6;

import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.util.*;

class SecureStorage {
    private static final String KEY = "lucky12345";
    private static final String FILE_PATH = "userdata.txt";
    
    public static void saveUserData(String username, String password) throws Exception {
        String encryptedData = encrypt(username + "," + password);
        Files.write(Paths.get(FILE_PATH), encryptedData.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
    
    public static void readUserData() throws Exception {
        List<String> lines = Files.readAllLines(Paths.get(FILE_PATH), StandardCharsets.UTF_8);
        for (String line : lines) {
            System.out.println(decrypt(line));
        }
    }
    
    private static String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        SecretKey secretKey = new SecretKeySpec(KEY.getBytes(), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        return Base64.getEncoder().encodeToString(cipher.doFinal(data.getBytes()));
    }
    
    private static String decrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        SecretKey secretKey = new SecretKeySpec(KEY.getBytes(), "AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        return new String(cipher.doFinal(Base64.getDecoder().decode(data)));
    }
}

public class SecureUserDataStorageSystem {
    public static void main(String[] args) throws Exception {
        SecureStorage.saveUserData("Lakshmi", "Lucky@123");
        SecureStorage.saveUserData("Devi", "Devi@123");
        
        System.out.println("Stored User Data:");
        SecureStorage.readUserData();
    }
}
