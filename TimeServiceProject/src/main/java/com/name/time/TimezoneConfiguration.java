package com.name.time;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;

public class TimezoneConfiguration extends Configuration
{
	@NotEmpty
	@JsonProperty
	private String defaultTimezone;
	
	public String getDefaultTimezone()
	{
		return defaultTimezone;
	}

}
