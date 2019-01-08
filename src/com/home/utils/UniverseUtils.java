package com.home.utils;


/*     */
/*     */ import java.lang.reflect.Array;
/*     */ import java.math.BigDecimal;
/*     */ import java.util.Date;
/*     */ import java.util.Iterator;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Map.Entry;
/*     */ import java.util.Set;
/*     */ import java.util.regex.Pattern;
/*     */ import org.apache.commons.beanutils.ConvertUtilsBean;
/*     */ import org.apache.commons.beanutils.Converter;
/*     */ import org.apache.commons.beanutils.converters.BigDecimalConverter;
/*     */ import org.apache.commons.beanutils.converters.ConverterFacade;
/*     */ import org.apache.commons.lang.StringUtils;

/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */ public final class UniverseUtils
/*     */ {
	/* 26 */ private static final ConvertUtilsBean CONVERT = new ConvertUtilsBean();
	/*     */ private static final String RECORD_MARK = "?";
	/*     */ private static final String FIELD_MARK = "?";
	/*     */ private static final String VALUE_MARK = "?";
	/*     */ private static final String SUBVALUE_MARK = "?";
	/*     */ private static final String TEXT_MARK = "?";
	/*     */ private static final String DELIM_CHARS = "??????";
	/*     */ private static final String NULL_CHARS = "?";
	/* 34 */ private static final Pattern SPLIT_DELIM = Pattern.compile("[??????]");
	/*     */
	
	/*     */ public static String trimToNull(Object str) {
		/* 44 */ if (str == null) {
			/* 45 */ return null;
			/*     */ }
		/* 47 */ String value = str.toString();
		/* 48 */ value = StringUtils.stripStart(value, "???????");
		/* 49 */ value = StringUtils.stripEnd(value, "?");
		/* 50 */ return StringUtils.trimToNull(value);
		/*     */ }

	/*     */
	/*     */ public static <E> E getValue(String str, Class<E> type) {
		/* 54 */ return (E) getValue(str, type, null);
		/*     */ }

	/*     */
	/*     */ public static <E> E getValue(String str, Class<E> type, E defaultValue) {
		/* 58 */ String value = trimToNull(str);
		/* 59 */ return value == null ? defaultValue : CONVERT.convert(value, type);
		/*     */ }

	/*     */
	/*     */ public static <E> E getValue(Map<String, String> map, String key, Class<E> type) {
		/* 63 */ return (E) getValue(map, key, type, null);
		/*     */ }

	/*     */
	/*     */ public static <E> E getValue(Map<String, String> map, String key, Class<E> type, E defaultValue) {
		/* 67 */ if (map == null) {
			/* 68 */ return defaultValue;
			/*     */ }
		/* 70 */ return (E) getValue((String) map.get(key), type, defaultValue);
		/*     */ }

	/*     */
	/*     */ public static void pruneMap(Map<String, String> map) {
		/* 74 */ if (map != null) {
			/* 75 */ Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
			/* 76 */ while (it.hasNext()) {
				/* 77 */ Map.Entry<String, String> entry = (Map.Entry) it.next();
				/* 78 */ String value = trimToNull(entry.getValue());
				/* 79 */ if (value == null) {
					/* 80 */ it.remove();
					/*     */ }
				/*     */ }
			/*     */ }
		/*     */ }

	/*     */
	/*     */ public static <E> E[] getValueArray(Map<String, String> map, String key, Class<E> type) {
		/* 87 */ String[] values = delimSplit((String) getValue(map, key, String.class, ""));
		/* 88 */ E[] answer = (Object[]) Array.newInstance(type, values.length);
		/* 89 */ for (int i = 0; i < values.length; i++) {
			/* 90 */ answer[i] = getValue(values[i], type);
			/*     */ }
		/* 92 */ return answer;
		/*     */ }

	/*     */
	/*     */ public static <E> E[][] getNestedValueArray(Map<String, String> map, String key, Class<E> type) {
		/* 96 */ String str = (String) getValue(map, key, String.class, "");
		/* 97 */ Class<?> arrayType = Array.newInstance(type, 0).getClass();
		/* 98 */ if (str.isEmpty()) {
			/* 99 */ return Array.newInstance(arrayType, 0);
			/*     */ }
		/* 101 */ String[] values = delimSplit(str, "?");
		/* 102 */ int valLen = values.length;
		/* 103 */ String[][] subValues = new String[valLen][];
		/* 104 */ E[][] answer =  Array.newInstance(arrayType, valLen);
		/* 105 */ for (int i = 0; i < valLen; i++) {
			/* 106 */ subValues[i] = delimSplit(values[i], "?");
			/* 107 */ int subValLen = subValues[i].length;
			/* 108 */ answer[i] = (E[]) ((Object[]) (Object[]) Array.newInstance(type, subValLen));
			/* 109 */ for (int j = 0; j < subValLen; j++) {
				/* 110 */ String s = trimToNull(subValues[i][j]);
				/* 111 */ answer[i][j] = (s == null ? null : CONVERT.convert(s, type));
				/*     */ }
			/*     */ }
		/* 114 */ return answer;
		/*     */ }

	/*     */
	/*     */ private static String[] delimSplit(String str) {
		/* 118 */ if (str == null) {
			/* 119 */ return new String[0];
			/*     */ }
		/* 121 */ return SPLIT_DELIM.split(str);
		/*     */ }

	/*     */
	/*     */ private static String[] delimSplit(String str, String delim) {
		/* 125 */ if (str == null) {
			/* 126 */ return new String[0];
			/*     */ }
		/* 128 */ return str.split(delim);
		/*     */ }
	/*     */ }
