/**
 * 
 */
package com.anil.patientasync.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Anil_Ramesh
 *
 */
@XmlRootElement
public class ChecksList {
	private List<Check> checksList;

	public List<Check> getChecksList() {
		return checksList;
	}

	public void setChecksList(List<Check> checksList) {
		this.checksList = checksList;
	}

}
