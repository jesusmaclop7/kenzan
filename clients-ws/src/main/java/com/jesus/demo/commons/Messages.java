package com.jesus.demo.commons;

import java.util.ResourceBundle;

public class Messages {

	private static ResourceBundle rb = ResourceBundle.getBundle("com.jesus.messages.messages");
	
	public static String getMessage(String key) {
		return rb.getString(key);
	}
	
}
