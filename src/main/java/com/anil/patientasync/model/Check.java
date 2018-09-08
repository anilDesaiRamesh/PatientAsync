/**
 * 
 */
package com.anil.patientasync.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Anil_Ramesh
 *
 */
@XmlRootElement
public class Check {

	private String checkNumber;
	private String accountNumber;
	private Double amount;
	public String getCheckNumber() {
		return checkNumber;
	}
	public Check() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Check(String checkNumber, String accountNumber, Double amount) {
		super();
		this.checkNumber = checkNumber;
		this.accountNumber = accountNumber;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Check [checkNumber=" + checkNumber + ", accountNumber=" + accountNumber + ", amount=" + amount + "]";
	}
	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
