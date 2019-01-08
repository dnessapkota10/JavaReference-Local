package com.home.strings;

import org.apache.commons.lang3.StringUtils;


public class StringBuilderClass {
	static StringBuilder buffer = new StringBuilder();
	public static void skip(final int len, final char padChar) {
        add("", len, padChar, true);
    }
	
	public static void add(final String value, final int len, final char padChar, final boolean right) {
		
        buffer.append(right ? StringUtils.left(StringUtils.rightPad(value, len, padChar), len) : StringUtils.right(StringUtils.leftPad(value, len, padChar), len));
        
        System.out.println(("Buffer:"+buffer + "after"));
    }
	
	
	public static void add(final String value, final int len) {
        add(value == null ? "" : value, len, ' ', false);
    }
}
