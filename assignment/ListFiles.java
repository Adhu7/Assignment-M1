package assignment;
import java.io.*;
public class ListFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File dir=new File("/Users/Adhu/eclipse-workspace");
File files[]=dir.listFiles();
for (File file : files) {
	System.out.println(file.getName());
}
	}

}
