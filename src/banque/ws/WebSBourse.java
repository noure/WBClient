
package banque.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebSBourse", targetNamespace = "http://banque/ws")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebSBourse {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCotations", targetNamespace = "http://banque/ws", className = "banque.ws.GetCotations")
    @ResponseWrapper(localName = "getCotationsResponse", targetNamespace = "http://banque/ws", className = "banque.ws.GetCotationsResponse")
    @Action(input = "http://banque/ws/WebSBourse/getCotationsRequest", output = "http://banque/ws/WebSBourse/getCotationsResponse")
    public List<Object> getCotations(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAll", targetNamespace = "http://banque/ws", className = "banque.ws.GetAll")
    @ResponseWrapper(localName = "getAllResponse", targetNamespace = "http://banque/ws", className = "banque.ws.GetAllResponse")
    @Action(input = "http://banque/ws/WebSBourse/getAllRequest", output = "http://banque/ws/WebSBourse/getAllResponse")
    public List<Object> getAll();

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "ajoutCotation", targetNamespace = "http://banque/ws", className = "banque.ws.AjoutCotation")
    @ResponseWrapper(localName = "ajoutCotationResponse", targetNamespace = "http://banque/ws", className = "banque.ws.AjoutCotationResponse")
    @Action(input = "http://banque/ws/WebSBourse/ajoutCotationRequest", output = "http://banque/ws/WebSBourse/ajoutCotationResponse")
    public void ajoutCotation(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns banque.ws.Cotation
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCotation", targetNamespace = "http://banque/ws", className = "banque.ws.GetCotation")
    @ResponseWrapper(localName = "getCotationResponse", targetNamespace = "http://banque/ws", className = "banque.ws.GetCotationResponse")
    @Action(input = "http://banque/ws/WebSBourse/getCotationRequest", output = "http://banque/ws/WebSBourse/getCotationResponse")
    public Cotation getCotation(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
