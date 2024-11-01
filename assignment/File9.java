package assignment;

import java.io.File;

public class File9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1= new File("C:\\Users\\ADHU\\eclipse-workspace\\Prj10\\javaFile123.txt");
		if (f1.exists()) {
			System.out.println("The size of the file in bytes is: " +f1.length());
		}else {
			System.out.println("File does not exist");
		}
	}

}
