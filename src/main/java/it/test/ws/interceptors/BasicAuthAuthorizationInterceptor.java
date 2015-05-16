package it.test.ws.interceptors;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.binding.soap.interceptor.SoapHeaderInterceptor;
import org.apache.cxf.configuration.security.AuthorizationPolicy;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;

public class BasicAuthAuthorizationInterceptor extends org.apache.cxf.ws.security.wss4j.UsernameTokenInterceptor  {

	@Override
	public void handleMessage(SoapMessage message) throws Fault {
		String str = "";
	    str = "123";
		
	}

	
	

}
