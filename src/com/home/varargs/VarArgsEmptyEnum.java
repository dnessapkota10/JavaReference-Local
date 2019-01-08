package com.home.varargs;

import java.util.Arrays;
import java.util.EnumSet;


public class VarArgsEmptyEnum {
	private static enum Web047ActionFlags {
        RESET_ORDER,
        CHANGE_DELIVERY_DATE,
        CHANGE_ADDRESS,
        CHANGE_PAYMENT,
        CHANGE_PRODUCTS,
        CHANGE_STATUS,
        PAY_ORDER
    }

	public static void varArgsWithNull(){
		boolean test = invokeWeb047((Web047ActionFlags) null);
		System.out.println("Result = " +test);
	}
	private static boolean invokeWeb047(final Web047ActionFlags... actions){
		
		 final EnumSet set = actions[0] == null ? EnumSet.noneOf(Web047ActionFlags.class) : EnumSet.copyOf(Arrays.asList(actions)) ; //deal with null pointer exception
		 System.out.println(set);
		 System.out.println(set.contains(Web047ActionFlags.CHANGE_ADDRESS));
		 return false;
	}
}
