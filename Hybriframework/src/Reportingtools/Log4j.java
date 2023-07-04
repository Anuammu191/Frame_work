package Reportingtools;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Log4j 
{
	@Test
	public void test2()
	{
		//step1
		BasicConfigurator.configure();
		//step2
		Logger log = Logger.getLogger(this.getClass().getName());
		//step3
		log.error("error");
		log.fatal("fatal");
		log.info("info");
	}

}
