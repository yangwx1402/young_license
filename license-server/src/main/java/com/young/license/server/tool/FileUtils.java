package com.young.license.server.tool;

import java.io.*;

public class FileUtils {

	public static void mvFile(File from,File to) throws IOException{
		if(!from.exists())
			throw new IOException("--from path ["+from+"] is error");
		InputStream is = new FileInputStream(from);
		OutputStream os = new FileOutputStream(to);
		byte[] buffer = new byte[1024];
		while(is.read(buffer)!=-1){
			os.write(buffer);
			os.flush();
		}
		is.close();
		os.close();
	}
	
	public static boolean rmFile(File file){
		if(file.exists())
			return file.delete();
		return true;
	}
}
