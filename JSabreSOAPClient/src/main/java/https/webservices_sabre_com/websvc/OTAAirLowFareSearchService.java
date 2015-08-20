
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
@WebServiceClient(name = "OTA_AirLowFareSearchService", targetNamespace = "https://webservices.sabre.com/websvc", wsdlLocation = "http://webservices.sabre.com/wsdl/swso/OTA_AirLowFareSearchLLS2.3.0RQ.wsdl")
public class OTAAirLowFareSearchService
    extends Service
{

    private final static URL OTAAIRLOWFARESEARCHSERVICE_WSDL_LOCATION;
    private final static WebServiceException OTAAIRLOWFARESEARCHSERVICE_EXCEPTION;
    private final static QName OTAAIRLOWFARESEARCHSERVICE_QNAME = new QName("https://webservices.sabre.com/websvc", "OTA_AirLowFareSearchService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://webservices.sabre.com/wsdl/swso/OTA_AirLowFareSearchLLS2.3.0RQ.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OTAAIRLOWFARESEARCHSERVICE_WSDL_LOCATION = url;
        OTAAIRLOWFARESEARCHSERVICE_EXCEPTION = e;
    }

    public OTAAirLowFareSearchService() {
        super(__getWsdlLocation(), OTAAIRLOWFARESEARCHSERVICE_QNAME);
    }

    public OTAAirLowFareSearchService(URL wsdlLocation) {
        super(wsdlLocation, OTAAIRLOWFARESEARCHSERVICE_QNAME);
    }

    public OTAAirLowFareSearchService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns OTAAirLowFareSearchPortType
     */
    @WebEndpoint(name = "OTA_AirLowFareSearchPortType")
    public OTAAirLowFareSearchPortType getOTAAirLowFareSearchPortType() {
        return super.getPort(new QName("https://webservices.sabre.com/websvc", "OTA_AirLowFareSearchPortType"), OTAAirLowFareSearchPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OTAAirLowFareSearchPortType
     */
    @WebEndpoint(name = "OTA_AirLowFareSearchPortType")
    public OTAAirLowFareSearchPortType getOTAAirLowFareSearchPortType(WebServiceFeature... features) {
        return super.getPort(new QName("https://webservices.sabre.com/websvc", "OTA_AirLowFareSearchPortType"), OTAAirLowFareSearchPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OTAAIRLOWFARESEARCHSERVICE_EXCEPTION!= null) {
            throw OTAAIRLOWFARESEARCHSERVICE_EXCEPTION;
        }
        return OTAAIRLOWFARESEARCHSERVICE_WSDL_LOCATION;
    }

}