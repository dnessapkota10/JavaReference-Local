package com.home.arrays;

public class TwoDimensionalArray {

	public void twoDimensionalArrays(){
		int installmentCount = 3;
		int federalTax = 0;
		int[][] multi = new int[][]{
			  { 1, 2, 3, 4, 5},
			  { 10, 11, 12, 13, 14, 15},	
			  { 101, 111, 112, 113, 114, 115},	
			};
			
			if (multi.length > 0) {
                for (int i = 0; i < installmentCount; ++i) {
                    federalTax = federalTax + multi[i][0];
                }
            }
			
			System.out.println(federalTax);
	}
}
