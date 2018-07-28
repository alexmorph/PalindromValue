package com.palindrom.main;

import java.util.logging.Logger;

import com.palindrom.palindrom.Palindom;

public class RunApp {
	private static Logger logger = Logger.getLogger(RunApp.class.getName());

	public static void main(String[] args) {
		Palindom pl = new Palindom();
		logger.info("max palindrom is: " +pl.getResult());
	}

}
