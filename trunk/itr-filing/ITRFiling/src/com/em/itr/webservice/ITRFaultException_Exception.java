
package com.em.itr.webservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.2.9
 * Wed Aug 11 22:09:10 IST 2010
 * Generated source version: 2.2.9
 * 
 */

@WebFault(name = "ITRFaultException", targetNamespace = "http://incometaxindiaefiling.gov.in/itrservice/v_1_0")
public class ITRFaultException_Exception extends Exception {
    public static final long serialVersionUID = 20100811220910L;
    
    private com.em.itr.webservice.ITRFaultException itrFaultException;

    public ITRFaultException_Exception() {
        super();
    }
    
    public ITRFaultException_Exception(String message) {
        super(message);
    }
    
    public ITRFaultException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public ITRFaultException_Exception(String message, com.em.itr.webservice.ITRFaultException itrFaultException) {
        super(message);
        this.itrFaultException = itrFaultException;
    }

    public ITRFaultException_Exception(String message, com.em.itr.webservice.ITRFaultException itrFaultException, Throwable cause) {
        super(message, cause);
        this.itrFaultException = itrFaultException;
    }

    public com.em.itr.webservice.ITRFaultException getFaultInfo() {
        return this.itrFaultException;
    }
}
