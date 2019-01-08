package com.home.unicode.formatter;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.logging.Logger;


public class UnicodeFormatter {

	private static final Logger logger = Logger.getLogger(UnicodeFormatter.class.getName());
	
	public static void convertStringToHexUTF8(){
		final String tx = "ÖÜßÖ";
		final String txt = "<SURNAME>Ã�Ã�Ã�Ã�</SURNAME>";
		try {
			byte[] utf8Bytes = txt.toString().getBytes("UTF8");
			UnicodeFormatter.printBytes(utf8Bytes, "utf8Bytes", "Before:");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String unreadable = "ÖÜßÖ";

		try {
		    String readable = new String(unreadable.getBytes("ISO-8859-15"), "UTF-8");
		    System.out.println("readable::" +readable);
		    // readable -> äöüÄÖÜßáéíóúÁÉÍÓÚàèìòùÀÈÌÒÙñÑ
		} catch (UnsupportedEncodingException e) {
		    // ...
		}
		
//		CharsetDetector detector = new CharsetDetector();
//		detector.setText(yourStr.getBytes());
//		detector.detect();
		
		System.out.println("Default Locale:   " + Locale.getDefault());
		System.out.println("Default Charset:  " + Charset.defaultCharset());
		System.out.println("file.encoding;    " + System.getProperty("file.encoding"));
		System.out.println("sun.jnu.encoding: " + System.getProperty("sun.jnu.encoding"));
		System.out.println("Default Encoding: " + getEncoding());
	      
	      
		
		String readable = "ÖÜßÖ";

		try {
		     unreadable = new String(readable.getBytes("UTF-8"), "ISO-8859-15");
		    System.out.println("unreadable::" +unreadable);
		    // unreadable -> Ã¤Ã¶Ã¼ÃÃÃÃÃ¡Ã©Ã­Ã³ÃºÃÃÃÃÃÃ Ã¨Ã¬Ã²Ã¹ÃÃÃÃÃÃ±Ã
		} catch (UnsupportedEncodingException e) {}
	}
	
	  static public String byteToHex(byte b) {
	    // Returns hex String representation of byte b
	    char hexDigit[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a',
	        'b', 'c', 'd', 'e', 'f' };
	    char[] array = { hexDigit[(b >> 4) & 0x0f], hexDigit[b & 0x0f] };
	    return new String(array);
	  }

	  static public String charToHex(char c) {
	    // Returns hex String representation of char c
	    byte hi = (byte) (c >>> 8);
	    byte lo = (byte) (c & 0xff);
	    return byteToHex(hi) + byteToHex(lo);
	  }
	  public static void printBytes(byte[] array, String name, String method) {
		  String allChars = "";
		    for (int k = 0; k < array.length; k++) {
		      allChars += "[" + "0x" + UnicodeFormatter.byteToHex(array[k]) +"]";	
		      //logger.info(name + "[" + k + "] = " + "0x"  + UnicodeFormatter.byteToHex(array[k]));
		    }
		    
		    logger.info("Method=" +method + "ServiceHelper HEX BYTES \n" +allChars);
	  }

	  
	  public static String getEncoding()
	   {
	      final byte [] bytes = {'D'};
	      final InputStream inputStream = new ByteArrayInputStream(bytes);
	      final InputStreamReader reader = new InputStreamReader(inputStream);
	      final String encoding = reader.getEncoding();
	      return encoding;
	   }
} // class