/**
 * 
 */
package com.anil.patientasync;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

import com.anil.patientasync.model.ChecksList;

/**
 * @author Anil_Ramesh
 *
 */
@Path("/checkprocessingservice")

public interface ICheckProcessor {

	@Path("/checks")
	@POST
	public void processChecks(@Suspended AsyncResponse response, ChecksList checksList);

}
