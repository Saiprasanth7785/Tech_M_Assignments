package Assignment3;
import java.io.*;

@SuppressWarnings("serial")
class FileProcessingException extends Exception {
    public FileProcessingException(String message) {
        super(message);
    }
}

public class DemoFileProcessorException {
    public static void writeFile(String fileName, String content) throws FileProcessingException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        } catch (IOException e) {
            throw new FileProcessingException("Error writing to file");
        }
    }
    
    public static String readFile(String fileName) throws FileProcessingException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            throw new FileProcessingException("Error reading from file");
        }
        return content.toString();
    }
    
    public static void main(String[] args) {
        String fileName = "sample.txt";
        try {
            writeFile(fileName, "Hello, World!");
            System.out.println(readFile(fileName));
        } catch (FileProcessingException e) {
            System.out.println(e.getMessage());
        }
    }
}
