package Log4jExamples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class basicConfiguratorExample {

	static Logger logger = Logger.getLogger(basicConfiguratorExample.class); //factory design pattern

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicConfigurator.configure(); 
		logger.debug("debug mesage");
		logger.info("info message");
		logger.warn("warn message");
		logger.error("error mesage");
		logger.fatal("fatal message");


	}

}
