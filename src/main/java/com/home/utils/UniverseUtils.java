package com.home.utils;

 import java.lang.reflect.Array;
 import java.math.BigDecimal;
 import java.util.Date;
 import java.util.Iterator;
 import java.util.Locale;
 import java.util.Map;
 import java.util.Map.Entry;
 import java.util.Set;
 import java.util.regex.Pattern;
 //import org.apache.commons.beanutils.ConvertUtilsBean;
 //import org.apache.commons.beanutils.Converter;
 //import org.apache.commons.beanutils.converters.BigDecimalConverter;
 //import org.apache.commons.beanutils.converters.ConverterFacade;
 import org.apache.commons.lang.StringUtils;

 public final class UniverseUtils
 {
     //private static final ConvertUtilsBean CONVERT = new ConvertUtilsBean();
	 private static final String RECORD_MARK = "?";
	 private static final String FIELD_MARK = "?";
	 private static final String VALUE_MARK = "?";
	 private static final String SUBVALUE_MARK = "?";
	 private static final String TEXT_MARK = "?";
	 private static final String DELIM_CHARS = "??????";
	 private static final String NULL_CHARS = "?";
	 private static final Pattern SPLIT_DELIM = Pattern.compile("[??????]");	
	
	 public static String trimToNull(Object str) {
		if (str == null) {
			return null;
		}
		   String value = str.toString();
		   value = StringUtils.stripStart(value, "???????");
		   value = StringUtils.stripEnd(value, "?");
		   return StringUtils.trimToNull(value);
		 }
	
	 /*public static <E> E getValue(String str, Class<E> type) {
		   return (E) getValue(str, type, null);
	 }

	
	 public static <E> E getValue(String str, Class<E> type, E defaultValue) {
		   String value = trimToNull(str);
		   return value == null ? defaultValue : CONVERT.convert(value, type);
		 }

	
	 public static <E> E getValue(Map<String, String> map, String key, Class<E> type) {
		   return (E) getValue(map, key, type, null);
		 }

	
	 public static <E> E getValue(Map<String, String> map, String key, Class<E> type, E defaultValue) {
		   if (map == null) {
			   return defaultValue;
			 }
		   return (E) getValue((String) map.get(key), type, defaultValue);
		 }

	
	 public static void pruneMap(Map<String, String> map) {
		   if (map != null) {
			   Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
			   while (it.hasNext()) {
				   Map.Entry<String, String> entry = (Map.Entry) it.next();
				   String value = trimToNull(entry.getValue());
				   if (value == null) {
					   it.remove();
					 }
				 }
			 }
		 }

	
	 public static <E> E[] getValueArray(Map<String, String> map, String key, Class<E> type) {
		   String[] values = delimSplit((String) getValue(map, key, String.class, ""));
		   E[] answer = (Object[]) Array.newInstance(type, values.length);
		   for (int i = 0; i < values.length; i++) {
			   answer[i] = getValue(values[i], type);
			 }
		   return answer;
		 }

	
	 public static <E> E[][] getNestedValueArray(Map<String, String> map, String key, Class<E> type) {
		   String str = (String) getValue(map, key, String.class, "");
		   Class<?> arrayType = Array.newInstance(type, 0).getClass();
		   if (str.isEmpty()) {
			   return Array.newInstance(arrayType, 0);
			 }
		   String[] values = delimSplit(str, "?");
		   int valLen = values.length;
		   String[][] subValues = new String[valLen][];
		   E[][] answer =  Array.newInstance(arrayType, valLen);
		   for (int i = 0; i < valLen; i++) {
			   subValues[i] = delimSplit(values[i], "?");
			   int subValLen = subValues[i].length;
			   answer[i] = (E[]) ((Object[]) (Object[]) Array.newInstance(type, subValLen));
			   for (int j = 0; j < subValLen; j++) {
				   String s = trimToNull(subValues[i][j]);
				   answer[i][j] = (s == null ? null : CONVERT.convert(s, type));
				 }
			 }
		   return answer;
		 }

	
	 private static String[] delimSplit(String str) {
		   if (str == null) {
			   return new String[0];
			 }
		   return SPLIT_DELIM.split(str);
		 }

	
	 private static String[] delimSplit(String str, String delim) {
		   if (str == null) {
			   return new String[0];
			 }
		   return str.split(delim);
		 }*/
}
