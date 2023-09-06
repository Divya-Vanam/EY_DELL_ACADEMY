package C1708;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class Deleteonedirectory {

	public static void main(String[] args) throws IOException {
		Path p=Paths.get("C:/files/files2");
		//Files.delete(p);
		//System.out.println("One directory got deleted");
		
		Path p2=Paths.get("C:/files/ABC");
		AttributeView view=Files.getFileAttributeView(p, BasicAttributeView, class);
		BasicFileAttributes attr=view.readAttributes();
		
		FileTime creatintime=attr.creationtime();
		System.out.println("CREATION TIME OF MY FILE WAS" +creatintime);
		
		FileTime lastaccessedtime=attr.lastaccesstime();
		System.out.println("LAST ACCESSED TIME OF MY FILE WAS" +lastaccesstime);
		
		FileTime modifiedtime=attr.lastmodifiedtime();
		System.out.println("LAST MODIFIED TIME OF MY FILE WAS" +lastmodifiedtime);
		

	}

}
