
package com.home.enums;

import java.util.EnumSet;
import java.util.Set;


enum Gfg {
	CODE, LEARN, CONTRIBUTE, QUIZ, MCQ
};

public class EnumSetDemo {
	// https://www.geeksforgeeks.org/enumset-class-java/

	private static enum Web047ActionFlags {
        RESET_ORDER,
        CHANGE_DELIVERY_DATE,
        CHANGE_ADDRESS,
        CHANGE_PAYMENT,
        CHANGE_PRODUCTS,
        CHANGE_STATUS,
        PAY_ORDER
    }
	
//	Important:
//
//		EnumSet class is a member of the Java Collections Framework & is not synchronized.
//		It’s a high performance set implementation, much faster than HashSet.
//		All elements of each EnumSet instance must be elements of a single enum type.
	
	
	public void testEnumSet() {
		// create a set
		EnumSet<Gfg> set1, set2, set3, set4;

		// add elements
		set1 = EnumSet.of(Gfg.QUIZ, Gfg.CONTRIBUTE, Gfg.LEARN, Gfg.CODE);
		set2 = EnumSet.complementOf(set1);
		set3 = EnumSet.allOf(Gfg.class);
		set4 = EnumSet.range(Gfg.CODE, Gfg.CONTRIBUTE);
		System.out.println("Set 1: " + set1);
		System.out.println("Set 2: " + set2);
		System.out.println("Set 3: " + set3);
		System.out.println("Set 4: " + set4);
	}
	
	public static void getEnumSet(){
		 Web047ActionFlags op = Web047ActionFlags.CHANGE_PAYMENT;
		 final Set<Web047ActionFlags> flags = EnumSet.of(op, Web047ActionFlags.CHANGE_ADDRESS);
		 Web047ActionFlags[] enums = flags.toArray(new Web047ActionFlags[0]);
		 System.out.println(enums); //Prints [CHANGE_PAYMENT, CHANGE_ADDRESS]
	}
}
