
package eaa.chapter15.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.0_01-b59-fcs
 * Generated source version: 2.0
 * 
 */
@WebFault(name = "ApplicationException", targetNamespace = "http://service.server.chapter15.eaa/")
public class ApplicationException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ApplicationException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ApplicationException_Exception(String message, ApplicationException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param message
     * @param cause
     */
    public ApplicationException_Exception(String message, ApplicationException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: eaa.chapter15.client.ApplicationException
     */
    public ApplicationException getFaultInfo() {
        return faultInfo;
    }

}
