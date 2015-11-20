package cdoremus.stategeo.server.service;

import java.io.Serializable;
import java.util.Map;

public class ErrorJson implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public final Integer status;
	public final String error;
	public final String message;
	public final String timeStamp;
	public final String trace;
	
	public ErrorJson(int status, Map<String, Object> errorAttributes) {
	    this.status = status;
	    this.error = (String) errorAttributes.get("error");
	    this.message = (String) errorAttributes.get("message");
	    this.timeStamp = errorAttributes.get("timestamp").toString();
	    this.trace = (String) errorAttributes.get("trace");
	}

}
