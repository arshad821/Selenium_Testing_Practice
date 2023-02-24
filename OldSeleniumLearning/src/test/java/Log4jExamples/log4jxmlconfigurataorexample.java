package Log4jExamples;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class log4jxmlconfigurataorexample {
	
	static Logger logger = Logger.getLogger(log4jxmlconfigurataorexample.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DOMConfigurator.configure("log4j.xml");
		logger.debug("debug mesage");
		logger.info("info message");
		logger.warn("warn message");
		logger.error("error mesage");
		logger.fatal("fatal message");

	}

}
