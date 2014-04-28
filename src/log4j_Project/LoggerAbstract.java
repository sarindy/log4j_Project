package log4j_Project;

import org.apache.log4j.Logger;

public abstract class LoggerAbstract {
	protected  Logger logger = null;

	
	//This Constructor will read the properties file and process the log to the destination folder
	protected LoggerAbstract() {
		logger = Logger.getLogger(this.getClass().getName());
		logger.info(this.getClass().toString() + ": start.");
	}

	protected   String getMethodName(StackTraceElement ste[]) {
		String methodName = "";
		boolean flag = false;
		for (StackTraceElement s : ste) {
			if (flag) {
				methodName = s.getMethodName();
				break;
			}
			flag = s.getMethodName().equals("getStackTrace");
		}
		return this.getClass().toString() + "." + methodName;
	}
}
