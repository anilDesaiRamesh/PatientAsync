/**
 * 
 */
package com.anil.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.cxf.feature.Features;

/**
 * @author Anil_Ramesh
 *
 */
@WebService
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class HelloWs {

	@WebMethod
	public String hello() {
		return "hello";
	}
}
