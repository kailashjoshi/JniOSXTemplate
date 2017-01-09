package com.jni;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloJni {
	private static Logger LOG = LoggerFactory.getLogger(HelloJni.class);
	static {
		try {
			System.load(System.getProperty("java.native"));
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
	}

	public static void main(String[] args) {
		LOG.info("Hello from JAVA!");
		LOG.info(new JniNative().hello());
	}

}
