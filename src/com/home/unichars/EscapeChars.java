package com.home.unichars;

import java.util.regex.Pattern;

public class EscapeChars {

		public static final String RECORD_MARK = "\uf8ff";
		public static final String FIELD_MARK = "\uf8fe";
		public static final String VALUE_MARK = "\uf8fd";
		public static final String SUBVALUE_MARK = "\uf8fc";
		public static final String TEXT_MARK = "\uf8fb";
		public static final String DELIM_CHARS = "\uf8fa" + TEXT_MARK + SUBVALUE_MARK + VALUE_MARK + FIELD_MARK + RECORD_MARK;
		public static final String NULL_CHARS = "\ufffd";
		public static final Pattern SPLIT_DELIM = Pattern.compile("[" + DELIM_CHARS + "]");
}
