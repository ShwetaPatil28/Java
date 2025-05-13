import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileAnalysis {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path to the text file (e.g., sample.txt): ");
        String fileName = scanner.nextLine();

        
        int vowelCount = 0;
        int wordCount = 0;
        int aCount = 0;

       
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            
            while ((line = reader.readLine()) != null) {
                
                if (!line.trim().isEmpty()) {
                    
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                }

                
                String lowerLine = line.toLowerCase();

               
                for (char c : lowerLine.toCharArray()) {
                    
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        vowelCount++;
                    }

                    
                    if (c == 'a') {
                        aCount++;
                    }
                }
            }

           
            System.out.println("\nAnalysis Results:");
            System.out.println("Total number of vowels: " + vowelCount);
            System.out.println("Total number of words: " + wordCount);
            System.out.println("Number of times 'a' appears: " + aCount);

        } catch (IOException e) {
           
            System.out.println("Error reading file: " + e.getMessage());
        }

        
        scanner.close();
    }
}
