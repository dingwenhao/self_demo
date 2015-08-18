package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer {

	public static void main(String[] args) throws IOException {
		String contends[]={"好久不见","你们好吗","你知道我很想你吗"};
		File file=new File("d:new.txt");
		try {
			FileWriter fw=new FileWriter(file);
			BufferedWriter bw=new BufferedWriter(fw);
			for (int i=0;i<contends.length;i++){
				bw.write(contends[i]);
				bw.newLine();
			}
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String s=null;
			int i=0;
			while((s=br.readLine())!=null){
				i++;
				System.out.println("第"+i+"行是"+s);
				System.out.println("第"+i+"行是"+s);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
