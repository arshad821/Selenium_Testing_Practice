package Log4jExamples;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyLog4jExample {
	
	static Logger logger = Logger.getLogger(PropertyLog4jExample.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("debug mesage");
		logger.info("info message");
		logger.warn("warn message");
		logger.error("error mesage");
		logger.fatal("fatal message");

	}

}
