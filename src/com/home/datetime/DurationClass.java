package com.home.datetime;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public class DurationClass {

	private long maxReorderPeriodInHours = 24L;
	private Duration maxReorderPeriod;
	
	public DurationClass(){
		this.maxReorderPeriod = Duration.ofHours(maxReorderPeriodInHours);
		System.out.println(maxReorderPeriod);
		System.out.println(Date.from(Instant.now().minus(this.maxReorderPeriod)));
		System.out.println(Duration.ofHours(24L));
	}
	
	public long getMaxReorderPeriodInHours() {
		return maxReorderPeriodInHours;
	}
	public void setMaxReorderPeriodInHours(long maxReorderPeriodInHours) {
		this.maxReorderPeriodInHours = maxReorderPeriodInHours;
	}
	public Duration getMaxReorderPeriod() {
		return maxReorderPeriod;
	}
	public void setMaxReorderPeriod(Duration maxReorderPeriod) {
		this.maxReorderPeriod = maxReorderPeriod;
	}
	    
}
