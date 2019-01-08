package com.home.main;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang.StringUtils;

import com.home.collections.UnmodifiableListClass;
import com.home.custom.annotation.Car;
import com.home.custom.annotation.JsonSerializeException;
import com.home.custom.annotation.JsonSerializer;
import com.home.datetime.CurrentDateTime;
import com.home.datetime.DurationClass;
import com.home.datetime.TwentyFourHourCheck;
import com.hom.pojo.BillingAddressXML;
import com.hom.pojo.ShippingAddressXML;
import com.home.arrays.LumpSum;
import com.home.arrays.NullValues;
import com.home.arrays.TwoDimensionalArray;
import com.home.calendar.CalendarClass;
import com.home.calendar.CheckSameDay;
import com.home.collections.CheckValueInArray;
import com.home.collections.CollectorsJoining;
import com.home.collections.CreateListWithAnotherList;
import com.home.collections.MapClass;
import com.home.collections.SingletonListClass;
import com.home.enums.HyphenUnderscore;
import com.home.java8.OptionalClass;
import com.home.java8.TwoLists;
import com.home.locales.LocaleClass;
import com.home.non.primitive.IntegerFormatClass;
import com.home.strings.ReplaceString;
import com.home.strings.StringUtilsClass;
import com.home.unichars.EscapeChars;
import com.home.unicode.formatter.UnicodeFormatter;
import com.home.xml.ReadXML;

import come.home.longtype.LongComparision;
import come.home.ups.api.ReturnLabelHttpPost;

public class MainClass {

	public static void main(String[] args) {
		//System.out.println("HERE");
//		System.out.println(new Date());
//		System.out.println(LocalDate.now().getDayOfMonth());
//		
//		final long DAY = 24 * 60 * 60 * 1000;
//		System.out.println(System.currentTimeMillis() - DAY);
		
		//TwentyFourHourCheck.check24Hrs();
		//TwentyFourHourCheck.check24HrsDate();
		//CheckSameDay.checkIfTheyAreInSameDay();
		//OptionalClass.ofNullable();
		
		//LumpSum.test();
		//MapClass.testRetainAll();
		/*final Long firstEchoTime = System.currentTimeMillis();
		Car car = new Car("Ford", "F150", "2018");
		JsonSerializer serializer = new JsonSerializer();
		serializer.serialize(car);
		final Long lastEchoTime = System.currentTimeMillis();
		
		System.out.println(lastEchoTime-firstEchoTime);*/
		
		//UnicodeFormatter.convertStringToHexUTF8();
		
		
		/*String a  = null;
		System.out.println("aa");
		System.out.println("A".equals("a"));
		
		 final String INSERT_ARO_COMMENT = "INSERT INTO %s_COMMENT (ARO_NUMBER, COMMENTS) VALUES (?, ?) NOWAIT";
		 System.out.println(String.format(INSERT_ARO_COMMENT, "ARO"));
		
		 
		 System.out.println("StringUtils.isNotBlank(raNumber)::" +StringUtils.isNotBlank(a));
		 
		 List<String> testlist = null;
		 //System.out.println((testlist.isEmpty()));
		
		 Date date = new Date();
		 
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(date);
		
		 cal.add(Calendar.DATE,30);
		 final Date d = cal.getTime();
		 System.out.println(d);*/
		
		//StringUtilsClass.checkWordInString();
		 
		 //ReturnLabelHttpPost.printLabels();
		String raNumber = "";
		raNumber = "456";
		
		/*DecimalFormat df = new DecimalFormat("#.00"); 
		int totalWeight = 2350;
		double val = (double)totalWeight/100;
		System.out.println(val);
		
		String.format("%.2f", val);
		System.out.println(df.format(val));
		
		System.out.println("USA".substring(0,2));*/
		
	}
	
}
		
		// TODO Auto-generated method stub
//		System.out.println("Running from main...");
//
//		final Logger LOGGER = Logger.getLogger(MainClass.class.getName());
//		System.out.println("LOGGER Name::" + LOGGER.getName());
		
		//System.out.println(EscapeChars.FIELD_MARK.toString());
		//HyphenUnderscore.getHypUnderscore();
		
		//ReadXML
		//ReadXML.readXML();
		
		//Map
		//new MapClass().map();
		
		//SingletonListClass
		//new SingletonListClass().getSingletonLst();
		
		//Dynamic Query-Replace string
		//new ReplaceString().replaceStrInQry();
		
		//initialize and pass arraylist in method call
		//new UnmodifiableListClass().getImmutableList();
		
		//Assign list to new list
		//new CreateListWithAnotherList().createListwithOtherList();
		
		//TwoDimensionalArray
		//new TwoDimensionalArray().twoDimensionalArrays();
		
		//StringUtil isNotBlank
		
		//new StringUtilsClass().checkBlank();
		
		//Check matching string in List
		//new StringUtilsClass().checkStringInList("Google2Profile#107830166369376907763");
		//new StringUtilsClass().checkStringInList("twitterProfile#361903757");
		//new StringUtilsClass().checkStringInList("FacebookProfile#10210136278347105");
		//new StringUtilsClass().checkStringInList("jjj");
		
		//new CalendarClass().calendarTest();
		
		//new TwoLists().removeProductItems();
		
		//new LongComparision().compareTwoLong();
		
		//new DurationClass();
		
		//new CurrentDateTime().getCurrentDateTime();
		
		//new CollectorsJoining().afterCollection();
		//new CollectorsJoining().afterCollectionProducts();
		//new IntegerFormatClass().showFormat();
		
		//new OptionalClass().ofNullable();
		
		//new LocaleClass().testLocale();
		
		//CheckValueInArray.checkValue();
		
		//new StringUtilsClass().checkCompare();
		
//		ShippingAddressXML s = new ShippingAddressXML();
//		BillingAddressXML b = new BillingAddressXML();
//		
//		s.setTitle("Ship");
//		s.setEmail("ship@abc");
//		s.setMobilePhone("shipPhone");
//		
//		b.setTitle("Bill");
//		b.setEmail("bill@abc");
//		b.setMobilePhone("billPhone");
//		
//		System.out.println("ship--");
//		System.out.println(s.getTitle());
//		
//		System.out.println("bill--");
//		System.out.println(b.getTitle());
		
		//NullValues.checkNullinLoop();
		
		
		//CalendarClass.test();
		
	//}
	
	/*static void finalPrice(int[] prices){
	     List<Integer> noDiscount = new ArrayList();
	    long result = 0;
	    
	    for(int i =0 ; i<prices.length; i++){
	        int j = i + 1;
	        while(j < prices.length && prices[i] < prices[j]){
	            j++;
	        }
	        if(j == prices.length) {
	            result += prices[i];
	            noDiscount.add(i);
	        } else{
	            result += (prices[i] -prices[j]);
	        }
	        
	    }
	    
	    System.out.println(result);
	    System.out.println(noDiscount.toString());
	      
	}
	
	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String s = in.next();
			System.out.println(matchParenthisis(s));
		}
		in.close();
		*/
		/*int[] test = {5,1,3,4,6,2};
		
		finalPrice(test);*/
		
		
	/*}*/

/*}*/
