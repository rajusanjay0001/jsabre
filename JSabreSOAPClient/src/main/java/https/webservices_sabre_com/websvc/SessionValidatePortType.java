
package https.webservices_sabre_com.websvc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import org.ebxml.namespaces.messageheader.MessageHeader;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SessionValidatePortType", targetNamespace = "https://webservices.sabre.com/websvc")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    org.xmlsoap.schemas.ws._2002._12.secext.ObjectFactory.class,
    org.ebxml.namespaces.messageheader.ObjectFactory.class,
    org.opentravel.ota._2002._11.ObjectFactory.class,
    org.w3._2000._09.xmldsig.ObjectFactory.class,
    org.xmlsoap.schemas.soap.envelope.ObjectFactory.class
})
public interface SessionValidatePortType {


    /**
     * 
     * @param header2
     * @param header
     * @param body
     * @return
     *     returns java.lang.Object
     */
    @WebMethod(operationName = "SessionValidateRQ", action = "OTA")
    @WebResult(name = "SessionValidateRS", targetNamespace = "http://www.opentravel.org/OTA/2002/11", partName = "body")
    public Object sessionValidateRQ(
        @WebParam(name = "MessageHeader", targetNamespace = "http://www.ebxml.org/namespaces/messageHeader", header = true, mode = WebParam.Mode.INOUT, partName = "header")
        Holder<MessageHeader> header,
        @WebParam(name = "Security", targetNamespace = "http://schemas.xmlsoap.org/ws/2002/12/secext", header = true, mode = WebParam.Mode.INOUT, partName = "header2")
        Holder<Security> header2,
        @WebParam(name = "SessionValidateRQ", targetNamespace = "http://www.opentravel.org/OTA/2002/11", partName = "body")
        Object body);

}
