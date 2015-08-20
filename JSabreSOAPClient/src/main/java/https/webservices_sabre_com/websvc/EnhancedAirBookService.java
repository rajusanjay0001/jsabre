
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
@WebServiceClient(name = "EnhancedAirBookService", targetNamespace = "https://webservices.sabre.com/websvc", wsdlLocation = "http://webservices.sabre.com/wsdl/swso/EnhancedAirBook2.5.0RQ.wsdl")
public class EnhancedAirBookService
    extends Service
{

    private final static URL ENHANCEDAIRBOOKSERVICE_WSDL_LOCATION;
    private final static WebServiceException ENHANCEDAIRBOOKSERVICE_EXCEPTION;
    private final static QName ENHANCEDAIRBOOKSERVICE_QNAME = new QName("https://webservices.sabre.com/websvc", "EnhancedAirBookService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://webservices.sabre.com/wsdl/swso/EnhancedAirBook2.5.0RQ.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ENHANCEDAIRBOOKSERVICE_WSDL_LOCATION = url;
        ENHANCEDAIRBOOKSERVICE_EXCEPTION = e;
    }

    public EnhancedAirBookService() {
        super(__getWsdlLocation(), ENHANCEDAIRBOOKSERVICE_QNAME);
    }

    public EnhancedAirBookService(URL wsdlLocation) {
        super(wsdlLocation, ENHANCEDAIRBOOKSERVICE_QNAME);
    }

    public EnhancedAirBookService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns EnhancedAirBookPortType
     */
    @WebEndpoint(name = "EnhancedAirBookPortType")
    public EnhancedAirBookPortType getEnhancedAirBookPortType() {
        return super.getPort(new QName("https://webservices.sabre.com/websvc", "EnhancedAirBookPortType"), EnhancedAirBookPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EnhancedAirBookPortType
     */
    @WebEndpoint(name = "EnhancedAirBookPortType")
    public EnhancedAirBookPortType getEnhancedAirBookPortType(WebServiceFeature... features) {
        return super.getPort(new QName("https://webservices.sabre.com/websvc", "EnhancedAirBookPortType"), EnhancedAirBookPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ENHANCEDAIRBOOKSERVICE_EXCEPTION!= null) {
            throw ENHANCEDAIRBOOKSERVICE_EXCEPTION;
        }
        return ENHANCEDAIRBOOKSERVICE_WSDL_LOCATION;
    }

}