package com.home.non.primitive;

import java.math.BigDecimal;

public class BigDecimalClass {

	public static void compareValueInBigDecimal(){
		BigDecimal x = new BigDecimal("0.00");
		BigDecimal y = BigDecimal.ZERO;
		System.out.println(x.equals(y));
		System.out.println(x.compareTo(y) == 0 ? "true": "false");
	}
	
	public static void twoDimensionalArray(){
		BigDecimal[][] taxAmounts = new BigDecimal[1][3];
		taxAmounts[0][0] = new BigDecimal(1020);
		taxAmounts[0][1] = new BigDecimal(20);
		taxAmounts[0][2] = new BigDecimal(30);
		System.out.println(taxAmounts.length);
//		for(int i=0;i<3;i++){
//			System.out.println(taxAmounts[0][i]);
//		}
		
		for (int row = 0; row < taxAmounts.length; row++) {
            for (int col = 0; col < taxAmounts[row].length; col++) {
            	System.out.println(taxAmounts[row][col].movePointLeft(2));
            }
        }
	}
}
