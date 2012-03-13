package com.kthcorp.daisy.util;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StartStopMain {
	
	private static AbstractApplicationContext applicationContext;
	
	public static void main(String[] args) throws Exception{
		
		String methodName = args[0];
		System.out.println("methodName: [" + methodName + "]");
		
		if(methodName.equals("start"))
		{  		
			start();
		}
		else if(methodName.equals("stop"))
		{
			stop();
		}
		else
		{
			System.exit(1);
		}
		
	}
	

	public static void start() throws Exception
	{		
		applicationContext = new ClassPathXmlApplicationContext(
				new String[] {
						"META-INF/spring/spring-all-context.xml" });
		applicationContext.registerShutdownHook();
	}  	

	public static void stop()
	{
		applicationContext.close();
	}
}

