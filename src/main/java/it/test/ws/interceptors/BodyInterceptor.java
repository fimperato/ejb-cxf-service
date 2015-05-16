package it.test.ws.interceptors;

import java.util.List;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

public class BodyInterceptor extends AbstractPhaseInterceptor<Message> {

	  public BodyInterceptor() {
	    super(Phase.PRE_INVOKE);
	    System.out.println("Creating Instance");
	  }

	  @Override
	  public void handleMessage(final Message message) throws Fault {
	    System.out.println("Formats message is available in : " + message.getContentFormats());
	    final List contents = message.getContent(List.class);
	    for (final Object object : contents) {
	      

	    }

	  }

	}
