package com.home.locales;


import java.util.Locale;
import java.util.Optional;

public class LocaleClass {

	public void testLocale(){
		
		
		//https://bugs.java.com/bugdatabase/view_bug.do?bug_id=4140555
		
		
		//Locale locale = new Locale("he","IL");
		Locale locale = new Locale("iw","IL");
		//Locale locale = new Locale("en","us");
//		Locale locale1 = new Locale("il");
//		 Locale locale3 = new Locale("en");
		//System.out.println("".substring(0,"".length()));
		String language = Optional.ofNullable(locale).map(Locale::toLanguageTag).map(s->s.substring(0,s.indexOf("-") >0 ? s.indexOf("-"):s.length())).map(String::toUpperCase).orElse("EN");
		
		System.out.println("Locale::" + locale + "\nlocale.getCountry()::" +locale.getCountry()+ "\n Old Language:" +locale.getLanguage() + "\nlocale.toLanguageTag()::" +locale.toLanguageTag() + "\nLanguage::" +language);
		
		//Old way with backward compatibility
		//System.out.println(new Locale("he").getLanguage()); //It prints 'IW'
		
		//toLanguageTag() - New way
		//System.out.println(new Locale("he").toLanguageTag()); //It prints 'HE'
		//System.out.println("locale.toLanguageTag()::" +locale.toLanguageTag() + "\t Language::" +locale.getLanguage() + "\t country::" +locale.getCountry());
		//System.out.println(new Locale("fr").toLanguageTag());
//		System.out.println(locale3);
		
		
		Locale loc2 = Locale.forLanguageTag("he");
		//System.out.println("loc2::" +loc2.getLanguage());
		//System.out.println("loc2::" +loc2.getDisplayLanguage());
	}
}
