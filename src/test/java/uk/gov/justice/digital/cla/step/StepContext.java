package uk.gov.justice.digital.cla.step;

public class StepContext {
	
	private String contactName = "";
	private String situationDescription = "";
	private String postcode = "";
	
	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("contact name: " + contactName + "\n");
		builder.append("situation description: " + situationDescription + "\n");
		builder.append("Postcode: " +  postcode + "\n");
		return builder.toString();
	}
	
	public void reset(){
		contactName = "";
		situationDescription = "";
		postcode = "";
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	
	public String getContactName(){
		return contactName;
	}

	public void setSituationDescription(String situationDescription) {
		this.situationDescription = situationDescription;
		
	}
	
	public String getSituationDescription(){
		return situationDescription;
	}

	public void setPostcode(String validPostcode) {
		this.postcode = postcode;	
	}

	public String getPostcode() {
		return postcode;
	}
	

}
