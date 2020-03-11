package mulesoft.payments.util;

//import org.mule.runtime.core.api.util.UUID;
import java.util.UUID;

public class GeneralUUIDGenerator {
	
	public static String generateUUID()
	{
		return UUID.randomUUID().toString();
	}

}
