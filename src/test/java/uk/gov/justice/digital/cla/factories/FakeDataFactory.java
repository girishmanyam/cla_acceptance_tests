package uk.gov.justice.digital.cla.factories;





public class FakeDataFactory {
	
	public static String getCLAWebStartPageUrl(){
//		return "http://172.22.5.112:5000";
		return "http://public-demo.cla.dsd.io/";
//		return 	"https://cla-public.service.dsd.io/";
//        return	"https://www.gov.uk/check-if-civil-legal-advice-can-help-you";
	}
	
	public static String getCLAClinicalNegligenceSearchForALegalAdvisorPageUrl(){
		return "http://public-demo.cla.dsd.io/result/face-to-face?category=clinneg";
	}
	
	public static String generateRandomLines(int number_of_lines, int number_of_characters_per_line) throws Exception{
		StringBuilder builder = new StringBuilder();
		for (int index=1;index <= number_of_lines; index++ ){
			if (number_of_lines == index)
			  builder = builder.append(generateRandomString(number_of_characters_per_line, Mode.ALPHANUMERIC));
			else
			  builder = builder.append(generateRandomString(number_of_characters_per_line, Mode.ALPHANUMERIC)+"\r");
		}
		return builder.toString();
	}

	
	public static enum Mode {
	    ALPHA, ALPHANUMERIC, NUMERIC 
	}
	
	
	public static String generateRandomString(int length, Mode mode) throws Exception {

		StringBuffer buffer = new StringBuffer();
		String characters = "";

		switch(mode){
		
		case ALPHA:
			characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			break;
		
		case ALPHANUMERIC:
			characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
			break;
	
		case NUMERIC:
			characters = "1234567890";
		    break;
		}
		
		int charactersLength = characters.length();

		for (int i = 0; i < length; i++) {
			double index = Math.random() * charactersLength;
			buffer.append(characters.charAt((int) index));
		}
		return buffer.toString();
	}

	public static String getContactName() throws Exception{
		return generateRandomString(40, Mode.ALPHA);
	}

	public static String getContactNumber() throws Exception {
		return generateRandomString(9, Mode.NUMERIC);
	}

	public static String getValidPostcode() {
		return "sG80Lt";
	}
	
}
