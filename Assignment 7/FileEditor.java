import java.io.*;
import java.util.Scanner;

public class FileEditor {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a filename as a command-line argument.");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);
        Scanner scanner = new Scanner(System.in);

        
        if (file.exists()) {
            System.out.println("File exists. Displaying contents:\n");

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }

            System.out.print("\nDo you want to add data to the end of the file? (Yes/No): ");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("Yes")) {
                System.out.println("Enter data to append. Type 'exit' on a new line to stop:");

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                    while (true) {
                        String input = scanner.nextLine();
                        if (input.equalsIgnoreCase("exit")) {
                            break;
                        }
                        writer.write(input);
                        writer.newLine();
                    }
                    System.out.println("Data appended successfully.");
                } catch (IOException e) {
                    System.out.println("Error writing to file: " + e.getMessage());
                }
            }

        } else {
            System.out.println("File does not exist. Creating new file.");
            System.out.println("Enter data to store in the file. Type 'exit' on a new line to stop:");

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                while (true) {
                    String input = scanner.nextLine();
                    if (input.equalsIgnoreCase("exit")) {
                        break;
                    }
                    writer.write(input);
                    writer.newLine();
                }
                System.out.println("Data written to new file successfully.");
            } catch (IOException e) {
                System.out.println("Error writing to new file: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
