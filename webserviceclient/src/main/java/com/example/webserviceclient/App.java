package com.example.webserviceclient;

import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;

import com.isbank.opsvcs.collateralhandling.appraisalservice.service.v1.AppraisalServiceV1X5;
import com.isbank.opsvcs.collateralhandling.appraisalservice.service.v1.AppraisalServiceV1X5_Service;
import com.isbank.opsvcs.collateralhandling.appraisalservice.service.v1.BusinessFault;
import com.isbank.opsvcs.collateralhandling.appraisalservice.service.v1.GetAppraisalCompaniesResponse.GetAppraisalCompaniesResponseDTO;
import com.isbank.opsvcs.collateralhandling.appraisalservice.service.v1.SystemFault;

/**
 * Hello world!
 *
 */
public class App {
	@WebServiceRef(wsdlLocation="http://localhost:8080/ws/hello?wsdl")
	static AppraisalServiceV1X5 service;
	
	private static final String SERVICE_TOKEN = "MR94s+M9zRQ0rtHZ5Zq3Ufy685y3JQvMVTZBlgzRaypvWeYLQ691kaNwztxuFG2p3YiEEyHYa42HEKfHxEfiCSR02AA/plKt7Mb7tOrXVNsFx+Nu1oNh/n16s4GIYRfEQvIABYGbgbR7YWTHicU38iS6nb0jIHswx1EpLWcQe5Ow0WzdyBCzlU9jD9uhn8xkf6CroWEDGTxHfdXg16EzUqFGyfuH+iy/6TYU0GMIcyOwqbFScoD5BZBGREsxuCPwS1BgMmcansDsAAY0sFQy5AnmHT/UtMnmiK+CR86RraXJtZt/dPMpy1NPAS9sZ5uYyQYgNF6mXamVstGjducYt8iiC7AGkOVxeeVjUiIRwmI=";
	public static void main(String[] args) throws BusinessFault, SystemFault {
		AppraisalServiceV1X5_Service service = new AppraisalServiceV1X5_Service();
		AppraisalServiceV1X5 port = service.getAppraisalServiceV1X5UATProviderWebServicePort1();

		BindingProvider bp = (BindingProvider) port;  
		Map<String, Object> reqContext = bp.getRequestContext();  
		reqContext.put(BindingProvider.SOAPACTION_URI_PROPERTY, SERVICE_TOKEN);  
		reqContext.put(BindingProvider.PASSWORD_PROPERTY, "test");  
		
		GetAppraisalCompaniesResponseDTO dto = port.getAppraisalCompanies();
		System.out.println(dto.getAppraisalCompanies());
	}
}
