
package com.em.itr.webservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.2.9
 * Wed Aug 11 22:09:10 IST 2010
 * Generated source version: 2.2.9
 * 
 */

@WebFault(name = "ITRInvalidDocFaultException", targetNamespace = "http://incometaxindiaefiling.gov.in/itrservice/v_1_0")
public class ITRInvalidDocFaultException_Exception extends Exception {
    public static final long serialVersionUID = 20100811220910L;
    
    private com.em.itr.webservice.ITRInvalidDocFaultException itrInvalidDocFaultException;

    public ITRInvalidDocFaultException_Exception() {
        super();
    }
    
    public ITRInvalidDocFaultException_Exception(String message) {
        super(message);
    }
    
    public ITRInvalidDocFaultException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public ITRInvalidDocFaultException_Exception(String message, com.em.itr.webservice.ITRInvalidDocFaultException itrInvalidDocFaultException) {
        super(message);
        this.itrInvalidDocFaultException = itrInvalidDocFaultException;
    }

    public ITRInvalidDocFaultException_Exception(String message, com.em.itr.webservice.ITRInvalidDocFaultException itrInvalidDocFaultException, Throwable cause) {
        super(message, cause);
        this.itrInvalidDocFaultException = itrInvalidDocFaultException;
    }

    public com.em.itr.webservice.ITRInvalidDocFaultException getFaultInfo() {
        return this.itrInvalidDocFaultException;
    }
}
