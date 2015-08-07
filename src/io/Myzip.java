package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Myzip {
      public void zip(String zipname,File inputfile) throws IOException{
    	  ZipOutputStream  out=new ZipOutputStream(new FileOutputStream(zipname));
    	  zip(out,inputfile,"");
    	  System.out.println("压缩中。。。。。");
    	  out.close();
      }

	private void zip(ZipOutputStream out, File file, String base) throws IOException {
		if(file.isDirectory()){
			File[] fl=file.listFiles();
			out.putNextEntry(new ZipEntry(base+"/"));
			base=base.length()==0?"":base+"/";
			for(int i=0;i<fl.length;i++){
				zip(out, fl[i],base+fl[i]);
			}
		}else{
			out.putNextEntry(new ZipEntry(base));
			FileInputStream in= new FileInputStream(file);
			int b;
			System.out.println("base");
			while((b=in.read())!=-1){
				out.write(b);
			}
			in.close();
		}
		
	}
	 public static void main(String[] args) throws IOException{
		 Myzip book=new Myzip();
		 book.zip("D:new.zip",new File("D:new.txt"));
		 System.out.println("压缩完成");
	 }
}
