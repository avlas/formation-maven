package fr.diginamic;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogger {

	private static final Logger LOG = LoggerFactory.getLogger(TestLogger.class);
	
	public void afficherLog(String param) {
		LOG.info("Bonjour Slf4J !");
		LOG.info("Impl�mentation Logback");
		
		LOG.info(param);
	}

}
