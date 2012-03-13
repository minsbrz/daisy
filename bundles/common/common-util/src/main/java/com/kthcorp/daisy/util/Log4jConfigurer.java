package com.kthcorp.daisy.util;

import org.apache.log4j.xml.DOMConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4jConfigurer {
	
	static Log4jConfigurer instance;	

	public Log4jConfigurer(String confPath) {		
		this.init(confPath);
	}

	private void init(String confPath) {
		java.net.URL url = this.getClass().getResource(confPath);
		System.out.println("log4j url: " + url.toString());

		DOMConfigurator.configure(url);

		final Logger log = LoggerFactory.getLogger(Log4jConfigurer.class);
		log.debug("log4j loaded...");
	}
}

