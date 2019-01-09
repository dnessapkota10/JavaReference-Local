package com.home.main;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang.StringUtils;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.home.collections.CollectorsJoining;
import com.home.collections.ListOfMap;
import com.home.database.DatabaseConnection;
import com.home.datetime.CheckDayRange;
import com.home.datetime.DifferenceInMinute;
import com.home.enums.EnumSetDemo;
import com.home.exception.handling.NestedException;
import com.home.jackson.JSONObjectDateConverter;
import com.home.nulls.NullObject;
import com.home.strings.StringBuilderClass;
import com.home.strings.StringFormat;
import com.home.varargs.VarArgsEmptyEnum;

import come.home.ups.api.ReturnLabelHttpPost;

public class MainClass1 {

	private static final ThreadLocal<Long> CUSTOMER_ID_HOLDER = new ThreadLocal<>();
	private static final Logger LOGGER = Logger.getLogger(MainClass1.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double totalWeight = 72544.5;
		//ReturnLabelHttpPost.printLabelMI();
		//System.out.println(String.format("%.4f", (double)totalWeight/10000));
		
		//System.out.println(StringUtils.isNotEmpty(null));
		//CUSTOMER_ID_HOLDER.set((long) 100);
		//System.out.println("Thread:"+CUSTOMER_ID_HOLDER.get());
		
		/*DifferenceInMinute.diffInMin();
		System.out.println(30*24*60);*/
		
		/*StringBuilderClass.skip(5,'0');
		StringBuilderClass.add("1",1);
		StringBuilderClass.skip(7,'0');*/
		
		/*StringBuilderClass.skip(5,'0');
		StringBuilderClass.skip(1,'0');
		StringBuilderClass.skip(7,'0');*/
		
		//CheckDayRange.checkRange();
		
		//EnumSetDemo.getEnumSet();
		
		//VarArgsEmptyEnum.varArgsWithNull();
		
		//NestedException.nestedException();
		
		//System.out.println(Integer.parseInt("050596330"));
		
		//ListOfMap.collectFromListofMap();
		
		//System.out.println("0123".startsWith("a"));
		
		//DatabaseConnection.getUVConnection();
		
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(new Date());		
//		cal.add(Calendar.DATE,30);
//		System.out.println(cal.getTime());
		
//		try {
//			JSONObjectDateConverter.getJsonConvertedDate();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		CollectorsJoining c = new CollectorsJoining();
//		c.afterCollection();
		
//		final int diffInMinute = 10;
//		
//		if(NullObject.getNull() >= diffInMinute){
//			System.out.println("Test null");
//		}
		
		
		StringFormat.dateTimeFormat();
		StringFormat.testDate();
		StringFormat.simpleFormat();
		StringFormat.testArgumentIndex();
		StringFormat.testCharacter();
		StringFormat.testInteger();
		StringFormat.testFloat();		
		StringFormat.testFlags();
		StringFormat.testGeneral();
	}
	
	
	public static Long getCustomerId() {
        return CUSTOMER_ID_HOLDER.get();
    }
    
    public static void setCustomerId(long customerId) {
        CUSTOMER_ID_HOLDER.set(customerId);
    }

}
