package com.blog.cavalr.entity;

import java.util.ArrayList;

import org.springframework.integration.Message;

public class UserActivator {
	
	public void readMessage(Message<?> message)
	{
		 ArrayList<?> usr = ( ArrayList<?>)message.getPayload();
	}

}
