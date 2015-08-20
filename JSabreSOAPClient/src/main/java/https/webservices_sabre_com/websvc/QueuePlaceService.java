
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
@WebServiceClient(name = "QueuePlaceService", targetNamespace = "https://webservices.sabre.com/websvc", wsdlLocation = "http://webservices.sabre.com/wsdl/tpfc/QueuePlaceLLS2.0.3RQ.wsdl")
public class QueuePlaceService
    extends Service
{

    private final static URL QUEUEPLACESERVICE_WSDL_LOCATION;
    private final static WebServiceException QUEUEPLACESERVICE_EXCEPTION;
    private final static QName QUEUEPLACESERVICE_QNAME = new QName("https://webservices.sabre.com/websvc", "QueuePlaceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://webservices.sabre.com/wsdl/tpfc/QueuePlaceLLS2.0.3RQ.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        QUEUEPLACESERVICE_WSDL_LOCATION = url;
        QUEUEPLACESERVICE_EXCEPTION = e;
    }

    public QueuePlaceService() {
        super(__getWsdlLocation(), QUEUEPLACESERVICE_QNAME);
    }

    public QueuePlaceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), QUEUEPLACESERVICE_QNAME, features);
    }

    public QueuePlaceService(URL wsdlLocation) {
        super(wsdlLocation, QUEUEPLACESERVICE_QNAME);
    }

    public QueuePlaceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, QUEUEPLACESERVICE_QNAME, features);
    }

    public QueuePlaceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public QueuePlaceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns QueuePlacePortType
     */
    @WebEndpoint(name = "QueuePlacePortType")
    public QueuePlacePortType getQueuePlacePortType() {
        return super.getPort(new QName("https://webservices.sabre.com/websvc", "QueuePlacePortType"), QueuePlacePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QueuePlacePortType
     */
    @WebEndpoint(name = "QueuePlacePortType")
    public QueuePlacePortType getQueuePlacePortType(WebServiceFeature... features) {
        return super.getPort(new QName("https://webservices.sabre.com/websvc", "QueuePlacePortType"), QueuePlacePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (QUEUEPLACESERVICE_EXCEPTION!= null) {
            throw QUEUEPLACESERVICE_EXCEPTION;
        }
        return QUEUEPLACESERVICE_WSDL_LOCATION;
    }

}
