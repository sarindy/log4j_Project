package log4j_Project;

import org.apache.log4j.Logger;

public class Apps {
	static Logger logger=Logger.getLogger(Apps.class.getName());
	

	public static void main(String[] args) {

logger.debug("Debug Message");
logger.info("Info Message");

	}

}
