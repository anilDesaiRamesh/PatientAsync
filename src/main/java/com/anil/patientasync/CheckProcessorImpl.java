/**
 * 
 */
package com.anil.patientasync;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.container.AsyncResponse;

import org.springframework.stereotype.Service;

import com.anil.patientasync.model.ChecksList;

/**
 * @author Anil_Ramesh
 *
 */
@Service
public class CheckProcessorImpl implements ICheckProcessor {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.anil.patientasync.ICheckProcessor#processChecks(com.anil.patientasync.
	 * model.ChecksList)
	 */
	@Override
	public void processChecks(AsyncResponse response, ChecksList checksList) {
		// TODO Auto-generated method stub
		new Thread() {
			public void run() {
				if (checksList == null || checksList.getChecksList() == null
						|| checksList.getChecksList().size() == 0) {
					response.resume(new BadRequestException());
				}
				response.resume(true);
			}
		}.start();

	}

}
