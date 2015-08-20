
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
@WebServiceClient(name = "OTA_CancelService", targetNamespace = "https://webservices.sabre.com/websvc", wsdlLocation = "http://webservices.sabre.com/wsdl/tpfc/OTA_CancelLLS2.0.0RQ.wsdl")
public class OTACancelService
    extends Service
{

    private final static URL OTACANCELSERVICE_WSDL_LOCATION;
    private final static WebServiceException OTACANCELSERVICE_EXCEPTION;
    private final static QName OTACANCELSERVICE_QNAME = new QName("https://webservices.sabre.com/websvc", "OTA_CancelService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://webservices.sabre.com/wsdl/tpfc/OTA_CancelLLS2.0.0RQ.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OTACANCELSERVICE_WSDL_LOCATION = url;
        OTACANCELSERVICE_EXCEPTION = e;
    }

    public OTACancelService() {
        super(__getWsdlLocation(), OTACANCELSERVICE_QNAME);
    }

    public OTACancelService(URL wsdlLocation) {
        super(wsdlLocation, OTACANCELSERVICE_QNAME);
    }

    public OTACancelService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns OTACancelPortType
     */
    @WebEndpoint(name = "OTA_CancelPortType")
    public OTACancelPortType getOTACancelPortType() {
        return super.getPort(new QName("https://webservices.sabre.com/websvc", "OTA_CancelPortType"), OTACancelPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OTACancelPortType
     */
    @WebEndpoint(name = "OTA_CancelPortType")
    public OTACancelPortType getOTACancelPortType(WebServiceFeature... features) {
        return super.getPort(new QName("https://webservices.sabre.com/websvc", "OTA_CancelPortType"), OTACancelPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OTACANCELSERVICE_EXCEPTION!= null) {
            throw OTACANCELSERVICE_EXCEPTION;
        }
        return OTACANCELSERVICE_WSDL_LOCATION;
    }

}
