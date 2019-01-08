package com.home.strings;

public class ReplaceString {

	public void replaceStrInQry(){
		final String SELECT_SKUS_DHL = "UPDATE \"IT.%1$s\" SET \"LOT.NBR\" = ? WHERE \"@ID\" = ? NOWAIT";
		System.out.println(String.format(SELECT_SKUS_DHL, "GER")); 
	}
}
