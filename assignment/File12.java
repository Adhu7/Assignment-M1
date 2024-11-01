package assignment;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
