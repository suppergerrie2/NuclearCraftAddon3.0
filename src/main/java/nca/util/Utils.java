
package nca.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Utils {

	private static Logger logger; 
public static Logger getLogger() {
	if(logger == null) {
		logger = LogManager.getFormatterLogger(nca.util.Reference.MODID); 
		
		}
	
	return logger;
	}

}

