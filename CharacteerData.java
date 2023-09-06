package C1708;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacteerData {

	public static void main(String[] args) {
		try {
			File f=new File("C:/files/ABC.txt");
			System.out.println(f.exists());
			FileWriter fw=new FileWriter(f);
			BufferedWriter bw=new BufferedWriter(fw);
			
			BufferedWriter bw2=new BufferedWriter(new FileWriter(new File("C:/files/ABC.txt")));
			bw.write("ABCD");
			bw.newLine();
			bw.write("WE ARE WRITING CHARACTER DATA USING BUFFER WRITER");
			bw.newLine();
			bw.write(97);
			bw.flush();
			bw.close();
			
			BufferedReader br=new BufferedReader(new FileReader(new File("C:/files/ABC.txt")));
			String str;
			
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			br.close();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
