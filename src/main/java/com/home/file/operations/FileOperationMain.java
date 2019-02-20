package com.home.file.operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class FileOperationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Directory.createDirectory();
//		Directory.listDirectory();
//		
//		
//		FileClass.countLinesWordsCharactersParagraphs();
		
		//FileClass.appendStrToFile();
		//FileClass.checkStringAaZz09AndNumber();
		
//		try {
//			copyFiles();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		//Datetime
		//login logout time difference
		final SimpleDateFormat formatDate = new SimpleDateFormat("hh:mm a");
		Date loginTime = new Date();
		loginTime.setHours(9);
		System.out.println(formatDate.format(loginTime));
		
		Date logoutTime = new Date();
		logoutTime.setHours(19);
		logoutTime.setMinutes(11);
		System.out.println(formatDate.format(logoutTime));
		
		final int a = loginTime.getHours() - logoutTime.getHours();
		System.out.println(Math.abs(loginTime.getMinutes() - logoutTime.getMinutes()));
		//System.out.println(TimeUnit.MILLISECONDS.toHours());
	}
	
	
	
}
