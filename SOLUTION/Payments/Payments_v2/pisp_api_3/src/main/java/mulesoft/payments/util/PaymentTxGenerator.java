package mulesoft.payments.util;

public class PaymentTxGenerator 
{

	public  static String generateTxId() {
		// TODO Auto-generated method stub
		
		String _uuid = GeneralUUIDGenerator.generateUUID();
		
		String _retVal = "PmtTx-"+_uuid;
		
		String _retVal1 =_retVal.substring(0, 33);
		
		return _retVal1;
		
	}
	

}
