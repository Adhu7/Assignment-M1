package assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File15 {

	public static void main(String[] args) {

 try {
FileWriter writer = new FileWriter("javaFile123.txt"); 
     writer.write("GOAT of football.");
		 writer.close();
     System.out.println("Successfully wrote to the file.");
 } catch (IOException e) {
    System.out.println("An error occurred while writing to the file.");
     e.printStackTrace();
        }
 try {
		File f1=new File("C:\\Users\\ADHU\\eclipse-workspace\\Prj10\\javaFile123.txt");
		Scanner dataReader = new Scanner(f1);
		while (dataReader.hasNextLine()) {
			String fileData =dataReader.nextLine();
			System.out.println(fileData);
		}
		dataReader.close();
	} catch (FileNotFoundException e) {
		// TODO: handle exception
		System.out.println("Unexpected error occured1");
		e.printStackTrace();
	}
	}

}
