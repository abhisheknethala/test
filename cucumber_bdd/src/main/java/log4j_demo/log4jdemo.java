package log4j_demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class log4jdemo {
	private static Logger logger= (Logger) LogManager.getLogger(log4jdemo.class);
	public static void main(String[] args) {
		System.out.println("hello world");
		logger.info("this is information message");
		logger.trace("this is debug message");
		 
		logger.debug("debug mode");
		System.out.println("completed");
	}

}
