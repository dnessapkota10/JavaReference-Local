package com.home.file.operations;

import java.io.File;

//https://docs.oracle.com/javase/tutorial/essential/io/check.html
public class Directory {

	//Creates new directory
	public static void createDirectory() {
		String dirname = "src/main/resources/test";
		File d = new File(dirname);

		// Create directory now.
		d.mkdirs();
		System.out.println("New directory create at::" + d.getAbsolutePath());
	}

	//list down all the files and directories available in a directory
	public static void listDirectory() {
		File file = null;
		String[] paths;

		try {
			// create new file object
			file = new File("/src/main/resources");

			// array of files and directory
			paths = file.list();

			// for each name in the path array
			for (String path : paths) {
				// prints filename and directory name
				System.out.println(path);
			}
		} catch (Exception e) {
			// if any error occurs
			e.printStackTrace();
		}
	}
}
