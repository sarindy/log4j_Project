package log4j_Project;

public class Apps extends LoggerAbstract {
	

	public static void main(String[] args)  {

		TriggerLog triggerLog=new TriggerLog();

		triggerLog.logger.debug("Debug Message");
		

	}

}
