
package https.webservices_sabre_com.websvc;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SessionCloseRQService", targetNamespace = "https://webservices.sabre.com/websvc", wsdlLocation = "http://webservices.sabre.com/wsdl/sabreXML1.0.00/usg/SessionCloseRQ.wsdl")
public class SessionCloseRQService
    extends Service
{

    private final static URL SESSIONCLOSERQSERVICE_WSDL_LOCATION;
    private final static WebServiceException SESSIONCLOSERQSERVICE_EXCEPTION;
    private final static QName SESSIONCLOSERQSERVICE_QNAME = new QName("https://webservices.sabre.com/websvc", "SessionCloseRQService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://webservices.sabre.com/wsdl/sabreXML1.0.00/usg/SessionCloseRQ.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SESSIONCLOSERQSERVICE_WSDL_LOCATION = url;
        SESSIONCLOSERQSERVICE_EXCEPTION = e;
    }

    public SessionCloseRQService() {
        super(__getWsdlLocation(), SESSIONCLOSERQSERVICE_QNAME);
    }

    public SessionCloseRQService(URL wsdlLocation) {
        super(wsdlLocation, SESSIONCLOSERQSERVICE_QNAME);
    }

    public SessionCloseRQService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }


    /**
     * 
     * @return
     *     returns SessionClosePortType
     */
    @WebEndpoint(name = "SessionClosePortType")
    public SessionClosePortType getSessionClosePortType() {
        return super.getPort(new QName("https://webservices.sabre.com/websvc", "SessionClosePortType"), SessionClosePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SessionClosePortType
     */
    @WebEndpoint(name = "SessionClosePortType")
    public SessionClosePortType getSessionClosePortType(WebServiceFeature... features) {
        return super.getPort(new QName("https://webservices.sabre.com/websvc", "SessionClosePortType"), SessionClosePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SESSIONCLOSERQSERVICE_EXCEPTION!= null) {
            throw SESSIONCLOSERQSERVICE_EXCEPTION;
        }
        return SESSIONCLOSERQSERVICE_WSDL_LOCATION;
    }

}
