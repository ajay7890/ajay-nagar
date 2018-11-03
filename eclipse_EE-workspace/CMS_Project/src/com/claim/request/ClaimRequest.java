package com.claim.request;

import java.util.Date;

public class ClaimRequest {
	
	private int memberId;
	private String first_name;
	private String last_name;
	private int nominee_count;
	private double maximum_claim_amount;
	private String insurance_type;
	private Date request_date;
	private String claim_reason;
	private double final_claim_amount;
	

	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getNominee_count() {
		return nominee_count;
	}
	public void setNominee_count(int nominee_count) {
		this.nominee_count = nominee_count;
	}
	public double getMaximum_claim_amount() {
		return maximum_claim_amount;
	}
	public void setMaximum_claim_amount(double maximum_claim_amount) {
		this.maximum_claim_amount = maximum_claim_amount;
	}
	public String getInsurance_type() {
		return insurance_type;
	}
	public void setInsurance_type(String insurance_type) {
		this.insurance_type = insurance_type;
	}
	public Date getRequest_date() {
		return request_date;
	}
	public void setRequest_date(Date request_date) {
		this.request_date = request_date;
	}
	public String getClaim_reason() {
		return claim_reason;
	}
	public void setClaim_reason(String claim_reason) {
		this.claim_reason = claim_reason;
	}
	public double getFinal_claim_amount() {
		return final_claim_amount;
	}
	public void setFinal_claim_amount(double final_claim_amount) {
		this.final_claim_amount = final_claim_amount;
	}


}
