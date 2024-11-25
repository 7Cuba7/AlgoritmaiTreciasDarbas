package bmt;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomNumberGenerator 
{

    public static void main(String[] args) 
    {
        String fileName = "random_10k.txt";
        int numberOfNumbers = 10000;

        
        try 
        {
            generateRandomNumbersFile(fileName, numberOfNumbers);
            System.out.println("File " + fileName + " created successfully!");
        }
        catch (IOException e) 
        {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
        
        
    }
    
    
    
    public static void generateRandomNumbersFile(String fileName, int count) throws IOException 
    {
        Random random = new Random();

        // Using try-with-resources to ensure the FileWriter is closed
        try (FileWriter writer = new FileWriter(fileName)) 
        {
            for (int i = 0; i < count; i++) 
            {
                int randomNumber = random.nextInt(100000); // Generate a random number (0 to 99,999)
                writer.write(randomNumber + "\n"); // Write the number to the file
            }
        }
    }
    
    
    
    
}
