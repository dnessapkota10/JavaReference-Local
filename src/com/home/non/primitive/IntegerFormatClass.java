package com.home.non.primitive;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;


public class IntegerFormatClass {

	private final StringBuilder buffer = new StringBuilder();
	
	public void showFormat(){
		Integer num;
		num = 111;
		add("CPORTAL", 8);
		add("", 1,  ' ', true);
		add(1,1);
		add("NN", 2);
		System.out.println("Math.log10(num)::" +(Math.log10(num) + 1));
		System.out.println(buffer.toString());
	}
	
	public void add(final Character value) {
         add(value == null ? "" : value.toString(), 1, ' ', true);
    }
    
    public void add(final Date value) {
         //add(value == null ? "" : new SimpleDateFormat(FIXED_LENGTH_DATE_FORMAT).format(value), 8, ' ', true);
    }
    
    public void add(final String value, final int len) {
         add(value == null ? "" : value, len, ' ', false);
    }
    
    public void add(final Integer value, final int len) {
        final Optional<String> str = Optional.ofNullable(value).map(i -> i.toString());
         add(str.orElse(""), len, str.map(s -> '0').orElse(' '), false);
    }
    
    public void add(final BigDecimal value, final int len) {
         add(value, len, false);
    }
    
    public void add(final BigDecimal value, final int len, final boolean format) {
        if (format) {
             //add(value == null ? null : String.format(FIXED_LENGTH_DECIMAL_FORMAT, value), len);
        } 
         add(value == null ? null : value.movePointRight(2).divide(BigDecimal.ONE, RoundingMode.HALF_UP).intValue(), len);
    }
    
    public void skip(final int len) {
         skip(len, ' ');
    }
    
    public void skip(final int len, final char padChar) {
         add("", len, padChar, true);
    }
    
    public void add(final String value, final int len, final char padChar, final boolean right) {
    	System.out.println("value::" + value + "\t len" + len + "\t padChar::" +padChar + "\t right::" +right);
        buffer.append(right ? StringUtils.left(StringUtils.rightPad(value, len, padChar), len) : StringUtils.right(StringUtils.leftPad(value, len, padChar), len));
         
    }
}
