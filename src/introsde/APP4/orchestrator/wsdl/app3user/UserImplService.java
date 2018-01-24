
package introsde.APP4.orchestrator.wsdl.app3user;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UserImplService", targetNamespace = "http://soap.users.APP3.introsde/", wsdlLocation = "http://localhost:6900/app3/user?wsdl")
public class UserImplService
    extends Service
{

    private final static URL USERIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException USERIMPLSERVICE_EXCEPTION;
    private final static QName USERIMPLSERVICE_QNAME = new QName("http://soap.users.APP3.introsde/", "UserImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:6900/app3/user?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERIMPLSERVICE_WSDL_LOCATION = url;
        USERIMPLSERVICE_EXCEPTION = e;
    }

    public UserImplService() {
        super(__getWsdlLocation(), USERIMPLSERVICE_QNAME);
    }

    public UserImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERIMPLSERVICE_QNAME, features);
    }

    public UserImplService(URL wsdlLocation) {
        super(wsdlLocation, USERIMPLSERVICE_QNAME);
    }

    public UserImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERIMPLSERVICE_QNAME, features);
    }

    public UserImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UserWebService
     */
    @WebEndpoint(name = "UserImplPort")
    public UserWebService getUserImplPort() {
        return super.getPort(new QName("http://soap.users.APP3.introsde/", "UserImplPort"), UserWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserWebService
     */
    @WebEndpoint(name = "UserImplPort")
    public UserWebService getUserImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.users.APP3.introsde/", "UserImplPort"), UserWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERIMPLSERVICE_EXCEPTION!= null) {
            throw USERIMPLSERVICE_EXCEPTION;
        }
        return USERIMPLSERVICE_WSDL_LOCATION;
    }

}