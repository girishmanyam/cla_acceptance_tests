package uk.gov.justice.digital.cla.step;

import uk.gov.justice.digital.cla.pages.PageEnum;

public class StepContext {
	
	private String contactName = "";
	private String situationDescription = "";
	private String postcode = "";
	private PageEnum pageEnum = PageEnum.UNKNOWN;
	private String addressText = "";
	
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
	

	public void setPageEnum(PageEnum pageEnum) {
		// TODO Auto-generated method stub
		this.pageEnum = pageEnum;
	}

	public PageEnum getPageEnum() {
		// TODO Auto-generated method stub
		return pageEnum;
	}

	public String getAddressText() {
		return addressText;
	}
	
	public void setAddressText(String addressText){
		this.addressText = addressText;
	}
	

}
