package com.soap.service.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soap.service.calculation.CalculationRequest;
import com.soap.service.calculation.CalculationResponse;

@Endpoint
public class CalculationEndpoint {

	private static final String NAMESPACE = "http://www.soap.com/service/calculation";
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "CalculationRequest")
	@ResponsePayload
	public CalculationResponse add(@RequestPayload CalculationRequest req) {
		CalculationResponse resp = new CalculationResponse();
		int result = req.getInput1()+req.getInput2();
		resp.setOutput(result);
		return resp;
	}
}
