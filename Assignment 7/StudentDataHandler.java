import java.io.*;
import java.util.Scanner;

public class StudentDataHandler {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "student_data.dat";

        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Weight (kg): ");
        float weight = scanner.nextFloat();

        System.out.print("Enter Height (cm): ");
        float height = scanner.nextFloat();
        scanner.nextLine(); // consume newline

        System.out.print("Enter City: ");
        String city = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();


        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeFloat(weight);
            dos.writeFloat(height);
            dos.writeUTF(city);
            dos.writeUTF(phone);
            System.out.println("\nData written successfully to " + filename);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            System.out.println("\nReading data from file...");
            String rName = dis.readUTF();
            int rAge = dis.readInt();
            float rWeight = dis.readFloat();
            float rHeight = dis.readFloat();
            String rCity = dis.readUTF();
            String rPhone = dis.readUTF();

            System.out.println("\n--- Student Information ---");
            System.out.println("Name: " + rName);
            System.out.println("Age: " + rAge);
            System.out.println("Weight: " + rWeight + " kg");
            System.out.println("Height: " + rHeight + " cm");
            System.out.println("City: " + rCity);
            System.out.println("Phone: " + rPhone);
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
