// File Read and Write

import java.io.File;
import java.io.*;
class fileReadWrite
{   
    // Method for Creating a New File
    public static void newFile()
    {
        try 
        { 
            // Creating BufferedReadered object
            BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
            System.out.println("Enter the file name:");
 
            // Reading File name
            String fileName = br.readLine();
 
            // Creating File Object
            File file1 = new File(fileName + ".txt");
 
            // Method createNewFile() method creates blank file.
            file1.createNewFile();
        }
 
        // Try-Catch Block
        catch (IOException e) 
        {
            System.out.print(e.getMessage());
        }
    }

    // Method for Writing into a File
    public static void writeFile(String fileName)
    {
        try
        {
            String greetings = "Welcome to ISS Governance!";

            // Create a FileWriter object
            // to write in the file
            FileWriter fWriter = new FileWriter(fileName);
            // Writing into file
            fWriter.write(greetings);
            // Printing the contents of a file
            System.out.println(greetings);
            // Closing the file writing connection
            fWriter.close();
            System.out.println("File is created successfully with the content.");
        }
        catch (IOException e)
        {
            System.out.print(e.getMessage());
        }
    }

    // Method for Reading from a File
    public static void readFile(String fileName)
    {
        try
        {
            String greetings = "Welcome to ISS Governance!";

            // Create a FileReader object
            // to read from the file
            FileReader fReader = new FileReader(fileName);

            // Reading from file
            System.out.println("File Content:");
            int i;
            // Holds true till there is nothing to read
            while ((i = fReader.read()) != -1)    
                // Print all the content of a file
                System.out.print((char)i);
       
            // Closing the file reading connection
            fReader.close();
        }
        catch (IOException e)
        {
            System.out.print(e.getMessage());
        }
    }

    // Deleting a File
    public static void deleteFile(String fileName)
    {    
        File file = new File(fileName);

        if (file.delete())
        {
            System.out.println("\nFile deleted successfully");
        }
        else
        {
            System.out.println("\nFailed to delete the file");
        }   
    }

	public static void main(String args[]) throws  IOException 
    {
        newFile();
        newFile();
        writeFile("greetings.txt");
        readFile("greetings.txt");
        deleteFile("hello.txt");
	}
}
