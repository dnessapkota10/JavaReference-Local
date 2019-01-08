package com.home.enums;

public class HyphenUnderscore {

	private static enum Delimeters {
        UNDERSCORE("_", "1111111111"),
        HYPHEN("-", "2222222222");
        
        private final String targetString;
        private final String sourceString;

        private Delimeters(String targetString, String sourceString) {
            this.targetString = targetString;
            this.sourceString = sourceString;
        }

        public String getTargetString() {
            return targetString;
        }

        public String getSourceString() {
            return sourceString;
        }
    }
	
	public static void getHypUnderscore(){
		Delimeters delim = Delimeters.UNDERSCORE;
		System.out.println("Hyphen::" + delim.HYPHEN.getSourceString() + "\tUnderscore::" + delim.UNDERSCORE);
		System.out.println(delim.values());
	}
}
