package com.home.datetime;

import java.time.Instant;
import java.util.logging.Logger;

import com.home.main.MainClass;

public class InstantClass {

	public static void instantMethod() {
		final Logger LOGGER = Logger.getLogger(MainClass.class.getName());
		System.out.println("LOGGER Name::" + LOGGER.getName());

		// Instant.now()
		Instant instance = Instant.now();
		System.out.println("Current Instance::" + instance);
	}
}
