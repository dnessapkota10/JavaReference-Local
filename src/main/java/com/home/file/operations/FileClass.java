package com.home.file.operations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class FileClass {

	public static void countLinesWordsCharactersParagraphs() {
		File file = new File("src/main/resources/test/test.txt");
		FileInputStream fileStream = null;
		try {
			fileStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader reader = new BufferedReader(input);

		String line;

		// Initializing counters
		int countWord = 0;
		int sentenceCount = 0;
		int characterCount = 0;
		int paragraphCount = 1;
		int whitespaceCount = 0;

		// Reading line by line from the
		// file until a null is returned
		try {
			while ((line = reader.readLine()) != null) {
				if (line.equals("")) {
					paragraphCount++;
				}
				if (!(line.equals(""))) {

					characterCount += line.length();

					// \\s+ is the space delimiter in java
					String[] wordList = line.split("\\s+");

					countWord += wordList.length;
					whitespaceCount += countWord - 1;

					// [!?.:]+ is the sentence delimiter in java
					String[] sentenceList = line.split("[!?.:]+");

					sentenceCount += sentenceList.length;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Total word count = " + countWord);
		System.out.println("Total number of sentences = " + sentenceCount);
		System.out.println("Total number of characters = " + characterCount);
		System.out.println("Number of paragraphs = " + paragraphCount);
		System.out.println("Total number of whitespaces = " + whitespaceCount);

	}

	// Append String to File
	public static void appendStrToFile() {
		try {
			final String fileName = "src/main/resources/test/test.txt";
			final String str = "This is just a test";
			// Open given file in append mode.
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));

			out.write(str);
			out.close();
		} catch (IOException e) {
			System.out.println("exception occoured" + e);
		}
	}

	// Check a-z, A-Z, 0-9
	public static void checkStringAaZz09AndNumber() {
		FileReader fr = null;
		try {
			fr = new FileReader("src/main/resources/test/test.txt");
			BufferedReader br = new BufferedReader(fr);

			int r;
			while ((r = br.read()) != -1) {
				char c = (char) r;
				/*
				 * if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >=
				 * 'A' && c <= 'Z')) { System.out.println(c); }
				

				//Check with ASCII				
			    if ((c >= 65 && c <= 122)) 
			       System.out.println("Alphabet");
			      
			    // CHECKING FOR DIGITS  
			    else if (c >= 48 && c <= 57) 
			      System.out.println("Digit");     
			  
			    // OTHERWISE SPECIAL CHARACTER 
			    else                                        
			      System.out.println(" Special Character ");    */ 
				
				if (Pattern.compile("[A-Za-z0-9]").matcher(String.valueOf(c)).matches()) {
					System.out.println(c);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
